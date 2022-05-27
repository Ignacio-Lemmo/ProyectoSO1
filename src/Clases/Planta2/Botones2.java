package Clases.Planta2;

import Clases.Main;
import static Clases.Main.botones2Producidos;
import Interfaces.Planta2;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Botones2 extends Thread{
    
    //Declaración de variables.
    public static volatile Semaphore botones2;
    public static volatile Semaphore botones2Mutex;
    public static volatile Semaphore ensambladorBotones2;
    int contratados = Main.botones2Contratados;
    int produccion = 2;
    public static int sueldo = 4;
    boolean contratado = true;
    
    //Declaración del constructor.
    public Botones2 (Semaphore botones2, Semaphore botones2Mutex, Semaphore ensambladorBotones2){
        this.botones2 = botones2;
        this.botones2Mutex = botones2Mutex;
        this.ensambladorBotones2 = ensambladorBotones2;
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
                    botones2.acquire();
                        botones2Mutex.acquire();
                            Main.botones2Producidos ++;
                            Simulacion.botones2.setText(String.valueOf(Main.botones2Producidos));
                            Simulacion.botones2Progreso.setValue(botones2Producidos);
                            Planta2.botones2Progreso.setString(String.valueOf(Main.botones2Producidos));
                            Planta2.botones2Progreso.setValue(botones2Producidos);
                        botones2Mutex.release();
                    ensambladorBotones2.release();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
