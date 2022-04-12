package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bus {
    private int bId;
    private String run_time;
    private double longitude;
    private double latitude;
    private String address;
    private String path;
    private int seats;

}
