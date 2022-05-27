package Clases.Planta2;

import Clases.CSVEL;
import Clases.Main;
import Interfaces.Planta2;
import Interfaces.Simulacion;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

public class Gerente2 extends Thread {
    
//Declaración de variables.
    Semaphore dias;
    public static int sueldo = 180;
    
    //Declaración del constructor.
    public Gerente2(Semaphore dias){
        this.dias = dias;
    }
    
    public void run(){
        while(true){
            try {
                double vigilando = (Math.random() * (90 - 30)) +  30;
                double durmiendo = (Math.random() * (18 - 12)) + 12;
                dias.acquire();
                if(Main.diasRestantes <= 0){
                    Planta2.gerente2.setText("Trabajando");
                    Main.diasRestantes = Integer.parseInt(CSVEL.data[19]);;
                    Main.producidos2 = 0;
                    Main.ganancias = 0;
                    Planta2.ganancia.setText("0");
                    Planta2.producidos2.setText("0");
                }else{
                    Planta2.gerente2.setText("Vigilando");
                    if(Main.jefeEstado == 1){
                        JOptionPane.showMessageDialog(null, "El Jefe estaba Jugando, se le ha reducido $2 de su sueldo.");
                        Main.jefe2Gastos -= 2;
                    }
                }
                dias.release();
                Planta2.gerente2.setText("Esperando");
                Thread.sleep(Math.round((Main.tiempo/24) * (vigilando/60)));
            }catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
