package AdapterDesignPattern.Banks;

public class ICICIBankAPI {
    public double getBalance(String token){
        return 1000.0;
    }

    public String pay(String fromUser, String toUser, int amount){
        return "Done";
    }

    public boolean changePin(String userId, int oldPin, int newPin){
        return true;
    }

}
