public class Loca implements IYemek,IKoltuk,IBilet{
    @Override
    public double biletFiyat() {
        return 1000;
    }

    @Override
    public void koltuk() {
        System.out.println("Konforlu loca koltuklari.");

    }

    @Override
    public void yemek() {
        System.out.println("Acik bufeden bedava yemek imkani.");

    }
}
