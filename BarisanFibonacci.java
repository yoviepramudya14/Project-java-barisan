public class BarisanFibonacci extends Barisan 
{
    //deklarasi variabel
    private int nilaiSebelumnya;
    
    //constructor tanpa parameter
    public BarisanFibonacci()
    {
        super();
        this.nilaiSebelumnya = 1;
    }
    
    //method naik
    public void naik()
    {
        int a = 1;
        a = nilaiSebelumnya + super.nilaiBerikutnya;
        super.nilaiBerikutnya = nilaiSebelumnya;
        nilaiSebelumnya = a;
    }
}
