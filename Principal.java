package triangulos;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner tec = new Scanner(System.in);	
	
	System.out.println("Digite o primeiro lado do triangulo.");
		float n1 = tec.nextFloat();
	
	
	System.out.println("Digite o segundo lado do triangulo.");
		float n2 = tec.nextFloat();
	
	System.out.println("Digite o terceiro lado do triangulo.");
		float n3 = tec.nextFloat();
	
	System.out.println(verificarTriangulo( n1, n2, n3));
	
	
	
	
	
	tec.close();
	
	}
	private static String verificarTriangulo(float n1, float n2, float n3) {
		
	
		
	if ( n1 == n2 && n1 == n3) {
		return "O triangulo é EQUÍLATERO";
		
	}else if(n1 != n2 && n1 != n3 && n2 != n3) {
		return "O triangulo é ESCALENO";
	}else{
		return "O triangulo é ISÓSCELES";
	}
	}
	
}
