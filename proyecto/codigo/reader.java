


import java.util.*;
import java.io.*;

/**
 * The type Reader.
 */
public class reader
{
    /**
     * Obatains the list of Datos from a text file
     *
     * @param direccion the direction of the File
     * @return A list with the Datos.
     */
    public static ListaDatos obtenerDatos(String direccion)
    {
        try
        {
            Scanner lector = new Scanner(new File(direccion));
            String x =(lector.nextLine());
            ListaDatos marco = new ListaDatos();
            while(lector.hasNextLine())
            {
                String[] temp = lector.nextLine().split(",");
                marco.add(new Dato(Double.parseDouble(temp[0]),Double.parseDouble(temp[1]), Double.parseDouble(temp[2]), Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), Double.parseDouble(temp[5]),temp[6]));
            }
            return marco;
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Not Found");
        }
        return new ListaDatos();
    }
}