package firstproject;

public class Bike extends  autoMobiles{
    private String jenisMotor;
    private String jenisMesinMotor;

    public void printType(){
        System.out.println("Motor Bergerak Dengan " + super.type1);
    }

    public String getJenisMotor() {
        return jenisMotor;
    }

    public void setJenisMotor(String jenisMotor) {
        this.jenisMotor = jenisMotor;
    }

    public String getJenisMesinMotor() {
        return jenisMesinMotor;
    }

    public void setJenisMesinMotor(String jenisMesinMotor) {
        this.jenisMesinMotor = jenisMesinMotor;
    }
}
