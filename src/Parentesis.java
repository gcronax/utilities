public class Parentesis {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        System.out.println(esCaracterizada(frase));
    }
    public static boolean esCaracterizada(String carac) {
        int n=0;
        for (int i = 0; i < carac.length(); i++) {
            if ('(' == carac.charAt(i)){
                n++;
            } else if (')' == carac.charAt(i)) {
                n--;
            }
            if (n==-1){
                return false;
            }
        }
        return n == 0;
    }
}
