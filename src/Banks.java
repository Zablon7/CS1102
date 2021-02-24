import textio.TextIO;

public class Banks {
    /*
    Since banks have different uses and offer different services;
    let us create a superclass called Banks;
    This super class will be used for general purposes;
    It can even be changed into an abstract class, if we wanted it to.
    * */
    protected int initialAmount;
    int amount;
    protected int AcNum;
    protected int AcPass;
    protected int remainingAmount;
    protected int Balance(){  // Instance method
        /*
        Since remainingAmount is a instance variable in this class;
        We can refer to it by it's full name on her using the "this keyword"
        * */
        return this.remainingAmount;
    }
}

class ATM extends Banks{

    private boolean x;

    public String withdraw(){
        System.out.print("Enter account number: ");
        super.AcNum = TextIO.getlnInt();
        System.out.print("Password: ");
        super.AcPass = TextIO.getlnInt();
        System.out.print("Enter amount to be withdrawn: ");
        super.amount = TextIO.getlnInt();
        super.remainingAmount = super.initialAmount - super.amount; // This changes our balance method in the superclass
        return super.amount +" withdrawn.";
    }

    public String Balance(boolean x){
        x = this.x; // Use a private instance method to prevent tampering.
        if (this.x){
            return "Your balance is: " + super.Balance(); // We call balance from the superclass to give us the amount;
        }
        else{
            return "";
        }
    }
}

class MobileBanking extends Banks{
    private int RecAcc;
    ATM system = new ATM();

    void Send(){
        System.out.print("Enter Receiver's account number: ");
        this.RecAcc = TextIO.getlnInt();
        system.AcNum = 0;
        system.AcPass = 0;


    }

}

class Demo{
    public static void main(String[] args){
        ATM outside = new ATM();
        System.out.println(outside.withdraw());
    }
}