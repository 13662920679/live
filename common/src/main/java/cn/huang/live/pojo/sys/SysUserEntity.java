package cn.huang.live.pojo.sys;

import cn.huang.live.pojo.BaseEntity;
import lombok.Data;

@Data
public class SysUserEntity extends BaseEntity {

    private String username;

    private String password;

    private String role;

}