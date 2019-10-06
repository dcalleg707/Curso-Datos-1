import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


/**
 * The type Carpeta.
 */
public class carpeta {

    /* Crea HashMap, un ArrayList para los archivos*/

    /**
     * The Carpetas.
     */
    HashMap<String, File> carpetas = new HashMap<String, File>();

    /**
     * The A.
     */
    /* SE INNGRESA UNA DIRECCIÓN COMO PATHNAME del archivo "File" que es la carpeta que queremos explorar, en este caso es una carpeta de mi computador*/
    File[] a = new File("C:\\Users\\Julián\\IdeaProjects\\Lab4P1\\src\\TESTEO").listFiles();
    /**
     * The T.
     */
    Scanner t = new Scanner(System.in);


    /**
     * Meter carpetas.
     */
    /* Metodo para meter las carpetas en la HashTable*/
    public void meterCarpetas() {
        for (File file : a) {
            if (file.isDirectory()) {
                carpetas.put(file.getName(), file);
            }
        }


    }

    /**
     * Buscar.
     *
     * @param op the op
     */
    /* Metodo para buscar*/
    public void buscar(int op) {
        switch (op) {
            case 1:
                /* Buscar los archivos en la carpeta raiz*/
                archivosCarpetaRaiz();
            case 2:
                /* buscar archivos en una carpeta específica*/
                buscarArchivosCarpeta(t.nextLine());
            case 3:
                /* Buscar archivos por peso en la carpeta raiz*/
                buscarArchivosPesoRaiz(t.nextInt());
            case 4:
                /* buscar archivos por peso en una carpeta especifica*/
                buscarArchivosPesoRaizCarpeta(t.nextLine(), t.nextInt());
        }

    }

    /**
     * Buscar archivos carpeta.
     *
     * @param name the name
     */
    /* Metodo para buscar los archivos en una carpeta específica*/
    public void buscarArchivosCarpeta(String name) {
        if (carpetas.get(name) == null) {
            System.out.println("No se encontró la carpeta");
        } else {
            System.out.println(carpetas.get(name).listFiles());
        }

    }


    /**
     * Archivos carpeta raiz.
     */
    /*Método para mostrar los archivos en la carpeta raíz*/
    public void archivosCarpetaRaiz() {
        for (File file : a) {
            if (file.isDirectory()) {
                System.out.println(file);
            }
        }
    }

    /*Método para buscar archivos por peso en la carpeta raíz*/

    /**
     * Buscar archivos peso raiz.
     *
     * @param peso the peso
     */
    public void buscarArchivosPesoRaiz(int peso) {
        for (File file : a) {
            if (file.length() > peso) {
                System.out.println(file);
            }
        }
    }


    /**
     * Buscar archivos peso raiz carpeta.
     *
     * @param carpeta the carpeta
     * @param peso    the peso
     */
    /* Método para buscar archivos por peso en una carpeta especifica */
    public void buscarArchivosPesoRaizCarpeta(String carpeta, int peso){
        File[] aux = new File(carpetas.get(carpeta).getPath()).listFiles();

        for(File file:aux){
            if(file.length()>peso){
                System.out.println(file);
            }
        }

    }




    }










