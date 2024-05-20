package vn.tad_sebs.Controller;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.net.URI;    
import vn.tad_sebs.View.LoginView;
import vn.tad_sebs.View.MainView2;
import vn.tad_sebs.View.SignUpCourseView;
import vn.tad_sebs.View.FeeView;

public class MainController2 {
    private MainView2 mainView2;
    public MainController2(MainView2 mainView2) {
        this.mainView2 = mainView2;
        mainView2.addDKKHistener(new DKKHListener());
        mainView2.addDHPListener(new DHPListener());
        mainView2.addDX2Listener(new DX2Listener());
    }
    class DKKHListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            try {
                SignUpCourseView studentView = new  SignUpCourseView();
                //StudentController studentController = new StudentController(studentView);
               // studentController.showStudentView();
                mainView2.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
}
