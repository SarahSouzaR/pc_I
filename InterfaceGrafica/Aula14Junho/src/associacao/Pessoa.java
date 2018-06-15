package associacao;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Pessoa {

	private String nome;
	private Date dtNasc;
	private List <Dependente> dependentes = new ArrayList <Dependente> (0);
	
	public void setDependentes (List <Dependente> dependentes) {
		
	}
	
	//Acrescentei os ()
	public List <Dependente> getDependentes() {
		return getDependentes();
	}
			
	public void addDependente (Dependente dependente) {
		this.dependentes.add(dependente);
	}
}