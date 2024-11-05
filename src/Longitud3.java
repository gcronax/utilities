public class Longitud3 {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        int n =Utilidades.leerEntero("dame los caracteres");
        String[] aux= Utilidades.dividirEnPalabras(frase);
        boolean es=false;
        for (String i:aux){
            if (i.length()>=n){
                es=true;
            }
        }
        if (es){
            System.out.println("Hay alguna palabra larga");
        }else {
            System.out.println("Todas las cadenas son cortas");
        }
    }
}
