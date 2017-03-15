package com.seckill.dao;

import com.seckill.entity.SuccessKilled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * Created by liheng on 2017/3/15.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class SuccessKilledDaoTest {
    @Resource
    private SuccessKilledDao successKilledDao;

    @Test
    public void insertSuccessKilled() throws Exception {
        long id = 1004L;
        long phone = 13622223333L;
        int insertCount = successKilledDao.insertSuccessKilled(id,phone);
        System.out.println("insertCount:"+insertCount);
    }

    @Test
    public void queryByIdWithSeckill() throws Exception {

        long id = 1004L;
        long phone = 13622223333L;
        SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(id, phone);
        System.out.println("----->"+successKilled);
        System.out.println("----->"+successKilled.getSeckill());
    }

}