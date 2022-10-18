import desconto.Porcentagem;
import desconto.ValorTotal;
import pagamento.Cartao;
import pagamento.Pix;

public class App {
    public static void main(String[] args) throws Exception {
        Carrinho a = new Carrinho();
        a.setPagamento(new Cartao());
        a.pagar();
        a.setDesconto(new Porcentagem());
        a.aplicar();

        System.out.println("-------------------------");

        Carrinho b = new Carrinho();
        b.setPagamento(new Pix());
        b.pagar();
        b.setDesconto(new ValorTotal());
        b.aplicar();

    }
}
