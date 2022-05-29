import pojo.Jugador;
import pojo.NumeroOculto;

class Main {
  public static void main(String[] args) {

    int x = 1;  //Llave de ejecucion del juego
    
    // Definimos el primer ciclo para poder iterar segun la cantidad que quiera jugar el usuario
    while (x == 1) {
      System.out.println("Bienvenido al juego de adivinar el numero");
      System.out.println("Es Simple, es adivinar en numero del 1 al 10");
      System.out.println("Y tu pones los intentos");
      System.out.println("Deseas jugar (Y/N)");
      String respuesta = System.console().readLine();
      /*
      *Arbol If para ejecutar o no el juego
      *If:      Si
      *Else if: No
      *Else:    Retry
      */
      if (respuesta.equals("Y") || respuesta.equals("y")) {
        System.out.println("Jugando...");
        Jugador j1 = new Jugador(); // Utilizamos la clase jugador
        NumeroOculto n1 = new NumeroOculto(); //Utilizamos la clase numero oculto
        n1.N_OC();
        int n_oculto=n1.Obtener_Oc();
        System.out.println("Ingrese el numero de intentos..."); //Dentro de la clase esta test de intentos
        int intentos = Integer.parseInt(System.console().readLine()); 
        j1.Jugador_Intentos(intentos);
        int a=1;
        /*
        *While:  Gameplay epico de elejir un numero
        */
        while (a==1) { //Nuestro segundo ciclo nos permite comprobar si el numero es el adivinado
            System.out.println("Ingrese un numero");
            int id = Integer.parseInt(System.console().readLine());
            j1.Jugador_J(id);
            int numero_participa = j1.Obtener_Numero();
            if(numero_participa==n_oculto){
                System.out.println("......");
                System.out.println("Felicidades, lo lograste,has ganado");
                System.out.println("......");
                a=0;
            } else {
                System.out.println("El numero es incorrecto");
                intentos=j1.Obtener_Intentos();
                intentos = intentos - 1;
                j1.Jugador_Intentos(intentos);
                System.out.println("El numero de intentos es: "+ j1.Obtener_Intentos());
                if (intentos == 0) {
                    System.out.println("......");
                    System.out.println("Perdiste");
                    System.out.println("......");
                    System.out.println("El numero oculto era: "+ n1.Obtener_Oc());
                    a = 0;
                }
            }

            }
        
      } else if (respuesta.equals("N") || respuesta.equals("n")) { //Creamos estas clases para finalizar el programa
          System.out.println("......");
          System.out.println("Adios");
          System.out.println("......");
          x = 0;
      }
      else { //Corroborar que sea la opcion correcta, y,Y,N,n
          System.out.println("Ingrese una opcion valida");
          System.out.println("Ingrese Nuevamente");
      
      }
    }

  }
}


