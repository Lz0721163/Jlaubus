package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Map {
    private int id;
    private double longitude;
    private double latitude;
    private String street;
    private String address;
    private Date time;
}
