public class Desencriptar {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        int n=Utilidades.leerEntero("dame un numero");
        String aux = "";
        n=-n;
        for (int i = 0; i < frase.length(); i++) {
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

        System.out.println(aux);

    }
}
