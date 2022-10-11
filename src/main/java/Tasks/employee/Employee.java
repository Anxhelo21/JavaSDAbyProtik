package Tasks.employee;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee {
    private String emri;
    private String mbiemri;
    private Integer vitePune;
    private Date ditaEPunesimit;
}
