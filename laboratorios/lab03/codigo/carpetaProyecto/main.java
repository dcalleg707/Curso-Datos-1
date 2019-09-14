import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static int contador = -1;


    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        ArrayList<MarcoDatos> docs = new ArrayList<>();
        docs.add(cargarDoc("NOTAS ST0242.csv"));
        docs.add(cargarDoc("NOTAS ST0245.csv"));
        docs.add(cargarDoc("NOTAS ST0247.csv"));

        System.out.println("¿Consulta 1 o 2? Ingrese 1 para Consulta 1 o 2 para consulta 2");
        int op = t.nextInt();
        switch(op){

            case 1:
                System.out.println("Consulta 1");
                consulta1(docs);
                break;

            case 2:
                System.out.println("Consulta 2");
                consulta2(docs);
        }


    }

    public static MarcoDatos cargarDoc(String nombreArchivo){


        MarcoDatos marcoauxiliar = new MarcoDatos();
        marcoauxiliar.setNombre_archivo(nombreArchivo);
        marcoauxiliar.setDatos(marcoauxiliar.leer());

        if (marcoauxiliar.getDatos().size() != 0) {  // SI EL ARRAYLIST DE DATOS CREADO NO ESTÁ VACIO, MUESTRA QUE ARCHIVO CARGÓ Y EN QUE POSICIÓN
            contador++;
            System.out.println("Cargado archivo " + nombreArchivo + " en posición " + contador);
            return marcoauxiliar;
        } else {
            System.out.println("No se puede cargar el documento."); // DE LO CONTRARIO NO LO CARGA
            return null;
        }

    }


    public static void consulta1(ArrayList<MarcoDatos> docs){
        Scanner t = new Scanner(System.in);

        System.out.println("¿Sobre que archivo quiere trabajar? (FUNDAMENTOS DE PROGRAMACION digite 0, ESTRUCTURA DE DATOS Y ALGORITMOS 1 digite 1 o ESTRUCTURA DE DATOS Y ALGORITMOS 2 digite 2");
        consulta1_metodo(docs.get(t.nextInt()));

    }

    public static void consulta1_metodo(MarcoDatos marco){

        String aux ="";
        for(int i = 0; i<marco.getDatos().size();i++){
            String nota = marco.getDatos().get(i).getNotaDefinitiva();
            String nombre = marco.getDatos().get(i).getNombre();

            if(nombre.equals(aux)){

            }else{

                System.out.println(nombre+"\t"+nota);
                aux = nombre;
            }
        }
    }

    public static void consulta2(ArrayList<MarcoDatos> docs){
            consulta2_metodo(docs.get(0),docs.get(1),docs.get(2));
    }

     public static void consulta2_metodo(MarcoDatos marco, MarcoDatos marco2, MarcoDatos marco3) {
         Scanner t = new Scanner(System.in);
         System.out.println("Ingrese nombre de estudiante: ");
         String nombre = t.nextLine();

         System.out.println("Ingrese nombre materia: ");

         String materia = t.nextLine();

         for(int i = 1; i<marco.getDatos().size();i++){
             String mataux = marco.getDatos().get(i).getNomMateria();
             String aux = marco.getDatos().get(i).getNombre();
           if(materia.equals(mataux)){

           }else{
               if(nombre.equals(aux)){

               }else{
                   String notaM = marco.getDatos().get(i).getNotaDefinitiva();
                   String notaM2 = marco2.getDatos().get(i).getNotaDefinitiva();
                   String notaM3 = marco3.getDatos().get(i).getNotaDefinitiva();
                   String m = marco.getDatos().get(i).getNomMateria();
                   String m2 = marco2.getDatos().get(i).getNomMateria();
                   String m3 = marco3.getDatos().get(i).getNomMateria();


                   System.out.println(nombre+" sus notas son: ");
                   System.out.println("Para "+m+" su nota es: "+notaM);
                   System.out.println("Para "+m2+" su nota es: "+notaM2);
                   System.out.println("Para "+m3+" su nota es: "+notaM3);
                   break;
               }

           }
         }

     }


    }






