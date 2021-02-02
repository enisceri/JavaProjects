public abstract class GameCalculator {
    public abstract void hesapla(); //Bu fonksiyonu mecburen her class override etmelidir.

    public void gameOver()
    {
        System.out.println("Oyun bitti.");
    }
}
