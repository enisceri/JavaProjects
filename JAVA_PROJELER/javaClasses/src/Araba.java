public class Araba {

    //constructor
    public Araba()
    {
        this.beygir = 250;
        this.kilometre = 0;
        this.marka = "Renault";

    }
    public Araba(String marka,int beygir,int kilometre)
    {
        this.marka = marka;
        this.beygir = beygir;
        this.kilometre = kilometre;



    }
    //attribute /field
    private String marka;
    private int beygir;
    private int kilometre;


    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getBeygir() {
        return beygir;
    }

    public void setBeygir(int beygir) {
        if(beygir < 100)
            this.beygir = 100;
        else
            this.beygir = beygir;
    }

    public int getKilometre() {
        return kilometre;
    }

    public void setKilometre(int kilometre) {
        if(kilometre < 0)
            this.kilometre = 0;
        else
            this.kilometre = kilometre;
    }
}
