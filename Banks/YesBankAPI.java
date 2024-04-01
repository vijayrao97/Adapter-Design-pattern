package AdapterDesignPattern.Banks;

public class YesBankAPI {
    public int checkBalance(String userid, int pin){
        return 1000;
    }

    public char transferMoney(String fromUser, String toUser, int amount){
        return 'Y';
    }

    public char updatePin(String userId, int oldPin, int newPin){
        return 'Y';
    }
}
