public class Main {
    public static void main(String[] args) {
        EliteSniper sniper = new EliteSniper();
        sniper.nama = "Nanda";
        sniper.nyawa = 100;
        sniper.level = 5;
        sniper.akurasi = 95;
        sniper.jarakTembak = 300;
        sniper.kecepatan = 3;
        sniper.displayInfo();
        sniper.tembak();
    }
}
