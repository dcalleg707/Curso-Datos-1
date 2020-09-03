/**
 * The type Dato.
 */
class Dato {
    double[] lista =  new double[6];;
    /**
     * whether the coffee has rust or not.
     */
    String roya;
    /**
     * The Dato in the linked list.
     */
    Dato next;

    /**
     * Instantiates a new Dato.
     *
     * @param p  the ph
     * @param t  the temperature
     * @param m  the moisture
     * @param i  the ilumination
     * @param et the environment temperature
     * @param eh the environment humidity
     * @param r  whether it has roya or not.
     */
    public Dato(double p, double t, double m, double i, double et, double eh, String r) {
        roya = r;
        next = null;
        lista[0] = p;
        lista[1] = t;
        lista[2] = m;
        lista[3] = i;
        lista[4] = et;
        lista[5] = eh;
    }

    /**
     * Instantiates a new Dato based on another Dato without copying its reference.
     *
     * @param copia the Dato to copy
     */
    public Dato(Dato copia)
    {
        roya = copia.roya;
        next = null;
        lista[0] = copia.lista[0];
        lista[1] = copia.lista[1];
        lista[2] = copia.lista[2];
        lista[3] = copia.lista[3];
        lista[4] = copia.lista[4];
        lista[5] = copia.lista[5];


    }
}
