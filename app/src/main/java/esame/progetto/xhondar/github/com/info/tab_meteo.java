package esame.progetto.xhondar.github.com.info;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tab_meteo extends Fragment {
    tab t = new tab();
    String s = "";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.tabmeteo, container, false);
        t = (tab) getActivity();
        s = t.getS();

        return rootView;

    }
}