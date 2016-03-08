import java.util.Scanner;

public class Resta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("bienvenido al mundo de las restas");
		System.out.println("introduce un numero");
		Scanner input = new Scanner(System.in);
		int x= input.nextInt();
		System.out.println("Introduce un segundo numero");
		int y= input.nextInt();
		
		System.out.println(resta(x,y));
		System.out.println("El resultado de dividir "+ x+" entre" +y +" es: "+ division(x,y));
		System.out.println("divide y venceras");
	}//END MAIN
	public static int resta(int c, int d){
		int resta;
		resta= c-d;
		return resta;
	}
	public static int division (int c, int d){
		int division;
		division=c/d;
		return division;
	}
}//END CLASS
