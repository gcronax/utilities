public class Digitos {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        String[] aux= Utilidades.dividirEnPalabras(frase);
        int count=0;
        for (String i:aux){
            if (esDigito(i)){
                count=count+i.length();
            }
        }
        System.out.println(count);
    }

    public static boolean esDigito(String esnumero) {
        try{
            int n= Integer.parseInt(esnumero);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
