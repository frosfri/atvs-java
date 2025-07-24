public class estoque {
    
    public static void main(String[] args) {
        int[] estoque = {12, 8, 30, 5, 22, 40, 18};

        int maior = estoque[0];
        for (int i = 1; i < estoque.length; i++) {
            if (estoque[i] > maior) {
                maior = estoque[i];
            }
        }

        System.out.println("Maior quantidade no estoque: " + maior);
    }
}

