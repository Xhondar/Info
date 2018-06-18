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
import android.widget.LinearLayout;
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
    String ss = "";

    public void setSS(String sss){
        this.ss = sss;
    }

    public String getSS(){return ss;}

    public void find_weather(String citta){


        final String city = getSS() ;
        String url = "http://api.openweathermap.org/data/2.5/weather?q=";
        String apiKey = "&appid=41afbec1ba89050882ba1ef131e6aa72";
        url = url + city + apiKey + "&lang=it&units=metric";

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try
                {
                    /*android:background="@drawable/logo"*/
                    //TABELLA CODICI CON CORRISPONDENTE CONDIZIONE CLIMATICA

                    /* THUNDERSTORMS / fulmini
                    200	thunderstorm with light rain
                    200	thunderstorm with light rain
                    201	thunderstorm with rain
                    202	thunderstorm with heavy rain
                    210	light thunderstorm
                    211	thunderstorm
                    212	heavy thunderstorm
                    221	ragged thunderstorm
                    230	thunderstorm with light drizzle
                    231	thunderstorm with drizzle
                    232	thunderstorm with heavy drizzle
                    */

                    /* DRIZZLE / pioggerella
                    300	light intensity drizzle
                    301	drizzle
                    302	heavy intensity drizzle
                    310	light intensity drizzle rain
                    311	drizzle rain
                    312	heavy intensity drizzle rain
                    313	shower rain and drizzle
                    314	heavy shower rain and drizzle
                    321	shower drizzle
                    */

                    /* RAIN / pioggia
                    500	light rain
                    501	moderate rain
                    502	heavy intensity rain
                    503	very heavy rain
                    504	extreme rain
                    511	freezing rain
                    520	light intensity shower rain
                    521	shower rain
                    522	heavy intensity shower rain
                    531	ragged shower rain
                    */

                    /* SNOW / neve
                    600	light snow
                    601	snow
                    602	heavy snow
                    611	sleet
                    612	shower sleet
                    615	light rain and snow
                    616	rain and snow
                    620	light shower snow
                    621	shower snow
                    622	heavy shower snow
                     */

                    /* ATMOSPHERE / atmosfera
                    701	mist
                    711	smoke
                    721	haze
                    731	sand, dust whirls
                    741	fog
                    751	sand
                    761	dust
                    762	volcanic ash
                    771	squalls
                    781	tornado
                     */

                    /* CLOUDS / nuvole
                    800 clear sky
                    801	few clouds
                    802	scattered clouds
                    803	broken clouds
                    804	overcast clouds
                     */

                    TextView temp, timeData,temperaturaMin, temperaturaMax, nomeCitta, descrizione;
                    temp = (TextView) getActivity().findViewById(R.id.tempMeteo);
                    temperaturaMin = (TextView) getActivity().findViewById(R.id.tempMin);
                    temperaturaMax = (TextView) getActivity().findViewById(R.id.tempMax);
                    timeData = (TextView) getActivity().findViewById(R.id.timeDate);
                    nomeCitta = (TextView) getActivity().findViewById(R.id.cityName);
                    descrizione = (TextView) getActivity().findViewById(R.id.description);

                    ImageView image = (ImageView) getActivity().findViewById(R.id.weatherPicture);

                    image.setImageResource(R.drawable.clouds);

                    JSONObject obj = response.getJSONObject("main");
                    JSONArray array = response.getJSONArray("weather");
                    JSONObject obj2 = array.getJSONObject(0);

                    Calendar calendar = Calendar.getInstance();
                    SimpleDateFormat sdf = new SimpleDateFormat("EEEE dd MMMM");
                    String formatted_date = sdf.format(calendar.getTime());

                    String tMin = String.valueOf(obj.getString("temp_min"));
                    String tMax = String.valueOf(obj.getString("temp_max"));
                    String code = obj2.getString("id");
                    String temperature = String.valueOf(obj.getInt("temp"));
                    String desc = obj2.getString("description");

                    if(Integer.parseInt(code) >= 200 || Integer.parseInt(code) <= 232) // fulmini
                    {
                        image.setImageResource(R.drawable.thunderstorm);
                        /*LinearLayout l = (LinearLayout) getActivity().findViewById(R.id.constraintLayout);
                        l.setBackgroundResource(R.drawable.berlino);*/
                    }

                    if(Integer.parseInt(code) >= 300 || Integer.parseInt(code) <= 321) // pioggerella
                    {
                        image.setImageResource(R.drawable.rain);

                    }

                    if(Integer.parseInt(code) >= 500 || Integer.parseInt(code) <= 531) // pioggia
                    {
                        image.setImageResource(R.drawable.rain);
                        /*LinearLayout l = (LinearLayout) getActivity().findViewById(R.id.constraintLayout);
                        l.setBackgroundResource(R.drawable.berlino);*/
                    }

                    if(Integer.parseInt(code) >= 600 || Integer.parseInt(code) <= 622) // neve
                    {
                        image.setImageResource(R.drawable.snow);

                    }

                    if(Integer.parseInt(code) >= 701 || Integer.parseInt(code) <= 781) // atmosfera
                    {
                        image.setImageResource(R.drawable.mist);

                    }


                    if(Integer.parseInt(code) == 800 ) // atmosfera
                    {
                        image.setImageResource(R.drawable.sun);

                    }

                    if(Integer.parseInt(code) >= 801 || Integer.parseInt(code) <= 804) // atmosfera
                    {
                        image.setImageResource(R.drawable.sun1);

                    }

                    temp.setText(temperature + "°");
                    temperaturaMin.setText("Min " + tMin + "°");
                    temperaturaMax.setText("Max " + tMax + "°");
                    timeData.setText(formatted_date);
                    nomeCitta.setText(t.getS());
                    descrizione.setText(desc);



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
        String s =t.getS();
        switch (s){
            case "Lubiana": setSS("Ljubljana"); break;
            case "Norimberga": setSS("Nuremberg"); break;
            default: setSS(s); break;
        }

        find_weather(getSS());

        return rootView;

    }
}