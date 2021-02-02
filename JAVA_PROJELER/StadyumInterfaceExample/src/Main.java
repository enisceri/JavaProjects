public class Main {
//vip,loca,kale arkasi
//vip -> yemek, ozelKoltuk,tv, forma dagitimi,bilet
//loca->yemek, ozelKoltuk,bilet
//kaleArkasi ->bilet
    public static void main(String[] args) {

        Vip vip = new Vip();
        Loca loca = new Loca();
        KaleArkasi kaleArkasi = new KaleArkasi();
        System.out.println("VIP");
        System.out.println("----------------");

        System.out.println(vip.biletFiyat());
        vip.formaHediye();
        vip.koltuk();
        vip.yemek();
        System.out.println("----------------");

        System.out.println("Loca");
        System.out.println("----------------");
        System.out.println(loca.biletFiyat());
        loca.koltuk();
        loca.yemek();
        System.out.println("----------------");

        System.out.println("Kale Arkasi");
        System.out.println("----------------");
        System.out.println(kaleArkasi.biletFiyat());
        System.out.println("----------------");

    }
}
