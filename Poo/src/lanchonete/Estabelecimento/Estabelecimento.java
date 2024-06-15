package lanchonete.Estabelecimento;

import lanchonete.atendimento.Atendente;
import lanchonete.cozinha.Almoxerife;
import lanchonete.cozinha.Cozinheiro;

public class Estabelecimento {
Cozinheiro cozinheiro = new Cozinheiro();
//Açoes que não precisam estarem disponível para toda aplicação
cozinheiro.lavar.Ingredientes();
cozinheiro.lavar.baterVitaminaLiquidificador();
cozinheiro.lavar.selecionarIgredientesVitamina();
cozinheiro.lavar.prepararLanche();
cozinheiro.lavar.preparaVitamina();
cozinheiro.lavar.Ingredientes();


//Ações que o estabelecimento precisa ter ciência
cozinheiro.adicionarSucoBalcao();
cozinheiro.adicionarLancheBalcao();
cozinheiro.adicionarComboNoBalcao(); 


Almoxerife almoxerife = new Almoxerife();
almoxerife.controlarEntrada();
almoxerife.controlarSaida();
almoxerife.entregarIngredientes();
almoxerife.trocaroGas();

Atendente atendente = new Atendente();
atendente.pegarLancheCozinha();
atendente.receberPagamento();
atendente.serVindoMesa();
//ação que somente seu pacote precisa connhecer(default)

Cliente cliente = new Cliente();
cliente.escolherLanche();
cliente.fazerPedido();
cliente.pagaarConta();

cliente.pegarPedidoBalcao();

cliente.consultarSaldoAplicativo();

cozinheiro.pedirParaTrocarGas(atendente);
cozinheiro.pedirParaTrocarGas(almoxerife);






}
