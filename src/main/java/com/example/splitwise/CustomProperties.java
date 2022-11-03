package com.example.splitwise;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "custom")
public class CustomProperties {
    private String url;
    private Prop prop;
    @Getter
    @Setter
    public static class Prop {
        private String data;
        private String camelCaseData;
    }
}
