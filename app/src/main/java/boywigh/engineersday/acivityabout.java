package boywigh.engineersday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class acivityabout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acivityabout);

        String string = "SPARASHA 2K17\n is an TechoCultural Fest celebrated on occasion of THE ENGINEERS DAY on birthday of Sir M Visvesvaraya by department of Civil Engineering ,Sambhram Institute of Technology";
        TextView textView = (TextView) findViewById(R.id.txtabot);
        textView.setText(string);
    }
}
