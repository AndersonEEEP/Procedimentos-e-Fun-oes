import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner tcl = new Scanner(System.in);
		int atual = 0;
		int proximo = 0;
		int anterior = 1;
		System.out.println("Digite a posicao da sequencia fibonacci");
		int num = tcl.nextInt();
		int sequencia[] = new int [num];
		for (int i = 0; i < sequencia.length; i++) {
			proximo=atual+anterior;
			anterior=atual;
			atual=proximo;
			sequencia[i] = proximo;
		}
		for (int i = 0; i < sequencia.length; i++) {
			System.out.print(sequencia[i] + "\t");
		} 

	}

}  

