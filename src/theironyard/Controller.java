package theironyard;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.Observable;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    ListView list;

    @FXML
    TextField text;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        list.setItems(items);
    }

    public void addItem () {
        items.add(text.getText());
        text.setText("");
    }

    public void removeItem () {
        String item = (String) list.getSelectionModel().getSelectedItem();
        items.remove(item);
        }
    }