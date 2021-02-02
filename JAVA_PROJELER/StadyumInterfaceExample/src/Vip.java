public class Vip implements IForma,ITelevizyon,IBilet,IKoltuk,IYemek{
    @Override
    public double biletFiyat() {
        return 2000;
    }

    @Override
    public void formaHediye() {
        System.out.println("Mac oncesi formaniz hazir.");

    }

    @Override
    public void koltuk() {
        System.out.println("Ozel koltuk imkani.");

    }

    @Override
    public void yemek() {
        System.out.println("Acik bufeden bedava yemek yiyebilirsiniz.");

    }
}
