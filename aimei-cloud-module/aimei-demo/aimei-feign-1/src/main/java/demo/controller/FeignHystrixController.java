package demo.controller;

import com.github.pagehelper.PageInfo;
import demo.entity.Member;
import demo.feign.UserFeignHystrixClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RefreshScope
public class FeignHystrixController {


    @Value("${profile}")
    private String profile;

    @Autowired(required = false)
    private UserFeignHystrixClient userFeignHystrixClient;

    @GetMapping("feign/{id}")
    public Member findByIdFeign(@PathVariable Long id) {
        Member user = this.userFeignHystrixClient.findByIdFeign(id);
        return user;
    }

    @GetMapping("feign")
    public PageInfo<Member> findByIdFeign() {
        return userFeignHystrixClient.findListFeign();
    }

    @GetMapping("/hello")
    public String hello() {
        return this.profile;
    }
}
