package AdapterDesignPattern;

public interface BankAdapter {
    double getBalance(String userid,int pin);
    boolean transfer(String fromUser, String toUser, int amount);
    boolean updatePin(String userId, int oldPin, int newPin);
}
