public class Siglas {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        System.out.println(siglas(palabras(frase)));
    }
    public static String[] palabras(String frase){
        return Utilidades.dividirEnPalabras(frase);
    }
    public static String siglas(String[] palabras){
        String aux="";
        for (String i:palabras) {
            if (Character.isUpperCase(i.charAt(0))){
                aux=aux+i.charAt(0);
            }
        }
        return aux;
    }
}
