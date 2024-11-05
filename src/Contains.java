public class Contains {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String frase2 =Utilidades.leerCadena("introduce una palabra que la contenga");

        System.out.println(frase.contains(frase2));
    }
}
