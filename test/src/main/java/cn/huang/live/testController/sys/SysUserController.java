package cn.huang.live.testController.sys;

import cn.huang.live.api.sys.ISysUserService;
import cn.huang.live.pojo.sys.SysUserEntity;
import cn.huang.live.utils.IdUtil;
import com.alibaba.fastjson.JSONObject;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Api(tags = "用户接口")
@RestController
@RequestMapping("/sys/user")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @ApiOperation("用户注册")
    @PostMapping("/reg")
    @ResponseBody
    public ResponseEntity reg(@RequestBody SysUserEntity entity){
        entity.setId(IdUtil.createId());
        entity.setCreateTime(new Date());
        entity.setCreateBy("system");
        entity.setEnableFlag("1");

        int reg = sysUserService.reg(entity);
        return reg==1?ResponseEntity.ok("注册成功"):new ResponseEntity<>("注册失败", HttpStatus.BAD_REQUEST);
    }


}
