package com.wyy.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@ConfigurationProperties(prefix="wyy")
public class Wyyentiy {
    private String names;
    @JsonIgnore         //
    private String age;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss",locale = "zh",timezone="GMT+8")
    private Date birthday;

    public void setName(String name) {
        this.names = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getNames() {
        return names;
    }

    public Date getBirthday() {
        return new Date();
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
