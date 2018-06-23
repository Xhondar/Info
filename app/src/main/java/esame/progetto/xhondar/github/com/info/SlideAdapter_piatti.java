package esame.progetto.xhondar.github.com.info;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SlideAdapter_piatti extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] images_carpi = {R.drawable.carpi_piatti_mostardafina, R.drawable.carpi_piatti_parmigiano, R.drawable.carpi_piatti_zamponecotechino};
    public String[] titolo_carpi = {"La Mostarda Fina", "Il Parmigiano Reggiano DOP", "Il Cotechino IGP e lo Zampone IGP"};
    public String[] descrizione_carpi = {
            "La Mostarda “fina” di Carpi, dalla lunga e complessa lavorazione, è una salsa dolce piccante utilizzata per accompagnare carni, soprattutto bollite come il lesso, il cotechino e lo zampone, o per accompagnare formaggi. Della mostarda Fina, però, non esiste un’unica ricetta autentica ma diverse ricette a seconda della famiglia che la produceva. Indubbiamente la coltivazione di mele e pere tipiche del territorio (come le mele Gagliardine e le Decime) favorì la creazione della ricetta, alle quali si aggiungevano bucce d’arancia, cedro candito, uvetta, senape, miele e varie spezie, ingredienti comuni a tutte le varie ricette di famiglia, oltre ad altri dettati da gusti personali o “ingredienti segreti”. La vera Mostarda Sopraffina di Carpi, però, era ricetta segreta della famiglia Sebellini che avevano una drogheria a Carpi. Chi la produce, la conserva, oggi come allora, in vasi di argilla a forma di pera rovesciata. La si prepara in inverno e, per questo, era uso farne dono per le feste natalizie.",
            "Il Parmigiano Reggiano DOP, prodotto tipico del territorio, nasce dal felice connubio tra lavoro umano e ingredienti locali. Tra questi il latte, reso speciale dai foraggi di cui si nutrono le mucche che lo producono, provenienti dai pascoli dell’Emilia e della Lombardia al di sotto del Po.",
            "Il cotechino IGP e lo zampone IGP sono due secondi piatti di largo consumo nella cucina modenese, soprattutto durante le festività natalizie. All'interno della pelle degli zampetti di maiale è insaccata la carne finemente tritata del maiale stesso. Di solito sono accompagnati con un contorno di lenticchie. Lo zampone nasce a Mirandola dove, narra la leggenda che durante il duro assedio di Papa Giulio II nel 1510-11, per poter meglio resistere alle difficoltà e per non lasciare al nemico animali così faticosamente ingrassati, un cuoco dei Pio pensò di tritare la carne dei maiali e di insaccarla nella pelle degli zampetti."};

    public int[] images_berlino = {R.drawable.berlino_piatti_stincodimaiale, R.drawable.berlino_piatti_apfelstrudel, R.drawable.berlino_piatti_bretzels};
    public String[] titolo_berlino = {"Stinco di maiale", "Apfelstrudel", "Bretzels"};
    public String[] descrizione_berlino = {
            "Invitante alla vista e piacevolissimo al palato, l' Eisben mit Sauerkraut è un secondo a base di carne irrinunciabile qualora si scelga di compiere un \"raid gastronomico\" nella capitale tedesca! Servito con un contorno di tradizionali crauti o di squisite patate, lo stinco di maiale è un \"must\" imperdibile dell'alimentazione tipica germanica, soprattutto se assaporato in un suggestivo ristorantino di campagna.",
            "Una vera e propria leggenda della gastronomia tedesca, è stato imitato ma mai eguagliato! Una sfoglia ripiena di mele,uva passa,zucchero,briciole di pane che, sin dal primo assaggio, si trasforma in una vera apoteosi per il palato, da gustare a colazione o a termine di un delizioso pranzo o di una gustosa cena, accompagnato da una pallina di gelato alla vaniglia. Provare per credere.",
            "Ottimo accompagnamento ai wrustel, questo pane speciale dalla forma intrecciata è inconfondibile e non solo grazie al suo sapore, ma anche e soprattutto alla sua particolare forma e alla sua glassatura arricchita da sale grosso o semi di sesamo."};

    public int[] images_lubiana = {R.drawable.lubiana_piatti_kranjska_klobassa, R.drawable.lubiana_piatti_krvavice, R.drawable.lubiana_piatti_pecenkaetenstankrompir};
    public String[] titolo_lubiana = {"Kranjska Klobassa", "Krvavice", "Pecenka e Tenstan Krompir"};
    public String[] descrizione_lubiana = {
            "È una salsiccia preparata con carne di suino ed insaporita con aglio e pepe. Questa ricetta risale ai tempi dell’impero austro ungarico e prende il nome dalla regione della Carniola. La leggenda racconta che l’imperatore Francesco Giuseppe, in viaggio da Vienna verso Trieste, si fermò in un locale nella cittadina di Naklo. Il proprietario della locanda, felice ma nello stesso tempo impreparato a quella visita illustre, servì all’imperatore l’unico piatto disponibile: la Kranjska Klobassa, descrivendola come una semplice salsiccia. Francesco Giuseppe, invece, ricevuto il piatto, esclamò: “ma questa non è una normale salsiccia, è la salsiccia di Carniola”. Da qui il nome del piatto che fece innamorare l’imperatore e ancora appassiona i turisti in visita in Slovenia.",
            "È un altro tipo di salsiccia, ma molto più simile al sanguinaccio italiano. La Krvavice è un insaccato di diverse parti di maiale (per lo più interiora e sangue) ed è arricchito con vari ingredienti che cambiano da città a città. È perfetta se servita con kislo zelje (crauti).",
            "È uno stufato di carne bovina preparato con l’aggiunta di patate, che vengono saltate con cipolla e grasso di maiale. È il classico piatto della domenica che gli sloveni preparano la mattina presto e lasciano sul fuoco fino all’ora di pranzo"};

    public int[] images_trieste = {R.drawable.trieste_piatti_jota, R.drawable.trieste_piatti_gnochidesusini, R.drawable.trieste_piatti_canocieinbusara};
    public String[] titolo_trieste = {"Jota", "Gnochi de' susini", "Canocie in busara"};
    public String[] descrizione_trieste = {
            "Si tratta di una minestra originaria della cucina giuliana, ma che nella più famosa versione triestina è a base di crauti (in dialetto triestino capuzi garbi, cappucci acidi), fagioli e patate; viene insaporita con costine, cotenna o altra carne di maiale, affumicata e non, e semi di cumino.",
            "Gli gnocchi di susine fanno parte del ricco gruppo degli gnocchi ripieni e sono tuttora molto apprezzati nel Goriziano e a Trieste. Si tratta di grandi gnocchi  a base di patata e farina, farciti con una mezza prugna privata del nocciolo, sostituto da un ripieno a base di burro fuso e pangrattato rosolati, previo insaporimento con  zucchero e cannella.",
            "La busera può essere preparata in bianco o rosso, a seconda se si desidera aggiungere i pomodorini. Alcuni sostengono che il nome derivi dall'intingolo detto appunto busera altri dalla pentola che i marinai utilizzavano per cucinare il pasto per la ciurma. Per busera si intende l'intingolo preparato con pepe, pan grattato, sale, vino bianco e pomodori pelati, nel quale vengono cotti gli scampi o le cannocchie. Secondo altre fonti invece la busera è un tipo di pentola di coccio o di ferro con i manico lungo che i marinai utilizzavano per cucinare i pasto di bordo. Termine in questo caso prettamente marinaresco che sarebbe arrivato ad uso comune nel lessico culinario triestino grazie ai viaggi dei pescatori."};

    public int[] images_norimberga = {R.drawable.norimberga_piatti_salsicciadinorimberga, R.drawable.norimberga_piatti_bratwurst, R.drawable.norimberga_piatti_leberwurst};
    public String[] titolo_norimberga = {"Salsiccia di Norimberga", "Brätwurst", "Leberwurst"};
    public String[] descrizione_norimberga = {
            "La salsiccia di Norimberga prende il nome dalla città stessa in cui viene fatta. E' un prodotto tipico e perciò viene tutelato dal marchio I. G. P., ovvero Indicazione Geografica Protetta. La loro forma caratteristica è alquanto piccola, misurano infatti dai 7 ai 9 centimetri per 2 centimetri di larghezza, ed il loro colore è abbastanza chiaro. La salsiccia di Norimberga è fatta con cane suina, senza però aggiungere cotenna e pancetta, la quale viene poi aromatizzata come prevede la ricetta.",
            "Il Brätwurst invece è un tipo di salsiccia tipico del posto. Può essere fatto sia con carne di suino, sia di manzo che di vitello. Inoltre differisce anche per la forma che risulta essere molto più lunga.",
            "Leberwurst, un altro salume insaccato: fatto con la carne tritata di maiale o vitello a cui va aggiunto il fegato che è l'elemento caratteristico di questo salume. Esso è un prodotto tipico della Germania, tant'è è vero che è diffuso anche negli altri Paesi limitrofi."};

    public SlideAdapter_piatti(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return titolo_carpi.length;
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
        View view = inflater.inflate(R.layout.slide_piatti, container, false);

        LinearLayout layoutslide = view.findViewById(R.id.slidelinear_piatti);

        Piatti p = new Piatti();
        p = (Piatti) view.getContext();
        String s = p.getS();

        ImageView img = view.findViewById(R.id.img);
        TextView t1 = view.findViewById(R.id.title);
        TextView t2 = view.findViewById(R.id.descrizione);

        switch (s){
            case "Carpi":
                img.setImageResource(images_carpi[position]);
                t1.setText(titolo_carpi[position]);
                t2.setText(descrizione_carpi[position]);
                break;
            case "Berlino":
                img.setImageResource(images_berlino[position]);
                t1.setText(titolo_berlino[position]);
                t2.setText(descrizione_berlino[position]);
                break;
            case "Lubiana":
                img.setImageResource(images_lubiana[position]);
                t1.setText(titolo_lubiana[position]);
                t2.setText(descrizione_lubiana[position]);
                break;
            case "Trieste":
                img.setImageResource(images_trieste[position]);
                t1.setText(titolo_trieste[position]);
                t2.setText(descrizione_trieste[position]);
                break;
            case "Norimberga":
                img.setImageResource(images_norimberga[position]);
                t1.setText(titolo_norimberga[position]);
                t2.setText(descrizione_norimberga[position]);
                break;
            default: break;
        }

        container.addView(view);
        return view;
    }

}
