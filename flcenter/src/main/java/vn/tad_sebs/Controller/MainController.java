package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vn.tad_sebs.View.StudentView;
import vn.tad_sebs.View.MainView;

public class MainController {
    private MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        mainView.addQLHVListener(new QLHVListener());
        // mainView.addQLLHListener(new QLLHListener());
        // mainView.addQLCBGVListener(new QLCBGVListener());
        // mainView.addQLCTHListener(new QLCTHListener());
        // mainView.addQLKTListener(new QLKTListener());
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

}
