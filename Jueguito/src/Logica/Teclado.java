package Logica;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Teclado {

	/**
	 * @param args
	 */
	public static String LeerCadena() {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		try {
			str = br.readLine();
		} catch (Exception e) {
			str = " ";
		}
		
		return str;
	}
	
	public static int LeerEntero() {
		int num;
		try {
			num = Integer.parseInt(LeerCadena().trim());
		} catch (Exception e) {
			num = 0;
		}
		return num;
	}
	
	public static char LeerCaracter(){
		char ch;
		
		try {
			ch = LeerCadena().charAt(0);
		} catch (Exception e) {
			ch = 0;
		}
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		System.out.print("Ingrese una cadena: ");
		String str = LeerCadena();
		System.out.println(str);
		*/
		/*
		System.out.print("Ingrese un numero: ");
		int num = LeerEntero();
		System.out.println(num);
		*/
		/*
		System.out.print("Ingrese un caracter: ");
		char ch = LeerCaracter();
		System.out.println(ch);
		*/
	}
	
}
