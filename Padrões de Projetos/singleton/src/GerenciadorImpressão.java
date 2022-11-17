public class GerenciadorImpressão {
    private static GerenciadorImpressão gerenciadorImpressão;

    private GerenciadorImpressão(){

    }

    public static GerenciadorImpressão getInstance(){
        if (gerenciadorImpressão == null){
        gerenciadorImpressão = new GerenciadorImpressão();
    }
        return gerenciadorImpressão;
    }
}
