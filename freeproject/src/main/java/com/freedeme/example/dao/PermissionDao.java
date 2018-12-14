package com.heeexy.example.dao;

import com.alibaba.fastjson.JSONObject;

import java.util.Set;

/**
 * @author: liruijiang
 * @date: 2018/10/30 13:28
 */
public interface PermissionDao {
    /**
     * 查询用户的角色 菜单 权限
     *
     * @param username
     * @return
     */
    JSONObject getUserPermission(String username);

    /**
     * 查询所有的菜单
     *
     * @return
     */
    Set<String> getAllMenu();

    /**
     * 查询所有的权限
     *
     * @return
     */
    Set<String> getAllPermission();
}
