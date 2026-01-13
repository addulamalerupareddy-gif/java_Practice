class Account {
    private int balance;

    public void setBalance(int b) {
        if (b > 0) {
            balance = b;
        }
    }

    public int getBalance() {
        return balance;
    }
}
