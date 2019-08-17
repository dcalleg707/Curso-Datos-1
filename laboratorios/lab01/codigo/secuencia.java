public class secuencia {

    public static void main(String args[]) {
        String str1 = "ABCDGHLQR";
        String str2 = "AEDPHR";

      int result= lcs(str1.toCharArray(), str2.toCharArray(),0,0);
        System.out.print(result);
    }


    public static int lcs(char str1[],char str2[],int len1, int len2){

        if(len1 == str1.length || len2 == str2.length){
            return 0;
        }
        if(str1[len1] == str2[len2]){
            return 1 + lcs(str1,str2,len1+1,len2+1);
        }
        else{
            return Math.max(lcs(str1,str2,len1+1,len2),lcs(str1,str2,len1,len2+1));
        }
    }




}
