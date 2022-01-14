package com.aldon.ecode.admin.sys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 后台服务
 * @author aldon
 */
//@EnableDiscoveryClient
//@SpringBootApplication(scanBasePackages = {"com.aldon.ecode"})
@MapperScan(value = {"com.aldon.ecode.**.mapper"})
@SpringBootApplication
public class EbuildAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(EbuildAdminApplication.class, args);
    }
}
