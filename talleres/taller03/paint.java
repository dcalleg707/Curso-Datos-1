

/**
 * Write a description of class hanoi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class paint
{
    //el ref entra como un numero cualquiera que no se vaya a utilizar
    public static void paint(int[][] bloque, int x, int y, int color)
    {
        int ref = bloque[x][y];
        bloque[x][y] = color;
        if(color == ref)
        {   
        }
        if(x > 0 && bloque[x-1][y] == ref)
        {
            paint(bloque, x-1, y, color);
        }
        if(y > 0 && bloque[x][y-1] == ref)
        {
            paint(bloque, x, y-1, color);
        }
        if(x < bloque.length-1 && bloque[x+1][y] == ref)
        {
            paint(bloque, x+1, y, color);
        }
        if(y < bloque[0].length-1 && bloque[x][y+1] == ref)
        {
            paint(bloque, x, y+1, color);
        }
        
    }
    public static void print(int[][] matriz)
    {
        for(int i = 0; i < matriz.length;i++)
        {
            for(int j = 0; j < matriz[0].length;j++)
            {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
