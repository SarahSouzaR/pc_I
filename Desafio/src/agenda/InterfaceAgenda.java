package agenda;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

public class InterfaceAgenda extends JInternalFrame{
	
	private JTable tabela;
	
	private JButton btnNovo = new JButton("Novo");
	private JButton btnEditar = new JButton("Editar");
	private JButton btnRemover = new JButton("Remover");
	private JButton btnFechar = new JButton("Fechar");
	
	private FormCadAgenda formCadAgenda; //objeto do tipo formulário
	private static InterfaceAgenda INSTANCE = null;
	
	private DefaultTableModel modelo = new DefaultTableModel(); //modelo da tabela
	
	//método para construir a janela da agenda
	public InterfaceAgenda() {
		super("Agenda", true, true, false, true);
		
		Container pane = this.getContentPane();
		pane.setLayout(null);
		
		btnNovo.setBounds(5, 10, 90, 70);
		btnNovo.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNovo.setVerticalAlignment(SwingConstants.TOP);
		btnNovo.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnNovo.setIcon( new ImageIcon(getClass().getResource("imagens/NOVO.png")));
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNovoActionPerformed(e); //chama o método
			}
		});
		
		btnEditar.setBounds(95, 10, 90, 70);
		btnEditar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnEditar.setVerticalAlignment(SwingConstants.BOTTOM);
		btnEditar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnEditar.setIcon(new ImageIcon(getClass().getResource("imagens/ALTERAR.png")));
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnEditarActionPerformed(e);
			}
		});
		
		btnRemover.setBounds(185, 10, 90, 70);
		btnRemover.setHorizontalTextPosition(SwingConstants.CENTER);
		btnRemover.setVerticalAlignment(SwingConstants.TOP);
		btnRemover.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnRemover.setIcon(new ImageIcon(getClass().getResource("imagens/REMOVER.png")));
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnRemoverActionPerformed(e);
			}
		});
		
		btnFechar.setBounds(280, 10, 90, 70);
		btnFechar.setHorizontalTextPosition(SwingConstants.CENTER);
		btnFechar.setVerticalAlignment(SwingConstants.TOP);
		btnFechar.setVerticalTextPosition(SwingConstants.BOTTOM);
		btnFechar.setIcon(new ImageIcon(getClass().getResource("imagens/FECHAR.png")));
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnFecharActionPerformed(e);
			}
		});
		
		this.addInternalFrameListener(new InternalFrameAdapter() {
			public void InternalFrameClosing(InternalFrameEvent e) {
				interfaceAgendaInternalFrameClosing(e);
			}
		});
		
		//montando a tabela
		
		tabela = new JTable(modelo);
		
		modelo.addColumn("Código");
		modelo.addColumn("Nome");
		modelo.addColumn("Telefone");
		modelo.addColumn("E-mail");
		modelo.addColumn("Endereço");
		
		JScrollPane scrollpane = new JScrollPane(tabela);
		scrollpane.setBounds(5, 95, 680, 390);
		
		pane.add(btnNovo);
		pane.add(btnEditar);
		pane.add(btnRemover);
		pane.add(btnFechar);
		pane.add(scrollpane);
		
		//preencheTabela();
		
		this.setResizable(false);
		this.setSize(700,  550);	
	}
	
	//Evento dos Botões
	
	//novo
	
	private void btnNovoActionPerformed(ActionEvent e) {
		formCadAgenda = new FormCadAgenda(this);
		formCadAgenda.setModal(true);
		formCadAgenda.inicia();
	}
	
	//editar
	
	private void btnEditarActionPerformed(ActionEvent e) {
		int linha = tabela.getSelectedRow();
		
		//verifica se existe linha
		if (linha < 0) {
			return;
		}
		else {
			String codigo = tabela.getValueAt(linha, 0).toString();
			String nome = tabela.getValueAt(linha, 1).toString();
			String telefone = tabela.getValueAt(linha, 2).toString();
			String email = tabela.getValueAt(linha, 3).toString();
			String endereco = tabela.getValueAt(linha, 4).toString();
			
			formCadAgenda = new FormCadAgenda(this, codigo, nome, telefone, email, endereco);
			formCadAgenda.setModal(true);
			formCadAgenda.inicia();
		}		
	}
	
	//remover
	
	private void btnRemoverActionPerformed(ActionEvent e) {
		int resposta = JOptionPane.showConfirmDialog(this, "Deseja remover este registro?",
				"Remoção",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		
		if (resposta == JOptionPane.OK_OPTION) {
			int linha = tabela.getSelectedRow();
			int coluna = 0;
			
			if (linha < 0) {
				return;
			}
			
			else {
				String codigo = tabela.getValueAt(linha, coluna).toString();
				Principal.minhaAgenda.remove(codigo); //remove o contato
				modelo.removeRow(linha); //remove a linha
				
				JOptionPane.showMessageDialog(this, "Registro excluído com sucesso!!!",
						"Remover",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	//fechar
	
	private void btnFecharActionPerformed(ActionEvent e) {
		//mensagem de confirmação antes de fechar
		int ret = JOptionPane.showConfirmDialog(this, "Deseja fechar?",
				"Fechar",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		
		if (ret == JOptionPane.OK_OPTION) {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//this.destroyInstance();
		}		
	}
	
	//"X" de fechar a janela em vez do botão
	
	private void interfaceAgendaInternalFrameClosing(InternalFrameEvent e) {
		int ret = JOptionPane.showConfirmDialog(this, "Deseja fechar?",
				"Fechar",
				JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		
		if (ret == JOptionPane.OK_OPTION) {
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//this.destroyInstance();
		}
		else {
			this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
	} //ver se o problema era essa chave
	
		public static InterfaceAgenda getInstance() {
			if (InterfaceAgenda.INSTANCE == null) {
				return INSTANCE = new InterfaceAgenda();
			}
			
			return INSTANCE; //MÉTODO VOID NÃO PODE RETORNAR
		}
		
		//Preenchendo a JTable com os valores
		
		public void preencheTabela() {
			
			ArrayList lista = Principal.minhaAgenda.getList();
			
			//ordena os contatos por ordem de código
			Collections.sort(lista, Pessoa.ORDEM_CODIGO);
			Iterator it = lista.iterator();
			
			while (it.hasNext()) {
				Pessoa p = (Pessoa)it.next();
				
				modelo.addRow(new String[] {
						p.getCodigo(),
						p.getNome(),
						p.getTelefone(),
						p.getEmail(),
						p.getEndereco(),
				});
			}
		}
		
		public void atualizaTabela(String[] dados) {
			int linha = tabela.getSelectedRow();
			
			tabela.setValueAt(dados[0], linha, 0);
			tabela.setValueAt(dados[1], linha, 1);
			tabela.setValueAt(dados[2], linha, 2);
			tabela.setValueAt(dados[3], linha, 3);
			tabela.setValueAt(dados[4], linha, 4);
		}
		
		public InterfaceAgenda destroyInstance() {
			this.dispose();
			return INSTANCE= null;
		}
		
		public static boolean isInstance() {
			if (INSTANCE == null) {
			}
			return false;
		}
	
		public void addRow(Object[] o) {
			modelo.addRow(o);
		}
		
}
