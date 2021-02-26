import textio.TextIO;

class Banks{
    protected int AccNum;
    private int amount;
    int remainingNum = 10000;
    int withdrawAmount;


    int Balance(){
        amount = remainingNum-withdrawAmount;
       return amount;
    }

    public static void main(String[] args){
        ATM atm = new ATM();
        atm.withdraw(atm.AccNum);
    }
}

class ATM extends Banks{
    private int PIN;

    void withdraw(int AccountNumber){
        System.out.print("Enter Account Number: ");
        AccountNumber=TextIO.getlnInt();
        super.AccNum = AccountNumber;
        System.out.print("Enter PIN: ");
        this.PIN = TextIO.getlnInt();
        while (Integer.toString(this.PIN).length() != 4){
            System.out.println("Invalid. Try Again.");
            this.PIN = TextIO.getlnInt();
        }
        System.out.print("Enter amount you want to withdraw: ");
        super.withdrawAmount=TextIO.getlnInt();
        while(super.withdrawAmount > 10000 || super.withdrawAmount < 1){
            System.out.println("Invalid operation, enter an amount between 1 and 10000");
            System.out.print("Amount: ");
            super.withdrawAmount = TextIO.getlnInt();
        }
        System.out.println("Successful.");
        System.out.println("Your remaining amount is $" + super.Balance());
    }
}

class MobileBanking extends Banks{
    protected int receiver;
    protected int sender;
    private int amount;

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
        System.out.println("Your remaining amount is $" + super.Balance());
    }

    void receive(){
        System.out.print("Enter sender's account number: ");
        this.sender = TextIO.getlnInt();
        System.out.print("Enter amount you want to request: ");
        this.amount = TextIO.getlnInt();
        System.out.println("Request for $" + this.amount + " sent");
    }
}