package lanchonete.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
    void adicionarComboNoBalcao() {
        // Lógica para contolar entrada de itens
        System.out.println("ADICIONAR OS LANCHES PEDIDOS NO BALCÃO");
    }

    void adicionarSucoBalcao() {
        // Lógica para saida de intens
        System.out.println("ADICIONAR SUCO NO BALCAO");
    }

    void adionarComboNoBalcao() {
        adicionarSucoBalcao();
        adicionarLancheBalcao();
    }

  public  void prepararLanche() {
        // Lógica para trocar o gas
        System.out.println("PREPARANDO OS LANCHES PEDIDOS");

    }
}
