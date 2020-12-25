package cn.huang.live.api.sys;

import cn.huang.live.pojo.sys.SysUserEntity;
import org.springframework.stereotype.Service;

public interface ISysUserService {
    int reg(SysUserEntity entity);
}
