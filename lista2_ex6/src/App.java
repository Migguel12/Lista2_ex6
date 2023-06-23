import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.print("Informe um número: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe um número: ");
        double n2 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe um número: ");
        double n3 = ler.nextDouble();
        System.out.println("");

        if(n1>n2 && n1>n3){
            System.out.println(n1);
        }

        else if(n2>n1 && n2>n3){
            System.out.println(n2);
        }

        else{
            System.out.println(n3);
        }
    }
}
