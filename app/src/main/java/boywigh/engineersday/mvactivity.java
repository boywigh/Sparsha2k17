package boywigh.engineersday;

import android.hardware.camera2.params.BlackLevelPattern;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class mvactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvactivity);

        String aboutmv="Full Name : Sir Mokshagundam Visvesvaraya\n" +
                "Farther Name : M Srinivasa Shastry\n" +
                "Mother Name : Venkatalakshmamma\n" +
                "Born : 15th Sep 1861  Muddenahalli,Karnataka \n" +
                "Died : 12th April 1962 Bangalore,Karnataka \n" +
                "Profession : Civil Enginner\n\n" +
                "Works:- Assistant Engineer in Bombay, services lent to Municipality of Sukkur in Sind,Executive Engineer in Surat, Assistant Superintending Engineer in Poona, Executive Engineer for Irrigation in Poona, Sanitary Engineer in Bombay, Member of Sanitary Board in Bombay, Designed and constructed automatic gates patented by him at Lake Fife Storage Reservoir, Chief Engineer and Secretary to the Government of Mysore, Chief Engineer and Secretary to the Government of Mysore, Board of director of Tata Steel, Founder of State of Mysore.\n\n" +
                "Awards n Honours:- Companion of the Order of the Indian Empire,  Diwan of Mysore, knighted as a Knight Commander of the Order of the Indian Empire,  Bharat Ratna,  honorary Membership of London , several honorary doctoral degrees including D.Sc., LL.D., D.Litt. from eight universities in India.\n";

        TextView textView = (TextView) findViewById(R.id.txtmv);
        textView.setText(aboutmv);
    }
}
