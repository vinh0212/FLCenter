package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

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
                mainView.dispose();
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
                mainView.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class QLCTHListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý chương trình học
            try {
                MonView monView = new MonView();
                SubjectController subjectController = new SubjectController(monView);
                subjectController.showMonView();
                mainView.dispose();
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
                mainView.dispose();
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
                mainView.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    class DXListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {           
            mainView.dispose();
            LoginView view = new LoginView();
            LoginController controller = new LoginController(view);
            controller.showLoginView();

        }
    }

    class QLTLListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý data
            try {
                DataView dataView = new DataView();
                DataController dataController = new DataController(dataView);
                dataController.showDataView();
                mainView.dispose();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

}
