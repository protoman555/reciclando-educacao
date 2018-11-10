package br.com.unibh.dao;

import java.util.List;

import javax.enterprise.inject.Model;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.unibh.redu.core.entities.BaseEntity;

@Model
public class BaseDAO {

	@PersistenceContext(unitName = "Redu")
	protected EntityManager entityManager;

	public BaseDAO() {

	}

	public <T extends BaseEntity<?>> T salvar(T t) {
		return entityManager.merge(t);
	}

	public <T extends BaseEntity<?>> void excluir(T t) {
		entityManager.remove(t);
	}

	public <T extends BaseEntity<?>> List<T> buscarTodos(Class<T> clazz) {
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(clazz);
		Root<T> root = query.from(clazz);
		return entityManager.createQuery(query).getResultList();
	}
}
