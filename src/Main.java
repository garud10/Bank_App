public class Main {
    public static void main(String[] args) {
        System.out.println("Creating Bank App!");

        Bank bankAccount = new SBIBank(1000, "Sanket", "sssgarud");
        boolean addMoneyStatus = bankAccount.addMoney(1500);
        boolean withdrawMoneyStatus = bankAccount.withdrawMoney(1300);
        if(withdrawMoneyStatus == true){
            System.out.println("Money Withdraw Succesfully");
        }else{
            System.out.println("Money Withdraw Failed!");
        }
        if(withdrawMoneyStatus == true){
            System.out.println("Money Withdraw Succesfully");
        }else{
            System.out.println("Money Withdraw Failed!");
        }

    }
}