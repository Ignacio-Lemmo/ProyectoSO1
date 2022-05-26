package Clases.Planta2;

import Clases.Main;
import static Clases.Main.botones2Producidos;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;

public class Botones2 extends Thread{
    
    //Declaración de variables.
    Semaphore botones2;
    Semaphore botones2Mutex;
    Semaphore ensambladorBotones2;
    int contratados = Main.botones2Contratados;
    int produccion = 2;
    int sueldo = 4;
    
    //Declaración del constructor.
    public Botones2 (Semaphore botones2, Semaphore botones2Mutex, Semaphore ensambladorBotones2){
        this.botones2 = botones2;
        this.botones2Mutex = botones2Mutex;
        this.ensambladorBotones2 = ensambladorBotones2;
    }
    //Declaración de la ejecución/
    public void run(){
        while(true){
            try {
                if(contratados > 0){
                    Thread.sleep(Math.round(Main.tiempo/(produccion)));
                    botones2Mutex.acquire();
                        botones2.acquire();
                            Main.botones2Producidos ++;
                            Simulacion.botones2.setText(String.valueOf(Main.botones2Producidos));
                            Simulacion.botones2Progreso.setValue(botones2Producidos);
                        ensambladorBotones2.release();
                    botones2Mutex.release();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
