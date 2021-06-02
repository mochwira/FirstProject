package firstproject;

public class Cars extends autoMobiles{
    private String jenisMobil;
    private String jenisRodaPenggerak;

    public void printType(){
        System.out.println("Mobil Bergerak dengan " + super.type2);
    }

    public String getJenisMobil() {
        return jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

    public String getJenisRodaPenggerak() {
        return jenisRodaPenggerak;
    }

    public void setJenisRodaPenggerak(String jenisRodaPenggerak) {
        this.jenisRodaPenggerak = jenisRodaPenggerak;
    }
}
