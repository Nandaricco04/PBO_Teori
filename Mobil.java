public class Mobil {
    private String merek;
    private int kecepatan;

    public Mobil(String merek, int kecepatan) {
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    public String getMerek() {
        return merek;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void displayInfo() {
        System.out.println("Merek    : " + merek);
        System.out.println("Kecepatan: " + kecepatan + " km/h");
    }
}
