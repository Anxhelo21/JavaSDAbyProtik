package Appish;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Author {
    public static String authorDetails(){
        String details = "The Authors details are: ";
        return details;
    }

    private String surname;
    private String nationality;
}
