public class Criptografia {
    public static void main(String[] args) {
        String frase_query =Utilidades.leerCadena("introduce una frase");
        int n_query=Utilidades.leerEntero("dame un numero");
        System.out.println("encriptado----> "+encriptar(frase_query,n_query));
        System.out.println("desencriptado-> "+desencriptar(encriptar(frase_query,n_query),n_query));
    }
    public static String encriptar(String frase,int n) {

        String aux = "";

        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' '){
                aux=aux+' ';
            }
            if (97<=frase.charAt(i)&&122>=frase.charAt(i)){
                int naux=((int) frase.charAt(i)+n)%(123);
                if (naux<97){
                    naux=naux+97;
                }
                aux=aux+(char)naux;
            }
            if (65<=frase.charAt(i)&&90>=frase.charAt(i)){
                int naux=((int) frase.charAt(i)+n)%(91);
                if (naux<65){
                    naux=naux+65;
                }
                aux=aux+(char)naux;
            }
            if (48<=frase.charAt(i)&&57>=frase.charAt(i)){
                int naux=((int) frase.charAt(i)+n)%(58);
                if (naux<48){
                    naux=naux+48;
                }
                aux=aux+(char)naux;
            }
        }
        return aux;
    }
    public static String desencriptar(String frase,int n) {

        String aux = "";
        n=-n;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i)==' '){
                aux=aux+' ';
            }
            if (97<=frase.charAt(i)&&122>=frase.charAt(i)){
                int naux=((int) frase.charAt(i)+n)%(123);
                if (naux<97){
                    naux=122-(97-naux);
                }
                aux=aux+(char)naux;
            }
            if (65<=frase.charAt(i)&&90>=frase.charAt(i)){
                int naux=((int) frase.charAt(i)+n)%(91);
                if (naux<65){
                    naux=90-(65-naux);
                }
                aux=aux+(char)naux;
            }
            if (48<=frase.charAt(i)&&57>=frase.charAt(i)){
                int naux=((int) frase.charAt(i)+n)%(58);
                if (naux<48){
                    naux=58-(48-naux);
                }
                aux=aux+(char)naux;
            }
        }
        return aux;
    }
}

