package models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
public class Worker {

    private Long id ;
    private String firstName;
    private String lastName;
    private int age;
    private String  logName;
    private String password;
}
