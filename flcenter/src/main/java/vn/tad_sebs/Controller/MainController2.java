package vn.tad_sebs.Controller;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.net.URI;    
import vn.tad_sebs.View.DHPView;
import vn.tad_sebs.View.LoginView;  
import vn.tad_sebs.View.MainView2;
import vn.tad_sebs.View.StudentView2;
import vn.tad_sebs.View.StudentView;

public class MainController2 {
    private MainView2 mainView2;
    public MainController2(MainView2 mainView2) {
        this.mainView2 = mainView2;
        mainView2.addDKKHListener(new DKKHListener());
        mainView2.addDHPListener(new DHPListener());
        mainView2.addDX2Listener(new DX2Listener());
    }
    class DX2Listener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            mainView2.dispose();
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view);
            controller.showLoginView();

        }
    }
    class DKKHListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            try {
                StudentView2 studentView2 = new StudentView2();
                StudentController2 studentController2 = new StudentController2(studentView2);
                studentController2.showStudentView2();
                mainView2.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
    class DHPListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            try {
                DHPView DHPview = new DHPView();
                DHPController DHPcontroller = new DHPController(DHPview);
                DHPcontrollr.showDHPView();
                mainView2.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    class EDITListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            try {
                EditStudentView EditStudentview = new EditStudentView();
                EditController Editcontroller = new EditController(EditStudentview);
                Editcontroller.showEditStudentView();
                mainView2.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    public void showMainView2() {
            mainView2.setVisible(true);
    }
}
