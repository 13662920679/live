package cn.huang.live.impl.sys;

import cn.huang.live.api.sys.ISysUserService;
import cn.huang.live.mapper.SysUserMapper;
import cn.huang.live.pojo.sys.SysUserEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class SysUserServiceImpl implements ISysUserService {
    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int reg(SysUserEntity entity) {
        return sysUserMapper.insertSelective(entity);
    }
}
