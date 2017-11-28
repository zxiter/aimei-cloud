package com.union.aimei.provider.user.controller;

import com.github.pagehelper.PageInfo;
import com.union.aimei.provider.user.model.Member;
import com.union.aimei.provider.user.service.UserDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @Autowired
  private DiscoveryClient discoveryClient;

  @Autowired
  UserDemoService userDemoService;

  @GetMapping("/{id}")
  public Member findById(@PathVariable Long id) {
    Member findOne = this.userDemoService.findOne(id);
    return findOne;
  }

  @GetMapping("/")
  public PageInfo<Member> findList() {
      PageInfo<Member> list = userDemoService.findList();
      return list;
  }

  @GetMapping("/instance-info")
  public ServiceInstance showInfo() {
    ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
    return localServiceInstance;
  }
}
