package com.aldon.ecode.admin.sys.controller;

import cn.hutool.db.Page;
import com.aldon.ecode.admin.sys.entity.SysRoleDO;
import com.aldon.ecode.admin.sys.service.SysRoleService;
import com.aldon.ecode.common.base.BaseController;
import com.aldon.ecode.common.base.BaseResult;
import com.aldon.ecode.common.base.BaseService;
import com.aldon.ecode.common.page.PageDomain;
import com.aldon.ecode.common.page.PageResult;
import com.baomidou.mybatisplus.core.toolkit.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Member;

/**
 * 角色管理
 * @author aldon
 */
@RestController
@RequestMapping("/sys/role")
public class SysRoleController extends BaseController {
    @Autowired
    private SysRoleService sysRoleService;

    /**
     * 系统角色分页查询
     * @param page        当前页码,默认第1页
     * @param rows        显示行数,默认10条
     * @param orderColumn 排序排序字段,默认不排序
     * @param isAsc       排序方式,desc或者asc
     * @param sysRoleDO   系统角色, 查询字段选择性传入, 默认为等值查询
     * @return 系统角色分页数据
     */
    @GetMapping("/list")
    public BaseResult<PageResult<SysRoleDO>> list(
            @RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows,
            @RequestParam(value = "orderColumn", defaultValue = "") String orderColumn,
            @RequestParam(value = "isAsc", defaultValue = "") String isAsc,
            SysRoleDO sysRoleDO
    ) {
        return super.list(page, rows, orderColumn, isAsc, sysRoleDO, sysRoleService);
    }



}
