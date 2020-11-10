package com.pawan;


import javafx.application.Application;
import static javafx.application.Application.launch;
import com.jpro.web.sessionmanager.SessionManager;
import javafx.scene.Scene;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author nobita
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) {
        Routes app = new Routes(stage);
        stage.setScene(new Scene(app));
        stage.show();
        app.start(SessionManager.getDefault(app, stage));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
