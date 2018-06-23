package esame.progetto.xhondar.github.com.info;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class tab_info extends Fragment {
    tab t = new tab();
    String s = "";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.tabinfo, container, false);

        t = (tab) getActivity();
        s = t.getS();

        CardView cardView_info = (CardView) view.findViewById(R.id.info);
        cardView_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), Info.class);
                i.putExtra("message1", s);
                startActivity(i);
            }
        });

        CardView cardView_storia = (CardView) view.findViewById(R.id.storia);
        cardView_storia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ii = new Intent(getContext(), Storia.class);
                ii.putExtra("message2", s);
                startActivity(ii);
            }
        });

        CardView cardView_monumenti = (CardView) view.findViewById(R.id.monumenti);
        cardView_monumenti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iii = new Intent(getContext(), Monumenti.class);
                iii.putExtra("message3", s);
                startActivity(iii);
            }
        });

        CardView cardView_piatti = (CardView) view.findViewById(R.id.piatti);
        cardView_piatti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iiii = new Intent(getContext(), Piatti.class);
                iiii.putExtra("message4", s);
                startActivity(iiii);
            }
        });

        return view;

    }
}
