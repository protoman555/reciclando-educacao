package br.com.unibh.redu.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.unibh.redu.core.util.Constante;

/**
 * Entidade para armazenar endereco
 * 
 * @author Lucas Gabriel
 *
 */
@Entity
@Table(name = "endereco", schema = Constante.DATABASE)
public class Endereco extends BaseEntity<Long> {

	private static final long serialVersionUID = 67190653709988451L;

	@Id
	@Column(name = "id_endereco")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "endereco", optional = true)
	private Usuario usuario;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy="endereco",optional=true)
	private Doacao doacao;

	@Column(name = "tx_cep", nullable = false)
	private String cep;

	@Column(name = "tx_logradouro", nullable = false)
	private String logradouro;

	@Column(name = "tx_numero", nullable = false)
	private String numero;

	@Column(name = "tx_bairro", nullable = false)
	private String bairro;

	@Column(name = "tx_municipio", nullable = false)
	private String municipio;

	@Column(name = "tx_uf", nullable = false)
	private String uf;

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}
