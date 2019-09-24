class Main {
  public static void main(String[] args) {
    
  }

  private void addNodo(nodo nodo, nodo raiz){


    if(raiz == null){

      raiz = nodo;

    }else{

      if(nodo.getValor()<= raiz.getValor()){

          if(nodo.getLeft()==null){
            raiz.setLeft(nodo);
          }else{
            addNodo(nodo,raiz.getLeft());
          }

      }else{

        if(raiz.getRight() == null){
          raiz.setRight(nodo);
        }else{
          addNodo(nodo,raiz.getRight());
        }

      }
    }
  }
    


}
