public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " +smartTv.ligar);
        System.out.println("TV ligada no canal: " +smartTv.canal);
        System.out.println("TV ligada no volume: " +smartTv.volume);

smartTv.diminuirVolume();
smartTv.diminuirVolume();
smartTv.diminuirVolume();
smartTv.aumentarVolume();
System.out.println("Volume atual " +smartTv.volume) ;

smartTv.mudarCanal(1);
System.out.println("Você esta sintonosado no canal: " +smartTv.canal);

smartTv.aumentarCanal();
System.out.println("Canal positivo: " +smartTv.canal);


    }
}
