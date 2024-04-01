package AdapterDesignPattern;


import AdapterDesignPattern.Banks.YesBankAPI;

public class YesBankAdapter implements BankAdapter{

    YesBankAPI yesBankAPI;

    public YesBankAdapter(){
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public double getBalance(String userid, int pin) {
        return yesBankAPI.checkBalance(userid,pin);
    }

    @Override
    public boolean transfer(String fromUser, String toUser, int amount) {
        char result = yesBankAPI.transferMoney(fromUser,toUser,amount);
        return result == 'Y';
    }

    @Override
    public boolean updatePin(String userId, int oldPin, int newPin) {
        char result = yesBankAPI.updatePin(userId,oldPin,newPin);
        return result == 'Y';
    }
}
