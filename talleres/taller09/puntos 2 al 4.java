public class Hash {
    static HashMap<String, String> negocio = new HashMap<String, String>();
    
    public static void punto2()
    {
        negocio.put("Google", "Estados Unidos");
        negocio.put("La locura", "Colombia");
        negocio.put("Nokia", "Finlandia");
        negocio.put("Sony", "Japón");
    }
    
    public static String punto3(String nombre)
    {
        boolean st = false;
        for (String i : negocio.keySet()) {
            if(i == nombre){
                st = true;
                break;
            }
        }
        
        if(st)
        {
            return negocio.get(nombre);
        }
        else{
            return "No está";
        }
    }
    
    public static String punto4(String nombre)
    {
        boolean st = false;
        for (String i : negocio.values()) {
            if(i == nombre){
                st = true;
                break;
            }
        }
        
        if(st)
        {
            return negocio.get(nombre);
        }
        else{
            return "No está";
        }
    }
    
}
