package listaCaderno;
import java.util.Scanner;
public class produtoDesc {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double p,d, vf;
		System.out.println("Digite o pre�o do produto:");
		p = ler.nextDouble();
		System.out.println("Digite o desconto:");
		d = ler.nextDouble();
		vf = p-(d/100*p);
		System.out.println("O pre�o final do produto � " + vf);
		ler.close();
	}

}
