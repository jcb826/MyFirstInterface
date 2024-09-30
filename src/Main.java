import model.Airplane;
import model.Motorcycle;

public class Main {
    public static void main(String[] args) {

        Airplane airplane = new Airplane();
        airplane.fly(50);
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.fly(50);

    }
}