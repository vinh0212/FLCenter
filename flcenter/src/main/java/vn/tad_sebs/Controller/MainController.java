package vn.tad_sebs.Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vn.tad_sebs.View.LoginView;
import vn.tad_sebs.View.MainView;

public class MainController {
    private MainView mainView;

    public MainController(MainView mainView) {
        this.mainView = mainView;
        this.mainView.addQLHVListener(new QLHVListener());
        //this.mainView.addQLLHListener(new QLLHListener());
        //this.mainView.addQLCBGVListener(new QLCBGVListener());
        //this.mainView.addQLCTHListener(new QLCTHListener());
        //this.mainView.addQLKTListener(new QLKTListener());
    }
}
