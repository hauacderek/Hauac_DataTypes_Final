package mcm.edu.ph.hauac_datatypes_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView display;

        display = findViewById(R.id.displayTxt);

        String firstName = "Derek Antonio";
        char middleInitial = 'T';
        String lastname = "Hauac";
        int myAge = 18;
        float myDreamTVLGrade = 99.0f;
        double myMoney =99999.99;



        //String.valueOf(myMoney);
        display.setText("My firstName is " +firstName+ "  "
                +String.valueOf(middleInitial)+ " "
                +lastname+ " \nand my age is "
                +myAge+ ". \ni want my grade in TVL3 to be "
                +String.valueOf(myDreamTVLGrade));

        boolean amIHuman = false;
    }
}