package Tasks.BankSolved;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Set;

public class AccountMain {

    public static void main(String[] args) {
        AccountsImplementation accountsImplementation = new AccountsImplementation();

        Customer ali = new Customer();
        ali.setName("ali");
        ali.setSurname("kamza");
        ali.setAccounts(1);
        ali.setCustomerId(1);
        Customer lena = new Customer();
        lena.setName("lena");
        lena.setSurname("kamza");
        lena.setAccounts(1);
        lena.setCustomerId(2);
        accountsImplementation.addNewCustomer(ali);
        accountsImplementation.addNewCustomer(lena);

        Account accountAliLena = new Account();
        accountAliLena.setCustomers(Set.of(ali, lena));
        accountAliLena.setBalance(0.0);
        accountAliLena.setAccId(1);
        accountsImplementation.addNewAccount(accountAliLena);

        //ali adds money
        try {
            accountsImplementation.saveMoney(300, 1, 1);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(accountAliLena.getBalance()+" llogaria e aliut dhe lenes ka tashme kaq leke");

        //lena terheq leke
        try {
            accountsImplementation.withdrawMoney(20,2,1);
        } catch (AccountNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Pas terheqjes nga lena kemi: "+accountAliLena.getBalance());
    }
}
