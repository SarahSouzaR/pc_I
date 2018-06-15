package aula;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Arquivo {
		
	public void inserir(String texto) throws IOException {
		//Gravação
		FileWriter arq = new FileWriter("d:\\teste.txt");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		/*
		for (int i = 0; i <= 100; i++) {
			gravarArq.println("Valor de i = " + i);
		}
		*/
		
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
	
	ArrayList<String> linhas = new ArrayList<String>();
	String linha = null;
	 
    public void doIt(String p1, String p2) throws IOException
    {				    	
        try
        {
            File arquivo = new File("d:\\teste.txt");
            FileReader arq = new FileReader(arquivo);
            BufferedReader lerArquivo = new BufferedReader(arq);
            while ((linha = lerArquivo.readLine()) != null)
            {
                if (linha.contains(p1))
                    linha = linha.replace(p1, p2);
                linhas.add(linha);
            }
            arq.close();
            lerArquivo.close();
            
            FileWriter Arq = new FileWriter(arquivo);
            BufferedWriter Arquiv = new BufferedWriter(Arq);
            
            for(String texto : linhas)
            	Arquiv.write(texto);
            	Arquiv.close();
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }
    
	public static void main(String[] args) throws Exception {	
		Arquivo arq = new Arquivo();
        //arq.inserir("Aula");
		arq.doIt("Aula", "Aula - Java");
	}
}
