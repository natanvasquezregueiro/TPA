import java.util.Scanner;
public class temperatura {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		double f,c;
		System.out.println("Digite a temperatura em fahrenheit:");
		f = ler.nextDouble();
		c = (f-32)/1.8;
		System.out.println("Sua temperatura em celsius �:" + c );
		if(c<15) {
			System.out.println("Frio");
		} else if (c<22) {
			System.out.println("Ameno");
		} else {
			System.out.println("Calor");
		}
		ler.close();
	}
}