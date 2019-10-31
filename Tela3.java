package views;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tela3 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tela3 window = new Tela3();
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
	public Tela3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 317, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCancelar = new JButton("cancelar");
		btnCancelar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			 Tela2 tela3 = new Tela2();
			 tela3.IniciaTela();
			frame.setVisible(false);
			}
		});
		btnCancelar.setBounds(106, 340, 89, 23);
		btnCancelar.setBackground(new Color(255, 0, 255));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnCancelar);
		
		JLabel lblGabriela = new JLabel("Gabriela Soares Pimentel\r\n");
		lblGabriela.setBounds(41, 191, 211, 24);
		lblGabriela.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		frame.getContentPane().add(lblGabriela);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(95, 92, 100, 93);
		lblNewLabel.setIcon(new ImageIcon("F:\\PjiVcm\\imagens vcm\\imagesboneca.jpg"));
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnPnico = new JButton("P\u00E2nico");
		btnPnico.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnPnico.setBounds(78, 226, 137, 88);
		btnPnico.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPnico.setForeground(new Color(0, 0, 0));
		btnPnico.setBackground(new Color(255, 0, 51));
		frame.getContentPane().add(btnPnico);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBackground(new Color(0, 0, 0));
		lblNewLabel_1.setBounds(64, 53, 112, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(54, 11, 237, 35);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Viol\u00EAncia Contra a Mulher");
		lblNewLabel_3.setFont(new Font("Yu Gothic Medium", Font.BOLD, 15));
		lblNewLabel_3.setForeground(new Color(255, 0, 255));
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("F:\\PjiVcm\\imagens vcm\\logodoProjeto.PNG"));
		lblNewLabel_2.setBounds(0, 0, 50, 56);
		frame.getContentPane().add(lblNewLabel_2);
	}

	public void IniciaTela() {
		frame.setVisible(true);
		
	}
}
