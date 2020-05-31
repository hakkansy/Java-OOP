    
	
//Program Java untuk merubah bentuk data primitive ke objek
//Contoh Autoboxing dari int ke Integer
    public class autoBoxingEx{  
    public static void main(String args[]){  
    //Mengkonversi int ke Integer
    int a=20;  
    Integer i=Integer.valueOf(a);//mengubah integer ke bentuk eksplisitnya(langsung)
    Integer j=a;//autoboxing, sekarang compiler akan menulis Integer.valueOf(a) secara internal
	
      
    System.out.println(a+" "+i+" "+j);  
   }
	
}  