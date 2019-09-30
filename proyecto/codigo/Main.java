
public class Main {
    public static void main(String[] args)
    {
        /**
        * Creamos un arbol
        * */
        arbol decision = new arbol();
        /**
        * Crea un lista ligada
        * */
        ListaDatos marco = reader.obtenerDatos();
        /*
        *  Crea arreglo con los limites
        * */
        double[] limites = marco.choosers();
        System.out.println(marco.length());


        /**
         *  Crea 6 nodos del arbol
         */
        for(int i = 0; i <= 6; i++)
        {
            decision.add(0);
        }
        // Dato como cabeza de lista de datos
        Dato current = marco.head;

        // Mientras haya un dato siguiete al otro
        while(current.next != null)
        {
            //
            decision.reparticion(decision.inicio,current, limites);
            current = current.next;
        }
        Dato ej = new Dato(current);
        decision.reparticion(decision.inicio,current, limites);
        System.out.println("Análisis de 2: \n" );
        decision.inicio.conjunto.resumen();
        decision.inicio.left.conjunto.resumen();
        decision.inicio.right.conjunto.resumen();
        System.out.println("Análisis de 2: \n" );
        decision.impresion(decision.inicio);
    }
}
