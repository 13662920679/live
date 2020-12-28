package cn.huang.live.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @ApiModelProperty("主键id")
    private String id;
    @ApiModelProperty("创建时间")
    private Date createTime;
    @ApiModelProperty("创建人id")
    private String createBy;
    @ApiModelProperty("更新时间")
    private Date updateTime;
    @ApiModelProperty("更新人id")
    private String updateBy;
    @ApiModelProperty("启用标识（'0'：未启用；'1'：已启用）")
    private String enableFlag;
}
