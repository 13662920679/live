package cn.huang.live.utils;

import java.util.UUID;

/**
 * ID 工具类
 */
public class IdUtil {
    /**
     * ID 生成32位的UUID
     * @return
     */
    public static String createId(){
        return UUID.randomUUID().toString().replaceAll("-","");
    }
}
