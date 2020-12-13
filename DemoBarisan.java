public class DemoBarisan
{  
   //method main
   public static void main(String[] arg)
   {
       cetakUrutan20();
   }
   
   //method cetakUrutan20
   public static void cetakUrutan20()
   {
       Barisan b;
      
       b = new BarisanAritmetika(-30, 5);
       System.out.println("Barisan aritmatika : ");
       int a = 0; 
       while(a < 20) 
       {
	System.out.print(b.nilaiBerikutnya + " ");
	b.berikutnya();
	a++;
	}
    
       b = new BarisanGeometri(1, 2);
       System.out.println("\nBarisan Geometri : ");
       int c = 0; 
       while(c < 20) {
	System.out.print(b.nilaiBerikutnya + " ");
	b.berikutnya();
	c++;
       }
    
       b = new BarisanFibonacci();
       System.out.println("\nBarisan Fibonacci : ");
       int d = 0; 
       while(d < 20) 
       {
	System.out.print(b.nilaiBerikutnya + " ");
	b.berikutnya();
	d++;
       }
       
       System.out.println("\nBarisan pangkat :");
       for (int i=1; i<=20; i++){
           b = new BarisanPangkat(i, 2);
           System.out.print(b.berikutnya()+" ");
       }
   }
}



    
