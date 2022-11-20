package Composite;

import java.util.ArrayList;

public class Turma {
    
    private String idTurma;
    private ArrayList<Aluno> listarTurma;

    public Turma(String id){
        this.idTurma = id;
        listarTurma = new ArrayList<Aluno>(); 
    }

    public void adicionarAluno(Aluno alunoNovo) {
        listarTurma.add(alunoNovo);
    }

    public void removerAluno(Aluno alunoRemovido) {
        listarTurma.remove(alunoRemovido);
    }

    public ArrayList<Aluno> getListarTurma(){
        return listarTurma;
    }

    public String getIdTurma() {
        return idTurma;
    }
}
