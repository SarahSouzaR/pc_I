package view;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;

public class Interface extends JFrame{

	JToolBar toolbar = new JToolBar();
	
	JList lstEstados;
	JScrollPane scrollpane;
	JScrollPane srcEstado;
	
	public Interface () {
		super("Exemplo de Interface");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		toolbar.add(new JButton("Abrir"));
		toolbar.add(new JButton("Novo"));
		toolbar.add(new JButton("Salvar"));
		toolbar.add(new JButton("Fechar"));
		
		toolbar.setBounds(0, 0, 500, 30);
		pane.add(toolbar);
		
		String estados [] = {"SP", "RJ", "AM", "PA", "MG"};
		
		lstEstados = new JList(estados);
		scrollpane = new JScrollPane(lstEstados);
		
		scrollpane.setBounds(20, 40, 100, 80);
		pane.add(scrollpane);
		
		String[] coluna = {"Nome", "Cidade", "Estado"};
		
		String[] [] dados = {{"Eduardo Jorge", "Salvador", "Bahia"},
				{"Gustavo Neves", "Caetité", "Bahia"},
				{"Tarcísio Araújo", "Mutuípe", "Bahia"},
				{"Rafael", "Campinas", "São Paulo"}
		};
		
		JTable listEstados = new JTable(dados, coluna);
		
		JScrollPane scrEstados = new JScrollPane(listEstados);
		
		scrEstados.setBounds(20, 150, 400, 200);
		pane.add(scrEstados);
		
		this.setVisible(true);
		this.setSize(500, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
	}
	
	public static void main (String args []) {
		Interface janela = new Interface();
	}
}
