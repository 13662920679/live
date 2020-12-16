package cn.huang.live.testController.sys;

import cn.huang.live.api.sys.ISysUserService;
import cn.huang.live.pojo.sys.SysUserEntity;
import cn.huang.live.utils.IdUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Api(tags = "用户接口")
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation("用户注册")
    @PostMapping("/reg")
    public ResponseEntity reg(@RequestBody SysUserEntity entity){
        entity.setId(IdUtil.createId());
        entity.setCreateTime(new Date());
        int reg = sysUserService.reg(entity);
        return reg==1?ResponseEntity.ok("注册成功"):null;
    }


}
