package cn.huang.live.testController.sys;

import cn.huang.live.api.sys.ISysUserService;
import cn.huang.live.pojo.sys.SysUserEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "用户接口")
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation("用户注册")
    @PostMapping("/reg")
    public String reg(@RequestBody SysUserEntity entity){
        return "reg";
    }

}
