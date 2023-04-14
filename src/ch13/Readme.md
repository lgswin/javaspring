## 인터페이스를 활용한 dao 구현하기

* Hierarchy
+ ch13 
  + domain.userinfo
      + dao
          + mysql
              + UserInfoMySqlDao.java
          + oracle
              + UserInfoOracleDao.java
          + UserInfoDao.java
      + UserInfo.java
  + userinfo.web
      + UserInfoClient.java

UserInfoDao.java에 구현해야할 method를 정의하고
```java
public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
```

실제 동작은 properties에서 정의된 값에 따라 동작하게 설계
```java
if (dbType.equals("ORACLE")) {
    userInfoDao = new UserInfoOracleDao();
}
else if (dbType.equals("MYSQL")) {
    userInfoDao = new UserInfoMySqlDao();
}
else {
    System.out.println("db error!");
    return;
}

userInfoDao.insertUserInfo(userInfo);
userInfoDao.updateUserInfo(userInfo);
userInfoDao.deleteUserInfo(userInfo);
```

이후 유지보수는 각 패키지의 클래스에서 진행하도록 한다.
```java
public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into Oracle DB userID = "+userInfo.getUserId());
    }
    ...
```
```java
public class UserInfoMySqlDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("Insert into MySQL DB userID = "+userInfo.getUserId());
    }
    ....
```
