package com.example.demo.User.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.User.entity.Users;
import com.example.demo.User.mapper.UsersMapper;
import com.example.demo.User.service.IUsersService;

import org.springframework.stereotype.Service;


/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wwx
 * @since 2019-04-17
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {


}
