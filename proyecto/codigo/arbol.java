/**
 * The type Arbol.
 */
public class arbol {
    /**
     * The root node of the tree.
     */
    Nodo inicio;

    /**
     * Instantiates a new Arbol.
     *
     * @param n the number of generations that the tree will have
     */
    public arbol(int n)
    {
        inicio = null;
        for(int i = 0; i <= n; i++)
        {
            this.add(0);
        }
    }

    /**
     * Adds a node in the root tree.
     *
     * @param n an auxiliary number to indicate de number of the generation, it is always 0
     */
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

    /**
     * Add nodes recursively in the tree.
     *
     * @param pos the current node that is being checked
     * @param n   the number of the generation
     */
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

    /**
     * spreads the Dato trough the tree.
     *
     * @param cur  the current node
     * @param dato the dato that is going to be inserted in the tree
     * @param lim  the limits that define whether the dato goes to the left or to the right
     */
    public void reparticion(Nodo cur, Dato dato, double[][] lim)
    {
        cur.conjunto.add(new Dato(dato));

        if(cur.left == null && cur.right == null){
        }
        else if(dato.lista[(int)lim[1][cur.num]] < lim[0][(int)lim[1][cur.num]])
        {
            reparticion(cur.left, dato, lim);
        }
        else
        {
            reparticion(cur.right, dato, lim);
        }

    }


    /**
     * prints the distribution of the Datos in the tree.
     *
     * @param cur the initial node of the tree.
     */
    public void impresion(Nodo cur)
    {
        if(cur.right == null && cur.left == null) {
            if (cur.conjunto.head != null)
            {
                cur.conjunto.resumen();
            }
        }
        else
        {
            impresion(cur.left);
            impresion(cur.right);
        }
    }
}
