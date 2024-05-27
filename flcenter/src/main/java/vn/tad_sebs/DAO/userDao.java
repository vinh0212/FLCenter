package vn.tad_sebs.DAO;

import vn.tad_sebs.Model.User;

public class UserDao {
    public boolean checkUser(User user) {
            if (user != null) {
                if ("admin".equals(user.getUserName()) 
                        && "admin".equals(user.getPassword())) {
                    return true;
                }
                else if ("staff".equals(user.getUserName()) 
                        && "staff".equals(user.getPassword())) {
                    return true;
                }
            }
            return false;
        }
}
