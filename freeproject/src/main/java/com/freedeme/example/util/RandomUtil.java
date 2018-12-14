package com.heeexy.example.util;

import java.util.UUID;

/**
 * @author: liruijiang
 * @description: 生成随机码的工具类
 * @date: 2018/10/26 14:20
 */
public class RandomUtil {
    /**
     * 生成前缀+32位编码 用作id
     *
     * @return string
     */
    public static String genarateId(String prefix) {
        String uuid = prefix + UUID.randomUUID().toString().trim().replaceAll("-", "");
        return uuid;
    }
}
