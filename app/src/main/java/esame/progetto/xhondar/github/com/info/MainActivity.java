package esame.progetto.xhondar.github.com.info;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.support.v7.widget.Toolbar;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.dd.CircularProgressButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Button button;
    public String s;
    CircularProgressButton circularProgressButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner  = (Spinner) findViewById(R.id.spin);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.cities, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        setS(spinner.getSelectedItem().toString());

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, tab.class);
                intent.putExtra("message", getS());
                startActivity(intent);
            }
        });
/*
        circularProgressButton = (CircularProgressButton) findViewById(R.id.cpbLogin);

        circularProgressButton.setIndeterminateProgressMode(true);

        circularProgressButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(circularProgressButton.getProgress()==0)
                {
                    circularProgressButton.setProgress(30);
                }
                else if (circularProgressButton.getProgress()==-1)
                {
                    circularProgressButton.setProgress(0);
                }
                else if (circularProgressButton.getProgress()==100)
                {
                    Intent intent = new Intent(MainActivity.this, tab.class);
                    intent.putExtra("message", getS());
                    startActivity(intent);
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        if(etUserName.getText().toString().equals("appeteria") && etPassword.getText().toString().equals("123"))
                        {
                            circularProgressButton.setProgress(100);
                        }
                        else
                        {
                            circularProgressButton.setProgress(-1);
                        }
                    }
                },3000);
            }
        });*/
    }

    public void setS(String ss){
        s=ss;
    }

    public String getS(){
        return s;
    }

    int i = 0;
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String sSelected = parent.getItemAtPosition(position).toString();
        if(i==0){

        }else {
            Toast.makeText(this, sSelected, Toast.LENGTH_SHORT).show();
        }
        i++;
        setS(parent.getItemAtPosition(position).toString());
        ImageView img = (ImageView)findViewById(R.id.image);
        Drawable d;

        switch (s){
            case "Carpi": d = getResources().getDrawable(R.drawable.carpi); img.setImageDrawable(d); break;
            case "Berlino": d = getResources().getDrawable(R.drawable.berlino); img.setImageDrawable(d); break;
            case "Trieste": d = getResources().getDrawable(R.drawable.trieste); img.setImageDrawable(d); break;
            case "Lubiana": d = getResources().getDrawable(R.drawable.lubiana); img.setImageDrawable(d); break;
            case "Norimberga": d = getResources().getDrawable(R.drawable.norimberga); img.setImageDrawable(d); break;
            default: break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}