package min;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountModel {
    private String name;
    private int password;
    private int money;
    public AccountModel(){

    }
    public AccountModel(String name,int password){
        this.name=name;
        this.password=password;
        this.money=0;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPassword() {
        return password;
    }
    public void setPassword(int password) {
        this.password = password;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    
}
