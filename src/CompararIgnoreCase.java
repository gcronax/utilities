public class CompararIgnoreCase {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String frase2 =Utilidades.leerCadena("introduce una frase");

        int n=frase.compareToIgnoreCase(frase2);
        if (n<0){
            System.out.println("es menor");
        } else if (n>0) {
            System.out.println("es mayor");
        } else {
            System.out.println("es igual");
        }
    }
}
