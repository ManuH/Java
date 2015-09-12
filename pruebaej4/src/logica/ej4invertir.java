package logica;

public class ej4invertir {

	public static String invertirfrase (String Frase) {
		String fraseinvertida = "";
		for (int i = Frase.length() - 1; i>-1; i--) {
			String frase = "" + Frase.charAt(i);
			fraseinvertida = fraseinvertida + frase;
		}
		return fraseinvertida;
	}
}
