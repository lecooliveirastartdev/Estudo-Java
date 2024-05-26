public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmarTv();

        System.out.println("TV ligada ?  "   +SmartTv.ligada);
        System.out.println("Canal Atual : "  +SmartTv.canal);
        System.out.println("Volume Atual : "  +SmartTv.volume);
        
        smartTv.ligar();
        System.out.println( "Novo Status-> TV ligada ?  "   +SmartTv.ligada);
        smartTv.desligar();

    }
}
