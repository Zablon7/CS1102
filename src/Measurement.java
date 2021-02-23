import textio.TextIO;

public class Measurement {
    public static void main(String[] args){
        int optionNumber;
        double measurement;

        double inches;

        System.out.println("What unit of measurement does your input use?");
        System.out.println();
        System.out.println("    1.  inches");
        System.out.println("    2.  feet");
        System.out.println("    3.  yards");
        System.out.println("    4.  miles");
        System.out.println();
        System.out.print("Enter the number of your choice: ");
        optionNumber = TextIO.getlnInt();

        switch(optionNumber){
            case 1:
                System.out.println("Enter the number of inches: ");
                measurement = TextIO.getlnDouble();
                inches = measurement;
                System.out.println(inches);
                break;
            case 2:
                System.out.println("Enter the number of feet: ");
                measurement = TextIO.getlnDouble();
                inches = measurement * 12;
                System.out.println(inches);
                break;
            case 3:
                System.out.println("Enter the number of yards: ");
                measurement = TextIO.getlnDouble();
                inches = measurement * 36;
                System.out.println(inches);
                break;
            case 4:
                System.out.println("Enter the number of miles: ");
                measurement = TextIO.getlnDouble();
                inches = measurement * 12 * 5280;
                System.out.println(inches);
                break;
            default:
                System.out.println("Error! Illegal option number! I quit!");
                System.exit(1);


        }
    }
}
