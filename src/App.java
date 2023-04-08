import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = sc.nextDouble();
        System.out.print("Digite outro número: ");
        double n2 = sc.nextDouble();
        double s = n1 + n2;

        System.out.print("A soma é " + s);

        sc.close();

    }

}
