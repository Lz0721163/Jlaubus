package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Driver {
    private int id;
    private int sex;
    private int age;
    private int state;
    private String name;
    private String phone;
    private String password;
    private String email;
}
