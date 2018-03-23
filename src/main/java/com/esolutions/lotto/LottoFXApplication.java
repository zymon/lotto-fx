package com.esolutions.lotto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LottoFXApplication extends Application {

	private ConfigurableApplicationContext springContext;
	private Parent rootNode;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setScene(new Scene(rootNode));
		primaryStage.centerOnScreen();
		primaryStage.show();
	}

	@Override
	public void stop() throws Exception {
		springContext.stop();
	}

	@Override
	public void init() throws Exception {
		springContext = SpringApplication.run(LottoFXApplication.class);
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fx/LottoFX.fxml"));
		fxmlLoader.setControllerFactory(springContext::getBean);
		rootNode = fxmlLoader.load();
	}
}
