import java.util.Scanner;
public class cantina {
	public static void main(String args[]) {
		Scanner ler = new Scanner (System.in);
		int cod;
		System.out.println("Digite o c�digo do produto:");
		cod = ler.nextInt();
		switch (cod) {
		case 1:
			System.out.println("Descri��o: Cachorro-quente. Valor: R$8,00");
			break;
		case 2:
			System.out.println("Descri��o: cheeseburger.  Valor: R$12,00");
			break;
		case 3:
			System.out.println("Descri��o: X-Salada.  Valor: R$15,00");
			break;
		case 4:
			System.out.println("Descri�a�: Misto Quente.  Valor: R$11,00");
			break;
		case 5:
			System.out.println("Descri�a�: P�o na chapa. Valor: R$6,00");
			break;
		default:
			System.out.println("C�digo invalido");
			break;
		}
	}
}
