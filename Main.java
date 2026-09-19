//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PagamentoCartao cartao = new PagamentoCartao();
        cartao.setNumeroCartao("123456789");
        cartao.setTitular("Isa");
        cartao.realizarPagamento(150);

        PagamentoPix pix = new PagamentoPix();
        pix.setChavePix("isa@email.com");
        pix.setNomeTitular("Isa");
        pix.realizarPagamento(75);
    }
}