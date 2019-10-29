import javax.sound.midi.Soundbank;
import java.math.BigDecimal;


/**
 * The type Lista datos, a linked list.
 */
public class ListaDatos {
    /**
     * The Head of the list.
     */
    Dato head;
    /**
     * The Tail of the list.
     */
    Dato tail;

    /**
     * Instantiates a new Lista datos.
     */
    public ListaDatos()
    {
        head = null;
        tail = null;
    }

    /**
     * returns the length of the list
     *
     * @return the length of the list
     */
    public int length()
    {
        int cont = 1;
        Dato current = this.head;
        while(current.next != null)
        {
            cont++;
            current = current.next;
        }
        return cont;
    }

    /**
     * summary of the information into the linked list.
     */
    public void resumen()
    {
        int yes = 0;
        int no = 0;
        int cont = 1;
        Dato current = this.head;
        while(current.next != null)
        {
            cont++;
            if (current.roya.equals("yes"))
            {
                yes++;
            }
            else
            {
                no++;
            }
            current = current.next;
        }
        if (current.roya.equals("yes")){yes++;}else{no++;};
        System.out.println("yes: " + yes + "  no: " + no + " total: " + cont);
    }

    /**
     * returns how likely it is to a Dato to have Roya according to the node where it is.
     *
     * @return the probability of roya for a Dato inside the list
     */
    public int probabilidad()
    {
        int yes = 0;
        int cont = 1;
        Dato current = this.head;
        if(current == null)
        {
            return 50;
        }
        while(current.next != null)
        {
            cont++;
            if (current.roya.equals("yes"))
            {
                yes++;
            }
            current = current.next;
        }

        if (current.roya.equals("yes")){yes++;}
        int vals = yes*100/cont;
        return vals;
    }
    /**
     * Adds a Dato to the list.
     *
     * @param nuevo the new value that will be added into the list
     */
    public void add(Dato nuevo)
    {
        if(this.tail != null)
        {
            tail.next = nuevo;
            this.tail = nuevo;
        }
        else
        {
            this.head = nuevo;
            this.tail = nuevo;
        }
    }
    /**
     * returns the maxium value in a list
     *
     * @param n the parameter that will be used
     * @return the max value
     */
    public double valMax(int n)
    {
        double valMax = 0;
        Dato current = head;
        while(current.next != null)
        {
            valMax = current.lista[n] > valMax && current.roya.equals("no")? current.lista[n] : valMax;
            current = current.next;
        }
        return current.lista[n] > valMax && current.roya.equals("no")? current.lista[n]:valMax;
    }

    /**
     * returns the minium value in a list
     *
     * @param n the parameter that will be used
     * @return the max value
     */
    public double valMin(int n)
    {
        double valMin = 10000;
        Dato current = head;
        while(current.next != null)
        {
            valMin = current.lista[n] < valMin && current.roya.equals("no")? current.lista[n]: valMin;
            current = current.next;
        }
        return current.lista[n] < valMin && current.roya.equals("no")? current.lista[n]: valMin;
    }

    /**
     * returns how good a value is to separate Datos
     *
     * @param n the n
     * @param l the l
     * @return the double [ ]
     */
    public double[] promedio(int n, double l)
    {
        int yes = 0;
        int no = 0;
        int yes2 = 0;
        int no2 = 0;
        double t1 = 0;
        double t2 = 0;
        Dato current = this.head;
        while(current.next != null)
        {
            if(current.lista[n] < l) {
                if(current.roya.equals("yes")){yes++;}else{no++;}
                t1++;
            }
            else
                {
                    if(current.roya.equals("yes"))
                    {
                        yes2++;
                    }
                    else
                        {
                            no2++;
                        }
                    t2++;
                }

            current = current.next;
        }
        double selector = 0;
        double selector2 = 0;
        double selector1 = 0;

        if (t1 != 0 )
        {
            selector1 = (yes/t1) * (1-yes/t1) +(no/t1) * (1-no/t1);
        }
        if (t2 != 0 )
        {
            selector2 = (yes2/t2) * (1-yes2/t2) +(no2/t2) * (1-no2/t2);
        }
        if(selector1 != 0 && selector2 != 0)
        {
            selector = Math.abs((selector1 + selector2) / 2);
        }





        double[] sol = {selector, yes , no, yes2, no2};
        return sol;
    }

    /**
     *Chooses the best value for each variable
     * @return the double [ ] [ ] best values and their order form best to worse
     */
    public double[][] choosers()
    {
        double[] order = new double[6];
        double better[][] = new double[2][6];
        for(int j = 0; j < 6; j++)
        {
            double beter =100000;
            double ref = 0;
            double[] aux = new double[5];
            for(double i = valMin(j); i <= valMax(j); i+= Math.abs((valMax(j)- valMin(j))) / (valMax(j)+ valMin(j)))
            {
                double[] vals = promedio(j,i);
                if(vals[0] < beter && vals[0] != 0)
                {
                    beter = vals[0];
                    ref = i;
                    double[] refs = {vals[1],vals[2], vals[3], vals[4]};
                    aux = refs;
                }
            }
            System.out.println(j + " = " + ref + " beter: "+ beter +", yes: " + aux[0] + " no: " + aux[1] + " yes2: " + aux[2] + " no2: " + aux[3]);
            better[0][j] = ref;
            order[j] = beter;
        }

        double max1 = 1;
        double max2 = 0;
        double pos = 0;
        for(int k = 0; k < 6; k++){
            for(int i = 0; i < 6; i++)
            {
                if(order[i] < max1 && order[i] > max2)
                {
                    max1 = order[i];
                    pos = i;
                }
            }
            better[1][k] = pos;
            max2 = max1;
            max1 = 1;
        }
        return better;
    }


}



