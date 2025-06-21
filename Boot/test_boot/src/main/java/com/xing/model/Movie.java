package com.xing.model;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data
public class Movie {
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;
    @TableField("moviename")
    private String moviename;
    private int count;
    @TableLogic(value = "0",delval = "1")
    private int deletestate;
    @Version
    private Long version;
}
