
public class arbol {
    Nodo inicio;
    
    public arbol()
    {
        inicio = null;
    }
    
    public void add(int n)
    {
        if(this.inicio == null)
        {

            this.inicio = new Nodo(0);
        }
        else
        {
            add2(this.inicio, n+1);
        }
    }
    
    public void add2(Nodo pos, int n)
    {
        if(pos.left == null && pos.right == null)
        {
            pos.left= new Nodo(n);
            pos.right = new Nodo(n);
        }
        else
        {
            add2(pos.left, n+1);
            add2(pos.right, n+1);
        }
    }

    public void reparticion(Nodo cur, Dato dato, double[] lim)
    {
        cur.conjunto.add(new Dato(dato));

        if(cur.num >=6){
        }
        else if(dato.lista[cur.num] < lim[cur.num])
        {
            reparticion(cur.left, dato, lim);
        }
        else if(dato.lista[cur.num] >= lim[cur.num])
        {
            reparticion(cur.right, dato, lim);
        }

    }


    public void impresion(Nodo cur)
    {
        if(cur.right == null && cur.left == null) {
            if (cur.conjunto.head != null)
            {
                cur.conjunto.resumen();
            }
            else
                {
                    System.out.println("nodo sin datos");
                }
        }
        else
        {
            impresion(cur.left);
            impresion(cur.right);
        }
    }
}

class Nodo {
    Nodo left;
    Nodo right;
    int num;
    ListaDatos conjunto = new ListaDatos();

    public Nodo(int n)
    {
        num = n;
    }
}



