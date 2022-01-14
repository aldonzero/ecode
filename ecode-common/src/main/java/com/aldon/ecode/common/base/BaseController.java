package com.aldon.ecode.common.base;

import com.aldon.ecode.common.page.PageDomain;
import com.aldon.ecode.common.page.PageResult;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Web层通用处理
 * @author aldon
 */
public class BaseController {


    /**
     * 通用处理——分页查询
     * @param page
     * @param rows
     * @param orderColumn
     * @param isAsc
     * @param t
     * @param baseService
     * @param <T>
     * @return
     */
    protected <T> BaseResult<PageResult<T>> list(Integer page, Integer rows,
                                                 String orderColumn, String isAsc, T t,
                                                 BaseService baseService) {
        PageDomain pageDomain = new PageDomain(page, rows, orderColumn, isAsc);
        PageResult<T> pageResult = baseService.listPage(pageDomain, t);

        System.out.println(pageResult.toString());
        if (ObjectUtils.isNotEmpty(pageResult.getItems())) {
            return BaseResult.ok(pageResult);
        }
        return BaseResult.fail(HttpStatus.NOT_FOUND, "查询结果为空");
    }

    /**
     * 获取实体对象数据并返回给前端
     *
     * @param entity 需要返回的数据实体对象
     * @return 传入对象不为null返回封装的实体数据
     */
    protected BaseResult<?> toResponseResult(Object entity) {
        if (ObjectUtils.isNotEmpty(entity)) {
            return BaseResult.ok("查询成功", entity);
        }
        return BaseResult.fail(404, "查询失败,查找信息为空.");
    }
}
