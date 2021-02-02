public class Main{

    public static void main(String[] args)
    {
        String sehirler[][] = new String[3][3];

        /*
        sehirler -> 1. Marmara Bölgesi
                    2. Karadeniz Bölgesi
                    3. İç Anadolu Bölgesi
         */

        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Balikesir";
        sehirler[0][2] = "Bolu";

        sehirler[1][0] = "Rize";
        sehirler[1][1] = "Trabzon";
        sehirler[1][2] = "Artvin";

        sehirler[2][0] = "Ankara";
        sehirler[2][1] = "Sivas";
        sehirler[2][2] = "Yozgat";



        for(int i = 0; i < sehirler.length; i++)
        {
            for(int j = 0; j < sehirler[0].length; j++)
                System.out.println(sehirler[i][j]);
        }


    }

}