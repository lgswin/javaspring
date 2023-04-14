package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

// 구현해야할 기능을 인터페이스로 선언!
public interface UserInfoDao {
    void insertUserInfo(UserInfo userInfo);
    void updateUserInfo(UserInfo userInfo);
    void deleteUserInfo(UserInfo userInfo);
}
