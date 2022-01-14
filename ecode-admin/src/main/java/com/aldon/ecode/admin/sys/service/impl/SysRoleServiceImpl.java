package com.aldon.ecode.admin.sys.service.impl;

import com.aldon.ecode.admin.sys.entity.SysRoleDO;
import com.aldon.ecode.admin.sys.mapper.SysRoleMapper;
import com.aldon.ecode.admin.sys.service.SysRoleService;
import com.aldon.ecode.common.base.BaseServiceImpl;
import com.aldon.ecode.common.page.PageDomain;
import com.aldon.ecode.common.page.PageResult;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 系统角色
 * @author aldon
 */
@Slf4j
@Service
public class SysRoleServiceImpl extends BaseServiceImpl<SysRoleMapper, SysRoleDO> implements SysRoleService {


}
