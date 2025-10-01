public class PenembakJitu extends Marksman {
    public int jarakTembak;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Akurasi: " + akurasi + "%");
        System.out.println("Jarak Tembak: " + jarakTembak + " meter");
    }

    public void tembakJitu() {
        System.out.println(nama + " menembak dengan jarak " + jarakTembak + " meter!");
    }
}
