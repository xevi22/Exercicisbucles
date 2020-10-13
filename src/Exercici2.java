import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        String paraulaSecreta;
        final int numErrorsPossibles = 5;
        int errors=0;
        boolean paraulaTrobada = false;

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriu la paraula secreta: ");
        paraulaSecreta = sc.nextLine();
        char[] lletresParaula = new char[paraulaSecreta.length()];
        char[] lletresAmeguades = new char[paraulaSecreta.length()];
        boolean [] control = new boolean[paraulaSecreta.length()];

        for (int i=0; i<lletresAmeguades.length; i++){
             lletresAmeguades[i] ='-';
        }

        for (int i=0 ; i<paraulaSecreta.length(); i++){
            lletresAmeguades[i] = paraulaSecreta.charAt(i);
        }

        do {
            System.out.println("###############");
            System.out.println("    PANELL     ");
            System.out.println("###############");
            for (int i=0; i<control.length; i++) {
                if (control[i] == true) {
                    System.out.println(lletresParaula[i] + " ");
                } else {
                    System.out.println(lletresAmeguades[i] + " ");
                }
            }
            char lletra;
            System.out.println("Introdueix una lletra: ");
            lletra = sc.nextLine().charAt(0);
            boolean llentraOk=false;

            for (int i = 0;i<lletresParaula.length; i++){
                 if(lletresParaula[i]==lletra){
                    control[i] = true;
                    llentraOk = true;
                 }
            }

            if (llentraOk==false) {
                errors++;
            }else{
                int compatadorsTrues = 0;
                for (int i=0; i<control.length; i++) {
                    if (control[i] == true) {
                        compatadorsTrues = true;
                    }
                }
            }
        }while (errors<numErrorsPossibles && !paraulaTrobada);
        if(paraulaTrobada == true){
            System.out.println("Feliçitats as guanyat!!!!!!!!!!");
        }else {
            System.out.println("Ets molt dolent! has perdut");
        }

       // for (int i=0 ; i<lletresAmeguades.length ; i++) {
           // System.out.println("");
       // }
    }
}
