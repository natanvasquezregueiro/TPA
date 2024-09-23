package listacomplementar;
import java.util.Scanner;
public class destino {
   public static void main (String args[]) {

	   Scanner ler = new Scanner(System.in);
	   String destino;
	   double d;
	   System.out.println("Digite o destino:");
	   destino = ler.next();
	   System.out.println("Digite a quantidade de dias que pretende ficar na cidade:");
	   d = ler.nextDouble();
	   if (destino.equalsIgnoreCase("ilhabela"))
           if (d<=5) {
	      System.out.println("O valor a pagar é de R$240,00");
	      d = ler.nextDouble();
      }else if (d>=6 && d<11) {
    	  System.out.println("O valor a pagar é de R$350,00");
    	  d = ler.nextDouble(); 
      }else {
    	  System.out.println("O valor a pagar é de R$360,00");
 	      d = ler.nextDouble();
      }
	   d = ler.nextDouble();
       if (destino.equalsIgnoreCase("fernandodenoronha")) {
   	      if (d<=5){
		   System.out.println("O valor a pagar é de R$500,00");
		      d = ler.nextDouble();
	  }else if (d>=6 && d<11) {
    	  System.out.println("O valor a pagar é de R$560,00");
	      d = ler.nextDouble();
      }else {
    	  System.out.println("O valor a pagar é de R$620,00");
	      d = ler.nextDouble();
      }
      ler.close();
}
}
}

