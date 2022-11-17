public class Principal {
    public static void main(String[] args){
        GerenciadorImpressão g1 = GerenciadorImpressão.getInstance(); //Puxa o metódo criado dentro da classe Gerenciador
        GerenciadorImpressão g2 = GerenciadorImpressão.getInstance();
        GerenciadorImpressão g3 = GerenciadorImpressão.getInstance();
        GerenciadorImpressão g4 = GerenciadorImpressão.getInstance();

        System.out.println(g1); //Faz a impressão da localização que o metódo ocupa na memória
        System.out.println(g2);
        System.out.println(g3);
        System.out.println(g4);
    }
}
