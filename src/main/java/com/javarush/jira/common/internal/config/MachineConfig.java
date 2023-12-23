package com.javarush.jira.common.internal.config;


import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;


@Component
public class MachineConfig {

    @Value("${jr.db.login}")
    private String dataBaseLogin;

    @Value("${jr.db.password}")
    private String dataBasePassword;

    @Value("${jr.oauth.google.client.id}")
    private String googleClientId;

    @Value("${jr.oauth.google.client.secret}")
    private String googleClientSecret;

    @Value("${jr.oauth.github.client.id}")
    private String gitHubClientId;

    @Value("${jr.oauth.github.client.secret}")
    private String gitHubClientSecret;

    @Value("${jr.oauth.gitlab.client.id}")
    private String gitLabClientId;

    @Value("${jr.oauth.gitlab.client.secret}")
    private String gitLabClientSecret;

    @Value("${jr.mail.host}")
    private String mailHost;

    @Value("${jr.mail.user.name}")
    private String mailUserName;

    @Value("${jr.mail.pwd}")
    private String mailPassword;

    public String getDataBaseLogin() {
        return dataBaseLogin;
    }

    public String getDataBasePassword() {
        return dataBasePassword;
    }

    public String getGoogleClientId() {
        return googleClientId;
    }

    public String getGoogleClientSecret() {
        return googleClientSecret;
    }

    public String getGitHubClientId() {
        return gitHubClientId;
    }

    public String getGitHubClientSecret() {
        return gitHubClientSecret;
    }

    public String getGitLabClientId() {
        return gitLabClientId;
    }

    public String getGitLabClientSecret() {
        return gitLabClientSecret;
    }

    public String getMailHost() {
        return mailHost;
    }

    public String getMailUserName() {
        return mailUserName;
    }

    public String getMailPassword() {
        return mailPassword;
    }
}
