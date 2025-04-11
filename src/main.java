public class main {
    public static void main(String[] args){
        EjerciciosRecursivos serie=new EjerciciosRecursivos();
          int fibo=  serie.fibonacci(5);
           System.out.println("la serie fibonacci es:"+fibo);

           int resultado = serie.getPotencia(2, 8);
        
           System.out.println("el resultado es:"+resultado);
           int numero= 125; 
           int sumaD = serie.sumaDigitos(numero);
           System.out.println("el suma de digitos fue:"+sumaD);
           System.out.println("impresion del descendente 2: ");
           serie.MetodoRecursivoDescendente(5);
           System.out.println("\ninverso del numero 792: ");
           serie.metodoInverso(792);

    }
}

