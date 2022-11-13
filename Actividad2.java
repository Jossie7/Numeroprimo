public class Actividad2 {
    public static void main(String[] args) {
        /* Vamos a proceder a crear nuestras variables.Nuestra variable que 
        nos dará un número aleatorio se denominará "randonNumber" y va a estar 
        declarada como una constante.
        *Ahora crearemos una variable llmada MAX, la cual va a determinar el máximo
        de nuestros números aleatorios.
        *La variable numDivisores es la que va a contener el número de divisores de 
        nuestros números aleatorios.
        */
        int MAX=100;
        final int randomNumber= ((int)(Math.random()*MAX));
        int numDivisores=0;
        
        //Ahora vamos a planntear nuestra función:
        /*Primero vamos a hacer nuestro bucle, el cual va a determinar los divisores de cada función.
         *Inicializamos con 1, porque es el mínimo que va a tomar. Se le pone que i sea menor o igual que randomNumer/2 
         ´porque el 2 es el mínimo diivisor de un número
         *Si nuestro número aleatorio dividido entre el otro número (randonNumber%i) es 0, pues se le añade una unidad 
         al número de divisores.
         */
        for (int i = 1; i <= randomNumber / 2; i++) {
            if (randomNumber % i == 0) {
                numDivisores++;
            }
          }
          if (numDivisores > 2) { // Si el número de divisores es mayor que 2 ya no es un número primo.
              System.out.println("El numero " + randomNumber +  " no es primo");
          }
          else { //Por otro lado, si el número tiene solo 2 divisores es primo.
            System.out.println("El numero " + randomNumber +  " sí es primo");
          }
    }
}
