package com.esolutions.lotto.controller;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;
import javafx.application.Platform;
import javafx.fxml.FXML;
import org.springframework.stereotype.Component;

@Component
public class MenuController {




    @FXML
    private void closeApplication() {
        Platform.exit();
    }

    @FXML
    private void openAnalysisView() {
        System.out.println("Open analysis view");

    }
}
