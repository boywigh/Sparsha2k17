package boywigh.engineersday;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import static android.content.ContentValues.TAG;

/**
 * Created by boywigh on 4/9/17.
 */

public class Callme extends AsyncTask<String,String,String> {

    Context context;
    Callme(Context ctx){
        context=ctx;
    }
    @Override
    protected String doInBackground(String... params) {
            RegisterTeam registerTeam = new RegisterTeam();
            String pchoice=Integer.toString(registerTeam.getChoice());
            String ppname = registerTeam.getPname();
            String ppclass = registerTeam.getPclass();
            String ppsec = registerTeam.getPsec();
            String ppnum = registerTeam.getPnumber();
            String register_url="http://cbcsres.000webhostapp.com/hell/qadd.php";
                try {
                    URL url = new URL(register_url);
                    try {
                        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setDoInput(true);

                        OutputStream outputStream = httpURLConnection.getOutputStream();
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream,"UTF-8"));
                        String post_data= URLEncoder.encode("code","UTF-8")+"="+URLEncoder.encode(pchoice,"UTF-8")+"&"
                                +URLEncoder.encode("pname","UTF-8")+"="+URLEncoder.encode(ppname,"UTF-8")+"&"
                                +URLEncoder.encode("pclass","UTF-8")+"="+URLEncoder.encode(ppclass,"UTF-8")+"&"
                                +URLEncoder.encode("psec","UTF-8")+"="+URLEncoder.encode(ppsec,"UTF-8")+"&"
                                +URLEncoder.encode("pnum","UTF-8")+"="+URLEncoder.encode(ppnum,"UTF-8");
                        bufferedWriter.write(post_data);
                        bufferedWriter.flush();
                        bufferedWriter.close();

                        InputStream inputStream = httpURLConnection.getInputStream();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));
                        String result="";
                        String line="";
                        while ((line = bufferedReader.readLine())!=null)
                        {
                            result+=line;
                        }
                        bufferedReader.close();
                        inputStream.close();
                        httpURLConnection.disconnect();
                        return result;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } catch (MalformedURLException e) {
                    e.printStackTrace();
                }
            return null;
        }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        Toast.makeText(context,
                    s, Toast.LENGTH_SHORT).show();
        super.onPostExecute(s);
    }
}
