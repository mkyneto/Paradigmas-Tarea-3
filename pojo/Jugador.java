package pojo;
//Creamos la clase jugador, donde se comprueba si el numero ingresado es el correcto
// verificamos que el numero elejido sea entre 1 y 10

public class Jugador {
    int Numero_J;
    int Intentos;

    public void Jugador_J(int Numero_J) {
        int id=Numero_J;
        while(true){
            if (id <= 10 && id >= 0) {
                this.Numero_J = id;
                break;
            } else if(id<=0){
                System.out.println("El numero de jugador no es valido");
                System.out.println("Ingrese un numero");
                id = Integer.parseInt(System.console().readLine());
            } else if(id > 11){
                System.out.println("El numero de jugador no es valido");
                System.out.println("Ingrese un numero");
                id = Integer.parseInt(System.console().readLine());
            } else {
                System.out.println("El numero de jugador no es valido");
                System.out.println("Ingrese un numero");
                id = Integer.parseInt(System.console().readLine());  
            }
        }  
    }

    public void Jugador_Intentos(int Intentos){
        while(true){
            if (Intentos <= 24 && Intentos >= 1) {
                this.Intentos = Intentos;
                break;
            } else if (Intentos>25){
                System.out.println("No creo que sea necesario tener mas de 25 intentos para ganar");
                System.out.println("Menor que 25");
                System.out.println("Ingresa un numero de intentos valido");
                Intentos = Integer.parseInt(System.console().readLine());
            } else if(Intentos<0){
                System.out.println("Ingrese un numero de intentos valido");
                Intentos = Integer.parseInt(System.console().readLine());
            } else {
                System.out.println("El numero de intentos no es valido");
                System.out.println("Ingrese un numero");
                Intentos = Integer.parseInt(System.console().readLine());
            }
        }  
    }

    /*
    *Getter del numero de intentos restantes
    */
    public int Obtener_Intentos(){
        return this.Intentos;
    }
    /*
    *Getter del numero de Jugadores restantes
    */
    public int Obtener_Numero(){
        return this.Numero_J;
    }
}
