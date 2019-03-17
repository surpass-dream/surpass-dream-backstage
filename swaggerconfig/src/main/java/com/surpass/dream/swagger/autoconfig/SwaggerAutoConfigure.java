package com.surpass.dream.swagger.autoconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.ApiSelectorBuilder;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @program:lunar
 * @description:swagger自动配置类
 * @author:ljw
 * @create:2019-02-26 21:00
 */
@Configuration
@EnableSwagger2
@ConditionalOnClass({Controller.class})
@ConditionalOnMissingBean({Docket.class})
@EnableConfigurationProperties({SwaggerProperties.class})
public class SwaggerAutoConfigure {
    @Autowired
    SwaggerProperties properties;
    @Bean
    public Docket autoEnableSwagger() {
        String basePackage = properties.getBasePackage();
        String groupName = properties.getGroupName();
        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo());

        //判断是否存在groupname
        if(null != groupName && !groupName.trim().equals("")){
            docket = docket.groupName(groupName);
        }

        ApiSelectorBuilder builder = docket.select();

        //判断是否存在基础扫描包
        if(null == basePackage || basePackage.trim().equals("")){
            return builder.build();
        }else{
            return builder.apis(RequestHandlerSelectors.basePackage(basePackage))
                    .build();
        }

    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact(this.properties.getContactName(), this.properties.getContactUrl(), this.properties.getContactEmail());

        return new ApiInfoBuilder()
                .title(this.properties.getTitle())
                .description(this.properties.getDescription())
                .termsOfServiceUrl(properties.getTermsOfService())
                .license(properties.getLicenseName())
                .licenseUrl(properties.getLicenseUrl())
                .contact(contact)
                .version(this.properties.getVersion())
                .build();
    }
}
