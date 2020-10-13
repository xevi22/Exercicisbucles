import java.util.Scanner;
public class Exercici1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numPositius=0;
        int numNegatius=0;
        int numEntrat;
        do{
            System.out.println("Introdueix un numero(Per finalitzar introdueix 0): ");
            numEntrat=sc.nextInt();
            if (numEntrat>0){
                numPositius++;
            }else if(numEntrat<0){
                numNegatius++;
            }
        }while (numEntrat!=0);

        System.out.println("Numeros positius;"+numPositius);
        System.out.println("Numeros positius;"+numNegatius);
    }
}