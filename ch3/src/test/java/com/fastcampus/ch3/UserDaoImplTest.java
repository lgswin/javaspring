package com.fastcampus.ch3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class UserDaoImplTest {

    @Autowired
    UserDao userDao;

    @Test
    public void deleteUser() {
    }

    @Test
    public void selectUser() {
    }

    @Test
    public void insertUser() {
    }

    @Test
    public void updateUser() {
        /*
            public User(String asdf, String number, String abc, String mail, Date date, String fb, Date date1) {
            public User(String id, String pwd, String email, Date birth, String sns, Date reg_date) {
         */
        User user = new User("asdf33", "12234", "abc", "aaa@aaa.com", new Date(), "fb", new Date());
        int rowCnt = userDao.updateUser(user);
        assertTrue(rowCnt == 1);
    }
}