public class GerenciadorImpressão {

    private static GerenciadorImpressão gerenciadorImpressão;

    private GerenciadorImpressão(){ //criação do metódo construtor sem parametros

    }

    public static GerenciadorImpressão getInstance(){
        if (gerenciadorImpressão == null){ //Aqui entra a lógica do Singleton, porque sempre que o valor foi igual a nulo, ele criara um novo espaço alocado na memória, porém ele nunca é nulo, por ja ocupar um espaço ele nunca vai retornar outro valor na memória
        gerenciadorImpressão = new GerenciadorImpressão();
    }
        return gerenciadorImpressão;
    }
}
