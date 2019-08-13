class Main {
  

    public static void main(String[] args) {

      int arr[]  = new int [2000000];

      for(int i = 0; i<arr.length;i++){

          arr[i] = i;

      }

      
      long startTime = System.currentTimeMillis();

        int n = recorrermatriz(arr);

      long estimatedTime = System.currentTimeMillis()-startTime;

        System.out.println("Tiempo para: "+arr.length+" es: "+estimatedTime+"         --      RESULTADO "+n);

    }

    
    public static int recorrermatriz(int arr[]){
        int suma = 0;
       for(int i = 0; i<arr.length;i++){
         suma = suma+arr[i];
       }

    return suma;
  }
}

// Complejidad es O(n)
/** Respuesta a pregunta: Si, hay una diferencia y es que con el manejo de ciclos vemos un aumento del ruido
pero a la vez el tiempo de ejecución es menor en los intervalos, en cambio con recursion tarda un poco más aunque el ruido 
se minimiza un poco. 
