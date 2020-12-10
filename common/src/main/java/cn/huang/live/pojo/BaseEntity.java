package cn.huang.live.pojo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private String id;

    private Date createTime;

    private String createBy;

    private Date updateTime;

    private String updateBy;

    private String enableFlag;
}
