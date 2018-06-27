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
        String url = "http://api.openweathermap.org/data/2.5/forecast?q";
        String apiKey = "&appid=41afbec1ba89050882ba1ef131e6aa72";
        url = url + city + apiKey + "&lang=it&units=metric";

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {

                    JSONArray arrayList = response.getJSONArray("list"); // lista di tutti gli array presenti nel JSON
                    /*
                    //---------------------------------------------------------------------------------------------
                    JSONObject dayOne = arrayList.getJSONObject(0);
                    JSONArray arrayOne = dayOne.getJSONArray("weather"); //primo giorno
                    JSONArray objOne = arrayOne.getJSONObject("main");
                    //---------------------------------------------------------------------------------------------

                    JSONObject dayTwo = arrayList.getJSONObject(1);
                    JSONArray arrayTwo = dayTwo.getJSONArray("weather"); //primo giorno
                    //---------------------------------------------------------------------------------------------
                    JSONObject dayThree = arrayList.getJSONObject(2);
                    JSONArray arrayThree = dayThree.getJSONArray("weather"); //primo giorno


                    //---------------------------------------------------------------------------------------------

                    String tMin = String.valueOf(obj.getString("temp_min"));
                    String tMax = String.valueOf(obj.getString("temp_max"));
                    String code = obj2.getString("id");
                    String temperature = String.valueOf(obj.getInt("temp"));
                    String desc = obj2.getString("description");

                    //---------------------------------------------------------------------------------------------
                */

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
