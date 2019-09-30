


import java.util.*;
import java.io.*;
public class reader
{
    public static ListaDatos obtenerDatos()
    {
        try
        {
            Scanner lector = new Scanner(new File("src\\data_train.csv"));
            System.out.println(lector.nextLine());
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