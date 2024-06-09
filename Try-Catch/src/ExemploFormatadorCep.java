public class ExemploFormatadorCep {

  public static void main(String[] args) {

    try {
      String cepFormatado = formatarCep("2376506");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      // TODO: handle exception
      System.out.println("Verifique novamente, formato iválido!");
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();
    // simulando um cep formatado
    return "23.765-064";
  }

}