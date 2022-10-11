package Tasks.Guitar;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Guitar {

    private GuitarType type;
    private Integer stringNr;
    private String owner;
    private Integer akorda;

    @Override
    public String toString() {
        return "Guitar{" +
                "type='" + type + '\'' +
                ", stringNr=" + stringNr +
                ", owner='" + owner + '\'' +
                ", akorda=" + akorda +
                '}';
    }
}
