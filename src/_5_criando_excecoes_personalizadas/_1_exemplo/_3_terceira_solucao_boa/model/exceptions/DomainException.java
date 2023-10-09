package _5_criando_excecoes_personalizadas._1_exemplo._3_terceira_solucao_boa.model.exceptions;

public class DomainException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

}
