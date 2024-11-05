public class Encriptar {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String aux = "";
        char letra;
        for (int i = 0; i < frase.length(); i++) {
            letra= ((char) ((int) frase.charAt(i)+2));
            if (letra=='{'){
                letra='a';
            } else if (letra=='|') {
                letra='b';
            }
            aux=aux+letra;
        }
        System.out.println(aux);
    }
}
