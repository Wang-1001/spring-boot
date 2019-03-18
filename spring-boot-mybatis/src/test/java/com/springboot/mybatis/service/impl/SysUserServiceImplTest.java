package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.SysUser;
import com.springboot.mybatis.service.SysUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class SysUserServiceImplTest {

    @Resource
    private SysUserService sysUserService;

    @Test
    public void selectAll() {
        List<SysUser> sysUserList = sysUserService.selectAll();
        sysUserList.forEach(sysUser -> System.out.println(sysUser));
    }

    @Test
    public void getOne() {
        SysUser sysUser = sysUserService.getOne(1L);
        System.out.println(sysUser);
    }

    @Test
    public void delete() {
        sysUserService.delete(1L);
    }

    @Test
    public void insert() {
        SysUser sysUser = new SysUser();
        sysUser.setUsername("王德旺");
        sysUser.setMoblie("12345678900");
        sysUser.setAvatar("2.jpg");
        sysUser.setPassword("222222");
        sysUserService.insert(sysUser);

    }

    @Test
    public void update() {
        SysUser sysUser = sysUserService.getOne(4L);
        sysUser.setAvatar("333333.jpg");
        sysUser.setPassword("123987654");
        sysUserService.update(sysUser);
    }
}