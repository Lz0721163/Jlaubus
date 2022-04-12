package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RuntimeTable {
    private int id;
    private Date runtime;
    private Date update_time;
    private int runCircle;
    private String path;
    private int bid;
    private Bus bus;
    private String mid;

}
