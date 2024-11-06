public class Palabras2 {
    public static void main(String[] args) {
        String frase_query =Utilidades.leerCadena("introduce una frase");
        frase_query=frase_query+" ";
        int n=0;
        int n_past=0;
        int count=0;

        for (int i = 0; i < frase_query.length(); i++) {
            if (97 <= frase_query.charAt(i) && 122 >= frase_query.charAt(i)) {
                n++;
            }else if (65 <= frase_query.charAt(i) && 90 >= frase_query.charAt(i)) {
                n++;
            }else n=0;
            if (n<n_past){
                count++;
            }
            n_past=n;
        }
        System.out.println(count);
    }
}
