package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vn.tad_sebs.View.StudentView;
import vn.tad_sebs.View.MainView;

public class MainController {
    private MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        mainView.addQLHVListener(new StudentListener());
        //mainView.addQLLHListener(new QLLHListener());
        //mainView.addQLCBGVListener(new QLCBGVListener());
        //mainView.addQLCTHListener(new QLCTHListener());
        //mainView.addQLKTListener(new QLKTListener());
    }

    public void showMainView() {
        mainView.setVisible(true);
    }

    class StudentListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // hiển thị màn hình quản lý học viên
            StudentView studentView = new StudentView();
            studentView.setVisible(true);
        }
    }

}
