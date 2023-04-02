import java.time.LocalDate;
import java.time.Period;

public class Buildings {
    private String name;
    private int year;
    private int month;
    private int day;

    private int floor;
    private LocalDate date;

    public Buildings(String name, int year, int month, int day, int floor) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.day = day;
        this.floor = floor;
        this.date = LocalDate.of(year,month,day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void dzień(int year , int month , int day) {
        LocalDate data = LocalDate.of(year,month,day);
        LocalDate today= LocalDate.now();
        Period różnica = Period.between(data,today);
        System.out.println(różnica);
    }
    public void wypisz() {
        System.out.println("budynek o nazwie" + name);
        System.out.println("budynek został zbudowany w " + date);
        System.out.println("budynek ma pięter " + floor);
        System.out.print("Ma lat");
        dzień(year,month,day);
    }

}
