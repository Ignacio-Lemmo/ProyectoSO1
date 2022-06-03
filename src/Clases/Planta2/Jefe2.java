package Clases.Planta2;

import Clases.Main;
import Interfaces.Planta2;
import Interfaces.Simulacion;
import java.util.HashSet;
import java.util.concurrent.Semaphore;
import javax.swing.JOptionPane;

public class Jefe2 extends Thread{
    
    //Declaración de variables.
    Semaphore dias;
    public static int sueldo = 7;
    
    //Declaración del constructor.
    public Jefe2(Semaphore dias){
        this.dias = dias;
    }
    
    public void run(){
        while(true){
            try {
                dias.acquire();
                        //Cmabiar el estado del Jefe a Trabajando.
                        Main.jefe2Estado = 0;
                        Planta2.jefe2.setText("Trabajando");
                        Thread.sleep((Main.tiempo/24)*6);

                        Main.dias ++;
                        Planta2.dias.setText(String.valueOf(Main.dias));
                        Main.diasRestantes --;
                        Planta2.diasRestantes.setText(String.valueOf(Main.diasRestantes));

                        Main.botones2Gastos += Clases.Planta2.Botones2.sueldo * Main.botones2Contratados;
                        Planta2.botones2Gastos.setText(String.valueOf(Main.botones2Gastos));
                        Main.pantallas2Gastos += Clases.Planta2.Pantallas2.sueldo * Main.pantallas2Contratados;
                        Planta2.pantallas2Gastos.setText(String.valueOf(Main.pantallas2Gastos));
                        Main.pines2Gastos += Clases.Planta2.Pines2.sueldo * Main.pines2Contratados;
                        Planta2.pines2Gastos.setText(String.valueOf(Main.pines2Gastos));
                        Main.camaras2Gastos += Clases.Planta2.Camaras2.sueldo * Main.camaras2Contratados;
                        Planta2.camaras2Gastos.setText(String.valueOf(Main.camaras2Gastos));

                        Main.ensambladores2Gastos += Clases.Planta2.Ensambladores2.sueldo * Main.ensambladores2;
                        Planta2.ensambladores2Gastos.setText(String.valueOf(Main.ensambladores2Gastos));

                        Main.gerente2Gastos += Clases.Planta2.Gerente2.sueldo;
                        Planta2.gerente2Gastos.setText(String.valueOf(Main.gerente2Gastos));

                        Main.jefe2Gastos += sueldo;
                        Planta2.jefe2Gastos.setText(String.valueOf(Main.jefe2Gastos));

                        Planta2.gananciasNetas.setText(String.valueOf(Main.gananciaTotal2 - (Main.botones2Gastos+Main.camaras2Gastos+Main.pantallas2Gastos+Main.pines2Gastos+Main.gerente2Gastos+Main.jefe2Gastos)));
                dias.release();
                double timing = 14 * (Main.tiempo/1000);
                int counter = 0;
                while(counter < 27){
                    //Cambiar el estdo del Jefe a Jugando.
                    Main.jefe2Estado = 1;
                    Planta2.jefe2.setText("Jugando");
                    Thread.sleep(Math.round(timing));
                    
                    //Cambiar el estado del Jefe a Revisando.
                    Main.jefe2Estado = 2;
                    Planta2.jefe2.setText("Revisando");
                    Thread.sleep(Math.round(timing));
                    
                    counter ++;
                }
            }catch (Exception e) {
                System.out.println(e);
        }
        }
    }
}
