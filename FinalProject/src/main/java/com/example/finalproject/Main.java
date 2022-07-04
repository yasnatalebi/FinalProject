package com.example.finalproject;

import MainPanel.FirstPage;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException
    {
        FirstPage firstPage = new FirstPage();
        stage = firstPage.getMainStage();

        firstPage.createButton();
        firstPage.createLogo();
        firstPage.createBackground();
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}