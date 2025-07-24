
    import java.util.Scanner;

public class fatoral {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = input.nextInt();

        for (int i = numero - 1; i > 0; i--) {
            numero *= i;
        }

        System.out.println("Resultado: " + numero);
    }
}

