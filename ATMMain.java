public class ATMMain {
    public static void main(String args[]) {
        ATMMain atm = new ATMMain();
        atm.getNewATM();
    }

    public ATM getNewATM(){
        return new ATMContext();
    }
}
