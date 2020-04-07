interface ATM {
    public boolean abortTransaction(ATM c);
    public void proceed(ATM c);
    public void payAmount(ATM c);
    public boolean invalidPIN(ATM c);
}
