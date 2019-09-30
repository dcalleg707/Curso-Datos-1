
class Dato {
    double ph, temp, moist, ilum, env_temp,env_hum;
    double[] lista =  new double[6];;
    String roya;
    Dato next;
    public Dato(double p, double t, double m, double i, double et, double eh, String r) {
        ph = p;
        temp = t;
        moist = m;
        ilum = i;
        env_temp = et;
        env_hum = eh;
        roya = r;
        next = null;
        lista[0] = p;
        lista[1] = t;
        lista[2] = m;
        lista[3] = i;
        lista[4] = et;
        lista[5] = eh;
    }

    public Dato(Dato copia)
    {
        ph = copia.ph;
        temp = copia.temp;
        moist = copia.moist;
        ilum = copia.ilum;
        env_temp = copia.env_temp;
        env_hum = copia.env_hum;
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