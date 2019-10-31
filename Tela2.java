package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.FlowLayout;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tela2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela2 window = new Tela2();
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
	public Tela2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	public void IniciaTela() {
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(56, 11, 228, 37);
		panel_1.setBackground(Color.BLACK);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblVcm = new JLabel("Viol\u00EAncia Contra a Mulher\r\n\r\n");
		lblVcm.setForeground(Color.MAGENTA);
		lblVcm.setBounds(10, 0, 219, 37);
		panel_1.add(lblVcm);
		lblVcm.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(0, 0, 60, 48);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("I:\\PjiVcm\\imagens vcm\\logodoProjeto.PNG"));
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(43, 229, 200, 105);
		frame.getContentPane().add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon("I:\\PjiVcm\\imagens vcm\\estupro.jpg"));
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(166, 90, 108, 136);
		frame.getContentPane().add(lblNewLabel_4);
		lblNewLabel_4.setIcon(new ImageIcon("I:\\PjiVcm\\imagens vcm\\viol\u00EAncia-contra-mulher-we-can-stop-it.jpg"));
		
		JTextArea txtrALei = new JTextArea();
		txtrALei.setFont(new Font("Arial", Font.BOLD, 11));
		txtrALei.setText("A lei 11.340 de agosto de 2006, criou \r\nmecanismos visando coibir a viol\u00EAncia\r\n dom\u00E9stica e familiar contra a mulher.\r\nAssegura em seu art.2\u00BA oportunidades \r\ne facilidade para viver sem viol\u00EAncia, \r\npreservar a sa\u00FAde f\u00EDsica e mental, o seu \r\naperfei\u00E7oamento intelectual e social,\r\nindependente de classe, ra\u00E7a, etnia,\r\n orienta\u00E7\u00E3o sexual, renda, cultura, \r\nn\u00EDvel educacional, idade e religi\u00E3o. \r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\nIncumbe a fam\u00EDlia, a sociedade e ao poder p\u00FAblico criar condi\u00E7\u00F5es necess\u00E1rias para o exerc\u00EDcio efetivo dos direitos \u00E0 vida, \u00E0 seguran\u00E7a, \u00E0 sa\u00FAde, \u00E0 alimenta\u00E7\u00E3o, \u00E0 educa\u00E7\u00E3o, \u00E0 cultura, \u00E0 moradia, ao acesso \u00E0 justi\u00E7a, ao esporte, ao lazer, ao trabalho, \u00E0 cidadania, \u00E0 liberdade, \u00E0 dignidade, ao respeito e \u00E0 conviv\u00EAncia familiar e comunit\u00E1ria");
		txtrALei.setBounds(33, 333, 224, 148);
		frame.getContentPane().add(txtrALei);
		
		JTextArea txtrQueTodasAs = new JTextArea();
		txtrQueTodasAs.setFont(new Font("Arial", Font.BOLD, 11));
		txtrQueTodasAs.setText("Que todas as Mulheres, \r\nn\u00E3o s\u00F3 hoje \r\nmas todos os dias,\r\n sejam livres de\r\n qualquer viol\u00EAncia e \r\nque n\u00E3o lhe sejam\r\n negados direitos \u00E1 vida.\r\n Que sejam associadas a \r\nrespeito e dignidade.");
		txtrQueTodasAs.setBounds(7, 90, 143, 136);
		frame.getContentPane().add(txtrQueTodasAs);
		
		JButton btnChat = new JButton("Chat");
		btnChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnChat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela5 tela2 = new Tela5();
				tela2.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnChat.setBackground(Color.MAGENTA);
		btnChat.setBounds(0, 59, 70, 23);
		frame.getContentPane().add(btnChat);
		
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Tela1 tela2 = new Tela1();
				tela2.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setBounds(66, 59, 60, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnEmergenci = new JButton("P\u00E2nico");
		btnEmergenci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEmergenci.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Tela3 tela2 = new Tela3();
				tela2.IniciaTela();
				frame.setVisible(false);
			}
		});
		btnEmergenci.setBackground(Color.MAGENTA);
		btnEmergenci.setBounds(121, 59, 97, 23);
		frame.getContentPane().add(btnEmergenci);
		
		JButton btnNewButton_1 = new JButton("Perfil");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tela6 tela2 = new Tela6();
				tela2.IniciaTela();
				frame.setVisible(false);
				
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setBounds(215, 59, 69, 23);
		frame.getContentPane().add(btnNewButton_1);
	}
}
