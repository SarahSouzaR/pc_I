package view;

import java.awt.Container;
//import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	
	JTextField txtVisor = new JTextField();

	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	
	JButton btnSeta = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+-");
	JButton btnRaiz = new JButton("v/");
	
	JButton btn7 = new JButton("7");
	JButton btn8 = new JButton("8");
	JButton btn9 = new JButton("9");
	JButton btnDivisao = new JButton("/");
	JButton btnPorcentagem = new JButton("%");
	
	JButton btn4 = new JButton("4");
	JButton btn5 = new JButton("5");
	JButton btn6 = new JButton("6");
	JButton btnMultiplicacao = new JButton("*");
	JButton btnFracao = new JButton("1/x");
	
	JButton btn1 = new JButton("1");
	JButton btn2 = new JButton("2");
	JButton btn3 = new JButton("3");
	JButton btnSubtracao = new JButton("-");
	
	JButton btn0 = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnAdicao = new JButton("+");
	JButton btnIgual = new JButton("=");

	//private Container button;

	public Calculadora() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		//Tamanho de largura do botão 34, espaçamento de 4. 
		
		// Ver o negócio de altura do campo invés de 29 ser 30.
		
		txtVisor.setBounds(12, 29, 190, 50);
		paine.add(txtVisor);
		btnMC.setBounds(12, 85, 35, 25);
		paine.add(btnMC);		
		btnMR.setBounds(50, 85, 35, 25);
		paine.add(btnMR);		
		btnMS.setBounds(88, 85, 35, 25);
		paine.add(btnMS);		
		btnMais.setBounds(126, 85, 35, 25);
		paine.add(btnMais);		
		btnMenos.setBounds(164, 85, 35, 25);
		paine.add(btnMenos);
		
		btnSeta.setBounds(12, 116, 35, 25);
		paine.add(btnSeta);
		btnCE.setBounds(50, 116, 35, 25);
		paine.add(btnCE);
		btnC.setBounds(88, 116, 35, 25);
		paine.add(btnC);
		btnMaisMenos.setBounds(126, 116, 35, 25);
		paine.add(btnMaisMenos);
		btnRaiz.setBounds(164, 116, 35, 25);
		paine.add(btnRaiz);
		
		btn7.setBounds(12, 147, 35, 25);
		paine.add(btn7);
		btn8.setBounds(50, 147, 35, 25);
		paine.add(btn8);
		btn9.setBounds(88, 147, 35, 25);
		paine.add(btn9);
		btnDivisao.setBounds(126, 147, 35, 25);
		paine.add(btnDivisao);
		btnPorcentagem.setBounds(164, 147, 35, 25);
		paine.add(btnPorcentagem);
		
		btn4.setBounds(12, 178, 35, 25);
		paine.add(btn4);
		btn5.setBounds(50, 178, 35, 25);
		paine.add(btn5);
		btn6.setBounds(88, 178, 35, 25);
		paine.add(btn6);
		btnMultiplicacao.setBounds(126, 178, 35, 25);
		paine.add(btnMultiplicacao);
		btnFracao.setBounds(164, 178, 35, 25);
		paine.add(btnFracao);
		
		btn1.setBounds(12, 209, 35, 25);
		paine.add(btn1);
		btn2.setBounds(50, 209, 35, 25);
		paine.add(btn2);
		btn3.setBounds(88, 209, 35, 25);
		paine.add(btn3);
		btnSubtracao.setBounds(126, 209, 35, 25);
		paine.add(btnSubtracao);
		
		btn0.setBounds(12, 240, 73, 25);
		paine.add(btn0);
		btnVirgula.setBounds(88, 240, 35, 25);
		paine.add(btnVirgula);
		btnAdicao.setBounds(126, 240, 35, 25);
		paine.add(btnAdicao);
		btnIgual.setBounds(164, 209, 35, 58);
		paine.add(btnIgual);
			
		//button = null;
		//button.setFont( new Font( "Arial", FONT.PLAIN, 12 ) );
		this.setSize(220, 313);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
	
	public static void main(String args[]) {
		Calculadora calc = new Calculadora();
	}
}