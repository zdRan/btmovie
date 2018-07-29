package com.zdran.btmovie.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by zdRan on 2018/7/28
 *
 * @author cm.zdran@gmail.com
 */
@SpringBootApplication
@ComponentScan({"com.zdran.btmovie.provider","com.zdran.btmovie.common"})
@MapperScan({"com.zdran.btmovie.provider.mapper"})
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
