package com.youzi.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author youzi-mall
 * @since 2023-05-11
 */
@TableName("tb_guanggao")
@ApiModel(value="Guanggao对象", description="")
public class Guanggao extends PageVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "主键")
    private Integer id;

    @ApiModelProperty(value = "广告标题")
    private String title;

    @ApiModelProperty(value = "广告类型")
    private Integer guanggaoId;

    @ApiModelProperty(value = "广告链接地址")
    private String link;

    @ApiModelProperty(value = "广告图片地址")
    private String url;

    @ApiModelProperty(value = "是否删除：1删除 0未删除")
    private Integer del;

    @TableField(exist = false)
    private GuanggaoType guanggaoType;

//    public Guanggao(Long page, Long limit,  String title) {
//        super(page, limit);
//        this.title = title;
//    }

    public GuanggaoType getGuanggaoType() {
        return guanggaoType;
    }

    public void setGuanggaoType(GuanggaoType guanggaoType) {
        this.guanggaoType = guanggaoType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getGuanggaoId() {
        return guanggaoId;
    }

    public void setGuanggaoId(Integer guanggaoId) {
        this.guanggaoId = guanggaoId;
    }
    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "Guanggao{" +
            "id=" + id +
            ", title=" + title +
            ", guanggaoId=" + guanggaoId +
            ", link=" + link +
            ", url=" + url +
            ", del=" + del +
        "}";
    }
}
