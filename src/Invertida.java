public class Invertida {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        System.out.println(invertir(palabras(frase)));
    }
    public static String[] palabras(String frase){
        return Utilidades.dividirEnPalabras(frase);
    }
    public static String invertir(String[] palabras){
        String aux="";
        for (int i = palabras.length; i > 0; i--) {
            aux=aux+palabras[i-1]+" ";
        }
        return aux;
    }
}
