import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;

public class MarcoDatos {

    static String nombre_archivo;
    ArrayList<Datos> datos = new ArrayList<>();


    public  ArrayList<Datos> leer() {


        Datos miDato;
        File f;
        String linea;


        try{

            String ruta = "src\\"+nombre_archivo;
            Scanner t = new Scanner(new File(ruta));

            while(t.hasNextLine()){


                String[] midato= t.nextLine().split(",");

                if(midato[0].equals("")){
                    continue;
                }

                miDato = new Datos(midato[0],midato[1],midato[2],midato[3],midato[4],midato[5],midato[6],midato[7],midato[8],midato[9],midato[10],midato[11],midato[12],midato[13]);
                datos.add(miDato);
            }

            System.out.println(datos.get(0));

        } catch(Exception ex){

        }

        return datos;

    }
    public static String getNombre_archivo() {
        return nombre_archivo;
    }

    public static void setNombre_archivo(String nombre_archivo) {
        MarcoDatos.nombre_archivo = nombre_archivo;
    }

    public  ArrayList<Datos> getDatos() {
        return datos;
    }

    public  void setDatos(ArrayList<Datos> datos) {
        this.datos = datos;
    }
}

