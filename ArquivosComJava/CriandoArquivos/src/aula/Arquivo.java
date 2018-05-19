package aula;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
		
	public void inserir(String texto) throws IOException {
		//Gravação
		FileWriter arq = new FileWriter("d:\\teste.txt", true);
		PrintWriter gravarArq = new PrintWriter(arq);
		
		/*for (int i = 0; i <= 100; i++) {
			gravarArq.println("Valor de i = " + i);
		}*/
		
		gravarArq.println(texto);
		
		arq.close();
	}
		
		
	public void leitura (String texto) throws IOException {		
		//Leitura
		FileReader arqLeitura = new FileReader("d:\\teste.txt");
		BufferedReader lerArq = new BufferedReader(arqLeitura);
		
		String linha = lerArq.readLine();
		int i = 0;
		
		while (linha != null) {
			i++;
			if (linha.contains(texto)) {
				System.out.println("linha: " + i + " \nconteúdo: " + linha);
			}
			linha = lerArq.readLine(); 	
		}
		
		
		arqLeitura.close();
	}	
	
	public void alterar(String pAntiga, String pNova) throws IOException {
		String arquivo = "Arquivo";
		String arquivo2 = "Modificar";
		
		BufferedWriter escrever = new BufferedWriter(new FileWriter("Modificar"));
		BufferedReader ler = new BufferedReader(new FileReader("Arquivo"));
		
		String linha;
		while ((linha = ler.readLine()) != null) {
			if (linha.contains(pAntiga)) {
				linha = linha.replace(pAntiga, pNova);
			}
			escrever.write(linha + "\n");
		}
		
		escrever.close();
		ler.close();
		
		new File (arquivo).delete();
		new File (arquivo2).renameTo(new File(arquivo));
	}
	
	
		public static void main(String[] args) throws Exception {
			Arquivo arq = new Arquivo();
			//arq.inserir("Rose\n");
			arq.leitura("Rose");
			
		}

}
