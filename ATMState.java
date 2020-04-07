public class ATMState {
    String name;
    FSMAction initAction;
    FSMAction exitAction;

    public boolean dispatch(String eventName, ATM context) {
        return true;
    }

    public void addTransition(String eventName, FSMTransition transition) {

    }
}
