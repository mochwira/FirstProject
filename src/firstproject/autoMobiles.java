package firstproject;

public class autoMobiles {
    //access  private
    private int year;
    private int speed;
    private String fuel;
    private String name;
    protected String type= "Terbang";
    protected String type1= "Di Tarik Gasnya";
    protected String type2= "Di Injak Gasnya";



    //Encapsulasi
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getName() {
        return name;
    }

    public void setName(String fuel) {
        this.name = name;
    }
}
