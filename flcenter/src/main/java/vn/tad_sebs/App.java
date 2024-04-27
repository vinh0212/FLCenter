package vn.tad_sebs;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import vn.tad_sebs.Controller.LoginController;
import vn.tad_sebs.View.LoginView;

public class App {

    private static void createIniFile(String filePath) throws IOException {
        Properties properties = new Properties();

        // Thêm các thuộc tính vào file .ini
        properties.setProperty("AutofillLogin", "0");

        // Tạo thư mục cha cho file nếu nó không tồn tại
        File file = new File(filePath);
        file.getParentFile().mkdirs();

        // Ghi các thuộc tính vào file .ini
        try (FileOutputStream fos = new FileOutputStream(file)) {
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

                String appDataPath = System.getenv("APPDATA");
                String filePath = appDataPath + "/FLCenter/config.ini";

                try {

                    boolean fileExists = checkFileExists(filePath);

                    // Nếu file chưa tồn tại, tạo file mới và ghi các thuộc tính vào đó
                    if (!fileExists) {
                        createIniFile(filePath);
                    }
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
                try (FileInputStream fis = new FileInputStream(filePath)) {
                    properties.load(fis);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                // Lấy giá trị của các thuộc tính từ file .ini
                String key = properties.getProperty("AutofillLogin");
                if (key.equals("1")) {
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
                    view.setRMBSelected();

                } else {
                    LoginView view = new LoginView();
                    LoginController controller = new LoginController(view);
                    controller.showLoginView();
                }

            }
        });
    }
}
