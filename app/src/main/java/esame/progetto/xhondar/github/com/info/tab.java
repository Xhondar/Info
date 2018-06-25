package esame.progetto.xhondar.github.com.info;


import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class tab extends AppCompatActivity {

    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    public String s;
    private int[] imageResId = {
            R.drawable.ic_one,
            R.drawable.ic_one,
            R.drawable.ic_one,
    R.drawable.ic_one};
    private String tabTitles[] = new String[] { "Meteo", "Locali", "Info", "Mappa" };
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_layout);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setOffscreenPageLimit(4);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        setS(getIntent().getStringExtra("message"));
        getSupportActionBar().setTitle(s);

        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_three).setText("Info"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_two).setText("Locali"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_one).setText("Meteo"));
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.ic_four).setText("Mappa"));

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mSectionsPagerAdapter.addFragment(new tab_info());
        mSectionsPagerAdapter.addFragment(new tab_locale());
        mSectionsPagerAdapter.addFragment(new tab_meteo());
        mSectionsPagerAdapter.addFragment(new tab_mappa());

        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

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

    public void download(){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/open?id=11CbsmykT4GDLd3kdCsJi3pcfBlnR4kQ6")));
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        private final List<Fragment> mFragments = new ArrayList<>();

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }
        @Override
        public int getCount() {
            return mFragments.size();
        }

        public void addFragment(Fragment fragment) {
            mFragments.add(fragment);
        }

    }
}
