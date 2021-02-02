public class DortIslem {

    public double topla(double sayi1, double sayi2) {
        return sayi1 + sayi2;
    }

    public double cikar(double sayi1, double sayi2) {
        return sayi1 - sayi2;
    }

    public double carp(double sayi1, double sayi2) {
        return sayi1 * sayi2;
    }

    public double bol(double sayi1, double sayi2) {
        return sayi1 / sayi2;
    }

    public double mutlakDegerAl(double sayi) {
        if (sayi < 0)
            sayi *= -1;
        return sayi;
    }
}
