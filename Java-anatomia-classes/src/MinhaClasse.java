public class MinhaClasse {

    public static void main(String[] args) {

        String primeiroNome = "Alexandro";
        String segundoNome = "Oliveira!";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {

        return "Ô, filho de Deus " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
