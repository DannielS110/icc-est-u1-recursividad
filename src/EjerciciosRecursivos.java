public class EjerciciosRecursivos {
    
    public  int fibonacci (int n){
        if(n == 0){
            return 0;
        }else if (n == 1){
            return 1;
        }
        return fibonacci(n-1)+ fibonacci(n- 2);
    }

    // metodo que devuelve la suma de los numeros que contiene n
    //n = 5,  5+4+3+2+1=15
    public int sumaConsecutivos(int n){

        //if (n == 1)return 1;
        // return n+ sumaConsecutivos(n-1);
        if(n == 1){
            return 1;
        }
        int resultadoParcial = sumaConsecutivos(n-1);
        int resultado = n+ resultadoParcial;
        return resultado;
    }

public int getPotencia (int base ,int exponente){

    if(exponente == 0){

return 1;
    }
    int resultado = base * getPotencia(base, exponente-1);
    return resultado;
}

public static int sumaDigitos(int numero) {
    if (numero < 10) {
        return numero;
    } else {
        return (numero % 10) + sumaDigitos(numero / 10);
    }
}


}
