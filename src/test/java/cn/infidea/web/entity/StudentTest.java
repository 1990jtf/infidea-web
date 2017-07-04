package cn.infidea.web.entity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/7/1.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-entity.xml"})
public class StudentTest {
    @Autowired
    private Student student;
    @Autowired
    private Student student2;
    @Test
    public void testStudent(){
        System.out.println(student.toString());
        System.out.println(student2.toString());
        System.out.println(student.getAge());
        System.out.println(student2.getAge());
    }

}