package com.pawan;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nobita
 */

import com.jpro.web.WebApp;
import com.jpro.web.Redirect;
import javafx.stage.Stage;
import com.pawan.pages.MainPage;

public class Routes extends WebApp {
    Routes(Stage stage) {
        super(stage);

        //getStylesheets().add("/com/jpro/samples/website/css/website.css");

        addRouteJava((s) -> {
            if(s.equals("") || s.equals("/")) {
                return new Redirect("/main");
            } else if(s.equals("/main")) {
                return new MainPage();
//            } else if(s.equals("/sub")) {
//                return new SubPage();
            } else {
                return null;
            }
        });
    }
}
