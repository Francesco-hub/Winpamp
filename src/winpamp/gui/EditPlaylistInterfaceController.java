/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package winpamp.gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author cille
 */
public class EditPlaylistInterfaceController implements Initializable {
 private MainModel model;
    @FXML
    private TextField playlistName;
    @FXML
    private Button cancel;
    /**
     * Initializes the controller class.
     */
 public EditPlaylistInterfaceController()
 {
      model = MainModel.GetInstance();
 }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        playlistName.setText(model.getPlaylistToDelete().getName());
       
    }    

    @FXML
    private void cancelView(ActionEvent event) {
         Stage stage = (Stage)cancel.getScene().getWindow();
    
    stage.close();
    }
    
}
