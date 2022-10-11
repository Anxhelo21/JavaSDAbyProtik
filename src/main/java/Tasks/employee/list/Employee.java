package Tasks.employee.list;
import lombok.*;

import java.util.Date;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String emri;
    private String mbiemri;
    private Date marrjaNePune;
}
