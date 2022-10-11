package Tasks.PersonStudent;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Student extends Person{

    private String studyType;
    private Integer yearStudy;
    private Double price;

    @Override
    public String toString() {
        return String.format("Studies: "+this.studyType
                +", Year: "+this.yearStudy
                +", Price: "+this.price+".");
    }
}
