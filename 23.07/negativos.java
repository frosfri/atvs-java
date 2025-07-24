import java.util.Scanner;
public class negativos {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int negativos = 0;

        for (int i = 0; i < 10; i++) {
            double valor = input.nextDouble();
            if (valor < 0) {
                negativos++;
            }
        }

        System.out.println(negativos);
    }
}


