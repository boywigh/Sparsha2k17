package boywigh.engineersday;

import android.app.Activity;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class Register extends Activity /*implements ServerGetRequest.Response*/ {


    Button btnreg;
    EditText pname, pclass, psec, pnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        pname = (EditText) findViewById(R.id.edtname);
        pclass = (EditText) findViewById(R.id.edtclass);
        psec = (EditText) findViewById(R.id.edtsec);
        pnumber = (EditText) findViewById(R.id.edtphone);

        btnreg = (Button) findViewById(R.id.btnmainregister);
        addListenerOnButton();
    }



    RegisterTeam regtem = new RegisterTeam();
    public int choice;

    public void addListenerOnButton() {
        btnreg.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                regtem.setPname(pname.getText().toString());
                regtem.setClass(pclass.getText().toString());
                regtem.setPsec(psec.getText().toString());
                regtem.setPnumber((pnumber.getText().toString()));
                choice = regtem.getChoice();
                Toast.makeText(Register.this, regtem.getChoice() + regtem.getPclass() + regtem.getPsec() + regtem.getPnumber() + regtem.getPname(), Toast.LENGTH_SHORT).show();

              Callme callme = new Callme(Register.this);
                callme.execute();
                Intent intent = new Intent(Register.this, activitythankyou.class);
                startActivity(intent);
            }

        });

    }
}

