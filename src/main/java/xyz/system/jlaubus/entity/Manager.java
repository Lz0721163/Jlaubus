package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Manager {
    private String name;
    private String password;
    private int state;
    private String mid;
    private String telephone;
    private int role;
    private int id;
}

