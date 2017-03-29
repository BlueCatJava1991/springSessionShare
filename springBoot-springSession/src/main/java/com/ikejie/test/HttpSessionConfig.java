package com.ikejie.test;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
/**
 * 关联redis 和session关联
* @ClassName: HttpSessionConfig 
* @Description: TODO 
* @author 341458 陈文杰
* @date 2017-3-28 下午6:03:38 
*
 */
@Configuration  
@EnableRedisHttpSession(maxInactiveIntervalInSeconds=300) 
public class HttpSessionConfig {
	  @Bean
      public JedisConnectionFactory connectionFactory() {
              return new JedisConnectionFactory();
      }
}
