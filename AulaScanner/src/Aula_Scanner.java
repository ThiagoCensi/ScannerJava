import java.util.Locale;
import java.util.Scanner;

public class Aula_Scanner {

	public static void main(String[] args) {
	
		// LEITOR DE TEXTOS
		//Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next();
		//System.out.println("Você digitou: " + x);
	

		
		//LEITOR DE NUMEROS INTEIROS
		//Scanner sc = new Scanner(System.in);
		
		//int x;
		//x = sc.nextInt();
		//System.out.println("Você digitou: " + x);
		

		
		
		//LEITOR NUMEROS QUEBRADOS BR (COM VIRGULA)
		//Scanner sc = new Scanner(System.in);
		
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Você digitou: " + x);
			
		
		
		//LEITOR NUMEROS QUEBRADOS BR (COM VIRGULA MODO2)
		//Scanner sc = new Scanner(System.in);
		
		//double x;
		//x = sc.nextDouble();
		//System.out.printf("Você digitou: %.2f%n", x);
		

		
		//LEITOR DE NUMEROS QUEBRADOS US (COM PONTO)
		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		
		//String x;
		//x = sc.next();
		//System.out.println("Você digitou: " + x);
		
		
		
		//LEITOR DE CHAR
		//Scanner sc = new Scanner(System.in);
				
		//char x;
		//x = sc.next().charAt(0);
		//System.out.println("Você digitou: " + x);
		
		

		//VÁRIAS LEITURAS DE DADOS JUNTO
		Scanner sc = new Scanner(System.in);
				
		String x;
		int y;
		double z;
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		
		sc.close();
	}

}
