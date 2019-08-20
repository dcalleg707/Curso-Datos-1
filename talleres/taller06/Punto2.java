
package datos;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author dcalleg
 */
public class Datos {
    public static ArrayList<Integer> agregar(ArrayList<Integer> arr, int n)
    {
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(n);
        for(int i = 0; i < arr.size(); i++)
        {
            arr2.add(arr.get(i));
        }
        return arr2;
    }
    public static void aux(ArrayList<Integer> arr, int[] n)
    {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        while(a!=-1)
        {
            arr = agregar(arr,a);
            a = inp.nextInt();
        }
    }    
}
