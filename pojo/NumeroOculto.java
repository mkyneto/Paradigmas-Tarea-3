package pojo;
import java.util.Random; 

public class NumeroOculto {
  Random rnd;
  int Numero_Oc;

  public void N_OC()
  {
    this.rnd = new Random();
    this.Numero_Oc = rnd.nextInt(10) + 1;
  }
  /*
  *Getter del Numero Oculto
  */
  public int Obtener_Oc(){
    return this.Numero_Oc;
  }
}
