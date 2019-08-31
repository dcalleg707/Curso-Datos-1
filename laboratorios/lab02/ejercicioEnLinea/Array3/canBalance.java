public boolean canBalance(int[] nums) {
    for (int i = 0; i < nums.length; i++) { 
   
        int suma = 0;
        
        for (int j = 0; j < i; j++){
          suma += nums[j];
          
        }
        for (int j = i; j < nums.length; j++){ 
          suma -= nums[j];
        }
        
        if (suma == 0){
          return true;
        }
    }
    return false;
}
