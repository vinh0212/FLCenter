package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import vn.tad_sebs.DAO.UserDao;
import vn.tad_sebs.Model.User;
import vn.tad_sebs.View.LoginView;
import vn.tad_sebs.View.MainView;
import vn.tad_sebs.View.MainView2;

public class LoginController {

    private LoginView view;
    private UserDao userDao;
    public LoginController(LoginView view) {
        this.view = view;
        userDao = new UserDao();
        view.addLoginListener(new LoginListener());
    }

    public void showLoginView() {
        view.setVisible(true);
    }
    class LoginListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            User user = view.getUser();
            if (userDao.checkUser(user)) {
                // hiển thị màn hình chính
                if ("admin".equals(user.getUserName()))
                {
                MainView mainView = new MainView();
                view.setVisible(false);
                MainController mainController = new MainController(mainView);
                mainController.showMainView();
                }
                else
                {
                    MainView2 mainView2 = new MainView2();
                    view.setVisible(false);
                    MainController2 mainController2 = new MainController2(mainView2);
                    mainController2.showMainView2();
                }
            } else {
                view.showMessage("Đăng nhập thất bại");
            }
        }
    }
}
