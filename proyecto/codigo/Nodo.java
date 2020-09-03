/**
 * The type Nodo.
 */
public class Nodo {
    /**
     * The Left nodo.
     */
    Nodo left;
    /**
     * The Right nodo.
     */
    Nodo right;
    /**
     * The Number of the generation of the nodo.
     */
    int num;
    /**
     * The list of Datos in the nodo.
     */
    ListaDatos conjunto = new ListaDatos();

    /**
     * Instantiates a new Nodo.
     *
     * @param n the generation number
     */
    public Nodo(int n)
    {
        num = n;
    }
}

