package vn.tad_sebs;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import javax.swing.UIManager;

import vn.tad_sebs.Controller.LoginController;
import vn.tad_sebs.View.LoginView;

public class App {

    public static void main(String[] args) {
        FlatLaf.registerCustomDefaultsSource("themes");
        FlatMacLightLaf.setup();
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginView view = new LoginView();
                LoginController controller = new LoginController(view);
                // hiển thị màn hình login
                controller.showLoginView();
            }
        });
    }
}
