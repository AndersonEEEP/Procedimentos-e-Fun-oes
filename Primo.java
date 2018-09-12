
import java.util.Scanner;
public class Primo {
   public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor:");
        
        int num = tcl.nextInt();
        double numD=num;
        
        if ((numD/numD)==(num/num)){
            if(numD/2!=num/2 || num==2){
                System.out.println("O valor informado é primo!");
            } else {
                System.out.println("O valor informado não é primo!");
            }
        } else {
            System.out.println("O valor informado não é primo!");
        }
    }

}
