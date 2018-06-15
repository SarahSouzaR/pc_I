package agregacao;

import java.util.ArrayList;

public class Time {

	private String nomeAtleta;
	private String tecnico;
	
	private ArrayList <Atleta> atleta;
	
	public Time() {
		
		atleta = new ArrayList<Atleta>();
	}

	
	public void add(Atleta umAtleta) {
		Atleta.add(umAtleta);
	}
}
