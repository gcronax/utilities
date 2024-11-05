public class Longitud2 {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        int n =Utilidades.leerEntero("dame los caracteres");
        String[] aux= Utilidades.dividirEnPalabras(frase);
        boolean es=false;
        for (String i:aux){
            if (i.length()==n){
                es=true;
            }
        }
        System.out.println(es);
    }
}
