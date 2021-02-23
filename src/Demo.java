import textio.TextIO;

public class Demo{
    static int x = 3;
    public static void main(String[] args){
        Bruh yo = new Bruh();
        System.out.print("Enter number to be printed: ");
        System.out.println(yo.getIt());

    }

}

class Bruh extends Demo{
    public int getIt(){
        super.x = TextIO.getlnInt();
        return super.x;
    }
}
