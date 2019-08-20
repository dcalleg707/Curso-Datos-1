

//tiene una complejidad de O(n) pues debe recorrer n los elementos por cada enesimo elemento ingresado.
import java.util.Scanner;
import java.util.ArrayList;

 class Main {
    public static ArrayList<Integer> aux(ArrayList<Integer> arr, int n)
    {
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        arr2.add(n);
        for(int i = 0; i < arr.size(); i++)
        {
            arr2.add(arr.get(i));
        }
        return arr2;
    }
    public static ArrayList<Integer> agregar(ArrayList<Integer> arr)
    {
        Scanner inp = new Scanner(System.in);
        int a = inp.nextInt();
        while(a!=-1)
        {
            arr = aux(arr,a);
            a = inp.nextInt();
        }
        return arr;
    }

    public static void main(String[] args)//test
    {
      ArrayList<Integer> i = new ArrayList<Integer>();
      i = agregar(i);
      System.out.println(i);
      
    }    
}
