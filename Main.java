package application;

// javaFX imports
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
// localS imports
import DBs.*;

// java.util imports
import java.util.ArrayList;

public class Main extends Application implements EventHandler<ActionEvent> {

    // mainMenu buttons
    private Button registerProduct = new Button("Register New Product");
    private Button orderProduct = new Button("orderProduct");
    private Button deregisterProduct = new Button("deregisterProduct");
    private Button addSubscription = new Button("addSubscription");
    private Button deleteSubscription = new Button("deleteSubscription");
    private Button registerSupplier = new Button("registerSupplier");
    private Button deregisterSupplier = new Button("deregisterSupplier");

    // home button
    private Button goHome = new Button("Home");

    // window stuff
    private static Stage primaryStage;
    private static Scene home;

    // to be removed later
    public static Scene empty;

    // data
    private ArrayList<Product> products = new ArrayList<Product>();

    // main
    public static void main(String[] args) {
        launch(args);
    }

    // Application process
    @Override
    public void start(Stage original) throws Exception {
        primaryStage = original;

        // read the database here

        primaryStage.setTitle("Pharmacy Inventory Manager");

        // give main menu buttons event detection
        registerProduct.setOnAction(this);
        orderProduct.setOnAction(this);
        deregisterProduct.setOnAction(this);
        addSubscription.setOnAction(this);
        deleteSubscription.setOnAction(this);
        registerSupplier.setOnAction(this);
        deregisterSupplier.setOnAction(this);

        // give general buttons event detection
        goHome.setOnAction(this);

        // create mainMenu and add Buttons
        VBox mainMenu = new VBox();
        Label mainLab = new Label("Main Menu");
        mainMenu.getChildren().addAll(mainLab, registerProduct, orderProduct, deregisterProduct, addSubscription,
                deleteSubscription, registerSupplier, deregisterSupplier);
        home = new Scene(mainMenu, 300, 250);

        // create emptyMenu and add Button
        VBox emptyMenu = new VBox();
        Label unFinished = new Label("This option has not yet been implemented.");
        emptyMenu.getChildren().addAll(unFinished, goHome);
        empty = new Scene(emptyMenu, 300, 250);

        // show main menu
        primaryStage.setScene(home);
        primaryStage.show();
    }

    // handle
    @Override
    public void handle(ActionEvent event) {

        if (event.getSource() == registerProduct) {
            products.add(new Product(primaryStage));
            primaryStage.setScene(home);

        } else if (event.getSource() == orderProduct) {
            primaryStage.setScene(empty);

        } else if (event.getSource() == deregisterProduct) {
            primaryStage.setScene(empty);

        } else if (event.getSource() == addSubscription) {
            primaryStage.setScene(empty);

        } else if (event.getSource() == deleteSubscription) {
            primaryStage.setScene(empty);

        } else if (event.getSource() == registerSupplier) {
            primaryStage.setScene(empty);

        } else if (event.getSource() == deregisterSupplier) {
            primaryStage.setScene(empty);

        } else if (event.getSource() == goHome) {
            primaryStage.setScene(home);
        }
    }
}
