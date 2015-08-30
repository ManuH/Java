package Logica;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Logica {
	
	public static boolean NombreVale (String name) {
		
		final String pattern_name = "^([A-Za-z])+";
		//compilo la expresion
		Pattern nombre = Pattern.compile(pattern_name);
		//armo el matcher
		Matcher coincide = nombre.matcher(name);
		return coincide.matches();
	}
	
	public static boolean Direvale (String dire) {
		//compilo patron
		Pattern pat_dire = Pattern.compile("^[A-Za-z]+\\s[0-9]{1,4}$");
		Matcher coincide = pat_dire.matcher(dire);
		return coincide.matches();
	}
	public static boolean ESFechaCorrecta (String a){
		Pattern p = Pattern.compile("^([0-3][0-9]){1}/{1}([01][0-2]){1}/{1}([12][09][1-9][0-9]){1}+");
		Matcher m = p.matcher(a);
		return m.matches();
		}
	public static boolean EsCiCorrecta (String a) {
	Pattern p = Pattern.compile("^([0-9])+$");
	Matcher m = p.matcher(a);
	return m.matches();
	}
	public static boolean ESEmailCorrecto (String a){
	Pattern p = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
	Matcher m = p.matcher(a);
	return m.matches();
	}
	public static boolean CICorrecta(String cedula) {
		boolean vale;
		int largo = cedula.length();
		if (largo < 7) {
			vale = false;
		} else {
			if (largo == 8) {
				
				int numero= Integer.parseInt(cedula);
				//4 6 2 5 3 3 5 0
				int a= (numero/10000000);
				int b= (numero/1000000)%10;
				int c= (numero/100000)%10;
				int d= (numero/10000)%10;
				int e= (numero/1000)%10;
				int f=(numero/100)%10;
				int g= (numero/10)%10;
				int h= (numero%10);
				int guion= a*2 +b*9 +c*8 +d*7 +e*6 +f*3 +g*4;
				while (guion>10) {
					guion= guion-10;
				}
				if ((10-guion)==h) {
					vale = true;
				} else {
					vale = false;
				}
			} else {
				int numero = Integer.parseInt(cedula);
				
				int a= 0;
				int b= (numero/1000000)%10;
				int c= (numero/100000)%10;
				int d= (numero/10000)%10;
				int e= (numero/1000)%10;
				int f=(numero/100)%10;
				int g= (numero/10)%10;
				int h= (numero%10);
				int guion= a*2 +b*9 +c*8 +d*7 +e*6 +f*3 +g*4;
				while (guion>10) {
					guion= guion-10;
				}
				if ((10-guion)==h) {
					vale = true;
				} else {
					vale = false;
				}
			}
		}
	return vale;
	}
	public static boolean EsSueldoOk (String sueldo) {
		Pattern p = Pattern.compile("[0-9]+");
		Matcher m = p.matcher(sueldo);
		return m.matches();
	}
}

