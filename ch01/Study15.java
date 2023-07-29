// package ch01;
class 계좌 {
    private String accountNumber; // 계좌 번호
    private String owner; // 주인
    private String password;
    private long money;
    public 계좌(String accountNumber, String owner, String password, long money) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.password = password;
        this.money = money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getPassword() {
        return password;
    }
    public String getOwner() {
        return owner;
    }

    public long getMoney(String password) {
        if(this.password.equals(password)){
            return money;
        } else {
            throw new RuntimeException();
        }
    }

    public void addMoney(long money){
        this.money = this.money + money;
    }

    public void minusMoney(long money, String password) {
        if(this.password.equals(password)) {
            this.money = this.money - money;
        } else {
            throw new RuntimeException();
        }
    }
}



public class Study15 {
    public static void main(String[] args) {
        계좌 account = new 계좌("asdf", "홍길동", "123", 10000);

        System.out.println(account.getMoney("123"));
        

    }
}
