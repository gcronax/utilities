import java.util.ArrayList;
import java.util.Arrays;

public class Palabras1 {
    public static void main(String[] args) {
        String frase_query =Utilidades.leerCadena("introduce una frase");
        String[] aux;
        frase_query=frase_query.replaceAll("[,.;:]"," ").trim();
        frase_query=frase_query.replaceAll(" +"," ");
        aux=frase_query.split(" ");
        System.out.println(aux.length);
    }
}
