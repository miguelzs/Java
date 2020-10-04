/**
 * We want to have instance data of: make, model, year, speed, hp, mpg
 * and methods to drive, break, turn
 * Encapsulation: the object is responsible for it's own data
 * and should protect it from outsider's use.
 * --> We don't want outsiders to modify our instance data (without us knowing).
 More on this coming...
 *
 */
public class CarA {
    String make = "Ford"; //null
    String model = ""; //null
    int year; // 0
    double speed = 30.0; // 0.0
    int hp; //0
    double mpg; //0

    public double drive(int time) {
        double distance;
        distance = speed * time;

        return distance;

    }
    public double drive(int time, double _speed) {
        double distance;
        speed = _speed;
        distance = speed * time;

        return distance;
    }
    public static void main(String[] args) {

    }
}
