package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CSVEL {
    
    private static String linea;
    private static String dataUnida = "";
    public static String[] data;
    
    public static void LeerCsv(){
        try{
            BufferedReader csvReader = new BufferedReader(new FileReader("./Parámetros.csv"));
            while ((linea = csvReader.readLine()) != null) {;
                dataUnida += linea + " ";
            }
            csvReader.close();
            data = dataUnida.split(" ");
            Main.tiempo = Integer.parseInt(data[0]);
            Main.pantallas1Contratados = Integer.parseInt(data[1]);
            Main.botones1Contratados = Integer.parseInt(data[2]);
            Main.pines1Contratados = Integer.parseInt(data[3]);
            Main.camaras1Contratados = Integer.parseInt(data[4]);
            Main.ensambladores1 = Integer.parseInt(data[5]);
            Main.pantallas2Contratados = Integer.parseInt(data[6]);
            Main.botones2Contratados = Integer.parseInt(data[7]);
            Main.pines2Contratados = Integer.parseInt(data[8]);
            Main.camaras2Contratados = Integer.parseInt(data[9]);
            Main.ensambladores2 = Integer.parseInt(data[10]);
            Main.pantallas1Almacen = Integer.parseInt(data[11]);
            Main.botones1Almacen = Integer.parseInt(data[12]);
            Main.pines1Almacen = Integer.parseInt(data[13]);
            Main.camaras1Almacen = Integer.parseInt(data[14]);
            Main.pantallas2Almacen = Integer.parseInt(data[15]);
            Main.botones2Almacen = Integer.parseInt(data[16]);
            Main.pines2Almacen = Integer.parseInt(data[17]);
            Main.camaras2Almacen = Integer.parseInt(data[18]);
            Main.diasRestantes = Integer.parseInt(data[19]);
            
            }catch(Exception e){
              System.out.println(e);
            }    
    }
    
    public static void EscribirCsv(){
        try {
            FileWriter csvEscritor = new FileWriter("./Parámetros.csv");
            csvEscritor.write(Main.tiempo + "\n" + Main.pantallas1Contratados + "\n" + Main.botones1Contratados + "\n" + Main.pines1Contratados + "\n" + Main.camaras1Contratados + "\n" + Main.ensambladores1 + "\n" + Main.pantallas2Contratados + "\n" + Main.botones2Contratados + "\n" + Main.pines2Contratados + "\n" + Main.camaras2Contratados + "\n" + Main.ensambladores2 + "\n" + Main.pantallas1Almacen + "\n" + Main.botones1Almacen + "\n" + Main.pines1Almacen + "\n" + Main.camaras1Almacen + "\n" + Main.pantallas2Almacen + "\n" + Main.botones2Almacen + "\n" + Main.pines2Almacen + "\n" + Main.camaras2Almacen + "\n" + Main.diasRestantes);
            csvEscritor.flush();
            csvEscritor.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

