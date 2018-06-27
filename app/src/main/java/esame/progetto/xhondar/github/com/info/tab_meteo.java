package esame.progetto.xhondar.github.com.info;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

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

public class tab_meteo extends Fragment {
    tab t = new tab();
    String ss = "";
    Calendar calendar = Calendar.getInstance();
    Dialog myDialog;

    public void setSS(String sss) {
        this.ss = sss;
    }

    public String getSS() {
        return ss;
    }


    //--------------------------------------------------
    public int hour(){
        int hour = calendar.get(calendar.HOUR_OF_DAY);
        return hour;
    }

    public String dayMoment() {


        if (hour() == 22 || hour() == 23 || hour() == 24 || hour() == 00 || hour() == 0 || hour() == 1 || hour() == 2 || hour() == 3 || hour() == 4 || hour() == 5 || hour() == 6) {
            return "night";
        } else {
            return "day";
        }
    }

    public void setBackgroundDay() {
        LinearLayout linearLayout;
        linearLayout = (LinearLayout) getView().findViewById(R.id.backgroundImage);
        linearLayout.setBackgroundResource(R.drawable.day);
        switch (dayMoment()) {
            case "day":
                setColorDay();
                break;
            case "night":
                setColorNight();
                break;
            default:
                setColorDay();
                break;
        }
    }

    public void setBackgroundNight() {
        LinearLayout linearLayout;
        linearLayout = (LinearLayout) getView().findViewById(R.id.backgroundImage);
        linearLayout.setBackgroundResource(R.drawable.night);
    }

    public void setColorNight() {
        TextView temp, timeData, nomeCitta, descrizione;
        temp = (TextView) getActivity().findViewById(R.id.tempMeteo);
        timeData = (TextView) getActivity().findViewById(R.id.timeDate);
        nomeCitta = (TextView) getActivity().findViewById(R.id.cityName);
        descrizione = (TextView) getActivity().findViewById(R.id.detail);

        descrizione.setTextColor(Color.parseColor("#ffffff"));
        temp.setTextColor(Color.parseColor("#ffffff"));
        timeData.setTextColor(Color.parseColor("#ffffff"));
        nomeCitta.setTextColor(Color.parseColor("#ffffff"));
    }

    public void setColorDay() {
        TextView temp, timeData, nomeCitta, descrizione;
        temp = (TextView) getActivity().findViewById(R.id.tempMeteo);
        timeData = (TextView) getActivity().findViewById(R.id.timeDate);
        nomeCitta = (TextView) getActivity().findViewById(R.id.cityName);
        descrizione = (TextView) getActivity().findViewById(R.id.detail);

        descrizione.setTextColor(Color.parseColor("#000000"));
        temp.setTextColor(Color.parseColor("#000000"));
        timeData.setTextColor(Color.parseColor("#000000"));
        nomeCitta.setTextColor(Color.parseColor("#000000"));
    }

    public void find_weather(String citta) {


        final String city = getSS();
        String url = "http://api.openweathermap.org/data/2.5/weather?q=";
        String apiKey = "&appid=41afbec1ba89050882ba1ef131e6aa72";
        url = url + city + apiKey + "&lang=it&units=metric";

        JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    TextView temp, timeData, temperaturaMin, temperaturaMax, nomeCitta, details;
                    temp = (TextView) getActivity().findViewById(R.id.tempMeteo);
                    temperaturaMin = (TextView) getActivity().findViewById(R.id.tempMin);
                    temperaturaMax = (TextView) getActivity().findViewById(R.id.tempMax);
                    timeData = (TextView) getActivity().findViewById(R.id.timeDate);
                    nomeCitta = (TextView) getActivity().findViewById(R.id.cityName);
                    details = (TextView) getActivity().findViewById(R.id.detail);

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

                    switch (dayMoment()) {
                        case "day":
                            setColorDay();
                            break;
                        case "night":
                            setColorNight();
                            break;
                        default:
                            setColorDay();
                            break;
                    }
                    if (Integer.parseInt(code) >= 200 && Integer.parseInt(code) <= 232) // fulmini
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon_thunder);
                        } else {
                            image.setImageResource(R.drawable.thunderstorm);
                        }
                    }

                    if (Integer.parseInt(code) >= 300 && Integer.parseInt(code) <= 321) // pioggerella
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon_rain);
                        } else {
                            image.setImageResource(R.drawable.rain);
                        }
                    }

                    if (Integer.parseInt(code) >= 500 && Integer.parseInt(code) <= 531) // pioggia
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon_rain);
                        } else {
                            image.setImageResource(R.drawable.rain);
                        }
                    }

                    if (Integer.parseInt(code) >= 600 && Integer.parseInt(code) <= 622) // neve
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon_snow);
                        } else {
                            image.setImageResource(R.drawable.snow);
                        }
                    }

                    if (Integer.parseInt(code) >= 701 && Integer.parseInt(code) <= 781) // atmosfera, nebbia
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon_fog);
                        } else {
                            image.setImageResource(R.drawable.mist);
                        }
                    }


                    if (Integer.parseInt(code) == 800) // atmosfera
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon);
                        } else {
                            image.setImageResource(R.drawable.sun);
                        }
                    }

                    if (Integer.parseInt(code) >= 801 && Integer.parseInt(code) <= 804) // atmosfera, nuvole sparse, poche nuvole ecc
                    {
                        if (dayMoment() == "night") {
                            image.setImageResource(R.drawable.moon_clouds);
                        } else {
                            image.setImageResource(R.drawable.sun1);
                        }
                    }

                    temp.setText(temperature + "°C");
                    temperaturaMin.setText("Min " + tMin + "°");
                    temperaturaMax.setText("Max " + tMax + "°");
                    timeData.setText(formatted_date);
                    nomeCitta.setText(t.getS());
                    details.setText(String.valueOf(desc));

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
        RequestQueue queue = Volley.newRequestQueue(getContext());
        queue.add(jor);
    }

    public void createIntent(){
        Intent intent = new Intent(getActivity(), custompopup.class);
        startActivity(intent);
    }

    public void openPopup(){
        Button btn;
        btn = (Button) getActivity().findViewById(R.id.previsioni);

        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                createIntent();
            }
        });

    }

    // -----------------------------------------------------------------------------------------------
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tabmeteo, container, false);


        t = (tab) getActivity();
        String s = t.getS();
        switch (s) {
            case "Lubiana":
                setSS("Ljubljana");
                break;
            case "Norimberga":
                setSS("Nuremberg");
                break;
            default:
                setSS(s);
                break;
        }

        find_weather(getSS());

        return rootView;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        switch (dayMoment()) {
            case "day":
                setBackgroundDay();
                break;
            case "night":
                setBackgroundNight();
                break;
            default:
                setBackgroundDay();
                break;
        }
        openPopup();
    }
}