public class App {
    public static void main(String[] args) throws Exception {
        int n=5;
        int rresultadoFinal = factorial(n);
        System.out.println("Resultado:"+rresultadoFinal);
    }

    public static int factorial(int n){
        if(n==0){
            System.out.println("alcance el caso base");
            return 1;
        }
        int resultado = n* factorial(n-1);
        System.out.println("calculando factorial de: "+n+"* factorias\t("+(n-1)+"-1)");
        return resultado;

    }
}
