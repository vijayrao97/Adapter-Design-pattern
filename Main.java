package AdapterDesignPattern;

public class Main {
    public static void main(String args[]){
        Phonepe phonepe = new Phonepe();
        phonepe.changePin("vijay",1,0);
        phonepe.getCurentBalance("xyz",123);
        phonepe.transferMoney("xyz",123,"abc",456);
    }
}
