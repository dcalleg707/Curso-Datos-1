import java.sql.SQLOutput;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        /**
         * Creamos un arbol
         * */
        arbol decision = new arbol(6);
        /**
         * Crea un lista ligada
         * */
        ListaDatos marco = reader.obtenerDatos("src\\test.csv");
        /*
         *  Crea arreglo con los limites
         * */
        double[][] limites = marco.choosers();
        System.out.println(marco.length());
        /**
         *  Crea 6 nodos del arbol
         */

        // Dato como cabeza de lista de datos
        Dato current = marco.head;

        // Mientras haya un dato siguiete al otro
        while(current.next != null)
        {
            //se reparte el dato por el arbol
            decision.reparticion(decision.inicio,current, limites);
            current = current.next;
        }
        decision.reparticion(decision.inicio,current, limites);
        decision.inicio.conjunto.resumen();
        decision.inicio.left.conjunto.resumen();
        decision.inicio.right.conjunto.resumen();
        System.out.println("Análisis de los nodos: \n" );
        decision.impresion(decision.inicio);
        System.out.println("\n \n");
        prueba(limites, decision, marco);
        System.out.println("\n \n");
        Dato eval = new Dato(6.64,25.75,39.86,2770.0,29.0,52.0,"no");
        analisisIndividual(eval, limites,  decision,  marco);
    }

    /**
     * Returns whether a Dato has roya or not
     *
     * @param eval  the eval
     * @param lim   the lim
     * @param Arbol the arbol
     * @return the int
     */
    public static int TieneRoya(Dato eval, double[][] lim, arbol Arbol)
    {
        Nodo cur = Arbol.inicio;
        while(cur.left != null && cur.right != null)
        {
            if(eval.lista[(int)lim[1][cur.num]] < lim[0][(int)lim[1][cur.num]])
            {
                cur = cur.left;
            }
            else
            {
                cur = cur.right;
            }
        }
        double percentage = cur.conjunto.probabilidad();
        if(percentage > 50)
        {
            return 1;
        }
        else if(percentage == 50)
        {
            return 0;
        }
        else
            {
                return -1;
            }
    }

    /**
     * Makes an analisis of a Dato and returns yes or no with no information
     *
     * @param eval     the eval
     * @param limites  the limites
     * @param decision the decision
     * @param marco    the marco
     * @return the string
     */
    public static String analisisGeneral(Dato eval, double[][] limites, arbol decision, ListaDatos marco)
    {
        int veredicto = 0;
        veredicto += TieneRoya(eval, limites, decision);
        for(int i = 0; i < 16; i++)
        {
            boolean[] temp = new boolean[6];
            for(boolean k: temp)
            {
                k = false;
            }
            for(int j = 0; j < 6; j++)
            {
                int random = (int)(Math.random()*6);
                while(temp[random] == true)
                {
                    random = (int)(Math.random()*6);
                }
                temp[random] = true;
                limites[1][j] = random;
            }
            int cant = (int)(Math.random()*6+1);
            arbol extra = new arbol(cant);
            Dato enviar = marco.head;
            while(enviar.next != null)
            {
                extra.reparticion(extra.inicio,enviar, limites);
                enviar = enviar.next;
            }
            extra.reparticion(extra.inicio,enviar, limites);
            veredicto += TieneRoya(eval, limites, extra);
        }
        //System.out.println("El veredicto del bosque es " + ((veredicto >= 0)? "yes":"no" ) + " con una diferencia de "+veredicto);
        return (veredicto >= 0)? "yes":"no";
    }

    /**
     * tests the tree.
     *
     * @param limites  the limites
     * @param decision the decision
     * @param marco    the marco
     */
    public static void prueba(double[][] limites, arbol decision, ListaDatos marco)
    {
        ListaDatos prueba = reader.obtenerDatos("src\\balanced.csv");
        Dato current = prueba.head;
        // Mientras haya un dato siguiete al otro
        int precision = 0;
        while(current.next != null)
        {
            if(analisisGeneral(current, limites, decision, marco).equals(current.roya))
            {
                precision++;
            }
            current = current.next;
        }
        if(analisisGeneral(current, limites, decision, marco).equals(current.roya))
        {
            precision++;
        }
        System.out.println("La precisión es aproximadamente del " + precision*100/prueba.length() + "%");
    }

    /**
     * Individual analisis of a node that prints information regarding to the Dato.
     *
     * @param eval     the eval
     * @param limites  the limites
     * @param decision the decision
     * @param marco    the marco
     */
    public static void analisisIndividual(Dato eval, double[][] limites, arbol decision, ListaDatos marco)
    {
        int veredicto = 0;
        veredicto += TieneRoya(eval, limites, decision);
        System.out.println("La decisión oficial es " + eval.roya);
        System.out.print("Según el primer arbol: " );
        System.out.println(((veredicto >= 0)? "yes":"no" ));
        System.out.println("Multiples Arboles: " );

        for(int i = 0; i < 12; i++)
        {
            boolean[] temp = new boolean[6];
            for(boolean k: temp)
            {
                k = false;
            }
            for(int j = 0; j < 6; j++)
            {
                int random = (int)(Math.random()*6);
                while(temp[random] == true)
                {
                    random = (int)(Math.random()*6);
                }
                temp[random] = true;
                limites[1][j] = random;
            }
            int cant = (int)(Math.random()*6+1);
            arbol extra = new arbol(cant);
            Dato enviar = marco.head;
            while(enviar.next != null)
            {
                extra.reparticion(extra.inicio,enviar, limites);
                enviar = enviar.next;
            }
            extra.reparticion(extra.inicio,enviar, limites);
            veredicto += TieneRoya(eval, limites, extra);

        }
        System.out.println("El veredicto del bosque es " + ((veredicto >= 0)? "yes":"no" ) + " con una diferencia de "+veredicto);

    }
}