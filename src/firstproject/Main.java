package firstproject;
import  java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Cars car = new Cars();
        //Cars cr = new Cars();

        Bike bike = new Bike();
        //Bike bk = new Bike();

        Planes planes = new Planes();
        //Super
       // Planes ps = new Planes();

        TotalVehicle impTotal = new TotalVehicle();

        //Scanner inputKendaraan = new Scanner (System.in);

        Scanner s = new Scanner(System.in);

        car.setYear(2018);
        car.setSpeed(180);
        car.setFuel("20 L");

        planes.setYear(2015);
        planes.setSpeed(250);
        planes.setFuel("20 L");

        //
        bike.setYear(2020);
        bike.setSpeed(120);
        bike.setFuel(" 5 L");



                //INPUT TOTAL KENDARAAN
                System.out.print("Masukkan Merk Mobil = ");
                car.setJenisMobil(s.nextLine());

                System.out.print("Masukkan Roda Penggerak Mobil = ");
                car.setJenisRodaPenggerak(s.nextLine());

                System.out.print("Masukkan Jumlah Mobil = ");
                int jumlahMobil=Integer.parseInt(s.nextLine());

                System.out.print("Masukkan Merk Motor = ");
                bike.setJenisMotor(s.nextLine());

                System.out.print("Masukkan Jenis Motor = ");
                bike.setJenisMesinMotor(s.nextLine());

                System.out.print("Masukkan Jumlah Motor = ");
                int jumlahMotor = Integer.parseInt(s.nextLine());

                System.out.print("Masukkan Merk Pesawat = ");
                planes.setJenisPesawat(s.nextLine());

                System.out.print("Masukkan Jenis Sayap Pesawat = ");
                planes.setJenisSayapPesawat(s.nextLine());

                System.out.print("Masukkan Jumlah Pesawat = ");
                int jumlahPesawat = Integer.parseInt(s.nextLine());

                // Hitung dan menampilkan data
                System.out.println("Mobil Anda Merk " + car.getJenisMobil() + " Dengan Pengerak Roda " + car.getJenisRodaPenggerak());
                System.out.println("Motor anda Merk " + bike.getJenisMotor() + " Dengan Jenis Mesin " + bike.getJenisMesinMotor());
                System.out.println("Pesawat Anda Merk " + planes.getJenisPesawat() + " Dengan Manuver Sayap " + planes.getJenisSayapPesawat());

                impTotal.totalKendaraan(jumlahMobil,jumlahMotor,jumlahPesawat);


                System.out.println("=================================");

                System.out.println("Pilih Lah 3 Jenis Kendaraan Di Bawah INI : ");

                System.out.println("1. Mobil ");
                System.out.println("2. Motor ");
                System.out.println("3. Pesawat ");
                System.out.println("Tentukan Pilihan Anda : ");

                int ch;
                ch = s.nextInt();
                if(ch == 1){
                    System.out.println("Tahun Pembuatan Mobil: " + car.getYear());
                    System.out.println("Kecepatan Maksimum Mobil : " + car.getSpeed());
                    System.out.println("Kapasitas Tangki Mobil : " + car.getFuel());
                    car.printType();
                }
                else if(ch == 2){
                    System.out.println("Tahun Pembuatan Motor : " + bike.getYear());
                    System.out.println("Kecepatan Maksimum Motor : " + bike.getSpeed());
                    System.out.println("Kapasistas Tangki Motor : " + bike.getFuel());
                    bike.printType();

                }else if (ch == 3){
                    System.out.println("Tahun Pembuatan Pesawat : " + planes.getYear());
                    System.out.println("Kecepatan Maksimum Pesawat : " + planes.getSpeed());
                    System.out.println("Kapasistas Tangki Pesawat : " + planes.getFuel());
                    //Super
                    planes.printType();

                }else{
                    System.out.println("Pilih lah jawaban antara 1-3 ");
                }

    }


}
