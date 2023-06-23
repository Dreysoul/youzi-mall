package com.youzi.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageVo {
    @TableField(exist = false)
    private Long page= 1L;//当前页码
    @TableField(exist = false)
    private Long limit= 5L;//每页数量
}
