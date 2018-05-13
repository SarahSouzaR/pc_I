package agenda;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormCadAgenda extends JDialog {

	private JLabel lblNome = new JLabel("Nome:");
	private JLabel lblTelefone = new JLabel("Telefone:");
	private JLabel lblEmail = new JLabel("E-mail:");
	private JLabel lblEndereco = new JLabel("Endereço:");
	
	private JTextField txtNome = new JTextField();
	private JTextField txtTelefone = new JTextField();
	private JTextField txtEmail = new JTextField();
	private JTextField txtEndereco = new JTextField();
	
	private JButton btnGravar;
	private JButton btnFechar;
	
	private InterfaceAgenda pai;
	
	private String codigo = "";
	
	private Boolean edicao = false;
	
	public FormCadAgenda(InterfaceAgenda newPai) {
		this.pai = newPai;
	}
	
	//Construtor
	public FormCadAgenda(InterfaceAgenda newPai, String codigo, String nome, String telefone, String email, String endereco) {
		this(newPai);
		this.edicao = true;
		this.codigo = codigo;
		this.txtNome.setText(nome);
		this.txtTelefone.setText(telefone);
		this.txtEmail.setText(email);
		this.txtEndereco.setText(endereco);
	}
	
	void inicia() {
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		btnGravar = new JButton("Gravar");
		btnFechar = new JButton("Fechar");
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		lblNome.setBounds(10, 10, 50, 20);
		lblTelefone.setBounds(10, 41, 80, 20);
		lblEmail.setBounds(10, 72, 50, 20);
		lblEndereco.setBounds(10, 102, 80, 20);
		
		txtNome.setBounds(70, 10, 150, 20);
		txtTelefone.setBounds(70, 41, 70, 20);
		txtEmail.setBounds(70, 72, 150, 20);
		txtEndereco.setBounds(70, 102, 150, 20);
		
		btnGravar.setBounds(68, 140, 80, 22);
		btnFechar.setBounds(150, 140, 80, 22);
		
		//Ação do botão
		btnGravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnGravarActionPerformed(e);
			}
		});
		
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFecharActionPerformed(e);
			}
		});
		
		//add as coisas
		pane.add(lblNome);
		pane.add(lblTelefone);
		pane.add(lblEmail);
		pane.add(lblEndereco);
		
		pane.add(txtNome);
		pane.add(txtTelefone);
		pane.add(txtEmail);
		pane.add(txtEndereco);
		
		pane.add(btnGravar);
		pane.add(btnFechar);
		
		this.setBounds(40, 60, 250, 210);
		this.setContentPane(pane);
		this.setVisible(true);
	}
	
	private void btnGravarActionPerformed(ActionEvent e) {
		int resposta;
		if (edicao == false) {
			resposta = JOptionPane.showConfirmDialog(this,
					"Incluir registro?",codigo, //implementei o "codigo" para sair o erro
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (resposta == JOptionPane.OK_OPTION) {
				Pessoa p = new Pessoa(txtNome.getText(),
						txtTelefone.getText(),
						txtEmail.getText(),
						txtEndereco.getText());
				Principal.minhaAgenda.add(p);
				
				JOptionPane.showMessageDialog(
						this, "Inclusão efetuada!!!",
						"Inclusão",
						JOptionPane.INFORMATION_MESSAGE);
							
				pai.addRow(new String[]{
						p.getCodigo(),
						p.getNome(),
						p.getTelefone(),
						p.getEmail(),
						p.getEndereco()
				});
				
				this.dispose();
			}
		}
		
		else {
			resposta = JOptionPane.showConfirmDialog(this, "Salvar alterações",
					"Edição",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			
			if (resposta == JOptionPane.OK_OPTION) {
				Pessoa p = Principal.minhaAgenda.getPessoa(codigo);
				
				p.setValores(new String[] {txtNome.getText(),
						txtTelefone.getText(),
						txtEmail.getText(),
						txtEndereco.getText()});
				
				this.dispose();
			}
		}
	}
	
	private void btnFecharActionPerformed(ActionEvent e) {
		this.dispose();
	}
}
