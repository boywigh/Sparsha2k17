package boywigh.engineersday;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class activitythankyou extends AppCompatActivity {
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythankyou);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(activitythankyou.this,MainActivity.class);
                activitythankyou.this.startActivity(mainIntent);
                activitythankyou.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
