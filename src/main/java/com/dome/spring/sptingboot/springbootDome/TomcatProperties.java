package com.dome.spring.sptingboot.springbootDome;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "tommcat")
public class TomcatProperties {
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "host='" + host + '\'' +
                ", port='" + port + '\'' +
                '}';
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    private String host;
    private String port;
}
