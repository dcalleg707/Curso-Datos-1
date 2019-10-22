import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.Buffer;
import java.util.HashMap;

public class Main {

        public static void main(String[] args)  {

            File f;
            FileReader fr;
            BufferedReader br;
            String linea;
            try {
                String ruta = "C:\\Users\\Julián\\IdeaProjects\\Lab\\src\\medellin_colombia-grande.txt";
                f = new File(ruta);
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                int count = 0;
                grafo ej = new grafo();

                while((linea = br.readLine())!= null){
                    if(count!=0){
                        String done[] = linea.split(" ");
                        ej.addNodo(done[0],Integer.parseInt(done[1]),Integer.parseInt(done[2]),done[3]);
                    }
                }

            }catch(Exception e){
            }
        }
    }

    class grafo
    {
        HashMap<String, HashMap<String, doble>> matriz;
        HashMap<String, nodo> nodos;

        public grafo()
        {
            matriz = new  HashMap<String, HashMap <String, doble>>();
            nodos = new HashMap<String, nodo>();
        }
        public void restart()
        {
            for(String i: nodos.keySet())
            {
                this.nodos.get(i).visited = false;
            }
        }
        public String adyacente(String desde)
        {
            String hasta = "-1";
            for (String i : matriz.get(desde).keySet()) {
                if(!nodos.get(i).visited)
                {
                    nodos.get(i).visited = true;
                    return i;
                }
            }
            return hasta;
        }
        public void addNodo(String id, long x, long y, String nombre)
        {
            this.nodos.put(id, new nodo(x, y, nombre));
        }
        public void addPath(String desde, String hasta, long weight, String id)
        {
            if(!matriz.containsKey(desde))
            {
                matriz.put(desde, new HashMap <String, doble>());
            }
            matriz.get(desde).put(hasta, new doble(id, weight));
        }

        public boolean dfs(String from, String to)
        {
            nodos.get(from).visited = true;
            stack pila = new stack();
            pila.inicio = new node(from);
            String temp = "";
            while(pila.inicio != null)
            {
                if((temp = adyacente(pila.inicio.id)) != "-1")
                {
                    if(temp.equals(to))
                    {
                        restart();
                        return true;
                    }
                    pila.push(new node(temp));
                }
                else
                {
                    pila.pop();
                }
            }
            restart();
            return false;
        }

        public boolean dbs(String from, String to)
        {
            nodos.get(from).visited = true;
            queue cola = new queue();
            cola.inicio = new node(from);
            while(cola.inicio != null)
            {
                String ref = cola.inicio.id;
                String ad;
                while((ad = adyacente(ref)) != "-1") {
                    if (ad.equals(to)) {
                        restart();
                        return true;
                    }
                    cola.put(new node(ad));
                    cola.pop();
                }
            }
            restart();
            return false;
        }
    }

    class doble
    {
        String id;
        long weight;
        public doble(String identificacion, long peso)
        {
            id = identificacion;
            weight = peso;
        }
    }

    class nodo
    {
        boolean visited;
        long x;
        long y;
        nodo next;
        String nombre;
        public nodo(long x, long y, String name)
        {
            this.x = x;
            this. y = y;
            visited = false;
            nombre = name;
        }
    }

    class stack
    {
        node inicio;
        public void push(node n)
        {
            n.next = inicio;
            inicio = n;

        }
        public void pop()
        {
            inicio= inicio.next;
        }
    }
    class node
    {
        String id;
        node next;
        public node(String n)
        {
            id = n;
        }
    }

    class queue
    {
        node inicio;
        public void put(node n)
        {
            node cur = inicio;
            while(cur.next != null)
            {
                cur = cur.next;
            }
            cur.next = n;

        }
        public void pop()
        {
            inicio= inicio.next;
        }

    }


