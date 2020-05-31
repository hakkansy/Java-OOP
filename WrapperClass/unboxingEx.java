//Program Java mengubah objek ke primitive
//Contoh unboxing dari Integer ke int
    
	public class unboxingEx{    
    public static void main(String args[]){    
    //Converting Integer to int    
		Integer a=new Integer(3);    
		int i=a.intValue();//Mengkonversi Integer ke int secara eksplisit(langsung)
		int j=a;//unboxing, sekarang compiler akan menukis a.intValue() secara internal
			
    System.out.println(a+" "+i+" "+j);    
    }}    