package Tasks.Stream;

import Tasks.BankSolved.Account;
import Tasks.BankSolved.Customer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        List<String> emratEKlases = new ArrayList<>();
        emratEKlases.add("Anxhelo");
        emratEKlases.add("Marcelo");
        emratEKlases.add("Alberto");
        emratEKlases.add("Qemal");
        emratEKlases.add("Shkelzen");

        List<String> emratEFiltruar = emratEKlases.stream().filter(emri -> emri.contains("el")).collect(Collectors.toList());

//        System.out.println(emratEFiltruar);
//        System.out.println(emratEKlases);

//        Same as above function, just more explained :)
//        List<String> emratEFiltruarGjate = new ArrayList<>();
//        for (String emri:
//             emratEKlases) {
//            if (emri.contains("el")){
//                emratEFiltruarGjate.add(emri);
//            }
//        }
//        System.out.println(emratEFiltruarGjate);

        List<Integer> numratPrim = new ArrayList<>();
        numratPrim.add(1);
        numratPrim.add(3);
        numratPrim.add(5);
        numratPrim.add(7);
        numratPrim.add(11);
        List<Integer> nrChosen = numratPrim.stream().filter(n -> n>5).collect(Collectors.toList());
//        System.out.println(numratPrim);
//        System.out.println(nrChosen);

        List<Customer> myCustomers = new ArrayList<>();
        Customer customerOne = new Customer();
        customerOne.setCustomerId(1);
        customerOne.setAccounts(2);
        customerOne.setName("Ali");
        customerOne.setSurname("Hamzai");
        myCustomers.add(customerOne);

        Customer customerTwo = new Customer(1, "Gjergj", "Elez Ali", 4);
        myCustomers.add(customerTwo);

        Set<Customer> filteredSet = myCustomers.stream().filter(customer -> customer.getAccounts()>2).collect(Collectors.toSet());
//        System.out.println(myCustomers);
//        System.out.println(filteredSet);

        List<Integer> moshat = new ArrayList<>();
        moshat.add(24);
        moshat.add(34);
        moshat.add(98);
        moshat.add(10);

        List<Integer> chosenAge = moshat.stream().map(i -> i-10).collect(Collectors.toList());
//        System.out.println(moshat);
//        System.out.println(chosenAge);

        List<Customer> theirCustomers = new ArrayList<>();
        Customer customer1 = new Customer(2, "Erjon", "Cani", 5);
        Customer customer2 = new Customer(4, "Florenc", "Tulla", 2);
        Customer customer3 = new Customer(1, "Gjergj", "Elez Ali", 3);
        theirCustomers.add(customer1);
        theirCustomers.add(customer2);
        theirCustomers.add(customer3);

        List<Customer> filtered = theirCustomers.stream().map(i -> {
            i.setAccounts(i.getAccounts()+1);
            return i;
        }).collect(Collectors.toList());
//        System.out.println(theirCustomers);
//        System.out.println(filtered);

        List<Integer> integerList = new ArrayList<>();
        integerList.add(24);
        integerList.add(34);
        integerList.add(98);
        integerList.add(10);

        List<Integer> newList =  integerList.stream().sorted().collect(Collectors.toList());
//        System.out.println(integerList);
//        System.out.println(newList);

        List<Account> Accounts = new ArrayList<>();
        Set<Customer> customers = new HashSet<>();
        Account Account1 = new Account(1, 200.0, Set.of(new Customer()));
        Account Account2 = new Account(2, 300.0, customers);
        Account Account3 = new Account(4, 800.0, customers);
        Accounts.add(Account1);
        Accounts.add(Account2);
        Accounts.add(Account3);
        System.out.println(Accounts);

        List<Account> newAccBalance = Accounts.stream().map(account -> {
            account.setBalance(account.getBalance()+1000);
            return account;
        }).collect(Collectors.toList());
        System.out.println(newAccBalance);

    }
}
