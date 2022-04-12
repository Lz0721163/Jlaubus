package xyz.system.jlaubus.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class User {
    private String username;
    private String password;

    private String u_name;
    private String uid;

    private String classes;
    private String academy;
    private String email;
    private String speciality;
    private String phone;
    private int grade;
    private int role;
    private int state;
    private String activecode;
    private Date createtime;
    private Date updatetime;

    public User(String username, String password, String u_name) {
        this.username = username;
        this.password = password;
        this.u_name = u_name;
    }

    public User(String username, String password, String u_name, String uid, String email, String phone, int role, int state, String activecode, Date createtime, Date updatetime) {
        this.username = username;
        this.password = password;
        this.u_name = u_name;
        this.uid = uid;
        this.email = email;
        this.phone = phone;
        this.role = role;
        this.state = state;
        this.activecode = activecode;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    public User(String username, String password, String u_name, String uid, String classes, String academy, String email, String speciality, String phone, int grade, int role, int state, String activecode, Date createtime, Date updatetime) {
        this.username = username;
        this.password = password;
        this.u_name = u_name;
        this.uid = uid;
        this.classes = classes;
        this.academy = academy;
        this.email = email;
        this.speciality = speciality;
        this.phone = phone;
        this.grade = grade;
        this.role = role;
        this.state = state;
        this.activecode = activecode;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }
}
