package associacao;

import java.util.Date;

public class Dependente {
	
	private String nome;
	private Date dtNasc;
	private String grauParentesco;
	private Pessoa responsavel;
	
	public void setResposavel (Pessoa resp) {
		
	}
	
	public Pessoa getResponsavel() {
		return responsavel;
	}

}
