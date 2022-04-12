package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private String editor;
    private int no;
    private Date state_time;
    private Date update_time;
    private String title;
    private String content;
    private String picture;
    private String audio;
    private String video;

}
