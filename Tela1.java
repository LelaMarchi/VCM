package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

import vcm.modelo.UsuarioVcm;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Tela1 {

	private static ArrayList<UsuarioVcm> listaDeUsuarios;
	private JFrame frame;
	private JTextField entradaEmail;
	private JPasswordField entradaSenha;
	public static ArrayList<UsuarioVcm> usuarios;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		UsuarioVcm user = new UsuarioVcm();
		user.setEmail("email@email");
		user.setSenha("123");
		listaDeUsuarios = new ArrayList<>();
		listaDeUsuarios.add(user);
		UsuarioVcm userRetornado = listaDeUsuarios.get(0);
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela1 window = new Tela1();
					window.frame.setVisible(true);
		
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 301, 522);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblViolnciaContraA = new JLabel("Viol\u00EAncia Contra a Mulher");
		lblViolnciaContraA.setForeground(Color.MAGENTA);
		lblViolnciaContraA.setBackground(Color.BLACK);
		lblViolnciaContraA.setFont(new Font("Yu Gothic Medium", Font.BOLD, 19));
		lblViolnciaContraA.setBounds(10, 37, 259, 34);
		frame.getContentPane().add(lblViolnciaContraA);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 37, 259, 34);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setBounds(77, 100, 136, 146);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("I:\\PjiVcm\\imagens vcm\\logodoProjetoo.PNG"));
		lblNewLabel.setBounds(0, 0, 136, 146);
		panel_1.add(lblNewLabel);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(10, 266, 46, 14);
		frame.getContentPane().add(lblEmail);
		
		entradaEmail = new JTextField();
		entradaEmail.setBounds(48, 263, 203, 20);
		frame.getContentPane().add(entradaEmail);
		entradaEmail.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(10, 310, 46, 14);
		frame.getContentPane().add(lblSenha);
		
		entradaSenha = new JPasswordField();
		entradaSenha.setBounds(48, 307, 203, 19);
		frame.getContentPane().add(entradaSenha);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(validaUsuario()) {
					Tela2 tela = new Tela2();
					tela.IniciaTela();
					frame.setVisible(false);
				}else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto!.");
				}
				
			}
		});
		btnNewButton.setForeground(Color.BLACK);
	
		btnNewButton.setBounds(88, 348, 100, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cadastrar\r\n");
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Tela4 tela = new Tela4();
				tela.IniciaTela();
				frame.setVisible(false);
				
				
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(88, 412, 100, 20);
		frame.getContentPane().add(btnNewButton_1);
	}

	public boolean validaUsuario() {
		for(UsuarioVcm user : listaDeUsuarios) {
			if(user.getEmail().equals(entradaEmail.getText())) {
				if(user.getSenha().equals(entradaSenha.getText())) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public void IniciaTela() {
		frame.setVisible(true);
		
	}
}
