package AdapterDesignPattern;

import AdapterDesignPattern.Banks.ICICIBankAPI;

public class ICICIBankAdapter implements BankAdapter {

    private ICICIBankAPI iciciBankAPI;

    public ICICIBankAdapter(){
        iciciBankAPI = new ICICIBankAPI();
    }

    @Override
    public double getBalance(String userid, int pin) {
        String token = generateToken(userid,pin);
        return iciciBankAPI.getBalance(token);
    }

    @Override
    public boolean transfer(String fromUser, String toUser, int amount) {
        String result = iciciBankAPI.pay(fromUser,toUser,amount);
        return result == "Done";
    }

    @Override
    public boolean updatePin(String userId, int oldPin, int newPin) {
        return iciciBankAPI.changePin(userId,oldPin,newPin);
    }

    private String generateToken(String userid, int pin){
        return "Token";
    }

}
