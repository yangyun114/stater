package com.yang.starter.config;

import com.yang.starter.util.SendUtil;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(value = UtilAutoConfiguration.class)
public class UtilAutoConfiguration {

    /**
     * 生成SendUtil bean，在spring.factories中引入UtilAutoConfiguration进行注入。
     * 其实直接用@Component效果是一样的。
     * @return
     */
    @Bean
    public SendUtil sender() {
        return new SendUtil();
    }
}
