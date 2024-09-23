import java.util.Scanner;
public class media {
	
	public static void main (String args[]) {
		Scanner ler = new Scanner(System.in); 
			Double n1,n2,nm = 0,e,m;
			System.out.println("Digite a primeira nota:");
			n1 = ler.nextDouble();
			System.out.println("Digite a segunda nota:");
			n2 = ler.nextDouble();
			m = (n1+n2)/2;
			System.out.println("Sua nota é" + m);
			if (m<3) {
				System.out.println("O aluno esta reprovado");
			} else if (m>=3 && m<6) {
				System.out.println("O aluno esta em exame"
						+
						"Digite a nota do exame:");
				e = ler.nextDouble();
				nm = (m+e)/2;
				System.out.println("Sua nova media:" + nm);
			if (nm>=6) {
				System.out.println("O aluno esta aprovado");
			} else {
				System.out.println("O aluno esta reprovado");
			}
			ler.close();
		
		}
	}
}