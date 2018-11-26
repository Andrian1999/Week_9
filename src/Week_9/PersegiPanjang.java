
package Week_9;

public class PersegiPanjang implements BangunDatar{
    private int panjang, lebar;
    @Override
    public void keliling() {
       panjang = 5; lebar = 10;
       panjang = panjang+lebar*2;
        System.out.println("Keliling Persegi panjang : "+panjang);
    }

    @Override
    public void luas() {
       panjang = 5; lebar = 10; 
       panjang = panjang*lebar;
       System.out.println("Luas Persegi Panjang : "+panjang); 
    }
    
    
}
