package Grafico;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Logica.juego;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;


public class Juego extends JFrame {

	public static int clicks = 0;
	public static String numero = juego.crearNum();
	public static int  largo = 5;
	//mensajes de error
	public static String erroringreso = "La entrada no es valida. \nRecuerde: 5 digitos diferentes";
	public static String vacio = "Ingrese un numero de 5 digitos diferentes";
	//reglas
	public static String rule1 = "Se generara un numero aleatorio de 5 digitos distintos.\n" ;
	public static String rule2 = "Una vez ingresado su numero, se interpretara de la siguiente manera: \n";
	public static String bien = "Si un digito esta 'bien',\nsignifica que esta en la posicion correcta.\n";
	public static String regular = "Si un digito esta 'regular',\nimplica que esta en el numero aleatorio,\npero en otra posicion.\n";
	public static String mal = "Si un digito esta 'mal'\nsignifica que no esta en el numero sorteado.";
	public static String ruleset = rule1 + rule2 + bien + regular + mal;
	private JPanel contentPane;
	private JTextField ingreso;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego frame = new Juego();
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
	public Juego() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ingreso = new JTextField();
		ingreso.setBounds(134, 242, 114, 19);
		contentPane.add(ingreso);
		ingreso.setColumns(10);
		
		JButton Salir = new JButton("Salir");
		Salir.setVisible(false);
		
		JLabel lblNumero = new JLabel("Numero:");
		lblNumero.setBounds(63, 244, 70, 15);
		contentPane.add(lblNumero);

		JTextArea Mensajes = new JTextArea();
		Mensajes.setEditable(false);
		
		Mensajes.setText(ruleset);
		
		JButton btnCheck = new JButton("Check!");
		btnCheck.setEnabled(false);
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clicks++;
				String mensaje = "";
				String numuser = ingreso.getText();
				if (numuser.length() > 0) {
					boolean valida = juego.esEntradaValida(numuser);
					if (!valida) {
						Mensajes.setText(erroringreso);
					} else {
						if (numuser.charAt(0) != 'Q' && numuser.charAt(0) != 'q') {
							int bien = juego.cantBien(numuser, numero);
							if (bien < largo){
								if (bien>0) {
									mensaje = mensaje + bien + "Bien\n";
								}
								int reg = juego.cantReg(numuser, numero);
								if (reg > 0) {
									mensaje = mensaje + reg + "Regular\n";
								}
								if (bien+reg < largo) {
									String mal = largo - bien - reg + "";
									mensaje = mensaje + mal + "Mal\n";
								}
								Mensajes.setText(mensaje + "Tu eleccion: " + numuser);
							//	Mensajes.setText(mensaje + "\n " + numero);
								ingreso.setText("");
								
							} else {
								Mensajes.setText("FELICIDADES! Ha conseguido adivinar el numero. \nIntentos: " + clicks);
								Salir.setVisible(true);
								btnCheck.setVisible(false);
							}
						} else {
							Mensajes.setText("Juego finalizado por el usuario");
							System.exit(0);
						}
					}
				}  else {
					Mensajes.setText(vacio);
				}
				
			}
		});
		btnCheck.setBounds(272, 239, 117, 25);
		contentPane.add(btnCheck);
		
		Mensajes.setBounds(12, 0, 424, 184);
		contentPane.add(Mensajes);
		
		JButton btnEmpezar = new JButton("Empezar!");
		btnEmpezar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = "Se ha generado un numero de "+largo+" digitos,\n intente adivinarlo! \nIngrese Q para terminar con el programa";
				Mensajes.setText(str);
				//numero = juego.crearNum();
				btnEmpezar.setVisible(false);
				btnCheck.setEnabled(true);
			}
		});
		btnEmpezar.setBounds(63, 189, 117, 25);
		contentPane.add(btnEmpezar);
		
		Salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		Salir.setBounds(272, 189, 117, 25);
		contentPane.add(Salir);
	}
}
