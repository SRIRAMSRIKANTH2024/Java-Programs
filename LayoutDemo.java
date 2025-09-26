package org.mano.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class LayoutDemo extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        Scene scene = new Scene(createBorderPane(), 800, 600);
        stage.setTitle("Layout Demo");
        stage.setScene(scene);
        stage.show();
    }

    public BorderPane createBorderPane() {
        BorderPane borderPane = new BorderPane();

        MenuBar menuBar = new MenuBar();

        Menu fileMenu = new Menu("File");
        fileMenu.getItems().addAll(
                new MenuItem("New"),
                new SeparatorMenuItem(),
                new MenuItem("Open"),
                new MenuItem("Save"),
                new MenuItem("Save As..."),
                new SeparatorMenuItem(),
                new MenuItem("Exit")
        );

        Menu editMenu = new Menu("Edit");
        editMenu.getItems().addAll(
                new MenuItem("Undo"),
                new MenuItem("Redo"),
                new MenuItem("Cut"),
                new MenuItem("Copy"),
                new MenuItem("Paste"),
                new SeparatorMenuItem(),
                new MenuItem("Search/Replace")
        );

        Menu helpMenu = new Menu("Help");
        helpMenu.getItems().addAll(
                new MenuItem("Help Contents"),
                new SeparatorMenuItem(),
                new MenuItem("About...")
        );

        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        ToolBar toolBar = new ToolBar(
                new Button("New"),
                new Button("Open"),
                new Separator(),
                new Button("Cut"),
                new Button("Copy"),
                new Button("Paste")
        );

        VBox vbox = new VBox(menuBar, toolBar);

        TreeItem<String> rootItem = new TreeItem<>("Projects");
        rootItem.setExpanded(true);

        TreeItem<String> project1 = new TreeItem<>("Project 1");
        TreeItem<String> project2 = new TreeItem<>("Project 2");
        TreeItem<String> project3 = new TreeItem<>("Project 3");
        TreeItem<String> project4 = new TreeItem<>("Project 4");

        // Add children individually to avoid unchecked warnings
        rootItem.getChildren().add(project1);
        rootItem.getChildren().add(project2);
        rootItem.getChildren().add(project3);
        rootItem.getChildren().add(project4);

        TreeView<String> treeView = new TreeView<>(rootItem);

        TabPane tabPaneLeft = new TabPane();
        Tab projectListTab = new Tab("Project List", treeView);
        projectListTab.setClosable(false);
        Tab explorerTab = new Tab("Explorer");
        explorerTab.setClosable(false);
        tabPaneLeft.getTabs().addAll(projectListTab, explorerTab);

        TabPane tabPaneRight = new TabPane();
        Tab outlineTab = new Tab("Outline");
        outlineTab.setClosable(false);
        Tab taskListTab = new Tab("Task List");
        taskListTab.setClosable(false);
        tabPaneRight.getTabs().addAll(outlineTab, taskListTab);

        TextArea textArea = new TextArea();

        Label statusLabel = new Label("Status text: BorderPane demo");

        borderPane.setTop(vbox);
        borderPane.setLeft(tabPaneLeft);
        borderPane.setCenter(textArea);
        borderPane.setRight(tabPaneRight);
        borderPane.setBottom(statusLabel);

        return borderPane;
    }
}
