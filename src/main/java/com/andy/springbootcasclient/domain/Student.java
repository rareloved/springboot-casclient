package com.andy.springbootcasclient.domain;

/**
 * User: andy
 * Date: 2019/7/31
 * Time: 15:04
 */
public class Student {
    //无意义主键
    private String id;
    //姓名
    private String name;
    //年龄
    private Integer age;
    //家庭住址
    private String homeAddress;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "id="+id+
                ",name="+name+
                ",age="+age+
                ",homeAddress="+homeAddress;
    }
}
