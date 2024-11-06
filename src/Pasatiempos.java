import java.util.ArrayList;

public class Pasatiempos {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        frase=frase.replaceAll("[aeiou]",".");
        System.out.println(frase);
    }
}
