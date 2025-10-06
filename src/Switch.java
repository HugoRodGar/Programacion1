import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce tu posicion de clase");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("David");
                break;
            case 2:
                System.out.println("Antonio");
                break;
            case 3:
                System.out.println("Juan Carlos");
                break;
            default:
                System.out.println("Gabriel");
                break;
        }
    }
}
