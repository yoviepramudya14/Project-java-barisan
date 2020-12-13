public abstract class Barisan
{
   //deklarasi variabel yang akan digunakan 
   protected int nilaiBerikutnya;
   
   //constructor tanpa parameter
   public Barisan()
   {
      this.nilaiBerikutnya = 0; 
   }
   
   //constructor dengan parameter nilai awal
   public Barisan(int nilaiAwal)
   {
    this.nilaiBerikutnya = nilaiAwal;
   } 
   
   //method berikutnya untuk nilai berikutnya
   public int berikutnya()
   {
       naik();
       return nilaiBerikutnya;
   } 
   
   //abstract method naik 
   public abstract void naik();
}
       
   

  