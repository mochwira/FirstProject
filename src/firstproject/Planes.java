package firstproject;

public class Planes extends autoMobiles{
    private String jenisPesawat;
    private String jenisSayapPesawat;

    public void printType(){
        System.out.println("Pesawat Bergerak Dengan " + super.type);
    }

    public String getJenisPesawat() {
        return jenisPesawat;
    }

    public void setJenisPesawat(String jenisPesawat) {
        this.jenisPesawat = jenisPesawat;
    }

    public String getJenisSayapPesawat() {
        return jenisSayapPesawat;
    }

    public void setJenisSayapPesawat(String jenisSayapPesawat) {
        this.jenisSayapPesawat = jenisSayapPesawat;
    }
}
