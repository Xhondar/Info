package esame.progetto.xhondar.github.com.info;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.VideoView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.w3c.dom.Text;

public class tab_meteo extends Fragment {
    tab t = new tab();
    String s = "";
    public void find_weather(String citta){
        String url = "http://api.openweathermap.org/data/2.5/weather?q=";
        if(citta == "Lubiana")
        {
            citta = "Ljubljana";
        }
        String city = citta ;
        String apiKey = "&appid=41afbec1ba89050882ba1ef131e6aa72";
        url = url + city + apiKey + "&lang=it&units=metric";

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try
                {
                    TextView temp, timeData;
                    temp = (TextView) getActivity().findViewById(R.id.tempMeteo);
                    timeData = (TextView) getActivity().findViewById(R.id.timeDate);

                    ImageView image = (ImageView) getActivity().findViewById(R.id.imageMeteo);
                    int id = getContext().getResources().getIdentifier("rain.gif", "drawable", getContext().getPackageName());
                    image.setId(id);
                    JSONObject obj = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    //JSONObject obj2 = array.getJSONObject(0);

                    String temperature = String.valueOf(obj.getDouble("temp"));
                    //String description = obj2.getString("description");

                    //image.setImageResource(id);

                    temp.setText(temperature);
                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd-MM");
                    String formatted_date = sdf.format(calendar.getTime());

                    timeData.setText(formatted_date);



                }catch(JSONException e)
                {
                    e.printStackTrace();
                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }
        );
        RequestQueue queue = Volley.newRequestQueue(getContext());
        queue.add(jor);
    }

    // -----------------------------------------------------------------------------------------------
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.tabmeteo, container, false);
        t = (tab) getActivity();
        s = t.getS();
        find_weather(s);
        return rootView;

    }
}