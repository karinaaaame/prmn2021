package lecture04;

public class Account {
    private String name;
    private String number;
    private long balanse;

    Account(String name, String number) {
        this.name = name;
        this.number = number;
        this.balanse=0;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public long getBalanse() {
        return balanse;
    }


    public void setBalanse(long balanse) {
        this.balanse = balanse;
    }
}