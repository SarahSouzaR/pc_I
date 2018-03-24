package janela;

import java.awt.Container;

import javax.swing.JFrame; 												//importa uma classe para que você possa usar os seus conteúdos para criação da janela.
import javax.swing.JLabel;
import javax.swing.JTextField; 											//Mesma coisa, essa é para características da janela.

public class JanelaPrincipal extends JFrame{
	
	JLabel lblIntro = new JLabel("Preencha os campos e clique em Gravar Dados");
	
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
	JLabel lblEndereco = new JLabel("Endereço: ");
	JTextField txtEndereco = new JTextField();
	
	JLabel lblBairro = new JLabel("Bairro: ");
	JTextField txtBairro = new JTextField();
	
	JLabel lblEstado = new JLabel("Estado: ");
	JTextField txtEstado = new JTextField();
	
	JLabel lblTelefone = new JLabel("Telefone: ");
	JTextField txtTelefone = new JTextField();
	
	JLabel lblCelular = new JLabel("Celular: ");
	JTextField txtCelular = new JTextField();
	
	JLabel lblEmail = new JLabel("Email: ");
	JTextField txtEmail = new JTextField();
	
	public JanelaPrincipal() {
		super("Minha Janela"); 											//o Super coloca um nome em sua janela.
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		lblIntro.setBounds(30, 20, 390, 20);
		paine.add(lblIntro);
		
		lblNome.setBounds(40, 60, 60, 20);
		paine.add(lblNome);
		
		txtNome.setBounds(110, 60, 200, 20);
		paine.add(txtNome);
		
		lblEndereco.setBounds(40, 90, 60, 20);
		paine.add(lblEndereco);
		
		txtEndereco.setBounds(110, 90, 200, 20);
		paine.add(txtEndereco);
		
		lblBairro.setBounds(40, 120, 60, 20);
		paine.add(lblBairro);
		
		txtBairro.setBounds(110, 120, 200, 20);
		paine.add(txtBairro);
		
		lblEstado.setBounds(40, 150, 60, 20);
		paine.add(lblEstado);
		
		txtEstado.setBounds(110, 150, 150, 20);
		paine.add(txtEstado);
		
		lblTelefone.setBounds(40, 180, 60, 20);
		paine.add(lblTelefone);
		
		txtTelefone.setBounds(110, 180, 100, 20);
		paine.add(txtTelefone);
		
		lblCelular.setBounds(40, 210, 60, 20);
		paine.add(lblCelular);
		
		txtCelular.setBounds(110, 210, 100, 20);
		paine.add(txtCelular);
		
		lblEmail.setBounds(40, 240, 60, 20);
		paine.add(lblEmail);
		
		txtEmail.setBounds(110, 240, 200, 20);
		paine.add(txtEmail);
		
		this.setResizable(false); 										//impede do usuário alterar o tamanho da janela.
		this.setVisible(true); 											//para deixar a janela visível.
		this.setSize(390, 350);											 //tamanho da minha janela em pixels
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 			//faz com que o usuário feche a janela sem deixá-la em segundo plano.
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JanelaPrincipal janela = new JanelaPrincipal();

	}

}
