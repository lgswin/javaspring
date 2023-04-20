package com.fastcampus.ch3.DB;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/root-context.xml"})
public class DBConnectionTest2Test {
    @Autowired
    DataSource ds;
    final int FAIL = 0;

    @Test
    public void updateUserTest() throws Exception {
        User user = new User("asdf33", "1234", "zzz@zzz.com", new Date(), "fb", new Date());
        int rowCnt = updateUser(user);

        assertTrue(rowCnt ==1);
    }
    @Test
    public void insertUserTest() throws Exception {
        User user = new User("asdf33", "1234", "aaaa@aaa.com", new Date(), "fb", new Date());
        deleteAll();
        int rowCnt = insertUser(user);

        assertTrue(rowCnt !=FAIL);
    }

    @Test
    public void selectUserTest() throws Exception{
        deleteAll();
        User user = new User("asdf33", "1234", "aaaa@aaa.com", new Date(), "fb", new Date());
        insertUser(user);

        User user2 = selectUser(("asdf33"));
        assertTrue(user.getId().equals("asdf33"));
    }

    @Test
    public void deleteUserTest() throws Exception {
        deleteAll();
        int rowCnt = deleteUser("asdf33");

        assertTrue(rowCnt==0);

        User user = new User("asdf33", "1234", "aaaa@aaa.com", new Date(), "fb", new Date());
        rowCnt = insertUser(user);
        assertTrue(rowCnt == 1);

        rowCnt = deleteUser(user.getId());
        assertTrue(rowCnt == 1);

        assertTrue(selectUser(user.getId())==null);
    }

    private void deleteAll() throws SQLException {
        Connection conn = ds.getConnection();

//        insert into user_info (id, pwd, name, email, birth, sns, reg_date)
//        values ('asdf', '1234', 'smith', 'ccc@ccc.com', '2021-01-01', 'facebook', now());

        String sql = "delete from user_info ";

        //  ?를  getter랑 매칭시켜 set해줌
        PreparedStatement pstmt = conn.prepareStatement(sql);
        int rowCnt = pstmt.executeUpdate();
    }

    // 사용자 정보를 user_info 테이블에 저장하는 메서드
    public int insertUser(User user) throws Exception{
        Connection conn = ds.getConnection();

//        insert into user_info (id, pwd, name, email, birth, sns, reg_date)
//        values ('asdf', '1234', 'smith', 'ccc@ccc.com', '2021-01-01', 'facebook', now());

        String sql = "insert into user_info values (?, ?, ?, ?, ?, ?, now()) ";

        //  ?를  getter랑 매칭시켜 set해줌
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, user.getId());
        pstmt.setString(2, user.getPwd());
        pstmt.setString(3, user.getName());
        pstmt.setString(4, user.getEmail());
        pstmt.setDate(5, new java.sql.Date(user.getBirth().getTime()));
        pstmt.setString(6, user.getSns());

        int rowCnt = pstmt.executeUpdate();
        return rowCnt;
    }

    public User selectUser(String id) throws Exception {
        Connection conn = ds.getConnection();

//        insert into user_info (id, pwd, name, email, birth, sns, reg_date)
//        values ('asdf', '1234', 'smith', 'ccc@ccc.com', '2021-01-01', 'facebook', now());

        String sql = "select * from user_info where id= ?";

        //  ?를  getter랑 매칭시켜 set해줌
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
            User user = new User();
            user.setId(rs.getString(1));
            user.setPwd(rs.getString(2));
            user.setName(rs.getString(3));
            user.setEmail(rs.getString(4));
            user.setBirth(rs.getDate(5));
            user.setSns(rs.getString(6));
            user.setReg_date(rs.getDate(7));
            return user;
        }
        return null;
    }

    public int deleteUser(String id) throws Exception {
        Connection conn = ds.getConnection();

        String sql = "delete from user_info where id= ? ";

        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, id);
        int rowCnt = pstmt.executeUpdate();
        return rowCnt;
    }

    // 과제
    public int updateUser(User user) throws Exception {
        int rowCnt = FAIL;

        String sql = "update user_info " +
                "set pwd = ?, name = ?, email = ?, birth =?, sns=?, reg_date=?" +
                "where id =? ";

        // try-with-resources - since jdk7
        try (
            Connection conn = ds.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
        ){
            pstmt.setString(1, user.getPwd());
            pstmt.setString(2, user.getName());
            pstmt.setString(3, user.getEmail());
            pstmt.setDate(4, new java.sql.Date(user.getBirth().getTime()));
            pstmt.setString(5, user.getSns());
            pstmt.setTimestamp(6, new java.sql.Timestamp(user.getReg_date().getTime()));
            pstmt.setString(7, user.getId());

            rowCnt = pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            return FAIL;
        }
        return rowCnt;
    }
    @Test
    public void springJdbcConnectionTest() throws Exception{
//        ApplicationContext ac = new GenericXmlApplicationContext("file:src/main/webapp/WEB-INF/spring/**/root-context.xml");
//        DataSource ds = ac.getBean(DataSource.class);

        Connection conn = ds.getConnection(); // 데이터베이스의 연결을 얻는다.

        System.out.println("conn = " + conn);
        assertTrue(conn!=null); // 괄호안의 조건식이 true이면 성공, 아니면 실패
    }
}