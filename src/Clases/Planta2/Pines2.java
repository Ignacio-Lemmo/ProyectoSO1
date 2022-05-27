package Clases.Planta2;

import Clases.Main;
import static Clases.Main.pines2Producidos;
import Interfaces.Planta2;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Pines2 extends Thread{
    
    //Declaración de variables.
    public static volatile Semaphore pines2;
    public static volatile Semaphore pines2Mutex;
    public static volatile Semaphore ensambladorPines2;
    int contratados = Main.pines2Contratados;
    double produccion = 1/3f;
    public static int sueldo = 5;
    boolean contratado = true;
    
    //Declaración del constructor.
    public Pines2 (Semaphore pines2, Semaphore pines2Mutex, Semaphore ensambladorPines2){
        this.pines2 = pines2;
        this.pines2Mutex = pines2Mutex;
        this.ensambladorPines2 = ensambladorPines2;
    }
    
    //Setter de Contratado.
    public void setContratado(boolean setter){
        contratado = setter;
    }
    
    //Declaración de la ejecución/
    public void run(){
        while(contratado == true){
            try {
                if(contratados > 0){
                    Thread.sleep(Math.round(Main.tiempo/(produccion)));
                    Main.pines2Producidos ++;
                    pines2.acquire();
                        pines2Mutex.acquire();
                            Simulacion.pines2.setText(String.valueOf(Main.pines2Producidos));
                            Simulacion.pines2Progreso.setValue(pines2Producidos);
                            Planta2.pines2Progreso.setString(String.valueOf(Main.pines2Producidos));
                            Planta2.pines2Progreso.setValue(pines2Producidos);
                        pines2Mutex.release();
                    ensambladorPines2.release();
                }
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
