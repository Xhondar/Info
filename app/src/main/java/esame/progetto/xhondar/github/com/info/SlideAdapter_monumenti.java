package esame.progetto.xhondar.github.com.info;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class SlideAdapter_monumenti extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] images_carpi = {R.drawable.carpi_monumenti_piazzadeimartiri, R.drawable.carpi_monumenti_palazzodeipio, R.drawable.carpi_monumenti_chiesasantamariaincastello};
    public String[] titolo_carpi = {"Piazza dei martiri", "Palazzo dei Pio", "Chiesa Santa Maria in castello"};
    public String[] descrizione_carpi = {
            "Piazza dei Martiri, chiusa sul lato occidentale da un unico lungo portico di 53 colonne e dal lato settentrionale dalla cattedrale.",
            "Palazzo dei Pio, si affaccia invece sul lato orientale della piazza; è un insieme di edifici di stile medievale (la torre merlata di Passerino Bonaccolsi), rinascimentale (la cilindrica Uccelliera, la lunga facciata, il torrione di Galasso Pio all'estremità sinistra) e seicentesca (di quest'epoca è la pur sobria torre dell'orologio). All'interno è notevole la cappella, con affreschi di Bernardino Loschi e Vincenzo Catena.",
            "La chiesa di Santa Maria in Castello, nota anche come La Sagra, è la chiesa più antica della città di Carpi (Modena), essendo stata eretta nel 752. Si affaccia su piazzale Re Astolfo. Si tratta di una pieve romanica consacrata nel 1184, costruita su di una precedente fondazione longobarda. La facciata rinascimentale venne progettata da Baldassarre Peruzzi e realizzata nel 1515, insieme all'abbattimento di alcune campate della navata, che hanno diminuito l'originaria lunghezza dell'edificio, e alla realizzazione di una copertura con volta a botte, eliminata tra il 1886 e il 1887 per opera dell'ingegnere Achille Sammarini. Notevole l'imponente torre campanaria, alta 49.50 metri."};

    public int[] images_berlino = {R.drawable.berlino_monumenti_colonnadellavittoria, R.drawable.berlino_monumenti_gendarmenmarkt, R.drawable.berlino_monumenti_museoebraico};
    public String[] titolo_berlino = {"Colonna della Vittoria", "Gendarmenmarkt", "Museo Ebraico"};
    public String[] descrizione_berlino = {
            "La Siegessäule, o Colonna della Vittoria, è un altro dei monumenti berlinesi che è stato capace di “re-inventarsi” un nuovo ruolo. Eretta come simbolo della vittoria militare prussiana nel 19° secolo, è diventata una postazione panoramica per i turisti e un emblema caro alla comunità gay, tanto che il periodico gay di Berlino si chiama, appunto, Siegessäule e qui culminano le celebrazioni della Techno Love Parade e del Christopher Street Day. Questo, infine, è il luogo, alternativo alla Porta di Brandeburgo, scelto da Barack Obama il 24 luglio 2008 per rivolgere il suo discorso a un pubblico di 200,000 berlinesi. Oggi la colonna, alta 67 m, si trova nel Tiergarten, al centro della rotonda Grosser Stern (grande stella): una rotonda dalla quale si dipartono cinque strade in cinque direzioni diverse. Questo punto particolare fu scelto dai nazisti nel 1938, che lo preferirono alla posizione originaria del monumento, di fronte al Reichstag, in Platz del Republik (allora Königsplatz). Secondo il progetto di Albert Speer, l’architetto visionario che cercò di trasformare Berlino nella gloriosa nuova capitale del Terzo Reich, denominata “Germania” la colonna doveva essere collocata lungo l’asse Est-Ovest che attraversava il Tiergarten.",
            "Gendarmenmarkt è forse la più maestosa piazza berlinese, nota soprattutto per tre inconfondibili edifici - il Deutscher Dom (duomo tedesco), il Französischer Dom (duomo francese) e la Konzerthaus (sala dei concerti) – che insieme formano un trittico architettonico senza pari. Le due cattedrali sono sormontate da due grandi cupole, realizzate nel 1785 dall’architetto Carl von Gontard con lo scopo di valorizzare ulteriormente le due chiese. La piazza risale al 1700 e fu voluta dal Principe elettore di Brandeburgo Federico III, poi Federico I, che immaginò proprio qui il cuore di Friedrichstadt, un nuovo quartiere di Berlino. Qui erano stati accolti gli ugonotti cui era stato garantito asilo, con l’editto di Potsdam del 1685, dopo la loro espulsione dalla Francia. La piazza prende infatti il nome dal termine francese “gens d’armes” (gendarmi), un reggimento prussiano formato da soldati ugonotti.",
            "Monumento alla storia sociale, politica e culturale degli ebrei in Germania, lo spettacolare Berlin Jüdisches Museum di Daniel Libeskind è considerato, per i suoi contenuti e la sua architettura, un’eccellenza mondiale. Dal 9 settembre 2001, data della sua apertura, il museo ha già accolto oltre 4 milioni di visitatori. Il Museo, sintesi architettonica dell’identità culturale di un popolo, si pone anche come tangibile espressione della presenza e del ruolo degli ebrei in Germania, ma oltre tutto questo è un invito alla riconciliazione – fisica e spirituale – della città di Berlino con l’Olocausto. Nato a pochi chilometri dalla capitale tedesca (a Lodz, in Polonia) e appartenente a una famiglia decimata nello sterminio, Libeskind presentò il suo progetto al Senato di Berlino nel 1988, un anno prima della caduta del muro. Alla base della sua proposta era il desiderio di affrontare, in un’unica struttura, temi ampi e complessi come la storia degli ebrei tedeschi e il vuoto lasciato dalla loro assenza a Berlino, per arrivare infine a offrire un simbolo di speranza per un nuovo corso storico, per Berlino e per l’Europa. Il Museo, ha spiegato Libeskind, “descrive e integra, per la prima volta nella Germania del dopoguerra, la storia degli ebrei del Paese, le ripercussioni dell’Olocausto e il senso di disorientamento spirituale connesso a tutto ciò. Ed è anche semplicemente un museo, con la documentazione esposta alle pareti."};

    public int[] images_lubiana = {R.drawable.lubiana_monumenti_ilcastello, R.drawable.lubiana_monumenti_lacattedrale, R.drawable.lubiana_monumenti_labiblioteca};
    public String[] titolo_lubiana = {"Il Castello di Lubiana", "La Cattedrale di San Nicola", "La Biblioteca"};
    public String[] descrizione_lubiana = {
            "Nel 1335, il castello divenuto proprietà degli Asburgo fu fortificato a causa delle frequenti invasioni turche ma, solo nella seconda metà del XV secolo le modifiche apportate dal duca, più tardi imperatore Federico III, ne cambiarono completamente l’aspetto e le dimensioni. Ad eccezione delle mura esterne e della cappella di San Giorgio (1489), tutti gli edifici principali del castello furono ricostruiti nel XVI e XVII secolo in seguito al terribile terremoto del 1515. A metà del XVII secolo, la roccaforte perse la sua funzione di fortezza e residenza nobiliare per diventare magazzino militare. In seguito all’occupazione francese della città (1809), il castello fu utilizzato come caserma ed ospedale militare. Con il ritorno degli austriaci, la struttura fu convertita in prigione provinciale. Tra il 1845 e il 1848 la vecchia torre in legno di avvistamento incendi (Torre panoramica) fu sostituita da una nuova torre in muratura. Nel 1849 il castello fu abbandonato finché nel 1868 fu nuovamente usato come penitenziario, funzione svolta fino alla fine della seconda guerra mondiale. Acquistato dal comune nel 1905, oggetto di lunghi lavori di ristrutturazione (ancora in corso), oggi il castello è una popolare destinazione turistica in cui si svolgono concerti, eventi culturali, mostre e spettacoli.",
            "La cattedrale, progettata dall’architetto gesuita Andrea Pozzo su modello della chiesa romana del Gesù, è a pianta a forma di croce latina. Si compone di un’unica navata, cappelle laterali e transetto sopra al quale si erge la cupola, aggiunta nel 1841. L’interno della chiesa in marmo rosa e stucchi bianchi e dorati, fu affrescato da Giulio Quaglio con dipinti raffiguranti scene della vita di San Nicola. Di gran pregio le sculture dei quattro vescovi di Emona di Angelo Putti, gli angeli dell’altare del Corpus Domini dello scultore veneziano Francesco Robba e gli scranni scolpiti del coro. Nel 1996, per commemorare la visita di Papa Giovanni Paolo II, sono stati aggiunte due straordinari portali in bronzo. In particolare, la porta principale realizzata da Demšar Tone, simboleggia i 1250 anni del cristianesimo in Slovenia; su quella laterale invece, Mirsad Begić, scultore bosniaco e musulmano, ha raffigurato il sacrificio di Cristo e la storia della Diocesi di Lubiana attraverso le effigi dei suoi vescovi.",
            "L’imponente edificio a forma di un rettangolo irregolare si compone di quattro piani, quattro ali e due cortili interni. La facciata è decorata da mattoni rossi e blocchi di pietra collocati in maniera casuale in base all’improvvisa decisione dei muratori. Immancabile l’elemento architettonico classico rappresentato da una colonna Ionica allungata che taglia in due le finestre dei quattro piani. Da notare le maniglie sul portone principale a forma di due teste di cavallini, rappresentati Pegaso, il mitologico cavallo alato, una sorta di guida simbolica per i visitatori della biblioteca nel mondo del sapere. All’interno, la monumentale scalinata centrale in marmo scuro con 32 colonne nere conduce alla grande sala di lettura dalle pareti vitree che lasciano che la luce naturale inondi lo spazio facendo risplendere il legno che la riveste. Abbellisce l’ingresso laterale la statua bronzea di Mosé, opera dello scultore Lojze Dolinar. La NUK è un importante monumento culturale. Vanta infatti, la più ampia raccolta di letteratura del Paese, e possiede numerosi manoscritti medievali e stampe rinascimentali."};

    public int[] images_trieste = {R.drawable.trieste_monumenti_foibadibasovizza, R.drawable.trieste_monumenti_canalgrande, R.drawable.trieste_monumenti_palazzomunicipio};
    public String[] titolo_trieste = {"Foiba di Basovizza", "Canal Grande", "Palazzo del Municipio"};
    public String[] descrizione_trieste = {
            "A Basovizza, frazione del comune di Trieste, è sita la tristemente famosa Foiba, ossia un pozzo molto profondo atto all’estrazione del carbone durante il Novecento. Si pensava che sul luogo ci fossero dei consistenti giacimenti di carbone o lignite e venne perciò scavato un pozzo che fu abbandonato più tardi visto il scarso rendimento. Si trattava di una cavità di 256 metri con una galleria lunga 735 metri. Durante l’occupazione di Trieste da parte degli jugoslavi nel 1945 i partigiani della Jugoslavia utilizzarono il come luogo nel quale nascondere i resti dei morti italiani e tedeschi, sia prigionieri che militari. Molti storici sostengono l’impossibilità di calcolare il numero cadaveri occultati, mentre altri al contrario sostengono che attraverso le testimonianze sia possibile ricostruirlo. Nel 1980 è stato riconosciuto lo stato d’interesse nazionale della foiba che fu visitata dall’allora in carica presidente Francesco Cossiga. Nel 1992 la Foiba di Basovizza è stata proclamata monumento nazionale dal presidente della Repubblica Oscar Luigi Scalfaro.",
            "Il Canal Grande di Trieste è sito nel centro del Borgo Teresiano. Realizzato da Matteo Pirona, artista veneziano, tra il 1754 e il 1756, dopo l’interramento delle saline per dare spazio allo sviluppo cittadino oltre le mura, è un canale navigabile che permetteva alle imbarcazioni di arrivare fino al cuore della città. In origine aveva una lunghezza maggiore rispetto a quella attuale e giungeva fino alla Chiesa di Sant’Antonio. Attualmente non è più presente la parte finale, coperta, e sulla quale sorge ora Piazza Sant’Antonio. Il canale è attraversato da Ponte rosso e Ponte Verde, nomi derivanti dai colori delle loro originarie strutture. Sul primo è posta la famosa statua dello scrittore irlandese James Joyce per celebrare il periodo di permanenza a Trieste. Vicino a questo ponte c’è l’omonima piazza conosciuta per il suo mercato all’aperto. Molteplici palazzi di notevole pregio si affacciano sul Canal Grande: palazzo Adedes, palazzo Gopcevich, la Chiesa di Sant’Antonio, lo storico caffè Stella Polare, il tempio di San Spiridione, Palazzo Genel e Palazzo Carciotti.",
            "Il Palazzo del Municipio di Trieste è sito in piazza Unità d’Italia che si affaccia sul Golfo di Trieste. Questa piazza è famosa per essere la seconda piazza europea più grande ad affacciarsi sul mare. Il Palazzo municipale fu edificato nella seconda metà dell’Ottocento, momento in cui si decise di riprogettare totalmente la piazza posizionando il municipio di fronte e altri edifici ai lati. Al fine di creare uno spazio aperto sul mare furono abbattuti i vecchi edifici posti in prossimità del mare. La struttura del Palazzo del Municipio fu progettata da Giuseppe Bruni, noto architetto triestino. Una torre campanaria sovrasta il palazzo e su di essa sono posti due mori, Micheze e Jacheze, che scandiscono ogni quindici minuti il tempo. Queste due statue non sono le originali, site invece al castello di San Giusto dal 2006. Il palazzo non riscosse il consenso dei cittadini che gli diedero vari nomi, il più famoso dei quali è Gabbia, in triestino Cheba, visto che la sua forma richiama una gabbia per uccelli. Il balcone del monumento fu il luogo dal quale Benito Mussolini nel 1938 promulgò le leggi razziali fasciste."};

    public int[] images_norimberga = {R.drawable.norimberga_monumenti_kaiserburg, R.drawable.norimberga_monumenti_mura, R.drawable.norimberga_monumenti_lochgefangnisse};
    public String[] titolo_norimberga = {"Il Kaiseburg", "Le Mura di Norimberga", "Lochgefängnisse"};
    public String[] descrizione_norimberga = {
            "Il Kaiseburg, il castello medievale di Norimberga che domina la città dall'alto è il simbolo della città e si trova nella periferia nord occidentale del centro storico della città, la Altstadt. Il Kaiserburg è una delle fortificazioni più significative, storicamente e architettonicamente. Dopo le distruzioni della seconda guerra mondiale, il castello fu accuratamente restaurato secondo precisi modelli storici. Dal 1050 al 1571, il castello è stato residenza ufficiale di re e imperatori tedeschi, tra cui Federico Barbarossa",
            "Originariamente le mura della città di Norimberga avevano una lunghezza di cinque chilometri e consistevano di diverse porte: Laufer, Spittler, Frauen, Neu-und Tiergartner. Dal XIII al XVI secolo vennero costantemente rafforzate ed uno dei motivi per cui la città resistette a tutti gli attacchi fu proprio quello di possedere delle mura indistruttibili. Oggi, a rimanere in piedi sono quasi quattro chilometri di parete. Rimane un grosso vuoto solo sul lato est, tra la stazione centrale e Rathenauplatz. Il fossato della città, che non è mai stato riempito con acqua, si estende per circa due chilometri.",
            "Una prigione medievale situato sotto l'antico municipio di Norimberga, l'Altes Rathaus, Certo questa è un'attrazione raccapricciante, ma proprio di fronte alla camera di tortura si trovano i resti di una stanza che un tempo nascondeva i tesori del consiglio comunale ed importanti documenti di guerre ed emergenze cittadine. Un tempo, dal 1543, esisteva un passaggio sotterraneo, bombardato durante la seconda guerra mondiale."};

    public SlideAdapter_monumenti(Context context){
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
        View view = inflater.inflate(R.layout.slide_monumenti, container, false);

        LinearLayout layoutslide = view.findViewById(R.id.slidelinear_monumenti);

        Monumenti m = new Monumenti();
        m = (Monumenti) view.getContext();
        String s = m.getS();

        ImageView img = view.findViewById(R.id.immg);
        TextView t1 = view.findViewById(R.id.ttitle);
        TextView t2 = view.findViewById(R.id.ddescrizione);

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