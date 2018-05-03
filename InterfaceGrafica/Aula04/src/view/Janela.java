package view;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela extends JFrame{
		
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField(30);
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField(30);
	JLabel lblCep = new JLabel("Cep: ");
	JTextField txtCep = new JTextField(10);
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField(20);
	JLabel lblCidade = new JLabel("Cidade: ");
	JTextField txtCidade = new JTextField(30);
	JLabel lblEstado = new JLabel("Estado: ");
	JTextField txtEstado = new JTextField(15);
	
	
		public Janela() {
			
			super("Janela com novo layout");
			
			Container pane = this.getContentPane();
			pane.setLayout(new FlowLayout(FlowLayout.LEFT));
			
			//Container pane = this.getContentPane();
			//pane.setLayout(new GridLayout(14, 2));
			
			//A diferença desse (Grid) é que ele trabalha com colunas e linhas 
			//Já o Flow trabalha com alinhamento, e enquanto o seu objeto couber
			//na linha da sua janela, ele será colocado, senão acontecerá
			//uma quebra de linha
			
			
			pane.add(lblNome);
			pane.add(txtNome);
			pane.add(lblEndereco);
			pane.add(txtEndereco);
			pane.add(lblCep);
			pane.add(txtCep);
			pane.add(lblTelefone);
			pane.add(txtTelefone);
			pane.add(lblCidade);
			pane.add(txtCidade);
			pane.add(lblEstado);
			pane.add(txtEstado);
			
			this.setVisible(true);
			this.setSize(500, 500);
			this.setResizable(false);
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
					
		}
		
		public static void main (String args []) {
			Janela jan = new Janela();
		}
}
