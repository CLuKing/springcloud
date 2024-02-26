package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // 配置随机的选择策略
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRule();
    }
}
