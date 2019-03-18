package com.springboot.mybatis.controller;

import com.springboot.mybatis.entity.SysUser;
import com.springboot.mybatis.service.SysUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping(value = "/api")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    public List<SysUser> sectAll(){
        return sysUserService.selectAll();
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public SysUser getOne(@PathVariable("id") long id){
        return sysUserService.getOne(id);
    }

    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    public  void delete(@PathVariable("id") long id){
        sysUserService.delete(id);
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public SysUser addCourse(@RequestBody SysUser sysUser){


        return sysUserService.insert(sysUser);

    }

   @RequestMapping(value = "/user",method = RequestMethod.PUT)
    public void updateSysUser(@RequestBody SysUser sysUser){

        sysUserService.update(sysUser);
   }
}
