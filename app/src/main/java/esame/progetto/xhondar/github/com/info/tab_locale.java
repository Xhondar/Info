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
import android.util.Log;
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
    private static final String TAG = "tab_locale";

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

        Log.d(TAG, "onCreate: Started.");

        ListView listView = (ListView) rootView.findViewById(R.id.list);

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

        switch (s){
            case "Carpi":
                Local zero_carpi = new Local("Il Barolino", "P.Giovanni XXIII, n°110", "059654327", "Mediterranea", "drawable://" + R.drawable.carpi_tablocali_barolino, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local uno_carpi = new Local("Pooja", "Karl Marx, n°3", "059645345", "Indiana, Vegana", "drawable://" + R.drawable.carpi_tablocali_pooja, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local due_carpi = new Local("L'Incontro", "delle Magliaie, n°4/1", "3391852095", "Pesce, Mediterranea", "drawable://" + R.drawable.carpi_tablocali_lincontro, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local tre_carpi = new Local("L'Oste", "I.Martinelli, n° 65", "059681260", "Vegetariana, Vegana", "drawable://" + R.drawable.carpi_tablocali_loste, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local quattro_carpi = new Local("Clorofilla", " V.Veneto, n°2", "059688277", "Barbecue, Mediterranea", "drawable://" + R.drawable.carpi_tablocali_clorofilla, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local cinque_carpi = new Local("Pepe Rosa", "Guastalla, n°32/A", "3393248699", "Italiana", "drawable://" + R.drawable.carpi_tablocali_peperosa, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sei_carpi = new Local("IL 25", "San Francesco, n°20", "059645248", "Pesce, Mediterranea", "drawable://" + R.drawable.carpi_tablocali_il25, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sette_carpi = new Local("La Perla", "G.Leopardi, n°44", "0596229202", "Pizza", "drawable://" + R.drawable.carpi_tablocal_laperla, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local otto_carpi = new Local("Narciso", "S.S. 468 Motta", "3938794963", "Pizza, Pesce", "drawable://" + R.drawable.carpi_tablocal_narciso, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local nove_carpi = new Local("Il Carducci", "Carducci, n°16", "0596229518", "Mediterranea", "drawable://" + R.drawable.carpi_tablocal_carducci, "drawable://" + R.drawable.quattro_stelle);

                ArrayList<Local> localList_carpi = new ArrayList<>();
                localList_carpi.add(zero_carpi);
                localList_carpi.add(uno_carpi);
                localList_carpi.add(due_carpi);
                localList_carpi.add(tre_carpi);
                localList_carpi.add(quattro_carpi);
                localList_carpi.add(cinque_carpi);
                localList_carpi.add(sei_carpi);
                localList_carpi.add(sette_carpi);
                localList_carpi.add(otto_carpi);
                localList_carpi.add(nove_carpi);

                LocalListAdapter adapter_carpi = new LocalListAdapter(getContext(), R.layout.list_item, localList_carpi);
                listView.setAdapter(adapter_carpi);

                break;
            case "Berlino":
                Local zero_berlino = new Local("Boetzow Privat", "Linienstr. 113", "3028095390", "Vegetariana", "drawable://" + R.drawable.berlino_tablocali_boetzowprivat, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local uno_berlino = new Local("Häppies", "Dunckerstr. 85", "15114984140", "Fusion", "drawable://" + R.drawable.berlino_tablocali_happies, "drawable://" + R.drawable.cinque_stelle);
                Local due_berlino = new Local("Eselin von A.", "Wannseebadweg 55", "302141284", "Pesce, Mediterranea", "drawable://" + R.drawable.berlino_tablocali_dieeselinvona, "drawable://" + R.drawable.cinque_stelle);
                Local tre_berlino = new Local("Langosch", "Petersburger Platz 1", "3042808100", "Vegetariana", "drawable://" + R.drawable.berlino_tablocali_langosch, "drawable://" + R.drawable.cinque_stelle);
                Local quattro_berlino = new Local("Skykitchen", "L.Allee 106", "304530532620", "Vegetariana, Vegana", "drawable://" + R.drawable.berlino_tablocali_skykitchen, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local cinque_berlino = new Local("Mabuhay", "Koethener Str. 28", "302651867", "Asiatica, Vegetariana", "drawable://" + R.drawable.berlino_tablocali_mabuhay, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sei_berlino = new Local("Zur Haxe", "Erich-Weinert-Str. 128", "304216312", "Tedesca", "drawable://" + R.drawable.berlino_tablocali_zurhaxe, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sette_berlino = new Local("Gaffel Haus", "Dorotheenstr. 65", "3031011693", "Grill, Salutistica", "drawable://" + R.drawable.berlino_tablocali_gaffelhaus, "drawable://" + R.drawable.quattro_stelle);
                Local otto_berlino = new Local("Kurpfalz", "Wilmersdorfer Str. 93", "308836664", "Tedesca, Europea", "drawable://" + R.drawable.berlino_tablocali_kurpfalzweinstuben, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local nove_berlino = new Local("FACIL", "Potsdamer Str. 3", "30590051234", "Opzioni senza glutine", "drawable://" + R.drawable.berlino_tablocali_facil, "drawable://" + R.drawable.quattroemezzo_stelle);

                ArrayList<Local> localList_berlino = new ArrayList<>();
                localList_berlino.add(zero_berlino);
                localList_berlino.add(uno_berlino);
                localList_berlino.add(due_berlino);
                localList_berlino.add(tre_berlino);
                localList_berlino.add(quattro_berlino);
                localList_berlino.add(cinque_berlino);
                localList_berlino.add(sei_berlino);
                localList_berlino.add(sette_berlino);
                localList_berlino.add(otto_berlino);
                localList_berlino.add(nove_berlino);

                LocalListAdapter adapter_berlino = new LocalListAdapter(getContext(), R.layout.list_item, localList_berlino);
                listView.setAdapter(adapter_berlino);
                break;
            case "Lubiana":
                Local zero_lubiana = new Local("Presnica", "Presernov trg 2", "40797887", "Salutistica", "drawable://" + R.drawable.lubiana_tablocali_presnica, "drawable://" + R.drawable.cinque_stelle);
                Local uno_lubiana = new Local("Fari's Delice", "M. cesta 34", "40825533", "Mediorientale", "drawable://" + R.drawable.lubiana_tablocali_farisdelice, "drawable://" + R.drawable.cinque_stelle);
                Local due_lubiana = new Local("Gostilna Dela", "Poljanska cesta 7", "59925446", "Mediterranea", "drawable://" + R.drawable.lubiana_tablocali_gostilnadela, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local tre_lubiana = new Local("Odprta Kuhna", "Pogacharjev trg 1", "//", "Giapponese", "drawable://" + R.drawable.lubiana_tablocali_odprtakuhna, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local quattro_lubiana = new Local("Klobasarna", "Ciril-Metodov trg 15", "51605017", "Europea", "drawable://" + R.drawable.lubiana_tablocali_klobasarna, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local cinque_lubiana = new Local("Hood Burger", "Jamova cesta 105", "40540411", "Americana", "drawable://" + R.drawable.lubiana_tablocali_hoodburger, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sei_lubiana = new Local("Druga Violina", "Stari trg 21", "82052506", "Centro-Europea", "drawable://" + R.drawable.lubiana_tablocali_drugaviolina, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sette_lubiana = new Local("Das ist Valter", "Njegosheva cesta 10", "915895866", "Esteuropea", "drawable://" + R.drawable.lubiana_tablocali_dasistvalter, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local otto_lubiana = new Local("Sarajevo '84", "Nazorjeva ulica 12", "14257106", "Barbecue, Europea", "drawable://" + R.drawable.lubiana_tablocali_sarajevo84, "drawable://" + R.drawable.quattro_stelle);
                Local nove_lubiana = new Local("Zbornica", "Rimska cesta 13", "40583355", "Americana", "drawable://" + R.drawable.lubiana_tablocali_zbornica, "drawable://" + R.drawable.cinque_stelle);

                ArrayList<Local> localList_lubiana = new ArrayList<>();
                localList_lubiana.add(zero_lubiana);
                localList_lubiana.add(uno_lubiana);
                localList_lubiana.add(due_lubiana);
                localList_lubiana.add(tre_lubiana);
                localList_lubiana.add(quattro_lubiana);
                localList_lubiana.add(cinque_lubiana);
                localList_lubiana.add(sei_lubiana);
                localList_lubiana.add(sette_lubiana);
                localList_lubiana.add(otto_lubiana);
                localList_lubiana.add(nove_lubiana);

                LocalListAdapter adapter_lubiana = new LocalListAdapter(getContext(), R.layout.list_item, localList_lubiana);
                listView.setAdapter(adapter_lubiana);
                break;
            case "Trieste":
                Local zero_trieste = new Local("T. speranza", "dell'Istria, n°64/A", "040762624", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_trattoriaallasperanza, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local uno_trieste = new Local("T. Nerodiseppia", "Luigi Cadorna, n°23", "040301377", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_trattorianerodiseppia, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local due_trieste = new Local("Osteria Voliga", "della Fornace, n°1", "040309606", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_osteriadimareallavoliga, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local tre_trieste = new Local("Tavernetta", "G. R. M. E C., n°11", "040224275", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_tavernettaalmolo, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local quattro_trieste = new Local("Hostaria", "Dell'Eremo, n°243", "040910979", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_hostariaai3magnoni, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local cinque_trieste = new Local("O. Maestri", "della Sorgente, n°6", "040636801", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_osteriaaimaestri, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sei_trieste = new Local("O. Tempo Perso", "Boccaccio, n°20", "3285319928", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_osteriaaltempoperso, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sette_trieste = new Local("Menarosti", "del Toro, n°12", "040661077", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_ristorantemenarosti, "drawable://" + R.drawable.quattro_stelle);
                Local otto_trieste = new Local("Spazzacamino", "d.Settefontane, n°68", "040945160", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_anticospazzacamino, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local nove_trieste = new Local("JOIA", "diaz, n°1", "0403478940", "Pesce, Mediterranea", "drawable://" + R.drawable.trieste_tablocali_joia, "drawable://" + R.drawable.quattroemezzo_stelle);

                ArrayList<Local> localList_trieste = new ArrayList<>();
                localList_trieste.add(zero_trieste);
                localList_trieste.add(uno_trieste);
                localList_trieste.add(due_trieste);
                localList_trieste.add(tre_trieste);
                localList_trieste.add(quattro_trieste);
                localList_trieste.add(cinque_trieste);
                localList_trieste.add(sei_trieste);
                localList_trieste.add(sette_trieste);
                localList_trieste.add(otto_trieste);
                localList_trieste.add(nove_trieste);

                LocalListAdapter adapter_trieste = new LocalListAdapter(getContext(), R.layout.list_item, localList_trieste);
                listView.setAdapter(adapter_trieste);
                break;
            case "Norimberga":
                Local zero_norimberga = new Local("Troedelstuben", "Troedelmarkt 30", "91136772767", "Vegetariana", "drawable://" + R.drawable.norimberga_tablocali_troedelstuben, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local uno_norimberga = new Local("Albrecht D. S.", "Albrecht-Duerer-Str. 6", "911227209", "Centro-Europea", "drawable://" + R.drawable.norimberga_tablocali_albrechtdurerstube, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local due_norimberga = new Local("Bohm's H.", "Theatergasse 19", "911224465", "Centro-Europea", "drawable://" + R.drawable.norimberga_tablocali_bohmsherrenkeller, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local tre_norimberga = new Local("Hutt'n E.& T.", "Bergstr. 20", "9112019881", "Centro-Europea", "drawable://" + R.drawable.norimberga_tablocali_huttnessentrinken, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local quattro_norimberga = new Local("Nurnberger A.", "Burgstr. 19", "911507169", "Bar, Europea", "drawable://" + R.drawable.norimberga_tablocali_nurnbergeralm, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local cinque_norimberga = new Local("Z. Albrecht D. H.", "O. Schmiedgasse 58", "91121144940", "Centro-Europea", "drawable://" + R.drawable.norimberga_tablocali_zumalbrechtduererhaus, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sei_norimberga = new Local("Schaufelewart", "Schweiggerstr. 19", "9114597325", "Gastronomia", "drawable://" + R.drawable.norimberga_tablocali_schaufelewartschaft, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local sette_norimberga = new Local("Hausbrauerei A.", "Bergstr. 19", "9112449859", "Bar, Pub", "drawable://" + R.drawable.norimberga_tablocali_hausbrauereialtstadthof, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local otto_norimberga = new Local("kopernikus", "H. Insel Schuett 34", "9112427740", "Tedesca, Polacca", "drawable://" + R.drawable.norimberga_tablocali_restaurationkopernikus, "drawable://" + R.drawable.quattroemezzo_stelle);
                Local nove_norimberga = new Local("Gaststatte K. B.", "Obere Woerthstr. 2", "9112373171", "Centro-Europea", "drawable://" + R.drawable.norimberga_tablocali_gaststattekarlsbruckla, "drawable://" + R.drawable.quattro_stelle);

                ArrayList<Local> localList_norimberga = new ArrayList<>();
                localList_norimberga.add(zero_norimberga);
                localList_norimberga.add(uno_norimberga);
                localList_norimberga.add(due_norimberga);
                localList_norimberga.add(tre_norimberga);
                localList_norimberga.add(quattro_norimberga);
                localList_norimberga.add(cinque_norimberga);
                localList_norimberga.add(sei_norimberga);
                localList_norimberga.add(sette_norimberga);
                localList_norimberga.add(otto_norimberga);
                localList_norimberga.add(nove_norimberga);

                LocalListAdapter adapter_norimberga = new LocalListAdapter(getContext(), R.layout.list_item, localList_norimberga);
                listView.setAdapter(adapter_norimberga);
                break;
            default: break;
        }

        return rootView;
    }
}