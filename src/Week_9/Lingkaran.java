
package Week_9;


public class Lingkaran implements BangunDatar{
    private float jari;
    @Override
    public void keliling() {
        jari = 14;
         jari =  (float) (2*3.14*jari);
        System.out.println("keliling Lingkaran : "+jari);
    }

    @Override
    public void luas() {
        jari = 7;
        jari = (float) (3.14*jari*jari);
        System.out.println("Luas Lingkaran : "+jari);
    }
    
}
