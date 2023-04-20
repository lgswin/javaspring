package com.fastcampus.ch3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Calendar;
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
    public void updateUser() throws Exception{

        // 날짜정보를 초기화해서 입력하기위해 
        Calendar cal = Calendar.getInstance();
        cal.clear();
        cal.set(2021, 1, 1);
        /*
            public User(String asdf, String number, String abc, String mail, Date date, String fb, Date date1) {
            public User(String id, String pwd, String email, Date birth, String sns, Date reg_date) {
         */
        //userDao.deleteUser("asdf33");
        userDao.deleteAll();
        // 삽입
        User user = new User("asdf33", "12234", "abc", "aaa@aaa.com", new Date(cal.getTimeInMillis()), "fb", new Date());
        int rowCnt = userDao.insertUser(user);
        assertTrue(rowCnt == 1);

        user.setPwd("234234");
        // 업데이트
        user.setEmail("ddd@ddd.com");
        rowCnt = userDao.updateUser(user);
        assertTrue(rowCnt == 1);

        // 셀렉트
        User user2 = userDao.selectUser(user.getId());
        System.out.println("user = " + user);
        System.out.println("user2 = " + user2);

        assertTrue(user.equals(user2));

    }
}