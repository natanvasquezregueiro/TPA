package tomadadeDecis�o2;
import java.util.Scanner;
public class nomeId {
	public static void main (String args[]) {
		Scanner ler = new Scanner (System.in);
		String nome, nomevelho, nomenovo;
		int id, idadenovo, idadevelho;
		System.out.println("Digite o nome do primeiro us�ario:");
		nome = ler.next();
		System.out.println("Digite a idade do primeiro us�ario:");
		id = ler.nextInt();
		nomevelho= nome;
		idadevelho= id;

		nomenovo= nome;
		idadenovo= id;
		
		System.out.println("Digite o nome do segundo us�ario: ");
		nome = ler.next();
		System.out.println("Digite a idade do segundo us�ario: ");
		id = ler.nextInt();
		if (id>idadevelho) {
			nomevelho= nome;
			idadevelho= id;
		}else {
			nomenovo= nome;
			idadenovo= id;
		}
		 System.out.println("Digite o nome do terceiro us�ario: ");
		 nome = ler.next();
		 System.out.println("Digite a idade do terceiro us�ario :");
		 id = ler.nextInt();
	     if (id>idadevelho){
		  nomevelho= nome;
		  idadevelho= id;
	   }else if (id<idadenovo) {
		  nomenovo= nome;
		  idadenovo= id;
	   }
	    System.out.println("Digite o nome do quarto us�ario: ");
		nome = ler.next();
		System.out.println("Digite a idade do quarto us�ario: ");
		id = ler.nextInt();   
		if (id>idadevelho){
		  nomevelho= nome;
	      idadevelho= id;
		}else if (id<idadenovo) {
			  nomenovo= nome;
			  idadenovo= id;
	    }
		 System.out.println("Digite o nome do quinto us�ario: ");
		 nome = ler.next();
		 System.out.println("Digite a idade do quinto us�ario: ");
		 id = ler.nextInt();   
		 if (id>idadevelho){
			  nomevelho= nome;
		      idadevelho= id;
		}else {
			nomenovo= nome;
			idadenovo= id;
		}
		 System.out.println("O us�ario mais velho �:"+nomevelho+".");
		 System.out.println("Sua idade �: "+idadevelho+"Anos.");
		 
		 System.out.println("O us�ario mais novo �:"+nomenovo+".");
		 System.out.println("Sua idade �: "+idadenovo+"Anos.");
		 ler.close();
}
}