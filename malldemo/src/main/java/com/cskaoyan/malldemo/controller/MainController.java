package com.cskaoyan.malldemo.controller;

import com.cskaoyan.malldemo.bean.Admin;
import com.cskaoyan.malldemo.service.AdminService;
import com.cskaoyan.malldemo.vo.Vo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.*;

/**
 * Created by cute coder
 * 2019/5/22 17:12
 */
@Controller
public class MainController {
  @Autowired
  AdminService adminService;

  @RequestMapping("/auth/login")
  @ResponseBody
  public Map login (@RequestBody Map<String,String> map,HttpServletRequest req){
    String username = map.get("username");
    String password = map.get("password");
    String requestURI = req.getRequestURI();
    HashMap<String, Object> vo = new HashMap<>();
    Admin admin=adminService.selectAdminByName(username);
    if (admin==null) {
      vo.put("errno",605);
      vo.put("errmsg","用户帐号或密码不正确");
    }
    if (requestURI.contains("/auth")) {
      String token="3c930073-fc38-48c2-be30-92c4ce917a6a";
      HttpSession session = req.getSession();
      session.setAttribute("token",token);
      session.setAttribute("admin",admin);
      vo.put("data","3c930073-fc38-48c2-be30-92c4ce917a6a");
      vo.put("errno",0);
      vo.put("errmsg","成功");
    }
    return vo;
  }
  @RequestMapping("/auth/info")
  @ResponseBody
  public Map info (String token,HttpServletRequest req){
    String requestURI = req.getRequestURI();
    Admin admin = (Admin) req.getSession().getAttribute("admin");
    HashMap<String, Object> vo = new HashMap<>();
    HashMap<String, Object> data = new HashMap<>();
    List<String> roles=new LinkedList<>();
    List<String> perms=new LinkedList<>();
    roles.add("超级管理员");
    perms.add("*");
    data.put("roles",roles);
    data.put("name","admin123");
    data.put("perms",perms);
    data.put("avatar","https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
    vo.put("data",data);
    vo.put("errno",0);
    vo.put("errmsg","成功");
    return vo;
  }

  @RequestMapping("dashboard")
  @ResponseBody
  public Map dashboard(){
    //{"errno":0,"data":{"goodsTotal":238,"userTotal":0,"productTotal":243,"orderTotal":0},"errmsg":"成功"}
    return new HashMap();
  }
}
