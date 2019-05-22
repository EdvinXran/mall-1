package com.cskaoyan.malldemo.vo;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by cute coder
 * 2019/5/22 17:13
 */
public class Vo {
  String errno;
  List data = new LinkedList();
  String errmsg;

  public String getErrno() {
    return errno;
  }

  public void setErrno(String errno) {
    this.errno = errno;
  }

  public List getData() {
    return data;
  }

  public void setData(List data) {
    this.data = data;
  }

  public String getErrmsg() {
    return errmsg;
  }

  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }
}
