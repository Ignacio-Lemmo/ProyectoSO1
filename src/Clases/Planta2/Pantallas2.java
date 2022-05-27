package Clases.Planta2;

import Clases.Main;
import static Clases.Main.pantallas2Producidas;
import Interfaces.Planta2;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Pantallas2 extends Thread{
    
    //Declaración de variables.
    public static volatile Semaphore pantallas2;
    public static volatile Semaphore pantallas2Mutex;
    public static volatile Semaphore ensambladorPantallas2;
    int contratados = Main.pantallas2Contratados;
    int produccion = 2;
    public static int sueldo = 3;
    boolean contratado = true;
    
    //Declaración del constructor.
    public Pantallas2 (Semaphore pantallas2, Semaphore pantallas2Mutex, Semaphore ensambladorPantallas2){
        this.pantallas2 = pantallas2;
        this.pantallas2Mutex = pantallas2Mutex;
        this.ensambladorPantallas2 = ensambladorPantallas2;
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
                    Thread.sleep(Main.tiempo/(produccion));
                    pantallas2.acquire();
                        pantallas2Mutex.acquire();
                            Main.pantallas2Producidas ++;
                            Simulacion.pantallas2.setText(String.valueOf(Main.pantallas2Producidas));
                            Simulacion.pantallas2Progreso.setValue(pantallas2Producidas);
                            Planta2.pantallas2Progreso.setString(String.valueOf(Main.pantallas2Producidas));
                            Planta2.pantallas2Progreso.setValue(pantallas2Producidas);
                        pantallas2Mutex.release();
                    ensambladorPantallas2.release();
                }
            } catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
