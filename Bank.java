
public class Bank {

    private int accountNumber;
    private String name;
    private int balance;
    private String accountType;
    private String email;

    
    public Bank(int accountNumber, String name, int  balance,String accountType,String emial) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.accountType = accountType; 
        this.email = email;  
    }

    
    public int getAccNumber(){
    return accountNumber;
}
public int getBalance(){
    return balance;
}
public String getName(){
    return name;
}
public String getEmail(){
    return email;
}
public String getAccType(){
    return accountType;
}

    public void setAccNumber(int accountNumber){
    this.accountNumber=accountNumber;
}
public void setBalance(int balance){
    this. balance=balance;
}
public void   setName(String name){
    this.name=name;
}
public void  setEmail(String email){
    this.email=email;
}
public void setAccType(String accountType){
     this.accountType=accountType;
     
}
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited Successfully");
    }

  
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
        }
    }

    
    public boolean withdrawTransfer(double amount) {
        if (amount > balance) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
    }

   
    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Email: " + email);
        System.out.println("------------------------------------------------------");
    }
}
