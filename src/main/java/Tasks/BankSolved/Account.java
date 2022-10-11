package Tasks.BankSolved;

import lombok.*;
import java.util.Set;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Account {

    private Integer accId;
    private Double balance;
    private Set<Customer> customers;

}
