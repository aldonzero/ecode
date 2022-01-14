package com.aldon.ecode.common.base;


import com.aldon.ecode.common.page.PageDomain;
import com.aldon.ecode.common.page.PageResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * 对mybatisplus中ServiceImpl的方法增加整合
 * @author aldon
 */
public class BaseServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M,T> implements BaseService<T>{
    @Override
    public PageResult<T> listPage(PageDomain pageDomain, T t) {
        // 1. 构造mybatis-plus查询wrapper
        QueryWrapper<T> wrapper = new QueryWrapper<>(t);
        // 2. 创建一个分页对象
        PageResult<T> pageResult = new PageResult<>();
        // 3. 开始分页
        pageResult.startPage(pageDomain);
        // 4. 执行Dao|Mapper SQL查询
        List<T> resList = this.list(wrapper);
        // 5. 分装并返回数据
        return pageResult.getPage(resList);
    }
}
