package boywigh.engineersday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class contactactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contactactivity);

        String string = "Likith D             9844132476\t\n" +
                "Pradyumna      9980735617\n" +
                "Nikhil                 7353185175\n" +
                "Purshotham     8105737843\n";
        String cred = "Bikram Singh aka boywigh(Developer)\n"+
                "Dipesh Singh(Programmer)\n"+
                "Sai Krishna(Designer)\n";

        TextView txtcont, txtcred;
        txtcont=(TextView) findViewById(R.id.txtcont);
        txtcred=(TextView) findViewById(R.id.txtcred);
        txtcont.setText(string);
        txtcred.setText(cred);
    }
}
