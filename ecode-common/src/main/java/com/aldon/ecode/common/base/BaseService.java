package com.aldon.ecode.common.base;

import com.aldon.ecode.common.page.PageDomain;
import com.aldon.ecode.common.page.PageResult;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * 对mybatisplus中ServiceImpl的方法增加整合
 * @author aldon
 */
public interface BaseService<T> extends IService<T> {

    /**
     * 分页查询
     * @param pageDomain 分页数据
     * @param sysRoleDO 分页对象
     * @return
     */
    PageResult<T> listPage(PageDomain pageDomain, T sysRoleDO);
}
