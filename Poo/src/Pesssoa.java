public class Pesssoa {
    private String Nome;
    private String Cpf;
    private String Endereco;

    public void Pessoa (String Cpf, String Nome){
    this.Cpf = Cpf;
    this.Nome = Nome;
}

    public String getNome() {
        return Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

}
