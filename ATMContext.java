import java.io.BufferedReader;

public class ATMContext implements ATM {
    ATMState state;
    String card;
    int pincodesentered;
    BufferedReader br;

    @Override
    public boolean abortTransaction(ATM c) {
        return false;
    }

    @Override
    public void proceed(ATM c) {

    }

    @Override
    public void payAmount(ATM c) {

    }

    @Override
    public boolean invalidPIN(ATM c) {
        return false;
    }
}
