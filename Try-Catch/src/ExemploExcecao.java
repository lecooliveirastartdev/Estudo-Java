import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {
        // Number valor = Double.valueOf("a1.75");
        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("a1.75");

            System.out.println(valor);
        } catch (Exception e) {
            e.printStackTrace();
            // TODO: handle exception
        }

    }
}
