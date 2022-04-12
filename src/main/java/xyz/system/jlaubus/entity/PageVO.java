package xyz.system.jlaubus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageVO {
    private int curentPageNo = 1;
    private int totalCount;
    private int pageSize=5;
    private int upPageNo;
    private int nextPageNo;
    private int toPageNo = 0;
}
