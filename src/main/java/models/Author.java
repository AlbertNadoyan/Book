package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Author {
    private String  authorName;
    private String nationality;
    private Gender gender;
    private String email;
    private String birthDay;
    private String placeOfBirth;
    private String dateOfDeath;

}
