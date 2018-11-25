/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytoeic.Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import mytoeic.Model.Category;

/**
 * FXML Controller class
 *
 * @author Administrator
 */
public class AdminQuestionManagementController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML private ComboBox<Category> cbCategories;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }

}
