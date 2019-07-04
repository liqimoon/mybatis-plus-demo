package com.liqimoon.mybatisplusdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.liqimoon.mybatisplusdemo.model.database.SysUser;
import org.apache.ibatis.annotations.Param;

/**
 * @author liqimoon
 * @version 1.0
 * @date 2019/6/4 15:22
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    /**
     * 根据username查询系统配置信息
     * @param username
     * @return
     */
    SysUser getByUsername(@Param("username") String username);
}
