package com.surpass.dream.swagger.autoconfig;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @program:lunar
 * @description:swagger属性类
 * @author:ljw
 * @create:2019-02-26 21:01
 */
@ConfigurationProperties("swagger")
public class SwaggerProperties {
    private String title = "Swagger Restful API";
    private String description = "This is a swagger api desc";
    private String version = "1.0.0";
    private String termsOfService = "";
    private String contactName = "";
    private String contactUrl = "";
    private String contactEmail = "";
    private String licenseName = "";
    private String licenseUrl = "";
    private String groupName;
    private String basePackage;

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public String getContactName() {
        return contactName;
    }

    public String getContactUrl() {
        return contactUrl;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getLicenseName() {
        return licenseName;
    }

    public String getLicenseUrl() {
        return licenseUrl;
    }

    public String getVersion() {
        return version;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactUrl(String contactUrl) {
        this.contactUrl = contactUrl;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setLicenseName(String licenseName) {
        this.licenseName = licenseName;
    }

    public void setLicenseUrl(String licenseUrl) {
        this.licenseUrl = licenseUrl;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
