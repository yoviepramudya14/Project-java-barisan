public class BarisanPangkat extends Barisan 
{
    //deklarasi variabel
    private int Pangkat; 
    
    //constructor dengan parameter
    public BarisanPangkat(int nilaiAwal, int Pangkat)
    {
     super(nilaiAwal);
     this.Pangkat=Pangkat;
    }  
    
    //method naik
    public void naik()
    {
       super.nilaiBerikutnya = ((int)Math.pow(super.nilaiBerikutnya, Pangkat));
    }
}
