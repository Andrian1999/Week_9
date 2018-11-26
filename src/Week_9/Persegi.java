
package Week_9;

public class Persegi implements BangunDatar{
    private int sisi;
    @Override
    public void luas(){
        sisi= 5;
        sisi = sisi*sisi;
        System.out.println("Luas Persegi : "+sisi);
    }
    @Override
    public void keliling() {
        sisi= 5;
        sisi = sisi+sisi*2;
        System.out.println("Luas Persegi : "+sisi);
    }
}
