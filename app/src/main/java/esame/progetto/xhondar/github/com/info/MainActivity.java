package esame.progetto.xhondar.github.com.info;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

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
        InputStream ims;
        Drawable d;

        switch (getS()){
            case "Carpi":
                try {
                    ims = getAssets().open("carpi.webp");
                    d = Drawable.createFromStream(ims, null);
                    img.setImageDrawable(d);
                    ims .close();
                } catch(IOException ex) { }
                break;
            case "Berlino":
                try {
                    ims = getAssets().open("berlino.webp");
                    d = Drawable.createFromStream(ims, null);
                    img.setImageDrawable(d);
                    ims .close();
                } catch(IOException ex) { }
                break;
            case "Trieste":
                try {
                    ims = getAssets().open("trieste.webp");
                    d = Drawable.createFromStream(ims, null);
                    img.setImageDrawable(d);
                    ims .close();
                } catch(IOException ex) { }
                break;
            case "Norimberga":
                try {
                    ims = getAssets().open("norimberga.webp");
                    d = Drawable.createFromStream(ims, null);
                    img.setImageDrawable(d);
                    ims .close();
                } catch(IOException ex) { }
                break;
            case "Lubiana":
                try {
                    ims = getAssets().open("lubiana.webp");
                    d = Drawable.createFromStream(ims, null);
                    img.setImageDrawable(d);
                    ims .close();
                } catch(IOException ex) { }
                break;
            default: break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}