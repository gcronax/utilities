public class Substring {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        int n1 =Utilidades.leerEntero("dame el inicio");
        int n2 =Utilidades.leerEntero("dame el final");
        try{
            System.out.println(frase.substring(n1,n2));
        }catch (Exception e){
            System.out.println("null");
        }
    }
}
