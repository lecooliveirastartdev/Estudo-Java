import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
    }

    static void entrandoEmContato(String candidato){
int tentativasRealizadas = 1;
boolean continuarTentando = true;
boolean atendeu = false;

do {
    atendeu = atender();
    if (atendeu) {
        System.out.println("O candidato " + candidato + "atendeu");
        continuarTentando = false;
    } else {
        System.out.println("O candidato " + candidato + "não atendeu");
        tentativasRealizadas++;
    }
} while (continuarTentando && tentativasRealizadas < 3);

    }

    // método auxiliar
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {

        String[] candidatos = { "Maria", "Pedro", "Ana", "Alexandro",
                "Dirce" };
        System.out.println("Imprimindo a lista  de candidatos informandos  o indice  do elemento ");

        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O indice de nº " + (indice + 1) + "  e " + candidatos[indice]);
        }

        System.out.println(("Forma abreviada de intenção for each"));

        for (String candidato : candidatos) {
            System.out.println("O candidato selecionado foi ");
        }
    }


    static void selecaoCandidatos() {

        String[] candidatos = { "João", "Maria", "Pedro", "Ana", "Alexandro", "Roberto", "Wanderson", "felipe",
                "Marçal", "Dirce" };

        int candidatoSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while (candidatoSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salário");
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + "foi selecionado a vaga ");
                candidatoSelecionados++;
            }
            candidatoAtual++;
        }
    }

    private static double valorPretendido() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'valorPretendido'");
    }

    static void analisarCandidato(double salarioPretendido) {

        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido)
            System.out.println("LIGAR PARA O CANDIDATO PARA CONTRATAÇÃO");
        else {

            System.out.println("AGUARDANDO RESULTADOS DOS DEMAIS CANDIDATOS");
        }

    }

}
