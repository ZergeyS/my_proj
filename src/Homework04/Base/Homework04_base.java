package Homework04.Base;

public class Homework04_base {
    public static void main(String[] args) {
//        Duck duckNotInjured = new Duck(false);
//        Duck duckInjured = new Duck(true);
//        Airplane airplanePositivePassengers = new Airplane(10);
//        Airplane airplaneNegativePassengers = new Airplane(-1);
//
        Flyable[] flyers = {
        new Duck(false), new Duck(true), new Airplane(10), new Airplane(-1)
        };
//        Flyable[] flyers = {duckInjured, duckNotInjured, airplanePositivePassengers, airplaneNegativePassengers};
        for (Flyable flyer : flyers) {
            try {
                flyer.fly();
            } catch (FlyException e) {
                System.out.println(e.getMessage());
            }
        }


//        for (Flyable flyer : flyers) {
//            try {
//                flyer.fly();
//            }  catch (FlyException flyError);
//        }

    }
}
