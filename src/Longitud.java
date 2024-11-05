public class Longitud {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        int n =Utilidades.leerEntero("dame los caracteres");
        String[] aux= Utilidades.dividirEnPalabras(frase);
        int count=0;
        for (String i:aux){
            if (i.length()==n){
                count++;
            }
        }
        System.out.println(count);
    }
}
