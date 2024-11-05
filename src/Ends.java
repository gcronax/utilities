public class Ends {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String frase2 =Utilidades.leerCadena("introduce una palabra que la contenga al final");

        System.out.println(frase.endsWith(frase2));
    }
}
