package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ej4invertir;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class graficaej4 extends JFrame {

	private JPanel contentPane;
	private JTextField frase;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					graficaej4 frame = new graficaej4();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public graficaej4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFrase = new JLabel("Frase");
		lblFrase.setBounds(12, 85, 70, 15);
		contentPane.add(lblFrase);
		
		frase = new JTextField();
		frase.setBounds(62, 83, 332, 19);
		contentPane.add(frase);
		frase.setColumns(10);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(296, 225, 117, 25);
		contentPane.add(btnSalir);
		
		JButton btnInvertirFrase = new JButton("Invertir Frase");
		btnInvertirFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fraseinvertida = ej4invertir.invertirfrase(frase.getText());
				frase.setText(fraseinvertida);
			}
		});
		btnInvertirFrase.setBounds(62, 225, 195, 25);
		contentPane.add(btnInvertirFrase);
	}
}
