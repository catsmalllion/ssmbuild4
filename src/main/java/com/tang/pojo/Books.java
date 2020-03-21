package com.tang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author GodLike
 *
 *
 */
@Data//get set方法
@AllArgsConstructor
@NoArgsConstructor
public class Books {
    private int bookID;
    private int bookCounts;
    private String bookName;
    private String detail;
}
