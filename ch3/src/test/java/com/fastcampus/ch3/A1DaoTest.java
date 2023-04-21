package com.fastcampus.ch3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.interceptor.DefaultTransactionAttribute;

import javax.sql.DataSource;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class A1DaoTest {
    @Autowired
    A1Dao a1Dao;

    @Autowired
    DataSource ds;

    @Test
    public void insertTest() throws Exception {
        // 둘다 성공했을때만 db upate 되려면?

        PlatformTransactionManager tm = new DataSourceTransactionManager(ds);
        TransactionStatus status = tm.getTransaction(new DefaultTransactionAttribute());
        try {
            a1Dao.deleteAll();
            a1Dao.insert(1, 100); // 성공
            a1Dao.insert(1, 200); // 실패
            tm.commit(status);
        } catch (Exception e) {
            e.printStackTrace();
            tm.rollback(status);
        } finally {
        }
    }
}