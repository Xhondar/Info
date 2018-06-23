package esame.progetto.xhondar.github.com.info;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

    public class Piatti extends AppCompatActivity {
        String s = "";
        private ViewPager viewPager;
        private SlideAdapter_piatti myadapter;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.piatti_layout);

            s = getIntent().getStringExtra("message4");

            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.green)));
            getSupportActionBar().setDisplayShowHomeEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

            viewPager = findViewById(R.id.viewpager_piatti);
            myadapter = new SlideAdapter_piatti(this);
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