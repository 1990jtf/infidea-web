package cn.infidea.web.entity;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 *
 * Created by Administrator on 2017/7/1.
 */
@Component
public class Student {
    private String name;
    private int age;
    private int sex;
    private Date brithday;

/*    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", brithday=" + brithday +
                '}';
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }
}
