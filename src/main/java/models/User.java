package models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {
    private String name;
    private String surname;
    private int years;
    private String username;
    private String password;
    private UserType userType;
}
