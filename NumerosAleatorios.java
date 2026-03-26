//Joaquín Devige

//Legajo: 114638

import java.util.Random;

public class NumerosAleatorios {
    
  public static void main(String args[]) {
   
        Random random = new Random();
        
        //Se asignan los valores hacia sus respectivas variables.

        int cantidadNumeros = 500;
        int min = 10;
        int max = 1000;
        
        //Se crea el acumulador que sirve para sumar todos los numeros.
        
        int sumaTotal = 0;

        System.out.println("GENERANDO LOS " + cantidadNumeros + " NÚMEROS");
        
        //Se realiza un bucle for hasta la cantidad de 500 numeros, incrementando de uno en uno, utilizando la formula Random.
        
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(max - min + 1) + min;

            //Sirve para mostrar cada número por pantalla mientras pasa el bucle for.
            
            System.out.println("\nNúmero " + (i + 1) + ": " + numeroAleatorio);

            sumaTotal += numeroAleatorio;
        }
        
        //Se calcula el promedio de los números, con variable double para que se permita colocar decimales.

        double promedio = (double) sumaTotal / cantidadNumeros;

        //Se muestran por pantalla los valores.
       
        System.out.println("\nRESULTADOS FINALES:");
        System.out.println("\nRango de valores: " + min + " a " + max);
        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Promedio: " + promedio);
    
    
   }

}
