


public class EnumDemo {
    enum Day {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC}

    public static void main(String[] args){
        Day sund;
        Month aries;

        sund = Day.SUNDAY;
        aries = Month.APR;

        System.out.print("My sign is aries, since I was born in ");
        System.out.println(aries);
        System.out.print("That's the ");
        System.out.print(aries.ordinal() + 1);
        System.out.println("th month of the year");
        // System.out.println(" (Counting from 0, of course!)");

        System.out.print("Isn't it nice to get to ");
        System.out.println(sund);

        System.out.println(sund + " is the " + (sund.ordinal() + 1) + "st day of the week");
        System.out.println("This is counting according to the bible");
    }
}
