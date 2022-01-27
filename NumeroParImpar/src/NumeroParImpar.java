/*import java.util.Scanner;

public class NumeroParImpar {
	
	public static boolean esPar(int numero) {
		return numero % 2 == 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		if (esPar(numero)) {
			System.out.println("Es par: " + numero);
		} else {
			System.out.println("Es impar: " + numero);
		}
	}
}
*/

/*public class NumeroParImpar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		if (numero % 2 == 0) {
			System.out.println("El número " + numero + " es par");
		} else {
			System.out.println("El número " + numero + " es impar");
		}
	}
}
*/



import java.util.Scanner;
public class NumeroParImpar{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un número entero: ");
		int numero = sc.nextInt();
		
		String resultado = (numero % 2 == 0) ? ("Es par") : ("Es impar");
		
		System.out.println(resultado);
		System.out.println(numero);
	}
}









 
