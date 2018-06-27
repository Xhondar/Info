package esame.progetto.xhondar.github.com.info;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class custompopup extends AppCompatActivity {

    tab t = new tab();
    String ss = "";

    public void setSS(String sss) {
        this.ss = sss;
    }

    public String getSS() {
        return ss;
    }

    public void forecast_weather(String citta){
        final String city = getSS();
        String url = "http://api.openweathermap.org/data/2.5/weather?q=";
        String apiKey = "&appid=41afbec1ba89050882ba1ef131e6aa72";
        url = url + city + apiKey + "&lang=it&units=metric";

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {

                    JSONObject obj = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject obj2 = array.getJSONObject(0);

                } catch (JSONException e) {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(this);
        queue.add(jor);
    }
    public void closePopup(){
        Button btn;
        btn = (Button) findViewById(R.id.btnclose);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                finish();
            }
        });

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custompopup);
        closePopup();
    }
}
