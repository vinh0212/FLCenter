package vn.tad_sebs;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import vn.tad_sebs.Controller.LoginController;
import vn.tad_sebs.View.LoginView;

public class App {

    public static void main(String[] args) throws IOException {
        UIManager.put("defaultFont", new Font("Verdana", 0, 12));
        FlatMacLightLaf.setup();

        EventQueue.invokeLater(new Runnable() {
            public void run() {
                    LoginView view = new LoginView();
                    LoginController controller = new LoginController(view);
                    controller.showLoginView();
                }
        });
        }
}

            
        
    

