package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class ActuatorConfig {
    @Value("${info.app.name}")
    private String appName;
    @Value("${info.app.version}")
    private String appVersion;
    @Value("${info.app.company.name}")
    private String appCompanyName;
    @Value("${info.app.company.email}")
    private String appCompanyEmail;
    @Value("${info.app.company.phone}")
    private String appCompanyPhone;

    public String getAppInfo() {
        return appName + appVersion + "\n" + appCompanyName + "\n" + appCompanyEmail + "\n" + appCompanyPhone;
    }
}
