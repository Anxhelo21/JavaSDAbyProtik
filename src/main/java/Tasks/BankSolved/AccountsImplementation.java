package Tasks.BankSolved;

import javax.security.auth.login.AccountNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class AccountsImplementation implements AccountInterface {

    private final List<Account> accountList = new ArrayList<>();
    private final List<Customer> customerList = new ArrayList<>();

    public void addNewCustomer(Customer newCustomer) {
        customerList.add(newCustomer);
    }

    public void addNewAccount(Account newAccount) {
        accountList.add(newAccount);
    }

    @Override
    public void saveMoney(Integer amountToAdd, Integer customerId, Integer idNumber) throws AccountNotFoundException {
        boolean accountFound = false;
        for (Account myAccount : accountList) {
            if (myAccount.getAccId().equals(idNumber)) {
                for (Customer thisAccountCustomer :
                        myAccount.getCustomers()) {
                    if (customerId.equals(thisAccountCustomer.getCustomerId())) {
                        myAccount.setBalance(myAccount.getBalance() + amountToAdd);
                        System.out.println("Your new balance is " + myAccount.getBalance());
                        accountFound = true;
                        break;
                    }
                }
            }
        }
        if (!accountFound)
            throw new AccountNotFoundException("Try again");

    }


    public void withdrawMoney(Integer amountToRemove, Integer customerId, Integer idNumber) throws AccountNotFoundException {
        boolean accountFound = false;
        for (Account myAccount : accountList) {
            if (myAccount.getAccId().equals(idNumber)) {
                for (Customer thisAccountCustomer :
                        myAccount.getCustomers()) {
                    if (customerId.equals(thisAccountCustomer.getCustomerId())) {
                        myAccount.setBalance(myAccount.getBalance() - amountToRemove);
                        System.out.println("Your new balance is " + myAccount.getBalance());
                        accountFound = true;
                        break;
                    }
                }
            }
        }
        if (!accountFound)
            throw new AccountNotFoundException("Try again");

    }

    public void closesAccount(Integer idNumber, Integer customerId) throws AccountNotFoundException {
        boolean accountFound2 = false;
        for (Account a : accountList) {
            if (a.getAccId() == idNumber) {
                for (Customer b : a.getCustomers()) {
                    if (b.getCustomerId() == customerId) {
                        accountList.remove(a);
                        System.out.println("We are sorry to announce that user " + b.getName()
                                + " " + b.getSurname() + " closed the account!");
                        accountFound2 = true;
                        break;
                    }
                }
            }
        }
        if (!accountFound2)
            throw new AccountNotFoundException("Try again");
    }

    public void updateAccountManager(Integer idNumber, Integer customerId, String name, String surname) {
        for (Account a : accountList) {
            if (a.getAccId().equals(idNumber)) {
                for (Customer b : a.getCustomers()) {
                    if (b.getCustomerId().equals(customerId)) {
                        Customer customerAdded = new Customer(customerList.get(customerList.size() - 1).getCustomerId() + 1, name, surname, 1);
                        a.getCustomers().add(customerAdded);
                        System.out.println("You added " + customerAdded.getName()
                                + " " + customerAdded.getSurname() + " to your account");
                        break;
                    }
                }
            }
        }
    }
}
