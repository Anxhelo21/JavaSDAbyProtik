package Tasks.BankSolved;

import javafx.beans.binding.ObjectExpression;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    private Integer customerId;
    private String name;
    private String surname;
    private Integer accounts; //how many accounts does he have

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Customer)) return false;
        Customer myObject = (Customer) o;
        if (myObject.getCustomerId().equals(this.customerId)) return true;
        return false;
    }

}
