package cn.huang.live.pojo.sys;

import cn.huang.live.pojo.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class SysUserEntity extends BaseEntity {

    private String username;

    private String password;

    private String role;

}