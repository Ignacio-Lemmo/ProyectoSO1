package Clases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CSVEL {
    
    private static String linea;
    private static String lineaHistorica;
    private static String dataUnida = "";
    private static String historicaUnida = "";
    public static String[] data;
    public static String[] dataHistorica;
    public static String[] indice;
    
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
            Main.entregas = Integer.parseInt(data[19]);
            
            }catch(Exception e){
              System.out.println(e);
            }    
    }
    
    public static void EscribirCsv(){
        try {
            FileWriter csvEscritor = new FileWriter("./Parámetros.csv");
            csvEscritor.write(Main.tiempo + "\n" + Main.pantallas1Contratados + "\n" + Main.botones1Contratados + "\n" + Main.pines1Contratados + "\n" + Main.camaras1Contratados + "\n" + Main.ensambladores1 + "\n" + Main.pantallas2Contratados + "\n" + Main.botones2Contratados + "\n" + Main.pines2Contratados + "\n" + Main.camaras2Contratados + "\n" + Main.ensambladores2 + "\n" + Main.pantallas1Almacen + "\n" + Main.botones1Almacen + "\n" + Main.pines1Almacen + "\n" + Main.camaras1Almacen + "\n" + Main.pantallas2Almacen + "\n" + Main.botones2Almacen + "\n" + Main.pines2Almacen + "\n" + Main.camaras2Almacen + "\n" + Main.entregas);
            csvEscritor.flush();
            csvEscritor.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    public static void GuardarHistorico(){
        try{
           FileWriter csvGuardar = new FileWriter("./Histórico.csv", true); 
           csvGuardar.append((Main.totalCorridas + 1) + "," + Main.diasTranscurridos + "," +Main.cambio + "\n" + Main.botones1Establecidos +  "," + Main.pantallas1Establecidos +  "," + Main.camaras1Establecidos +  "," + Main.pines1Establecidos +  "," + Main.ensambladores1Establecidos +  "," + Main.telefonos1Ensamblados + "," + Main.gananciasNetas1 + "," + Main.botones2Establecidos +  "," + Main.pantallas2Establecidos +  "," + Main.camaras2Establecidos +  "," + Main.pines2Establecidos +  "," + Main.ensambladores2Establecidos +  "," + Main.telefonos2Ensamblados + "," + Main.gananciasNetas2 + "," + "break");
           csvGuardar.flush();
           csvGuardar.close();
        }catch(Exception e){
            
        }
    }
    
    public static void LeerHistorico(){
        try{
            BufferedReader csvLeer = new BufferedReader(new FileReader("./Histórico.csv"));
            csvLeer.readLine();
            while ((lineaHistorica = csvLeer.readLine()) != null) {;
                historicaUnida += lineaHistorica + " ";
            }
            csvLeer.close();
            dataHistorica = historicaUnida.split("break");
            String [] x = dataHistorica[dataHistorica.length - 2 ].split(" ");
            indice = x[1].split(",");
            Main.totalCorridas = Integer.parseInt(indice[0]); 
        }catch(Exception e){
            System.out.println(e);
            Main.totalCorridas = 0;
        }
    }
}

