package cn.infidea.web.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 *
 * Created by Administrator on 2017/7/2.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ISuccessKilledDaoTest {
    private final Logger logger= LoggerFactory.getLogger(this.getClass());

    @Resource
    private ISuccessKilledDao iSuccessKilledDao;

    @Test
    public void insertSucessKill() throws Exception {
        Long id=1000L;
        Long phone=18697318866L;
        int s=iSuccessKilledDao.insertSuccessKill(id,phone);
        logger.info(s+"");

    }

    @Test
    public void queryByIdWithSecKill() throws Exception {
    }

}