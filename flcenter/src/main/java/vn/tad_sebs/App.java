package vn.tad_sebs;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import vn.tad_sebs.Controller.LoginController;
import vn.tad_sebs.Controller.MainController;
import vn.tad_sebs.View.LoginView;
import vn.tad_sebs.View.MainView;

public class App {

    private static void createIniFile(String filePath) throws IOException {
            Properties properties = new Properties();
            
            // Thêm các thuộc tính vào file .ini
            properties.setProperty("SetupMode", "0");
            properties.setProperty("SetupName", "z-bin");
            properties.setProperty("UseRegPath", "0");
            properties.setProperty("TreeKeyMode", "0");
            properties.setProperty("RegPath", "3");
            properties.setProperty("RegName", "6");
            properties.setProperty("ChangedPath", "2");
            properties.setProperty("PatchName", "9");
            properties.setProperty("PatchNameRun", "4");
            properties.setProperty("IniPath", "OakGame\\Binaries\\Win64\\CODEX.ini");
            properties.setProperty("KeyName", "UserName");
            properties.setProperty("KeyId", "3");
            properties.setProperty("LaunchMode", "0");
            properties.setProperty("Sumani", "0");
            properties.setProperty("hnaht", "1");
            properties.setProperty("MiMode", "0");
            properties.setProperty("mizedMode", "0");
            properties.setProperty("Mini", "1");
            properties.setProperty("zedMode", "1");
            properties.setProperty("Minimi", "0");
            properties.setProperty("Subasa", "1");
            properties.setProperty("anbatocom", "0");
            properties.setProperty("anhbaxin", "1");
            properties.setProperty("xuxifarm", "1");
            properties.setProperty("invodker", "1");
            properties.setProperty("vodka", "0");

            // Ghi các thuộc tính vào file .ini
            try (FileOutputStream fos = new FileOutputStream(filePath)) {
                properties.store(fos, null);                
            }
        } 
    private static boolean checkFileExists(String filePath) {
        return new java.io.File(filePath).exists();
    }
    private static Properties properties = new Properties();
    public static void main(String[] args) throws IOException {
        FlatMacLightLaf.setup();
        
        EventQueue.invokeLater(new Runnable() {           
            public void run() {                
                    
                    String filePath = "D:/config.ini";
                    
                    try {
          
                     boolean fileExists = checkFileExists(filePath);

            // Nếu file chưa tồn tại, tạo file mới và ghi các thuộc tính vào đó
                    if (!fileExists) {
                         createIniFile(filePath);
                    }
                     } catch (IOException ex) {
                            ex.printStackTrace();
                    }
                    try (FileInputStream fis = new FileInputStream("D:/config.ini")) {
                        properties.load(fis);
                     } catch (IOException e) {
                            e.printStackTrace();
                     }

        // Lấy giá trị của các thuộc tính từ file .ini
        String key = properties.getProperty("Sumani");                         
                        if (key.equals("1")){
                                LoginView view = new LoginView();
                                LoginController controller = new LoginController(view);
                                controller.showLoginView();
                                JTextField textField = view.getUsername();
                                if (textField != null) {
                                textField.setText("admin");
                                }
                                JPasswordField textField2 = view.getPassword();
                                if (textField2 != null) {
                                textField2.setText("admin");
                                }
                                
                        } else {
                               LoginView view = new LoginView();
                               LoginController controller = new LoginController(view);
                               controller.showLoginView();
                            }
                        
                      
                           
                
            }
            });
}}
        



