package lecture04;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ATM {
    private List<Account>  AccountList = new List<Account>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Account> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Account account) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Account> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Account> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public Account get(int index) {
            return null;
        }

        @Override
        public Account set(int index, Account element) {
            return null;
        }

        @Override
        public void add(int index, Account element) {

        }

        @Override
        public Account remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Account> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Account> listIterator(int index) {
            return null;
        }

        @Override
        public List<Account> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

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
            if (number.equals(AccountList.get(i).getName())) {
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
        for(int i=0;i<AccountList.size();i++){
            if(existAccount(AccountList.get(i).getName(),AccountList.get(i).getNumber())){
                if(AccountList.get(i).getBalanse()<money){
                    System.out.println("現在の預金額は　"+AccountList.get(i).getBalanse()+"　円です　"+money+"　円の引き出しはできません");
                }
                else{
                    AccountList.get(i).setBalanse(AccountList.get(i).getBalanse()-money);
                    System.out.println(money+"　円引き出して現在の預金額は "+AccountList.get(i).getBalanse()+"　円です");
                }
                return;

            }
        }
        System.out.println(number+"　というアカウントは存在しません");
    }
}

