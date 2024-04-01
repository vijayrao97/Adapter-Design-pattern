package AdapterDesignPattern;

public class Phonepe {
    private BankAdapter bankAdapter;

    public Phonepe(){
        this.bankAdapter = new YesBankAdapter();
    }

    public void getCurentBalance(String user, int pin){
        double balance = bankAdapter.getBalance(user,pin);
        System.out.println("Display balance : "+balance);
    }

    public void transferMoney(String fromUserid, int fromUserPin, String toUserid, int amount){
        double balance =  bankAdapter.getBalance(fromUserid,fromUserPin);
        if( amount <= balance ){
            if(bankAdapter.transfer(fromUserid,toUserid,amount) ){
                System.out.println("Money transferred successfully.");
            }
            else{
                System.out.println("Money failed to get transferred.");
            }
        }
        else{
            System.out.println("You don't have sufficient balance.");
        }
    }

    public void changePin(String userId, int oldPin, int newPin){
        if( bankAdapter.updatePin(userId, oldPin, newPin) ){
            System.out.println("Pin successfully changed.");
        }
        else{
            System.out.println("Pin failed to changed.");
        }
    }

}
