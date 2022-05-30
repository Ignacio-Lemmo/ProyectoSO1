package Clases.Planta2;

import Clases.Main;
import static Clases.Main.camaras2Producidas;
import Interfaces.Planta2;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Camaras2 extends Thread {
    //Declaración de variables.
    public static volatile Semaphore camaras2;
    public static volatile Semaphore camaras2Mutex;
    public static volatile Semaphore ensambladorCamaras2;
    int contratados = Main.camaras2Contratados;
    double produccion = 1/2f;
    public static int sueldo = 5;
    boolean contratado = true;
    
    //Declaración del constructor.
    public Camaras2 (Semaphore camaras2, Semaphore camaras2Mutex, Semaphore ensambladorCamaras2){
        this.camaras2 = camaras2;
        this.camaras2Mutex = camaras2Mutex;
        this.ensambladorCamaras2 = ensambladorCamaras2;
    }
    
    //Setter de Contratado.
    public void setContratado(boolean setter){
        contratado = setter;
    }
    
    //Declaración de la ejecución.
    public void run(){
        while(contratado == true){
            try {
                if(contratados > 0){
                    Thread.sleep(Math.round(Main.tiempo/(produccion)));
                    camaras2.acquire();
                        camaras2Mutex.acquire();
                            Main.camaras2Producidas ++;
                            Planta2.camaras2Progreso.setString(String.valueOf(Main.camaras2Producidas));
                            Planta2.camaras2Progreso.setValue(camaras2Producidas);
                        camaras2Mutex.release();
                    ensambladorCamaras2.release();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
