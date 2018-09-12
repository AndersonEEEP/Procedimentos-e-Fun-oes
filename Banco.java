import java.util.Scanner;
public class Banco {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Banco obj = new Banco();
        double valor = 0;
        while(true){
            obj.Tela();
        System.out.println("Escolha uma opção");
        int escolha = tcl.nextInt();

    switch(escolha){
        
            case 1:
                obj.Saldo(valor);   
                break;
            case 2:
                valor = obj.Deposito(valor);
                break;
            case 3:
                valor = obj.Saque(valor);
                break;
            case 4:
                obj.Sair();
                break;
            default:
                System.out.println("Escolha uma opção válida");
        
        }
    
}
               
        
}
    public void Saldo(double saldo){
        System.out.println(saldo);
        
    }
    public void Tela(){
        System.out.println("Banco");
        System.out.println("");
        System.out.println("1 - Mostrar saldo");
        System.out.println("2 - Fazer deposito");
        System.out.println("3 - Fazer saque");
        System.out.println("4 - Sair");
    } 
    

    public double Deposito(double valor){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Quanto deseja depositar?");
        double deposito = tcl.nextDouble();
        valor = valor  + deposito;
        return valor;
    }
    public double Saque(double valor){
        Scanner tcl = new Scanner(System.in);
        System.out.println("Quanto deseja sacar?");
        double saque = tcl.nextDouble();
        valor = valor - saque;
        return valor;
    }

public void Sair(){
    System.exit(0);
}   
}