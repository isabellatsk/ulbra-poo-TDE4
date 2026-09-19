public class PagamentoCartao implements Pagamento {

    private String numeroCartao;
    private String titular;

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.printf("Pagamento de R$%.2f realizado com cartão.%n", valor);
    }
}