package com.juphoon.rcsrunner;


import com.juphoon.rcsrunner.entity.User;
import com.juphoon.rcsrunner.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RcsRunnerApplicationTests {

    @Autowired
    private IUserService userService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    @Qualifier(value = "redisTemplate")
	private RedisTemplate<String,Object> redisTemplate;
    @Test
    public void contextLoads() {
        User user = userService.findById(1);
        System.out.println(user.getAge());
    }

    @Test
    public void testRedis() {

    }
}
