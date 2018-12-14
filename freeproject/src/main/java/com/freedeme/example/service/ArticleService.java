package com.heeexy.example.service;

import com.alibaba.fastjson.JSONObject;

/**
 * @author: liruijiang
 * @date: 2018/10/24 16:06
 */
public interface ArticleService {
    /**
     * 新增文章
     *
     * @param jsonObject
     * @return
     */
    JSONObject addArticle(JSONObject jsonObject);

    /**
     * 文章列表
     *
     * @param jsonObject
     * @return
     */
    JSONObject listArticle(JSONObject jsonObject);

    /**
     * 更新文章
     *
     * @param jsonObject
     * @return
     */
    JSONObject updateArticle(JSONObject jsonObject);
}
