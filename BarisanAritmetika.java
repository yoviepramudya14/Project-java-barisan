public class BarisanAritmetika extends Barisan
{
    //deklarasi variabel yang akan digunakan
    private int kenaikan;

    //constructor dengan parameter
    public BarisanAritmetika (int nilaiAwal, int kenaikan)
    {
      super(nilaiAwal);
      this.kenaikan = kenaikan;
    }
    
    //method naik
    public void naik()
    { 
      super.nilaiBerikutnya += kenaikan;
    }
}
