import java.util.Scanner;
public class primo {
public static void main (String args[]) {
	Scanner ler = new Scanner (System.in);
	int n = 0, divisor=2, contagemDivisores=0;
	
	System.out.println("Digite o número: ");
	n = ler.nextInt();
	
		if(n<2) {
			System.out.println(n + " não é primo.");
		}else {
			while (divisor<n) {
				if(n % divisor==0) {
					contagemDivisores++;
				}
				divisor++;
			}
			if(contagemDivisores==0) {
			   System.out.println(n +" é primo.");
			}else {
		       System.out.println(n +" não é primo.");
			}
		}
	ler.close();
}
}
