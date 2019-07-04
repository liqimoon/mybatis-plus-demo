package com.liqimoon.mybatisplusdemo.model.database;

import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * @author liqimoon
 * @version 1.0
 * @date 2019/6/4 15:27
 */
@Data
@TableName("tsys_user")
public class SysUser {

    /**
     *用户id
     */
    private Long id;

    /**
     *用户名
     */
    private String username;

    /**
     *密码
     */
    private String password;

    /**
     *状态
     */
    private String state;

    /**
     *创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date createTime;

    /**
     *用户描述,UI界面显示使用
     */
    private String description;
}
