package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JCheckBox;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import vn.tad_sebs.View.StudentView;
import vn.tad_sebs.View.ClassView;
import vn.tad_sebs.View.DataView;
import vn.tad_sebs.View.ExamView;
import vn.tad_sebs.View.LoginView;
import vn.tad_sebs.View.MainView;
import vn.tad_sebs.View.TeacherView;
import vn.tad_sebs.View.MonView;

public class MainController {
    private MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        mainView.addQLHVListener(new QLHVListener());
        mainView.addQLLHListener(new QLLHListener());
        mainView.addQLCBGVListener(new QLCBGVListener());
        mainView.addQLCTHListener(new QLCTHListener());
        mainView.addQLKTListener(new QLKTListener());
        mainView.addQLTLListener(new QLTLListener());
        mainView.addDXListener(new DXListener());
    }
    public void showMainView() {
        mainView.setVisible(true);
    }

    class QLHVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            try {
                StudentView studentView = new StudentView();
                StudentController studentController = new StudentController(studentView);
                studentController.showStudentView();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

    class QLCBGVListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý cán bộ giáo viên
            try {
                TeacherView teacherView = new TeacherView();
                TeacherController teacherController = new TeacherController(teacherView);
                teacherController.showTeacherView();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    
    class QLCTHListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // hiển thị màn hình quản lý chương trình học
            try {
                MonView monView = new MonView();
                SubjectController subjectController = new SubjectController(monView);
                subjectController.showMonView();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    class QLKTListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            try {
                ExamView examView = new ExamView();
                ExamController examController = new ExamController(examView);
                examController.showExamView();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }

    class QLLHListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý lớp học
            try {
                ClassView classView = new ClassView();
                ClassController classController = new ClassController(classView);
                classController.showClassView();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    private static Properties properties = new Properties();
    class DXListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String filePath = "D:/config.ini";                           
                    try (FileInputStream fis = new FileInputStream("D:/config.ini")) {
                        properties.load(fis);
                     } catch (IOException ex) { 
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
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
    }
    
    class QLTLListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            // hiển thị màn hình quản lý data
            try {
                DataView dataView = new DataView();
                DataController dataController = new DataController(dataView);
                dataController.showDataView();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
