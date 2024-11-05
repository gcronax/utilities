public class Encriptar {
    public static void main(String[] args) {
        String frase =Utilidades.leerCadena("introduce una frase");
        int count=0;

        for (int i = 1; i < frase.length(); i++) {
            if (!(frase.charAt(i-1)<(frase.charAt(i)))){
                count++;
            }


        }
        if (count>0){
            System.out.println("no es alfabetico");
        }else System.out.println("es alfabetico");

    }
}
