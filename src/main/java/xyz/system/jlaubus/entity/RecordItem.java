package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.annotation.ApplicationScope;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecordItem {
    private int id;
    private Manager mng;
    private User user;
    private Bus bus;
    private int bid;
    private String departure;
    private String destination;
    private int orderSeats;
    private int loops;
    private Date create_time;
    private Date finish_time;
    private int overtime;
    private int state;

}
