import textio.TextIO;

class Banks{

    /* This program is a model of a small bank and two different services they give;
    The first is ATM, where they can withdraw their money;
    For keeping this example simple, there is no restriction on the length of the account number;
    The second service is Mobile Banking, where they can send or receive money;
    * We will use "this" and "super" to access different instance variables and methods in this program;
    As the methodology is repeated throughout the program;
    Comments are found on different parts of the program;
    */

    protected int AccNum; // Protected means subclasses can access this variable.
    private int amount; // Amount of money in bank account;
    int remainingNum = 10000; // Our starting amount for any account
    int withdrawAmount;


    int Balance(){  // Method to keep track of balance of the account
        amount = remainingNum-withdrawAmount; // We use "this" to access the amount variable
       return amount;
    }

    public static void main(String[] args){
        ATM atm = new ATM();

    }
}

class ATM extends Banks{
    private int PIN;
    ATM(){
        this.withdraw();
        System.out.println("Your balance is $" + super.Balance());
    }

    void withdraw(){
        System.out.print("Enter Account Number: ");
        super.AccNum=TextIO.getlnInt();  // We use "super" to access the AccNum from the main Bank class
        System.out.print("Enter PIN: ");
        this.PIN = TextIO.getlnInt(); // We use "this" to access the PIN variable from this, ATM class
        while (Integer.toString(this.PIN).length() != 4){ // Forces the pin number of the ATM card to be 4 digits
            System.out.println("Invalid. Try Again.");
            this.PIN = TextIO.getlnInt();
        }
        System.out.print("Enter amount you want to withdraw: ");
        super.withdrawAmount=TextIO.getlnInt(); // We use super to access

        //This while loop forces the withdraw amount to be valid and within the sufficient balance
        while(super.withdrawAmount > 10000 || super.withdrawAmount < 1){
            System.out.println("Invalid operation, enter an amount between 1 and 10000");
            System.out.print("Amount: ");
            super.withdrawAmount = TextIO.getlnInt(); //Using "super" to access withdrawAmount variable from the superclass
        }
        System.out.println("Successful.");
         // Using "super" to access the withdrawAmount variable from the superclass
        System.out.println("Your have withdrawn $" + super.withdrawAmount);
    }
}

class MobileBanking extends Banks{
    protected int receiver;
    protected int sender;
    private int amount; // We make this amount variable to be private so it won't cause a bug by acting as the amount in the superclass

    MobileBanking(){
        this.send(); // we use "this" to access the send method in this class
        // We use "super" to access the Balance method in the superclass
        System.out.println("Your balance is $" + super.Balance());
    }

    void send(){
        System.out.print("Enter receiver's account number: ");
        this.receiver = TextIO.getlnInt();
        System.out.print("Enter amount to be sent: ");
        super.withdrawAmount= TextIO.getlnInt();
        while(super.withdrawAmount > 10000 || super.withdrawAmount < 1){
            System.out.println("Invalid operation, enter an amount between 1 and 10000");
            System.out.print("Amount: ");
            super.withdrawAmount = TextIO.getlnInt();
        }
        System.out.println("Sent.");
        System.out.println("Your have sent  $" + super.withdrawAmount); // Using "super" to call the "withdrawAmount" variable from the superclass.
    }

    void receive(){
        System.out.print("Enter sender's account number: ");
        this.sender = TextIO.getlnInt(); // Using "this" to access the sender variable from this, MobileBanking class.
        System.out.print("Enter amount you want to request: ");
        this.amount = TextIO.getlnInt();
        System.out.println("Request for $" + this.amount + " sent");
    }
}