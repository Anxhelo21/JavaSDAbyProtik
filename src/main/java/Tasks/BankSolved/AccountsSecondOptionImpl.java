package Tasks.BankSolved;

import java.util.List;

public class AccountsSecondOptionImpl {

    public void saveMoney(Customer customer, List<Account> accounts, Integer accId, Integer amount) {
        for (Account account:
             accounts) {
            if(account.getAccId() == accId) {
                Double balance = account.getBalance(); //?
                balance += amount;
                accounts.get(accId).setBalance(balance);
            }
        }

        if (accounts.contains(accId)){ //?
            Double balance = accounts.get(accId).getBalance(); //?
            balance += amount;
            accounts.get(accId).setBalance(balance);
        }
    }


}
