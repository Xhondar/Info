package esame.progetto.xhondar.github.com.info;


import android.app.DownloadManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class tab extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    public String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(3);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        setS(getIntent().getStringExtra("message"));
        getSupportActionBar().setTitle(s);


    }

    public void setS(String ss){
        s=ss;
    }

    public String getS(){
        return s;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            comunication();
            download();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void comunication(){
        Toast.makeText(this, "Download...", Toast.LENGTH_SHORT).show();
    }

    long queueid;
    DownloadManager dm;
    public void download(){
        //"https://drive.google.com/open?id=11CbsmykT4GDLd3kdCsJi3pcfBlnR4kQ6"
        dm = (DownloadManager) getSystemService(DOWNLOAD_SERVICE);
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse("https://drive.google.com/open?id=11CbsmykT4GDLd3kdCsJi3pcfBlnR4kQ6"));
        queueid = dm.enqueue(request);
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position)
            {
                case 0:
                    tab_meteo tm = new tab_meteo();
                    return tm;
                case 1:
                    tab_locale tl = new tab_locale();
                    return tl;
                case 2:
                    tab_info ti = new tab_info();
                    return ti;
                case 3:
                    tab_mappa tmp = new tab_mappa();
                    return tmp;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return 4;
        }

        @Override
        public CharSequence getPageTitle(int position){
            switch (position)
            {
                case 0:
                    return "Meteo";
                case 1:
                    return "Locali";
                case 2:
                    return "InfoCittà";
                case 3:
                    return "Mappa";
            }
            return null;
        }
    }
}
