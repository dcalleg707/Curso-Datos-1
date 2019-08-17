class Main {
  public static void main(String[] args) {
   System.out.println(formas(8));
  }

 public static int formas(int n){
   if(n <= 2) return 0;
      return formas(n-1) + formas(n-2);
 }
}