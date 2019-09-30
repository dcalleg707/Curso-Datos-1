

public class ListaDatos {
    Dato head;
    Dato tail;
    public ListaDatos()
    {
        head = null;
        tail = null;
    }

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

    public double[] promedio(int n, double l)
    {
        int yes = 0;
        int no = 0;
        int yes2 = 0;
        int no2 = 0;
        Dato current = this.head;
        while(current.next != null)
        {
            if(current.lista[n] < l) {
                if(current.roya.equals("yes")){yes++;}else{no++;}
            }
            else
                if(current.roya.equals("yes")){yes2++;}else{no2++;}

            current = current.next;
        }
        double selector = 0;

        if((yes == 0 && no == 0) || (yes2 == 0 && no2 == 0))
        {
            selector = 0;
        }
        else if(Math.max(yes, no) == yes)
        {
            selector = ((100*yes/(yes+no)) + (100*no2/(yes2+no2)))/2;
        }
        else
            {
                selector = ((100*no/(yes+no)) + (100*yes2/(yes2+no2)))/2;
            }


        double[] sol = {selector, yes , no, yes2, no2};
        return sol;
    }
    
    public double[] choosers()
    {
        double better[] = new double[6];
        for(int j = 0; j < 6; j++)
        {
            double beter = 0;
            double ref = 0;
            double[] aux = new double[5];
            for(double i = valMin(j); i <= valMax(j); i+= Math.abs((valMax(j)- valMin(j))) / (valMax(j)+ valMin(j)))
                {
                    double[] vals = promedio(j,i);
                    if(vals[0] > beter)
                    {
                        beter = vals[0];
                        ref = i;
                        double[] refs = {vals[1],vals[2], vals[3], vals[4]};
                        aux = refs;
                    }
                }
            System.out.println(j + " = " + ref + " beter: "+ beter +", yes: " + aux[0] + " no: " + aux[1] + " yes2: " + aux[2] + " no2: " + aux[3]);
            better[j] = ref;
        }  
        return better;
    }

}



