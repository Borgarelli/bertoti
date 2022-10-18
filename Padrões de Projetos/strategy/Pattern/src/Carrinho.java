import desconto.Desconto;
import pagamento.Pagamento;

public class Carrinho {
    
    Pagamento pagamento;
    Desconto desconto;

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void setDesconto(Desconto desconto) {
        this.desconto = desconto;
    }

    public void aplicar(){
        this.desconto.aplicar();
    }

    public void pagar(){
        this.pagamento.pagamento();
    }

}
