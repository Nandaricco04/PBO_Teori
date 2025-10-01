public class EliteSniper extends PenembakJitu {
    public int kecepatan;

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kecepatan: " + kecepatan);
    }

    public void tembakCepat() {
        System.out.println(nama + " menembak dengan kecepatan " + kecepatan + " peluru per detik!");
    }
    
}
