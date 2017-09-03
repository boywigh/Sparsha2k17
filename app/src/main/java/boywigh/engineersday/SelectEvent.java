package boywigh.engineersday;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by boywigh on 2/9/17.
 */

public class SelectEvent extends AppCompatActivity {

    public Spinner categor,sprna;
    private Button btnreg;
    public int ch, sh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_event);
        addItemsOnSpinner();
        addListenerOnButton();
        resu();
    }
    public int choice=0;
    String[] categ ={"Cultural","Gaming","Technical","Arts"};
    String[] cult={"Solo Singing","Solo Dance","Group Singing","Group Dance","Antyakshri"};
    String[] gam = {"Super Minute","Treasure Hunt","Mini Militia"};
    String[] art = {"Pencil Sketch","Rangoli","Cooking without Fire"};
    String[] tech ={"Fast Surveying","Technical Quiz","Idea Presentation","Best out of Waste"};


    public void addItemsOnSpinner(){
// Application of the Array to the Spinner
        categor = (Spinner) findViewById(R.id.spnrcat);

        ArrayAdapter<String> spinnerArrayAdapter = new ArrayAdapter<String>(this,   R.layout.support_simple_spinner_dropdown_item, categ);
        spinnerArrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // The drop down view
        categor.setAdapter(spinnerArrayAdapter);
        categor.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        ch=categor.getSelectedItemPosition();
                        res(ch);
                    }

                    public void onNothingSelected(AdapterView<?> parent) {

                    }
                });
    }
    public void res(int ch){
        ArrayAdapter adapter=new ArrayAdapter<String>(this,   R.layout.support_simple_spinner_dropdown_item, cult);
        switch(ch)
        {
            case 0:
                adapter = new ArrayAdapter<String>(this,   R.layout.support_simple_spinner_dropdown_item, cult);
                break;
            case 1:
                adapter = new ArrayAdapter<String>(this,   R.layout.support_simple_spinner_dropdown_item, gam);
                break;
            case 2:
                adapter = new ArrayAdapter<String>(this,   R.layout.support_simple_spinner_dropdown_item, tech);
                break;
            case 3:
                adapter = new ArrayAdapter<String>(this,   R.layout.support_simple_spinner_dropdown_item, art);
                break;
        }
        sprna = (Spinner) findViewById(R.id.spnrname);
        sprna.setAdapter(adapter);
        sprna.setOnItemSelectedListener(
                new AdapterView.OnItemSelectedListener() {
                    public void onItemSelected(
                            AdapterView<?> parent, View view, int position, long id) {
                        sh=sprna.getSelectedItemPosition();
                        resu();
                    }

                    public void onNothingSelected(AdapterView<?> parent) {
                        resu();
                    }
                });
    }
    public void resu(){
        if(ch==0)
            choice=sh;
        else if(ch==1)
            choice=sh+5;
        else if(ch==2)
            choice=sh+8;
        else if(ch==3)
            choice=sh+12;
        RulesEv rule = new RulesEv();
        String charact = rule.events(choice);
        TextView txtrule = (TextView) findViewById(R.id.txtrule);
        txtrule.setText(charact);
    }
    public void addListenerOnButton() {

        btnreg = (Button) findViewById(R.id.btnregister);

        btnreg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(SelectEvent.this,
                        "Events Selected", Toast.LENGTH_SHORT).show();

                RegisterTeam regtem = new RegisterTeam();
                regtem.setChoice(choice);

                Intent intent = new Intent(SelectEvent.this, Register.class);
                startActivity(intent);

            }

        });

    }
}