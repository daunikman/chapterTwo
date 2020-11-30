public class Account{

    private String accountName = "Nonso";

    private String accountNumber;

    private byte accountPin;

    private int accountBalance;

    
    public Account(String accountName, int accountBalance){
    
        this.accountBalance = accountBalance;
        this.accountName = accountName;

    }

    public Account(int accountBalance, String accountName){
    
        this.accountBalance = accountBalance;
        this.accountName = accountName;

    }


    public Account(){}



   public void setAccountName(String accountName){
       this.accountName = accountName;
  
    }

   public String getAccountName(){
       return accountName;
  
    }


   public String getAccountNumber(){
       return accountNumber;
  
    }


   public void setAccountNumber(String accountNumber){
       this.accountNumber = accountNumber;
  
    }




    public int getAccountBalance(){
        return accountBalance;

    }

    public void setAccountBalance(int accountBalance){

        this.accountBalance = accountBalance;

    }


    public byte getAccountPin(){
  
        return accountPin;
     }

     public void setAccountPin(byte accountPin){
       
        this.accountPin = accountPin; 
       }
    

 
  










}

