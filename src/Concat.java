public class Concat {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String frase2 =Utilidades.leerCadena("introduce una palabra que la contenga");

        System.out.println(frase.concat(frase2));
    }
}
