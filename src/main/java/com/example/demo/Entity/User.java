package com.example.demo.Entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

/**
 * @author wwx
 * @date 2019/4/3 14:52
 **/
@Data
@TableName(value="users")
public class User {
    @TableId(value="id",type= IdType.AUTO)
    private int id;
    private String username;
    private String password;
    private String realname;
    private int departmentId;
    private int PositionId;
    private String isDel;
    private Timestamp lastLoginTime;
    private Timestamp createTime;
    private Timestamp updateTime;
}
