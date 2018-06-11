package esame.progetto.xhondar.github.com.info;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class tab_locale extends Fragment {
    String[] name_carpi = {"Il Barolino", "Pooja", "L'Incontro", "L'Oste", "Clorofilla", "Pepe Rosa", "IL 25", "La Perla", "Narciso", "Il Carducci"};
    String[] address_carpi = {"P.Giovanni XXIII, n°110", "Karl Marx, n°3", "delle Magliaie, n°4/1", "I.Martinelli, n° 65", " V.Veneto, n°2", "Guastalla, n°32/A", "San Francesco, n°20", " G.Leopardi, n°44", "S.S. 468 Motta", "Carducci, n°16"};
    String[] number_carpi = {"059654327", "059645345", "3391852095", "059681260", "059688277", "3393248699", "059645248", "0596229202", "3938794963", "0596229518"};
    String[] description_carpi = {"Mediterranea", "Indiana, Vegana", "Pesce, Mediterranea", "Vegetariana, Vegana", "Barbecue, Mediterranea", "Italiana", "Pesce, Mediterranea", "Pizza", "Pizza, Pesce", "Mediterranea"};

    String[] name_berlino = {"Boetzow Privat", "Häppies", "Eselin von A.", "Langosch", "Skykitchen", "Mabuhay", "Zur Haxe", "Gaffel Haus", "Kurpfalz", "FACIL"};
    String[] address_berlino = {"Linienstr. 113", "Dunckerstr. 85", "Wannseebadweg 55", "Petersburger Platz 1", "L.Allee 106", "Koethener Str. 28", "Erich-Weinert-Str. 128", "Dorotheenstr. 65", "Wilmersdorfer Str. 93", "Potsdamer Str. 3"};
    String[] number_berlino = {"3028095390", "15114984140", "302141284", "3042808100", "304530532620", "302651867", "304216312", "30 31011693", "308836664", "30590051234"};
    String[] description_berlino = {"Vegetariana", "Fusion", "Pesce, Mediterranea", "Vegetariana", "Vegetariana, Vegana", "Asiatica, Vegetariana", "Tedesca", "Grill, Salutistica", "Tedesca, Europea", "Opzioni senza glutine"};

    String[] name_lubiana = {"Presnica", "Fari's Delice", "Gostilna Dela", "Odprta Kuhna", "Klobasarna", "Hood Burger", "Druga Violina", "Das ist Valter", "Sarajevo '84", "Zbornica"};
    String[] address_lubiana = {"Presernov trg 2", "M. cesta 34", "Poljanska cesta 7", "Pogacharjev trg 1", "Ciril-Metodov trg 15", "Jamova cesta 105", "Stari trg 21", "Njegosheva cesta 10", "Nazorjeva ulica 12", "Rimska cesta 13"};
    String[] number_lubiana = {"40797887", "40825533", "59925446", "//", "51605017", "40540411", "82052506", "915895866", "14257106", "40583355"};
    String[] description_lubiana = {"Salutistica", "Mediorientale", "Mediterranea", "Giapponese", "Europea", "Americana", "Centro-Europea", "Esteuropea", "Barbecue, Europea", "Americana"};

    String[] name_trieste = {"T. speranza", "T. Nerodiseppia", "Osteria Voliga", "Tavernetta", "Hostaria", "O. Maestri", "O. Tempo Perso", "Menarosti", "Spazzacamino", "JOIA"};
    String[] address_trieste = {"dell'Istria, n°64/A", "Luigi Cadorna, n°23", "della Fornace, n°1", "G. R. M. E C., n°11", "Dell'Eremo, n°243", "della Sorgente, n°6", " Boccaccio, n°20", "del Toro, n°12", "d.Settefontane, n°68", "diaz, n°1"};
    String[] number_trieste = {"040762624", "040301377", "040309606", "040224275", "040910979", "040636801", "3285319928", "040661077", "040945160", "0403478940"};
    String[] description_trieste = {"Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea", "Pesce, Mediterranea"};

    String[] name_norimberga = {"Troedelstuben", "Albrecht D. S.", "Bohm's H.", "Hutt'n E.& T.", "Nurnberger A.", "Z. Albrecht D. H.", "Schaufelewart", "Hausbrauerei A.", "kopernikus", "Gaststatte K. B."};
    String[] address_norimberga = {"Troedelmarkt 30", "Albrecht-Duerer-Str. 6", "Theatergasse 19", "Bergstr. 20", "Burgstr. 19", "O. Schmiedgasse 58", "Schweiggerstr. 19", "Bergstr. 19", "H. Insel Schuett 34", "Obere Woerthstr. 2"};
    String[] number_norimberga = {"91136772767", "911227209", "911224465", "9112019881", "911507169", "91121144940", "9114597325", "9112449859", "9112427740", "9112373171"};
    String[] description_norimberga = {"Vegetariana", "Centro-Europea", "Centro-Europea", "Centro-Europea", "Bar, Europea", "Centro-Europea", "Gastronomia", "Bar, Pub", "Tedesca, Polacca", "Centro-Europea"};

    String[] link_carpi = {"https://www.tripadvisor.it/Restaurant_Review-g670816-d2474842-Reviews-Il_Barolino-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d2653654-Reviews-Pooja-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d2235927-Reviews-Ristorante_L_Incontro-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g4442668-d3242841-Reviews-Ristorante_L_Oste-Fossoli_Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d2640640-Reviews-Clorofilla-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d2039414-Reviews-Ristorante_Pepe_Rosa-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d1905649-Reviews-Ristorante_Il_25-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d3469119-Reviews-LA_PERLA_Pizzeria_da_asporto-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d7347174-Reviews-Narciso_Ristorante-Carpi_Province_of_Modena_Emilia_Romagna.html", "https://www.tripadvisor.it/Restaurant_Review-g670816-d2301997-Reviews-Il_Carducci-Carpi_Province_of_Modena_Emilia_Romagna.html"};
    String[] link_berlino = {"https://www.tripadvisor.it/Restaurant_Review-g187323-d1837132-Reviews-Boetzow_Privat-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d8025081-Reviews-Happies-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d2456695-Reviews-Club_Restaurant_Das_Team_Die_Eselin_von_A-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d10376233-Reviews-Restaurant_Langosch-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d4261461-Reviews-Skykitchen-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d3422489-Reviews-Mabuhay_Indonesian_Restaurant-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d1344170-Reviews-Zur_Haxe-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d2071216-Reviews-Gaffel_Haus_Berlin-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d1341765-Reviews-Kurpfalz_Weinstuben-Berlin.html", "https://www.tripadvisor.it/Restaurant_Review-g187323-d695657-Reviews-FACIL-Berlin.html"};
    String[] link_lubiana = {"https://www.tripadvisor.it/Restaurant_Review-g274873-d12222815-Reviews-Presnica_Take_Away_Center_vegan_and_vegetarian-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d8763649-Reviews-Fari_s_Delice-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d4449974-Reviews-Gostilna_Dela-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d8262021-Reviews-Odprta_Kuhna-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d4497616-Reviews-Klobasarna-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d4216760-Reviews-Hood_Burger-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d3341082-Reviews-Druga_Violina-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d3242588-Reviews-Das_ist_Valter-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d4520377-Reviews-Sarajevo_84-Ljubljana_Upper_Carniola_Region.html", "https://www.tripadvisor.it/Restaurant_Review-g274873-d12930051-Reviews-Zbornica-Ljubljana_Upper_Carniola_Region.html"};
    String[] link_trieste = {"https://www.tripadvisor.it/Restaurant_Review-g187813-d8505168-Reviews-Trattoria_alla_Speranza-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d1901612-Reviews-Trattoria_Nerodiseppia-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d1131945-Reviews-Osteria_di_Mare_Alla_Voliga-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d1872239-Reviews-Tavernetta_al_Molo-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d1157788-Reviews-Hostaria_Ai_3_Magnoni-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d4104847-Reviews-Osteria_Ai_Maestri-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d5002888-Reviews-Osteria_Al_Tempo_Perso-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d1898779-Reviews-Ristorante_Menarosti-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d2406838-Reviews-Antico_Spazzacamino-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html", "https://www.tripadvisor.it/Restaurant_Review-g187813-d6598095-Reviews-Joia-Trieste_Province_of_Trieste_Friuli_Venezia_Giulia.html"};
    String[] link_norimberga = {"https://www.tripadvisor.it/Restaurant_Review-g187310-d1345365-Reviews-Troedelstuben-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d1785466-Reviews-Albrecht_Durer_Stube-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d1353630-Reviews-Bohm_s_Herrenkeller-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d1963787-Reviews-Hutt_n_Essen_Trinken-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d3750686-Reviews-Nurnberger_Alm-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d3669346-Reviews-Zum_Albrecht_Duerer_Haus-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d1344261-Reviews-Schaeufelewaertschaft-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d1340354-Reviews-Hausbrauerei_Altstadthof-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d2103502-Reviews-Restauration_Kopernikus-Nuremberg_Middle_Franconia_Franconia_Bavaria.html", "https://www.tripadvisor.it/Restaurant_Review-g187310-d964198-Reviews-Gaststatte_Karl_s_Bruckla-Nuremberg_Middle_Franconia_Franconia_Bavaria.html"};

    tab t = new tab();
    String s = "";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View rootView = inflater.inflate(R.layout.tablocali, container, false);
        t = (tab) getActivity();
        s = t.getS();

        ListView listView = rootView.findViewById(R.id.list);
        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Uri link;
                Intent intent;
                switch (s){
                    case "Carpi":
                        link = Uri.parse(link_carpi[position]);
                        intent = new Intent(Intent.ACTION_VIEW, link);
                        startActivity(intent);
                        break;
                    case "Berlino":
                        link = Uri.parse(link_berlino[position]);
                        intent = new Intent(Intent.ACTION_VIEW, link);
                        startActivity(intent);
                        break;
                    case "Norimberga":
                        link = Uri.parse(link_norimberga[position]);
                        intent = new Intent(Intent.ACTION_VIEW, link);
                        startActivity(intent);
                        break;
                    case "Lubiana":
                        link = Uri.parse(link_lubiana[position]);
                        intent = new Intent(Intent.ACTION_VIEW, link);
                        startActivity(intent);
                        break;
                    case "Trieste":
                        link = Uri.parse(link_trieste[position]);
                        intent = new Intent(Intent.ACTION_VIEW, link);
                        startActivity(intent);
                        break;
                    default: break;
                }

            }
        });

        return rootView;
    }

    String[] images_1;
    String[] images_2;

    class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return name_carpi.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        private  Bitmap readImageFromAssets_1(String path) {
            Bitmap bmp;
            try {
                InputStream stream = getContext().getAssets().open(path, Context.MODE_PRIVATE);
                bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(stream), 400, 400, true);
            } catch (Exception ignore) {
                bmp = null;
            }
            return bmp;
        }
        private  Bitmap readImageFromAssets_2(String path) {
            Bitmap bmp;
            try {
                InputStream stream = getContext().getAssets().open(path, Context.MODE_PRIVATE);
                bmp = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(stream), 615, 325, true);
            } catch (Exception ignore) {
                bmp = null;
            }
            return bmp;
        }

        @Override
        public View getView(int i, View view, ViewGroup parent) {
            view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,null);

            ImageView imageView1 = view.findViewById(R.id.image1);
            ImageView imageView2 = view.findViewById(R.id.image2);
            TextView textView1 = view.findViewById(R.id.name);
            TextView textView2 = view.findViewById(R.id.address);
            TextView textView3 = view.findViewById(R.id.number);
            TextView textView4 = view.findViewById(R.id.description);
            try {
                images_1 = getContext().getAssets().list(s.toLowerCase() + "_stelle");
                imageView1.setImageBitmap(readImageFromAssets_1(s.toLowerCase() + "_stelle/" + images_1[i]));
                images_2 = getContext().getAssets().list(s.toLowerCase());
                imageView2.setImageBitmap(readImageFromAssets_2(s.toLowerCase() + "/" + images_2[i]));
            } catch (IOException e) {
            }
            switch(s){
                case "Carpi":
                    textView1.setText(name_carpi[i]);
                    textView2.setText(address_carpi[i]);
                    textView3.setText(number_carpi[i]);
                    textView4.setText(description_carpi[i]);
                    break;
                case "Berlino":
                    textView1.setText(name_berlino[i]);
                    textView2.setText(address_berlino[i]);
                    textView3.setText(number_berlino[i]);
                    textView4.setText(description_berlino[i]);
                    break;
                case "Lubiana":
                    textView1.setText(name_lubiana[i]);
                    textView2.setText(address_lubiana[i]);
                    textView3.setText(number_lubiana[i]);
                    textView4.setText(description_lubiana[i]);
                    break;
                case "Trieste":
                    textView1.setText(name_trieste[i]);
                    textView2.setText(address_trieste[i]);
                    textView3.setText(number_trieste[i]);
                    textView4.setText(description_trieste[i]);
                    break;
                case "Norimberga":
                    textView1.setText(name_norimberga[i]);
                    textView2.setText(address_norimberga[i]);
                    textView3.setText(number_norimberga[i]);
                    textView4.setText(description_norimberga[i]);
                    break;
                default: break;
            }

            return view;
        }
    }
}