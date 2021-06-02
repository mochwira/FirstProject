package firstproject;

class TotalVehicle implements VehicleTotal{

    @Override
    public void totalKendaraan(int jumlahMobil, int jumlahMotor, int jumlahPesawat) {
        int toKen = jumlahMobil + jumlahMotor + jumlahPesawat;
        System.out.println("Jumlah Kendaraan "  + toKen);
    }
    // implementasi Override;

}
