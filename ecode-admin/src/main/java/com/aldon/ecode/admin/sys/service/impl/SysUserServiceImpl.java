package com.aldon.ecode.admin.sys.service.impl;

import com.aldon.ecode.admin.sys.entity.SysUserDO;
import com.aldon.ecode.admin.sys.service.SysUserService;
import com.aldon.ecode.common.page.PageResult;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 系统用户
 * @author aldon
 */

@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Override
    public PageResult queryPage(Map<String, Object> params) {
        return null;
    }

    @Override
    public List<String> queryAllPerms(Long userId) {
        return null;
    }

    @Override
    public List<Long> queryAllMenuId(Long userId) {
        return null;
    }

    @Override
    public SysUserDO queryByUserName(String username) {
        return null;
    }

    @Override
    public void saveUser(SysUserDO user) {

    }

    @Override
    public void update(SysUserDO user) {

    }

    @Override
    public void deleteBatch(Long[] userIds) {

    }

    @Override
    public boolean updatePassword(Long userId, String password, String newPassword) {
        return false;
    }
}
