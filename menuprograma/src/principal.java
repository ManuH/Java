import java.util.ArrayList;
import java.util.List;


public class principal {

	/**
	 * @param args
	 */
	
	public static boolean esmenor (int a, int b) {
		boolean menor;
		if (a <= b) {
			menor = true;
		} else {
			menor = false;
		}
		return menor;
	}
	public static boolean sube (List<Integer> lista) {
		boolean sube = false;
		boolean salgo = false;
		int i = 0;
			do {
				if (esmenor(lista.get(i), lista.get(i+1))) {
					i++;
				} else {
					salgo = true;
				}
			}while (i < lista.size() - 1 && !salgo);
			if (i == lista.size() - 1) {
				sube = true;
			}
		return sube;
	}
	public static boolean hay(List<Integer> lista, int i) {
		boolean esta = false;
		if (i <= lista.size() - 1) {
			esta = true;
		}
		return esta;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;
		List <Integer> lista = new ArrayList<Integer>();
		do{
			System.out.println("1- Insertar elemento");
			System.out.println("2- Borrar elemento");
			System.out.println("3- Despliega lista y cantidad de elementos");
			System.out.println("4- Salir");
			System.out.println("5- Verificar orden de lista");
			System.out.println("6- Busca un elemento en la lista");
			System.out.print("Seleccione su opcion: ");
			opcion = Teclado.LeerEntero();
			switch (opcion) {
			case 1:
				int elem = 0;
				System.out.println("");
				System.out.print("Ingrese elemento: ");
				elem = Teclado.LeerEntero();
				System.out.println("");
				lista.add(elem);
				System.out.println("Elemento insertado con exito");
				break;
			case 2:
				if (lista.size() == 0) {
					System.out.println("La lista esta vacia");
				} else {
					System.out.println("");
					System.out.print("Ingrese el lugar que desea borrar: ");
					System.out.println("");
					int point = Teclado.LeerEntero();
					if (point <= lista.size() - 1) {
						lista.remove(point);
						System.out.println("Elemento removido con exito");
					} else {
						System.out.println("No existe el elemento");
					}
				}	
				break;
			case 3:
				System.out.println("");
				if (lista.size() == 0) {
					System.out.println("Lista vacia");
				} else {
					System.out.println("Total: " + lista.size() + " elementos");
					for (int i = 0; i < lista.size(); i++) {
						System.out.println("Posicion(" + i + "): " + lista.get(i));
					}	
				}
				System.out.println("");
				break;
			case 4:
				break;
			case 5:
				boolean orden = sube(lista);
				if (orden) {
					System.out.println("");
					System.out.println("Lista ordenada");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("Lista no ordenada");
					System.out.println("");
				}
				break;
			case 6:
				System.out.println("Ingrese lugar a buscar: ");
				int i = Teclado.LeerEntero();
				if (hay(lista, i)) {
					System.out.print("El elemento es: " + lista.get(i));
				} else {
					System.out.println("No hay elementos en esa posicion");
				}
				break;
			default:
				System.out.println("");
				System.out.println("Debe ingresar 1, 2, 3, 4, 5 o 6 segun la opcion");
				System.out.println("");
			}
		}while (opcion != 4);
	}

}
