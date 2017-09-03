package boywigh.engineersday;

import android.Manifest;
import android.app.ActionBar;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ImageButton btnevent, btnvis, btncontact, btnabout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();
        isReadStorageAllowed();
    }
            private boolean isReadStorageAllowed() {
            //Getting the permission status
            int result = ContextCompat.checkSelfPermission(this, Manifest.permission.INTERNET);

            //If permission is granted returning true
            if (result == PackageManager.PERMISSION_GRANTED)
                return true;

            //If permission is not granted returning false
            return false;
        }

    public void addListenerOnButton() {

        btnevent = (ImageButton) findViewById(R.id.btn_event);
        btnvis = (ImageButton) findViewById(R.id.btn_vis);
        btnabout = (ImageButton) findViewById(R.id.btn_about);
        btncontact=(ImageButton) findViewById(R.id.btn_contact);

        btncontact.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "Contact Us Selected", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, contactactivity.class);
                startActivity(intent);

            }

        });

        btnvis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "About Sir MV Selected", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, mvactivity.class);
                startActivity(intent);

            }

        });

        btnabout.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "About Event Selected", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, acivityabout.class);
                startActivity(intent);

            }

        });


        btnevent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(MainActivity.this,
                        "Events Selected", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, SelectEvent.class);
                startActivity(intent);

            }

        });

    }
}
