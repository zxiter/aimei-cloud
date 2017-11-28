package demo.feign;

import com.github.pagehelper.PageInfo;
import demo.entity.Member;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用@FeignClient注解的fallback属性，指定fallback类
 * @author eacdy
 */
@FeignClient(name = "microservice-provider-user", fallback = UserFeignHystrixClient.HystrixClientFallback.class)
public interface UserFeignHystrixClient {
  @RequestMapping("/{id}")
  public Member findByIdFeign(@RequestParam("id") Long id);

  @RequestMapping()
  public PageInfo<Member> findListFeign();
  /**
   * 这边采取了和Spring Cloud官方文档相同的做法，将fallback类作为内部类放入Feign的接口中，当然也可以单独写一个fallback类。
   * @author eacdy
   */
  @Component
  static class HystrixClientFallback implements UserFeignHystrixClient {
    private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallback.class);

    /**
     * hystrix fallback方法
     * @param id id
     * @return 默认的用户
     */
    @Override
    public Member findByIdFeign(Long id) {
      HystrixClientFallback.LOGGER.info("异常发生，进入fallback方法，接收的参数：id = {}", id);
      Member user = new Member();
      user.setId(-1L);
      user.setNikename("default username");
      return user;
    }

      @Override
      public PageInfo<Member> findListFeign() {
          return null;
      }
  }
}
