import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.web.WebEngine;
import javafx.stage.Stage;


/**
 * Created by Mark on 16/01/2017.
 */

public class Browser_Methods {

    public void defineTitle(String str, Stage stage) //Gets the title of the current web page and makes it the title of the browser
    {
        stage.setTitle(str);
    }

    public void resetProgressBar(int i, ProgressBar pb)
    {
        pb.progressProperty().unbind();
        pb.setProgress(i);
    }

    public void setTheScene(Stage s, Scene scene, double w, double h, boolean r, String title) //Combines all methods needed to set the scene outputted in the program
    {
        s.setScene(scene);
        s.setWidth(w);
        s.setHeight(h);
        s.show();
        s.setResizable(r);
        s.setTitle(title);
    }

    public void setHelp(Button b, String s) //Gives help text to the buttons
    {
        b.setTooltip(
                new Tooltip(s)
        );

    }

    public void setHBoxAttributes(HBox hb, double spacing, Pos p, Insets i) //Sets all appropriate attributes to a HBox
    {
        hb.setSpacing(spacing);
        hb.setAlignment(p);
        hb.setPadding(i);
    }

    public void currentURL(String s) //Outputs in terminal what the current URL is
    {
        System.out.println("Current URL is: " +s);
    }

    public void goBack(Button b, WebEngine wb) //Returns to the previous page
    {
        b.setOnAction(event -> wb.getHistory().go(-1));
    }

    public void fixUrl(String s) //This means the user won't have to type in http:// at start of URL
    {
        //String s is the url the user has typed in

        /* How it will be done

            Get substring of first seven characters (for http://)
            Get substring of first eight characters (for https://)

            if the substring2 doesn't equal https://
            {
                if the substring1 doesn't equal http://
                {
                    add https:// to the beginning of the string
                }
                else
                {
                    exit with no change
                }
            }
            else
            {
                exit with no change
            }




         */
    }


}
