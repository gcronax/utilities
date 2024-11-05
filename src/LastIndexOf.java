public class LastIndexOf {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String frase2 =Utilidades.leerCadena("introduce una palabra");

        System.out.println(frase.lastIndexOf(frase2));
    }
}
