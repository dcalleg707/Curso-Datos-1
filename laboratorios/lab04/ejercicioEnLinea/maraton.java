//3.3 the implementation of this algorithm was quite simple, basically we created a binary tree with the pre-ordered values
//and  then printed them recursively so they would be in pos-order.

//3.4 and 3.5 the complexity of creating the tree is O(1), the complexity of adding items is Log(n), n is the number of elements in the tree.
// and the complexity of printing the tree is O(n) since it recursively reaches each node, n is the number of elements in the tree as well


public class maraton {
    public static void main(String[] args)
    {
        arbol tree = new arbol (50);
        tree.agregar(30, tree.inicio);
        tree.agregar(24, tree.inicio);
        tree.agregar(5, tree.inicio);
        tree.agregar(28, tree.inicio);
        tree.agregar(45, tree.inicio);
        tree.agregar(98, tree.inicio);
        tree.agregar(52, tree.inicio);
        tree.agregar(60, tree.inicio);
        tree.imprimir(tree.inicio);
    }

}

class arbol
{
    nodo inicio;
    public arbol(int n) {
        inicio = new nodo(n);
    }

    public void agregar(int n, nodo inicio)
    {
        if(n > inicio.num)
        {
            if(inicio.right != null)
            {
                agregar(n, inicio.right);
            }
            else
                {
                    inicio.right = new nodo(n);
                }
        }
        else
            {
                if(inicio.left != null)
                {
                    agregar(n, inicio.left);
                }
                else
                {
                    inicio.left = new nodo(n);
                }
            }
    }

    public void imprimir(nodo inicio)
    {
        if(inicio.left != null){imprimir(inicio.left);}
        if(inicio.right != null){imprimir(inicio.right);}
        System.out.println(inicio.num);
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

