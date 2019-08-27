class Lista{
  public Nodo head;
  public int size;
  
   public lista(){
      head = null;
      size = 0;
    }
      public void agregarInicio(int e){
    Nodo nuevo = new Nodo(e);
    nuevo.siguiente = head;
    head = nuevo;
    size++;
  }

  public void agregarFinal(int e){
    Nodo nuevo = new Nodo(e);
    for(int i = 0; i<=size;i++){
      if(nuevo.siguiente == null){
         nuevo.siguiente = nuevo;
      }else{
        agregarFinal(e);
      }
    }
    size++;
  }

  public Nodo getAux(Nodo nodo, int i){
      if(i == 0){
        return nodo;
      }else{
        return getAux(nodo.siguiente,i-1);
      }
  }
  public Nodo get(int i){
    return getAux(head,i);
  }

  public void agregarPosicion(int p, int e){
          Nodo nuevo = new Nodo(e);      
          nuevo.siguiente = get(p).siguiente;
          get(p).siguiente = nuevo;
          
        }
  

  public void borrar(int p){
        get(p-1).siguiente = get(p).siguiente;
    }
  }
