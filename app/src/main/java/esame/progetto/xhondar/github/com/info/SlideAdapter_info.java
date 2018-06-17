package esame.progetto.xhondar.github.com.info;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class SlideAdapter_info extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public String txt1_carpi = "Italia";
    public String txt2_carpi = "Carpigiani";
    public String txt3_carpi = "Italiano";
    public String txt4_carpi = "059";
    public String txt5_carpi = "131,54 km²";
    public String txt6_carpi = "71.033";
    public String txt7_carpi = "540,01 ab./km²";

    public String txt1_berlino = "Germania";
    public String txt2_berlino = "Berlinesi";
    public String txt3_berlino = "Tedesco";
    public String txt4_berlino = "030";
    public String txt5_berlino = "891,12 km²";
    public String txt6_berlino = "3.531.201";
    public String txt7_berlino = "3.962,65 ab./km";

    public String txt1_lubiana = "Slovenia";
    public String txt2_lubiana = "Lubianesi";
    public String txt3_lubiana = "Sloveno";
    public String txt4_lubiana = "386";
    public String txt5_lubiana = "163,8 km²";
    public String txt6_lubiana = "287.218";
    public String txt7_lubiana = "1.753,47 ab./km²";

    public String txt1_trieste = "Italia";
    public String txt2_trieste = "Triestini";
    public String txt3_trieste = "Italiano/Sloveno";
    public String txt4_trieste = "040";
    public String txt5_trieste = "85,11 km²";
    public String txt6_trieste = "204.347";
    public String txt7_trieste = "2.400,98 ab./km²";

    public String txt1_norimberga = "Germania";
    public String txt2_norimberga = "Norimberghesi";
    public String txt3_norimberga = "Tedesco";
    public String txt4_norimberga = "49";
    public String txt5_norimberga = "186,38 km²";
    public String txt6_norimberga = "511.628";
    public String txt7_norimberga = "2.745,08 ab./km²";

    public SlideAdapter_info(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return 1;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view==(ScrollView)object);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ScrollView)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide_info, container, false);

        LinearLayout layoutslide = view.findViewById(R.id.slidelinear_info);
        //layoutslide.setBackgroundColor(Color.rgb(55, 55, 55));



        Info i = new Info();
        i = (Info) view.getContext();
        String s = i.getS();

        ImageView img = view.findViewById(R.id.slideimg);
        TextView t = view.findViewById(R.id.txttitle);
        TextView t1 = view.findViewById(R.id.txt1);
        TextView t2 = view.findViewById(R.id.txt2);
        TextView t3 = view.findViewById(R.id.txt3);
        TextView t4 = view.findViewById(R.id.txt4);
        TextView t5 = view.findViewById(R.id.txt5);
        TextView t6 = view.findViewById(R.id.txt6);
        TextView t7 = view.findViewById(R.id.txt7);

        t.setText(s);

        switch (s){
            case "Carpi":
                img.setImageResource(R.drawable.stemma_carpi);
                t1.setText(txt1_carpi);
                t2.setText(txt2_carpi);
                t3.setText(txt3_carpi);
                t4.setText(txt4_carpi);
                t5.setText(txt5_carpi);
                t6.setText(txt6_carpi);
                t7.setText(txt7_carpi);
                break;
            case "Berlino":
                img.setImageResource(R.drawable.stemma_berlino);
                t1.setText(txt1_berlino);
                t2.setText(txt2_berlino);
                t3.setText(txt3_berlino);
                t4.setText(txt4_berlino);
                t5.setText(txt5_berlino);
                t6.setText(txt6_berlino);
                t7.setText(txt7_berlino);
                break;
            case "Lubiana":
                img.setImageResource(R.drawable.stemma_lubiana);
                t1.setText(txt1_lubiana);
                t2.setText(txt2_lubiana);
                t3.setText(txt3_lubiana);
                t4.setText(txt4_lubiana);
                t5.setText(txt5_lubiana);
                t6.setText(txt6_lubiana);
                t7.setText(txt7_lubiana);
                break;
            case "Trieste":
                img.setImageResource(R.drawable.stemma_trieste);
                t1.setText(txt1_trieste);
                t2.setText(txt2_trieste);
                t3.setText(txt3_trieste);
                t4.setText(txt4_trieste);
                t5.setText(txt5_trieste);
                t6.setText(txt6_trieste);
                t7.setText(txt7_trieste);
                break;
            case "Norimberga":
                img.setImageResource(R.drawable.stemma_norimberga);
                t1.setText(txt1_norimberga);
                t2.setText(txt2_norimberga);
                t3.setText(txt3_norimberga);
                t4.setText(txt4_norimberga);
                t5.setText(txt5_norimberga);
                t6.setText(txt6_norimberga);
                t7.setText(txt7_norimberga);
                break;
            default: break;
        }

        container.addView(view);
        return view;
    }
}
