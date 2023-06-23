package com.youzi.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author youzi-mall
 * @since 2023-05-11
 */
@TableName("tb_guanggao_type")
@ApiModel(value="GuanggaoType对象", description="")
public class GuanggaoType implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "广告类型")
    private String type;

    @ApiModelProperty(value = "是否删除：1删除 0未删除")
    private String del;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getDel() {
        return del;
    }

    public void setDel(String del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "GuanggaoType{" +
            "id=" + id +
            ", type=" + type +
            ", del=" + del +
        "}";
    }
}
