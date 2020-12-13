public class BarisanGeometri extends Barisan 
{
    //deklarasi variabel
    private int rasioPengali ;
    
    //constructor dengan parameter
    public BarisanGeometri(int nilaiAwal, int rasioPengali)
    {
     super(nilaiAwal);
     this.rasioPengali=rasioPengali;
    }
    
    //method naik
    public void naik()
    {
        super.nilaiBerikutnya *= rasioPengali;
    }
}
