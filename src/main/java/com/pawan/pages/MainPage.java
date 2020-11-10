/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pawan.pages;

import com.jpro.web.View;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

/**
 *
 * @author nobita
 */
public class MainPage extends View {

    @Override
    public String title() {
        return "Title: Hello JPro";
    }

    @Override
    public String description() {
        return "I'm the description. Google will find me!";
    }

    @Override
    public Node content() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/fxml/MainView.fxml"));
            AnchorPane a = new AnchorPane();
            a.getChildren().add(root);
            return a;
        } catch (IOException ex) {
            // System.out.println("Path :: "+getClass().getResource("/fxml/MainView.fxml"));
            VBox content = new VBox();
            content.getStyleClass().add("content");
            //content.getChildren().add(new Header());
            Label label = new Label("Main Page");
            label.getStyleClass().add("content-label");
            content.getChildren().add(label);
            return content;
        }
    }
}
