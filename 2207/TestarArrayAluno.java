public class TestarArrayAluno {
    public static void main(String[] args) {
       
        Aluno[] turma = new Aluno[5];

        
        turma[0] = new Aluno("Ana", 7.0, 8.5);
        turma[1] = new Aluno("Bruno", 6.0, 5.0);
        turma[2] = new Aluno("Carla", 9.0, 9.5);
        turma[3] = new Aluno("Diego", 4.5, 6.5);
        turma[4] = new Aluno("Elisa", 10.0, 9.0);

        
        System.out.println("Lista de alunos e suas médias:");
        for (int i = 0; i < turma.length; i++) {
            System.out.println("Aluno: " + turma[i].nome + 
                               " | Média: " + turma[i].calcularMedia());
        }
    }
}
