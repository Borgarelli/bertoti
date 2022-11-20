import Composite.Aluno;
import Composite.Turma;

public class Composite {
    
    public static void main(String[] args){
        
        Aluno aluno1 = new Aluno("Kauã", 3000);

        Aluno aluno2 = new Aluno("Borgarelli", 2000);

        Aluno aluno3 = new Aluno("Tavares", 1000);

        Turma novaTurma = new Turma("Banco de dados");
        novaTurma.adicionarAluno(aluno1);
        novaTurma.adicionarAluno(aluno2);
        novaTurma.adicionarAluno(aluno3);

        Aluno aluno4 = new Aluno("Walbon", 4000);
        Aluno aluno5 = new Aluno("Santos", 5000);

        novaTurma.adicionarAluno(aluno4);
        novaTurma.adicionarAluno(aluno5);

        novaTurma.removerAluno(aluno1);
        novaTurma.removerAluno(aluno4);
        novaTurma.removerAluno(aluno5);

        System.out.println("Alunos da turma " + novaTurma.getIdTurma());

        for (Aluno aluno : novaTurma.getListarTurma()) {
            System.out.println(aluno.getNome() + " " + aluno.getMatricula());
        }
    }
}
