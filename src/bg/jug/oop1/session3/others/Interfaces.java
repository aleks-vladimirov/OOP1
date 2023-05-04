package bg.jug.oop1.session3.others;

public class Interfaces {

    interface Clock {
        static int HOURS_DAY = 24;
        static int getTheHoursOfDay() {
            return HOURS_DAY;
        }


    }

    static class MyClock implements Clock {

    }




    public static void main(String[] args) {
        System.out.println(Clock.HOURS_DAY);
    }
}
