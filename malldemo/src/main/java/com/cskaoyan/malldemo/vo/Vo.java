package com.cskaoyan.malldemo.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cute coder
 * 2019/5/22 17:13
 */
public class Vo {
  String errno;
  Map<String, Object> data = new HashMap<>();
  String errmsg;

  public Vo() {
  }

  public Vo(String errno, Map<String, Object> data, String errmsg) {
    this.errno = errno;
    this.data = data;
    this.errmsg = errmsg;
  }

  public String getErrno() {
    return errno;
  }

  public void setErrno(String errno) {
    this.errno = errno;
  }

  public Map<String, Object> getData() {
    return data;
  }

  public void setData(Map<String, Object> data) {
    this.data = data;
  }

  public String getErrmsg() {
    return errmsg;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }
}