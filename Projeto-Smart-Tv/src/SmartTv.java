public class SmartTv {
   boolean ligar = false;
   boolean desligar = false;

   int canal = 1;
   int volume = 25;

   public void ligada() {
      ligar = true;
   }

   public void desligada() {
      desligar = false;
   }

   public void aumentarVolume() {
      volume++;
      System.out.println("Aumentando o volume para: " + volume);
   }

   public void diminuirVolume() {
      volume--;
      System.out.println("Diminuido o volume para: " + volume);

   }

   public void aumentarCanal() {
      canal++;

   }

   public void diminuirCanal() {
      canal--;

   }

   public void mudarCanal(int novoCanal) {
      canal = novoCanal;

   }

}
