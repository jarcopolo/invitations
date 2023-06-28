package jarcopolo.invitations.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public Label lblMain;
    public TextField tfName, tfVenue, tfHour;
    public ComboBox cbDate;
    public TextArea taOutput;

    public void actionGenerate(ActionEvent event)
    {
        String name, venue, date, hour;
        name = tfName.getText();
        venue = tfVenue.getText();
        date = "dzisiaj";
        hour = tfHour.getText();

        String message = "Cześć, z tej strony "+name+". Serdecznie zapraszam na "+venue+", "+date+" o godzinie "+hour
                + ". Mam nadzieję, że będziemy się dobrze bawić!";

        taOutput.setText(message);
    }





}
