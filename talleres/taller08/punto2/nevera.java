class nevera{

  int codigo = 0;
  String modelo = "";
  

  public nevera(String modelo, int codigo){
      this.codigo = codigo;
      this.modelo = modelo;
  }

  public int getID(){
    return codigo;
  }

  public String getModel(){
    return modelo;
  }

  @Override
  public String toString(){
    return "Nevera : "+codigo+" |";
  }
}
