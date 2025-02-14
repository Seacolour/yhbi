package com.hang.yhbi.config;

import com.zhipu.oapi.ClientV4;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * AI配置
 */

@Configuration
@ConfigurationProperties(prefix = "ai")
@Data
public class AIConfig {

    private String apiKey;


    @Bean
    public ClientV4 getClientV4() {
        return new ClientV4.Builder(apiKey)
                .networkConfig(30,60,60,60, TimeUnit.SECONDS)
                .build();
    }
}
