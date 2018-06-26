package esame.progetto.xhondar.github.com.info;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.Window;

public class Info extends AppCompatActivity {
    String s = "";
    private ViewPager viewPager;
    private SlideAdapter_info myadapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_layout);
        Window w = this.getWindow();
        w.setStatusBarColor(this.getResources().getColor(R.color.blue));
        s = getIntent().getStringExtra("message1");

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.blue)));
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = findViewById(R.id.viewpager_info);
        myadapter = new SlideAdapter_info(this);
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