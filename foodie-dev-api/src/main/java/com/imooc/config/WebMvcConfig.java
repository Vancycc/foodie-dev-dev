package com.imooc.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author: xuzhi
 * @date: 2021/7/8 9:16
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {


//    /**
//     * Add handlers to serve static resources such as images, js, and, css
//     * files from specific locations under web application root, the classpath,
//     * and others.
//     * 实现静态资源映射
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/META-INF/resources/")  //映射swagger2
//                .addResourceLocations("file:E:\\workspace\\images\\");  //映射本地静态资源
//    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
