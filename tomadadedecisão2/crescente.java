import java.util.Scanner;
public class Crescente {
    
	public static void main(String args[]) {
         Scanner ler = new Scanner(System.in);
             int a,b,c;
             System.out.println("Digite o valor a:" );
             a = ler.nextInt();
             System.out.println("Digite o valor b:");
             b = ler.nextInt();
             System.out.println("Digite o valor c:");
             c = ler.nextInt();
             if (a<b && b<c) {
            	 System.out.println("Os valores em ordem crescente s�o:" + a + ", " + b + ", " + c);
             }else if  (a<c && c< b){
            	 System.out.println("Os valores em ordem crescente s�o:" + a + ", " + c + ", " + b);
             }else if (b<a && a<c) {
            	 System.out.println("Os valores em ordem crescente s�o:" + b + ", "+ a + ", " + c);
             }else if (b<c && c<a) {
            	 System.out.println("Os valores em ordem crescente s�o:" + b + ", "+ c + ", " + a);
             }else if (c<a && a<b) {
            	 System.out.println("Os valores em ordem crescente s�o:" + c + ", " + a + ", " + b);
             }else {
            	 System.out.println("Os valores em ordem crescente s�o:" + c + ", " + b + ", " + a);
             }
    	 ler.close();
     }
}

	/** abc
	 * acb
	 * bac
	 * bca
	 * cab
	 * cba*/
