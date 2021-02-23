import textio.TextIO;

public class Demo{
    int x = 3;
    public static void main(String[] args){
        Bruh yo = new Bruh();
        System.out.print("Enter number to be printed: ");
        System.out.println(yo.getIt());

    }
    public interface ConversionFactors{
        int INCHES_PER_FOOT = 12;
        int FEET_PER_YARD = 3;
        int YARDS_PER_MILE = 1760;
        public void tryOut();
    }
}

class Bruh extends Demo implements Demo.ConversionFactors{
    public int getIt(){
        super.x = TextIO.getlnInt();
        return super.x;
    }
    public void tryOut(){
        System.out.println(INCHES_PER_FOOT);
    }
}

