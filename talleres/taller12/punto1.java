//Toda la implementación de los grafos fue extraida de Robert Lafore, Data Structures and Algorithms in Java (2nd edition), chapter 13: grafos. 2002 a exccepción de las modificaciones para retornar booleanos sobre la conexión de 2 nodos
// dfs.java
// demonstrates depth-first search
// to run this program: C>java DFSApp
////////////////////////////////////////////////////////////////
class StackX
 {
 private final int SIZE = 20;
 private int[] st;
 private int top;
 public StackX() // constructor
 {
 st = new int[SIZE]; // make array
 top = -1;
 }
 public void push(int j) // put item on stack
 { st[++top] = j; }
 public int pop() // take item off stack
 { return st[top--]; }
 public int peek() // peek at top of stack
 { return st[top]; }
 public boolean isEmpty() // true if nothing on stack
 { return (top == -1); }
 } // end class StackX
////////////////////////////////////////////////////////////////
class Vertex
 {
 public char label; // label (e.g. 'A')
 public boolean wasVisited;
// ------------------
 public Vertex(char lab) // constructor
 {
 label = lab;
 wasVisited = false;
 }
// ------------------
 } // end class Vertex
////////////////////////////////////////////////////////////////
class Graph
 {
 private final int MAX_VERTS = 20;
 private Vertex vertexList[]; // list of vertices
 private int adjMat[][]; // adjacency matrix
 private int nVerts; // current number of vertices
 private StackX theStack;
// ------------------
 public Graph() // constructor
 {
 vertexList = new Vertex[MAX_VERTS];
 // adjacency matrix
 adjMat = new int[MAX_VERTS][MAX_VERTS];
 nVerts = 0;
 for(int j=0; j<MAX_VERTS; j++) // set adjacency
 for(int k=0; k<MAX_VERTS; k++) // matrix to 0
 adjMat[j][k] = 0;
 theStack = new StackX();
 } // end constructor
// ------------------
 public void addVertex(char lab)
 {
 vertexList[nVerts++] = new Vertex(lab);
 }
// ------------------
 public void addEdge(int start, int end)
 {
 adjMat[start][end] = 1;
 adjMat[end][start] = 1;
 }
// ------------------
 public void displayVertex(int v)
 {
 System.out.print(vertexList[v].label);
 }
// ------------------
 public boolean dfs(int a, int b) // depth-first search
 { // begin at vertex 0
 vertexList[a].wasVisited = true; // mark it
 displayVertex(a); // display it
 theStack.push(a); // push it
 while( !theStack.isEmpty() ) // until stack empty,
 {
 // get an unvisited vertex adjacent to stack top
 int v = getAdjUnvisitedVertex(theStack.peek());
 if(v == b)
 {
     return true;
 }
 if(v == -1) // if no such vertex,
 theStack.pop();
 else // if it exists,
 {
 vertexList[v].wasVisited = true; // mark it
 displayVertex(v); // display it
 theStack.push(v); // push it
 }
 } // end while
 // stack is empty, so we're done
 System.out.println();
 for(int j=0; j<nVerts; j++) // reset flags
 {vertexList[j].wasVisited = false;}
 return false;
 } // end dfs
// ------------------
 // returns an unvisited vertex adj to v
 public int getAdjUnvisitedVertex(int v)
 {
 for(int j=0; j<nVerts; j++)
 if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
 return j;
 return -1;
 } // end getAdjUnvisitedVert()
// ------------------

 } // end class Graph
////////////////////////////////////////////////////////////////
public class Main
 {
 public static void main(String[] args)
 {
 Graph theGraph = new Graph();
 theGraph.addVertex('A'); // 0 (start for dfs)
 theGraph.addVertex('B'); // 1
 theGraph.addVertex('C'); // 2
 theGraph.addVertex('D'); // 3
 theGraph.addVertex('E'); // 4
 theGraph.addEdge(0, 1); // AB
 theGraph.addEdge(1, 2); // BC
 theGraph.addEdge(0, 3); // AD
 theGraph.addEdge(3, 4); // DE
 System.out.print("Visits: ");
 int a = 0;
 int b = 2;
 System.out.println(theGraph.dfs(a,b));
 } // end main()
 } 
