//3.3 the string is received and a node is created with the number of the root node, them we separate the string in 2 parts for each node left and right,
// and that is done recursively to create a tree and returns the root node of the tree. finally we sum all the possible paths recursively and we find out
//whether the number entered is the sum of any path in the tree or not.

//3.4 y 3.5, the creation of the tree is T(n) = 2*T(n/2), and acording to wolfram alpha, that would be O(n.The recursion to sum would be O(n^2)
// for the creation of the tree the n is the length of the initial String, and for the recursion n would be the number of generations in the tree
public class Maraton2 {

    public static void main(String[] args)
    {
       solucion(22, "(5(4(11(7()())(2()()))()) (8(13()())(4()(1()()))))");
        solucion(20, "(5(4(11(7()())(2()()))()) (8(13()())(4()(1()()))))");
        solucion(10, " (3\n" +
                "(2 (4 () () )\n" +
                "(8 () () ) )\n" +
                "(1 (6 () () )\n" +
                "(4 () () ) ) )");
        solucion(5, "()");

    }

    public static void solucion(int n, String base)
    {
        System.out.println(check(n, 0, armazon(base.replace(" ", "").replace("\n", ""))));
    }

    public static boolean check(int num, int sum, nodo node)
    {
        if(node == null)
        {
            return false;
        }
        if(node.left != null && node.right != null)
        {
            return check(num, sum + node.num, node.left) || check(num, sum + node.num, node.right);
        }
        else if(node.left != null)
        {
            return check(num, sum + node.num, node.left);
        }
        else if( node.right != null)
        {
            check(num, sum + node.num, node.right);
        }
        return node.num + sum == num;
    }

    public static nodo armazon(String base)
    {

        base = base.substring(1, base.length());
        if(base.indexOf("(") == -1)
        {

        }
        else if (isNumeric(base.substring(0,base.indexOf("(")) ))
        {
            int valor = adelantar( base.substring(base.indexOf("("), base.length()));
            nodo temp = new nodo(Integer.parseInt(base.substring(0,base.indexOf("("))));
            temp.left = armazon(base.substring(base.indexOf("("), base.indexOf("(")+valor));
            temp.right = armazon(base.substring(base.indexOf("(")+valor, base.length()));
            return temp;
        }
        return null;
    }

    public static boolean isNumeric(String cadena){
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe){
            return false;
        }
    }


    public static int adelantar(String arbol)
    {
        int rango = 0;
        int avance = 0;
        for(int i = 0; i < arbol.length(); i++) {
            if (arbol.substring(i, i+1).equals("(")) {
                avance++;

            } else if (arbol.substring(i, i+1).equals(")")) {
                avance--;
            }
            rango++;

            if (avance == 0) {
                break;
            }
        }
        return rango;
    }

}

class arbol
{
    nodo inicio;
    public arbol() {
    }



}

    class nodo
    {
        int num;
        nodo left = null;
        nodo right = null;
        public nodo(int n)
        {
            num = n;
        }
    }


