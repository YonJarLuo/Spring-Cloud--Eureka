package com.jiayun.domain;

/**
 * Created by LuoYJ on 2018/3/27.
 */
public class Person {
    private String name;
    private Integer id;
    private Integer age;
    private String message;

    public void setMessage(String message){
        this.message = message;
    }
    public String getMessage(){
        return message;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
}
