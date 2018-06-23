package esame.progetto.xhondar.github.com.info;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;

public class Monumenti extends AppCompatActivity {
    String s = "";
    private ViewPager viewPager;
    private SlideAdapter_monumenti myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monumenti_layout);

        s = getIntent().getStringExtra("message3");

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.gold)));
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewpager_monumenti);
        myadapter = new SlideAdapter_monumenti(this);
        viewPager.setAdapter(myadapter);

    }

    public void setS(String s){this.s=s;}
    public String getS(){return s;}

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}