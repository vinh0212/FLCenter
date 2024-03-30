package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vn.tad_sebs.DAO.UserDao;
import vn.tad_sebs.Model.User;
import vn.tad_sebs.View.LoginView;
//import vn.tad_sebs.View.StudentView;

public class LoginController {
    private LoginView view;
    private UserDao userDao;

    public LoginController(LoginView view) {
        this.view = view;
        userDao = new UserDao();
        this.view.addLoginListener(new LoginListener());
    }

    public void showLoginView() {
        view.showLoginView();
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            User user = view.getUser();
            if (userDao.checkUser(user)) {
                view.showMessage("Đăng nhập thành công");
                // hiển thị màn hình student
                //StudentView studentView = new StudentView();
                //StudentController studentController = new StudentController(studentView);
                //studentController.showStudentView();
            } else {
                view.showMessage("Đăng nhập thất bại");
            }
        }
    }
}
