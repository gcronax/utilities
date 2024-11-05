import java.util.Objects;

public class SumarBinario {
    public static void main(String[] args) {
        String binary1 =Utilidades.leerCadena("introduce un binario");
        String binary2 =Utilidades.leerCadena("introduce un binario");
        String zero="0";
        String binaryresult="0";
        String aux = "";
        if (binary1.length()<binary2.length()){
            binaryresult=zero+binary2;
            aux=zero.repeat(binary2.length()-binary1.length()+1)+binary1;
        }else {
            binaryresult=zero+binary1;
            aux=zero.repeat(binary1.length()-binary2.length()+1)+binary2;

        }
        System.out.println(binaryresult);
        System.out.println(aux);
        int temp=0;
        String resultado="";
        for (int i = binaryresult.length(); i > 0; i--) {
            if (binaryresult.charAt(i-1)=='1'&& aux.charAt(i-1)=='1'){
                if (temp==0){
                    resultado="0"+resultado;
                    temp=1;
                }else {
                    resultado="1"+resultado;
                    temp=1;
                }
            } else if (binaryresult.charAt(i-1)=='0'&& aux.charAt(i-1)=='1') {
                if (temp==0){
                    resultado="1"+resultado;
                    temp=0;
                }else {
                    resultado="0"+resultado;
                    temp=1;
                }
            } else if (binaryresult.charAt(i-1)=='1'&& aux.charAt(i-1)=='0') {
                if (temp==0){
                    resultado="1"+resultado;
                    temp=0;
                }else {
                    resultado="0"+resultado;
                    temp=1;
                }
            } else if (binaryresult.charAt(i-1)=='0'&& aux.charAt(i-1)=='0') {
                if (temp==0){
                    resultado="0"+resultado;
                    temp=0;
                }else {
                    resultado="1"+resultado;
                    temp=0;
                }
            }

        }

        System.out.println("______________+");
        System.out.println(resultado);
    }
}
