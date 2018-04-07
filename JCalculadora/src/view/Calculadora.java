package view;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

import calculos.FuncoesMat;

public class Calculadora extends JFrame{
	
	
	//só para salvar
	
	//Visor
	JTextField txtVisor = new JTextField("0");
	
	//Primeira Fileira de Botões
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	
	//Segunda Fileira de Botões
	JButton btnSeta = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+-");
	JButton btnRaiz = new JButton("v/");
	
	//Terceira Fileira de Botões
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDivisao = new JButton("/");
	JButton btnPorcentagem = new JButton("%");
	
	//Quarta Fileira de Botões
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMultiplicacao = new JButton("*");
	JButton btnFracao = new JButton("1/x");
	
	//Quinta Fileira de Botões
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnSubtracao = new JButton("-");
	
	//Sexta Fileira de Botões
	JButton btn0 = new JButton("0");
	JButton btnVirgula = new JButton(".");
	JButton btnAdicao = new JButton("+");
	JButton btnIgual = new JButton("=");

	
	FuncoesMat mat = new FuncoesMat();
	String sinal = null;
	double valor1 = 0, valor2 = 0;
	
	//Construtor
	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		//Visor
		txtVisor.setFont( new Font( "Arial", Font.PLAIN, 20));
		txtVisor.setBounds(12, 29, 190, 50);
		paine.add(txtVisor);
		
		//Primeira Fileira
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setBounds(12, 85, 35, 25);
		paine.add(btnMC);
		
		btnMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.setBounds(50, 85, 35, 25);
		paine.add(btnMR);
		
		btnMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMS.setMargin(new Insets(1,1,1,1));
		btnMS.setBounds(88, 85, 35, 25);
		paine.add(btnMS);	
		
		btnMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMais.setMargin(new Insets(1,1,1,1));
		btnMais.setBounds(126, 85, 35, 25);
		paine.add(btnMais);		
				
		btnMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMenos.setMargin(new Insets(1,1,1,1));
		btnMenos.setBounds(164, 85, 35, 25);
		paine.add(btnMenos);
		
		//Segunda Fileira
		btnSeta.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnSeta.setMargin(new Insets(1,1,1,1));
		btnSeta.setBounds(12, 116, 35, 25);
		paine.add(btnSeta);
		
		btnCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnCE.setMargin(new Insets(1,1,1,1));
		btnCE.setBounds(50, 116, 35, 25);
		paine.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnC.setMargin(new Insets(1,1,1,1));
		btnC.setBounds(88, 116, 35, 25);
		paine.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText("0");
			}
		});
		
		btnMaisMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMaisMenos.setMargin(new Insets(1,1,1,1));
		btnMaisMenos.setBounds(126, 116, 35, 25);
		paine.add(btnMaisMenos);
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "MaisMenos";
				if(sinal.equals("MaisMenos")) {
					txtVisor.setText(mat.MaisMenos(valor1) + "");
				}
			}
		});
		
		btnRaiz.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnRaiz.setMargin(new Insets(1,1,1,1));
		btnRaiz.setBounds(164, 116, 35, 25);
		paine.add(btnRaiz);
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "raiz";
				if(sinal.equals("raiz")) {
					txtVisor.setText(mat.raiz(valor1) + "");
				}
			}
		});
		
		//Terceira Fileira
		btn7.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn7.setMargin(new Insets(1,1,1,1));
		btn7.setBounds(12, 147, 35, 25);
		paine.add(btn7);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("7");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "7");
				}
			}
		});
		
		btn8.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn8.setMargin(new Insets(1,1,1,1));
		btn8.setBounds(50, 147, 35, 25);
		paine.add(btn8);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("8");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "8");
				}
			}
		});
		
		btn9.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn9.setMargin(new Insets(1,1,1,1));
		btn9.setBounds(88, 147, 35, 25);
		paine.add(btn9);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("9");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "9");
				}
			}
		});
		
		btnDivisao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnDivisao.setMargin(new Insets(1,1,1,1));
		btnDivisao.setBounds(126, 147, 35, 25);
		paine.add(btnDivisao);
		btnDivisao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "divisao";
				txtVisor.setText("0");
			}
		});
		
		btnPorcentagem.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnPorcentagem.setMargin(new Insets(1,1,1,1));
		btnPorcentagem.setBounds(164, 147, 35, 25);
		paine.add(btnPorcentagem);
		btnPorcentagem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "porcentagem";
				if(sinal.equals("porcentagem")) {
					txtVisor.setText(mat.porcentagem(valor1, valor2) + "");
				}
			}
		});
		
		//Quarta Fileira
		btn4.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn4.setMargin(new Insets(1,1,1,1));
		btn4.setBounds(12, 178, 35, 25);
		paine.add(btn4);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("4");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "4");
				}
			}
		});
		
		btn5.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn5.setMargin(new Insets(1,1,1,1));
		btn5.setBounds(50, 178, 35, 25);
		paine.add(btn5);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {			
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("5");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "5");
				}
			}
		});
		
		btn6.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn6.setMargin(new Insets(1,1,1,1));
		btn6.setBounds(88, 178, 35, 25);
		paine.add(btn6);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("6");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "6");
				}
			}
		});
		
		btnMultiplicacao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMultiplicacao.setMargin(new Insets(1,1,1,1));
		btnMultiplicacao.setBounds(126, 178, 35, 25);
		paine.add(btnMultiplicacao);
		btnMultiplicacao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "multiplicacao";
				txtVisor.setText("0");
			}
		});
		
		btnFracao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnFracao.setMargin(new Insets(1,1,1,1));
		btnFracao.setBounds(164, 178, 35, 25);
		paine.add(btnFracao);
		btnFracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "fracao";
				if(sinal.equals("fracao")) {
					txtVisor.setText(mat.fracao(valor1) + "");
				}
				
			}
		});
		
		//Quinta Fileira
		btn1.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn1.setMargin(new Insets(1,1,1,1));
		btn1.setBounds(12, 209, 35, 25);
		paine.add(btn1);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("1");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "1");
				}
			}
		});
		
		btn2.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn2.setMargin(new Insets(1,1,1,1));
		btn2.setBounds(50, 209, 35, 25);
		paine.add(btn2);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("2");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "2");
				}
			}
		});
		
		btn3.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn3.setMargin(new Insets(1,1,1,1));
		btn3.setBounds(88, 209, 35, 25);
		paine.add(btn3);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("3");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "3");
				}
			}
		});
		
		btnSubtracao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnSubtracao.setMargin(new Insets(1,1,1,1));
		btnSubtracao.setBounds(126, 209, 35, 25);
		paine.add(btnSubtracao);
		btnSubtracao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "subtracao";
				txtVisor.setText("0");
			}
		});
		
		//Sexta Fileira
		btn0.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btn0.setMargin(new Insets(1,1,1,1));
		btn0.setBounds(12, 240, 73, 25);
		paine.add(btn0);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(txtVisor.getText().equals("0")) {
					txtVisor.setText("0");
				}				
				else {
					txtVisor.setText(txtVisor.getText() + "0");
				}
			}
		});
		
		
		btnVirgula.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnVirgula.setMargin(new Insets(1,1,1,1));
		btnVirgula.setBounds(88, 240, 35, 25);
		paine.add(btnVirgula);
		
		btnAdicao.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnAdicao.setMargin(new Insets(1,1,1,1));
		btnAdicao.setBounds(126, 240, 35, 25);
		paine.add(btnAdicao);
		btnAdicao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(txtVisor.getText());
				sinal = "adicao";
				txtVisor.setText("0");
			}
		});
		
		btnIgual.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnIgual.setMargin(new Insets(1,1,1,1));
		btnIgual.setBounds(164, 209, 35, 58);
		paine.add(btnIgual);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(txtVisor.getText());
				
				if(sinal.equals("adicao")) {
					txtVisor.setText(mat.adicao(valor1, valor2) + "");
				}
				else if(sinal.equals("subtracao")) {
					txtVisor.setText(mat.subtracao(valor1, valor2) + "");
				}
				else if(sinal.equals("divisao")) {
					txtVisor.setText(mat.divisao(valor1, valor2) + "");
				}
				else if(sinal.equals("multiplicacao")) {
					txtVisor.setText(mat.multiplicacao(valor1, valor2) + "");
				}
				
			}
		});
			
		this.setSize(220, 313);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
		public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}