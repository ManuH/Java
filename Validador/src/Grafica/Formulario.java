package Grafica;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import datechooser.beans.DateChooserPanel;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private final JTextField Nombre = new JTextField();
	private JTextField Direccion;
	private JTextField Cedula;
	private JTextField txtApellido;
	private JTextField Ocupacion;
	private JTextField Sueldo;
	private JTextField Mail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 515, 447);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Nombre343 = new JLabel("Nombre:");
		Nombre343.setBounds(12, 12, 70, 15);
		contentPane.add(Nombre343);
		Nombre.setBounds(78, 6, 114, 28);
		contentPane.add(Nombre);
		Nombre.setColumns(10);
		
		JLabel Apellido32 = new JLabel("Apellido:");
		Apellido32.setBounds(244, 12, 70, 15);
		contentPane.add(Apellido32);
		
		JLabel Direcciondsds = new JLabel("Direccion:");
		Direcciondsds.setBounds(12, 83, 70, 15);
		contentPane.add(Direcciondsds);
		
		JLabel lblNewLabel_2 = new JLabel("Edad:");
		lblNewLabel_2.setBounds(301, 183, 70, 15);
		contentPane.add(lblNewLabel_2);
		
		JLabel Cedulajj = new JLabel("C.I.:");
		Cedulajj.setBounds(12, 292, 70, 15);
		contentPane.add(Cedulajj);
		
		JLabel lblsinPuntoNi = new JLabel("(Sin punto ni guion)");
		lblsinPuntoNi.setBounds(12, 319, 160, 15);
		contentPane.add(lblsinPuntoNi);
		
		JLabel Ocupaciondsds = new JLabel("Ocupacion:");
		Ocupaciondsds.setHorizontalAlignment(SwingConstants.LEFT);
		Ocupaciondsds.setBounds(12, 356, 81, 15);
		contentPane.add(Ocupaciondsds);
		
		JLabel lblSueldo = new JLabel("Sueldo:");
		lblSueldo.setBounds(281, 356, 70, 15);
		contentPane.add(lblSueldo);
		DateChooserPanel dateChooserPanel = new DateChooserPanel();
		JButton btnVerificarDatos = new JButton("Verificar");
		btnVerificarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//corroboro nombre
				if (Logica.Logica.NombreVale(Nombre.getText())) {
					Nombre.setBackground(Color.GREEN);;
				} else {
					Nombre.setBackground(Color.RED);
				}
				//corroboro apellido
				if (Logica.Logica.NombreVale(txtApellido.getText())) {
					txtApellido.setBackground(Color.GREEN);
				} else {
					txtApellido.setBackground(Color.RED);
				}
				//corroboro direccion
				if (Logica.Logica.Direvale(Direccion.getText())) {
					Direccion.setBackground(Color.GREEN);
				} else {
					Direccion.setBackground(Color.RED);
				}
				//corroboro cedula
				if (Logica.Logica.EsCiCorrecta(Cedula.getText())) {
					if (Logica.Logica.CICorrecta(Cedula.getText())) {
						Cedula.setBackground(Color.GREEN);
					} else {
						Cedula.setBackground(Color.RED);
					}
					
				} else {
					Cedula.setBackground(Color.RED);
				}
				//corroboro mail
				if (Logica.Logica.ESEmailCorrecto(Mail.getText())) {
					Mail.setBackground(Color.GREEN);
				} else {
					Mail.setBackground(Color.RED);
				}
				//corroboro ocupacion
				if (Logica.Logica.NombreVale(Ocupacion.getText())) {
					Ocupacion.setBackground(Color.GREEN);
				} else {
					Ocupacion.setBackground(Color.RED);
				}
				//corroboro sueldo
				if (Logica.Logica.EsSueldoOk(Sueldo.getText())) {
					Sueldo.setBackground(Color.GREEN);
				} else {
					Sueldo.setBackground(Color.RED);
				}
				//corroboro fecha
				/*
				if (Logica.Logica.ESFechaCorrecta(FechaNac.getText())) {
					FechaNac.setBackground(Color.GREEN);
				} else {
					FechaNac.setBackground(Color.RED);
				}
				*/
				Date fnac = dateChooserPanel.getDate();
			}
		});
		btnVerificarDatos.setBounds(78, 383, 117, 25);
		contentPane.add(btnVerificarDatos);
		
		Direccion = new JTextField();
		Direccion.setText("");
		Direccion.setBounds(108, 82, 330, 17);
		contentPane.add(Direccion);
		Direccion.setColumns(10);
		
		Cedula = new JTextField();
		Cedula.setBounds(56, 290, 114, 19);
		contentPane.add(Cedula);
		Cedula.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBounds(389, 183, 70, 15);
		contentPane.add(textArea);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(316, 6, 122, 28);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		Ocupacion = new JTextField();
		Ocupacion.setBounds(100, 354, 114, 19);
		contentPane.add(Ocupacion);
		Ocupacion.setColumns(10);
		
		Sueldo = new JTextField();
		Sueldo.setBounds(345, 354, 114, 19);
		contentPane.add(Sueldo);
		Sueldo.setColumns(10);
		
		JLabel lblMail = new JLabel("Mail:");
		lblMail.setBounds(222, 292, 70, 15);
		contentPane.add(lblMail);
		
		Mail = new JTextField();
		Mail.setBounds(281, 290, 114, 19);
		contentPane.add(Mail);
		Mail.setColumns(10);
		
		
		dateChooserPanel.setAutoScroll(false);
		dateChooserPanel.setBounds(42, 110, 250, 180);
		contentPane.add(dateChooserPanel);
	}
}
