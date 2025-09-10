public class DemoMobil {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Toyota", 120);

        System.out.println("Merek awal    : " + mobil1.getMerek());
        
        mobil1.setKecepatan(100);

        mobil1.displayInfo();
    }
}
