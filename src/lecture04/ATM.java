package lecture04;

import java.lang.reflect.Array;
import java.util.*;

public class ATM {
    private ArrayList<Account> AccountList = new ArrayList<>();


    void registerAccount(String name,String number){
        Account newAcount = new Account(name,number);
        AccountList.add(newAcount);
        System.out.println("アカウント名 "+name+" アカウント番号　"+number+" で登録");
    }

    private boolean existAccount(String name,String number){
        for(int i=0;i<AccountList.size();i++){
            if(name.equals(AccountList.get(i).getName()) && number.equals(AccountList.get(i).getNumber())) {
                return true;
            }
        }
        return false;
    }

    void deposit(String number,long money) {
        for (int i = 0; i < AccountList.size(); i++) {
            if (number.equals(AccountList.get(i).getNumber())) {
                if (existAccount(AccountList.get(i).getName(), AccountList.get(i).getNumber())) {
                    AccountList.get(i).setBalanse(AccountList.get(i).getBalanse() + money);
                    System.out.println("口座番号　" + number + "　は　" + money + " 円入金して残高　" + AccountList.get(i).getBalanse() + "　円");
                    return;
                }
            }
            }
            System.out.println(number + " という番号は存在しません");
        }
    void withdraw(String number,long money){
        for(int i=0;i<AccountList.size();i++) {
            if (number.equals(AccountList.get(i).getNumber())) {
                if (existAccount(AccountList.get(i).getName(), AccountList.get(i).getNumber())) {
                    if (AccountList.get(i).getBalanse() < money) {
                        System.out.println("現在の預金額は　" + AccountList.get(i).getBalanse() + "　円です　" + money + "　円の引き出しはできません");
                    } else {
                        AccountList.get(i).setBalanse(AccountList.get(i).getBalanse() - money);
                        System.out.println(money + "　円引き出して現在の預金額は " + AccountList.get(i).getBalanse() + "　円です");
                    }
                    return;

                }
            }
        }
        System.out.println(number+"　というアカウントは存在しません");
    }
}

