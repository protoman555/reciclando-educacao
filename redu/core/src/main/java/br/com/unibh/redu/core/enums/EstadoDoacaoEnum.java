package br.com.unibh.redu.core.enums;

public enum EstadoDoacaoEnum {

	NOVO("Novo"), USADO("Usado"), COM_DEFEITO("Com defeito");

	private final String descricao;

	private EstadoDoacaoEnum(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return descricao;
	}

	public static EstadoDoacaoEnum getEstadoDoacao(String valor) {
		for (EstadoDoacaoEnum estadoDoacao : values()) {
			if (estadoDoacao.descricao.equalsIgnoreCase(valor))
				return estadoDoacao;
		}
		return null;
	}
}
