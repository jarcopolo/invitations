package jarcopolo.invitations.ui;

import jarcopolo.invitations.logic.DateAndTime;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public Label lblMain;
    public TextField tfName, tfVenue, tfHour;
    public ComboBox cbDate;
    public TextArea taOutput;


    public void initialize()
    {
        populateDateChoicebox();

    }



    private void populateDateChoicebox()
    {


        for (int i=0; i<7; i++)
        {
            cbDate.getItems().add(DateAndTime.getDayName(i));
        }
        cbDate.setValue(cbDate.getItems().get(0));
    }

    // ***************
    // ACTION EVENTS
    // ***************

    public void actionGenerate(ActionEvent event)
    {
        String name, venue, date, hour;
        name = tfName.getText();
        venue = tfVenue.getText();
        date = cbDate.getValue().toString();
        hour = tfHour.getText();

        String message = "Cześć, z tej strony "+name+". Serdecznie zapraszam na "+venue+", "+date+" o godzinie "+hour
                + ". Mam nadzieję, że będziemy się dobrze bawić!";

        taOutput.setText(message);
    }





}
