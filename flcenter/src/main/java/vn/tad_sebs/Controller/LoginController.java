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
            String appDataPath = System.getenv("APPDATA");
            String filePath = appDataPath + "/FLCenter/config.ini";
            if (userDao.checkUser(user)) {
                // hiển thị màn hình chính
                MainView mainView = new MainView();
                view.setVisible(false);
                MainController mainController = new MainController(mainView);
                mainController.showMainView();
                Properties properties = new Properties();
                try (InputStream in = new FileInputStream(filePath)) {
                    properties.load(in);
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Đặt giá trị mới cho Sumani
                String autofillLoginValue = view.isRMBSelected() ? "1" : "0";
                properties.setProperty("AutofillLogin", autofillLoginValue);

                // Lưu các thay đổi vào file
                try (OutputStream out = new FileOutputStream(filePath)) {
                    properties.store(out, null);
                } catch (IOException ex) {
                    Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else {
                view.showMessage("Đăng nhập thất bại");
            }
        }
    }
}
