import textio.TextIO;

public class StudentP2 {

    public static void main(Student args) {
        System.out.print("Enter name: ");
        String name = TextIO.getln();
        final Student std = new Student(name);

        // Std
        System.out.print("Enter Math result: ");
        std.test1 = TextIO.getlnDouble();
        System.out.print("Enter English result: ");
        std.test2 = TextIO.getlnDouble();
        System.out.print("Enter Physics result: ");
        std.test3 = TextIO.getlnDouble();

        System.out.println();
        System.out.println(std.getName());
        System.out.println(std.getID());
        System.out.printf("Average: %.2f", std.getAverage());
        System.out.println("\n");


        }
}

