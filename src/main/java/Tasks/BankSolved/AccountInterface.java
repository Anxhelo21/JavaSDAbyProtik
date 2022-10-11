package Tasks.BankSolved;

import javax.security.auth.login.AccountNotFoundException;

public interface AccountInterface {

    void saveMoney(Integer customerId, Integer accId, Integer addedAmount) throws AccountNotFoundException; // how it is in an actual project

}
