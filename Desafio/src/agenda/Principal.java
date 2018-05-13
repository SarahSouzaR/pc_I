package agenda;

import java.awt.*;
import java.awt.event.*;
import javax.imageio.*;
import javax.swing.*;

/*import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;*/

//import javax.imageio.ImageIO;
/*import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.ImageIcon;*/

public class Principal extends JFrame{
	
	public static Agenda minhaAgenda = new Agenda(); //obj onde os contatos serão armazenados
	
	//componentes do menu
	
	private JMenuItem menuAbreAgenda = new JMenuItem("Abrir Agenda");
	private JMenuItem menuFechaAgenda = new JMenuItem("Fechar Agenda");
	private JRadioButtonMenuItem[] menuItemEstilo = new JRadioButtonMenuItem[3];
	
	private JMenu menuAgenda = new JMenu("Agenda");
	private JMenu menuEstilo = new JMenu("Estilo");
	
	private JMenuBar menuBar = new JMenuBar();
	
	private InterfaceAgenda agenda = null;
	
	private JDesktopPane desktop; //janela principal é criada
	
	private ButtonGroup group = new ButtonGroup();

	public static void main(String[] args) {
		Principal m = new Principal(); //chama o método que constrói a janela principal
	}

	public Principal() {//método construtor, monta a janela principal
		super("DESAFIO INTERFACE GRÁFICA - AGENDA");
		
		desktop = new JDesktopPane() {//imagem de fundo para o desktop
			public void paintComponent(Graphics g) {
				try {
					super.paintComponents(g);
					
					Image img = ImageIO.read(new java.net.URL(
							this.getClass().getResource("imagens/DESKTOP.gif"), "DESKTOP.gif"));
					
					if (img != null) {
						g.drawImage(img, 0, 0, 800, 600, this);
					}
				} 
				catch (Exception e) {
				e.printStackTrace();
				}				
			}
		};
		
		//cor de fundo do desktop		
		desktop.setBackground(Color.WHITE);
		
		//seta os ícones dos menus
		menuAgenda.setIcon(new ImageIcon(this.getClass().getResource("imagens/AGENDA2.png")));
		
		menuAbreAgenda.setIcon(new ImageIcon(this.getClass().getResource("imagens/AGENDA.png")));
		
		//evento do botão do menu abrir agenda
		menuAbreAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuAgendaActionPerformed(e);
			}
		});
		
		menuFechaAgenda.setIcon(new ImageIcon(this.getClass().getResource("imagens/FECHAR.png")));
		menuFechaAgenda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuFechaAgendaActionPerformed(e);
			}
		});
		
		menuEstilo.setIcon(new ImageIcon(this.getClass().getResource("imagens/ESTILO.png")));
		
		//add as opções de estilo
		
		menuItemEstilo[0] = new JRadioButtonMenuItem("Metal");
		menuItemEstilo[0].setSelected(true);
		menuItemEstilo[0].setIcon(new ImageIcon(this.getClass().getResource("imagens/JAVA.png")));
		
		menuItemEstilo[1] = new JRadioButtonMenuItem("Motif");
		menuItemEstilo[1].setIcon(new ImageIcon(this.getClass().getResource("imagens/LINUX.png")));
		
		menuItemEstilo[2] = new JRadioButtonMenuItem("Windows");
		menuItemEstilo[2].setIcon(new ImageIcon(this.getClass().getResource("imagens/WINDOWS.png")));
		
		//método que muda o estilo da janela
		for (int i = 0; i < menuItemEstilo.length; i++) {
			group.add(menuItemEstilo[i]);
			menuEstilo.add(menuItemEstilo[i]);
			menuItemEstilo[i].addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
					menuEstiloItemStateChanged(e);
				}
			});
		}
		
		//add os menus à barra
		menuAgenda.add(menuAbreAgenda);
		menuAgenda.addSeparator();
		menuAgenda.add(menuFechaAgenda);
		
		menuBar.add(menuAgenda);
		menuBar.add(menuEstilo);
		
		this.getContentPane().add(desktop);
		
		this.setJMenuBar(menuBar);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	//ação ao clicar mandar Abrir Agenda
	private void menuAgendaActionPerformed(ActionEvent e) {
		agenda = InterfaceAgenda.getInstance();
		desktop.remove(agenda);
		desktop.add(agenda);
		agenda.setVisible(true);
	}
	
	private void menuFechaAgendaActionPerformed(ActionEvent e) {
		//verifica se já existe instancia
		if (InterfaceAgenda.isInstance()) {
			int ret = JOptionPane.showConfirmDialog(this, "Deseja fechar?",
					"Fechar",
					JOptionPane.OK_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			if (ret == JOptionPane.OK_OPTION) {
				agenda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				agenda.destroyInstance();
			}
		}
	}
	
	private void menuEstiloItemStateChanged(ItemEvent e) {
		for (int i = 0; i < menuItemEstilo.length; i++) {
			if(menuItemEstilo[i].isSelected()) {
				atualizar(i);
			}
		}
	}
	
	public void atualizar(int valor) {
		UIManager.LookAndFeelInfo[]look = UIManager.getInstalledLookAndFeels();
		
		try {
			UIManager.setLookAndFeel(look[valor].getClassName());
			SwingUtilities.updateComponentTreeUI(this);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
