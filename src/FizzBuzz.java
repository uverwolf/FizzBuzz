import java.util.Scanner;

public class FizzBuzz {
	//Metodo condicional
	static void condicional(int valor){
		if (valor%5 ==0 && valor %3==0) {
			System.out.println("FizzBuzz");
			}
		else if(valor%3 == 0) {
			System.out.println("Fizz");
		}else if (valor%5 ==0) {
			System.out.println("Buzz");
		
		}else {
			System.out.println(valor);
		}
		
		
	}
	public static void main(String[] args) {
		//Se llama a la clase scanner para realizar un ingreso de dato//
		Scanner numero = new Scanner(System.in);
		try {
			
			System.out.println("Ingrese un numero: ");
			//Se Lee el numero ingresado
			int numeroIngresado = numero.nextInt();
			//Se ejecuta el metodo con el numero ingresado por el usuario
			condicional(numeroIngresado);
			
		} catch (Exception e) {
			//Codigo en caso de caracter invalido
			System.out.println("El valor ingresado no es un numero");
			
		}finally {
			numero.close();
		}

	}

}
