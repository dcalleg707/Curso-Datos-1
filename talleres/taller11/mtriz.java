import java.util.ArrayList;


public class DigraphAM extends Digraph {
	private int[][] matriz;

	
	public DigraphAM(int size) {
		super(size);
	    	matriz = new int[size][size];
	}

	
	public void addArc(int source, int destination, int weight) {
		 matriz[source][destination] = weight;
	}

	
	public ArrayList<Integer> getSuccessors(int vertex) {
		ArrayList<Integer> respuesta = new ArrayList<Integer>();
    		for (int i = 0 ; i < size; i++)
      			if (matriz[vertex][i] != 0)
         			respuesta.add(i);
    		return respuesta;
	}

	public int getWeight(int source, int destination) {
		 return matriz[source][destination];
	}

}