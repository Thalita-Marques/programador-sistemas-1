package controller;

public class EscopoDeVariavel {
	static int x = 2; // vari�vel global

	public static void metodoA() {
		int x = 25;
		System.out.println("Variavel local x ao entrar no metodoA � " + x);
		x = x + 1;
		System.out.println("vari�vel local x antes de sair do metodoA � " + x);
	}

	public static void metodoB() {
		System.out.println("Vari�vel x ao entrar no metodoB � " + x + " global.");
		x = x * 10;
		System.out.println("Vari�vel x antes de sair do metodoB � " + x);
	}
	
	public static void metodoB(double y)
	{
		//System.out.println("Eu");
		System.out.println("Vari�vel x aoe ntrar no metodoB � "+ y + " global.");
		y = y*10;
		System.out.println("Vari�vel x antes de sair do	metodoB � "+y);
	}
	
	
	public static int metodoB(int x)
	{
		System.out.println("Vari�vel x aoe ntrar no metodoB � "+ x + " global.");
		x = x*10;
		System.out.println("Vari�vel x antes de sair do	metodoB � "+x);
		return x;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//metodoA();
		//metodoB();
		int x = 5;
		x = x + 7;
		System.out.println("x no in�cio de main() � " + x);
		//metodoA();
		//System.exit(1);
		//metodoB();
		System.out.println("=======================");
		x = metodoB(x);
		System.out.println(x);
		System.out.println("=======================");
		metodoB(2.00);
	}

}
