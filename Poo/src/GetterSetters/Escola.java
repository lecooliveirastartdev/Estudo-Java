package GetterSetters;


    

   /*  public class Escola {
        public static void main(String[] args) {
            Aluno felipe = new Aluno();
            felipe.nome="Felipe";
            felipe.idade = 8;
            
            System.out.println("O aluno " + felipe.nome + " tem " + felipe.idade + " anos ");
            //RESULTADO NO CONSOLE
            //O aluno Felipe tem 8 anos 		
        }
    }*/

//arquivo Escola.java
public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		
		System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");	
	}
}