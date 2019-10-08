import java.util.ArrayList;

/**
 * Implementacion de un grafo dirigido usando listas de adyacencia
 *
 * @author Mauricio Toro, Mateo Agudelo, <su nombre>
 */
public class DigraphAL extends Digraph {

	ArrayList<LinkedList<Pair<Integer,Integer>>> listaDeListas;

	public DigraphAL(int size) {
		super(size);
    		listaDeListas = new ArrayList<LinkedList<Pair<Integer,Integer>>>(size);
		for(i = 0; i<size; i++){
			listaDeListas.add(lista = new LinkedList());
		}
	}

	
	public void addArc(int source, int destination, int weight) {
		listaDeListas.get(source).add(new Pair(destination, weight));
	}

	
	public ArrayList<Integer> getSuccessors(int vertex) {
		
	}
	
	public int getWeight(int source, int destination) {
		return listaDeListas.get(source).get(destination).getKey(1);
	}

}
