public class Principal {
    public static void main(String[] args){
        GerenciadorImpressão g1 = GerenciadorImpressão.getInstance();
        GerenciadorImpressão g2 = GerenciadorImpressão.getInstance();
        GerenciadorImpressão g3 = GerenciadorImpressão.getInstance();
        GerenciadorImpressão g4 = GerenciadorImpressão.getInstance();

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
    }
}
