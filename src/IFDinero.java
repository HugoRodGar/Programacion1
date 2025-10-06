import java.util.Scanner;

public class IFDinero {

    public static void main(String[] args) {

        //input
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu dinero");
        final double dinero = sc.nextDouble();

        //Output
        if (dinero > 7) {
            System.out.println("Te puedes comprar una Cocacola y un Bocadillo");
        } else if (dinero > 5) {
            System.out.println("Te puedes comprar Agua y un Bocadillo");
        } else if (dinero > 2) {
            System.out.println("Te puedes comprar una Cocacola");
        } else {
            System.out.println("Te puedes comprar Agua");
        }

        sc.close();

    }
}
