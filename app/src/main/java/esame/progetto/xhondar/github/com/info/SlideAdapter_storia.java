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

public class SlideAdapter_storia extends PagerAdapter {
    Context context;
    LayoutInflater inflater;

    public int[] images_carpi = {R.drawable.carpi_storia_origini, R.drawable.carpi_storia_secondaguerramondiale, R.drawable.carpi_storia_oep};
    public String[] titolo_carpi = {"Origini", "Seconda Guerra Mondiale", "Onorificenze e Protagonisti"};
    public String[] descrizione_carpi = {
            "Carpi era un borgo medievale di origine preistorica (civiltà villanoviana) rifondato, probabilmente come roccaforte (castrum Carpi), nell'Alto Medioevo. A partire dal XIV secolo fu sede della signoria dei Pio, per passare poi a far parte dei domini estensi nel Cinquecento. Nel 1779 fu eretta a sede diocesana. Nel secondo dopoguerra Carpi si è profondamente trasformata, grazie allo sviluppo dell'industria della maglieria.",
            "Durante la seconda guerra mondiale, la frazione di Fossoli fu il sito di un campo di transito, dal quale numerosi detenuti furono deportati verso i campi di sterminio e che ora è utilizzato come memoriale e come museo della 2ª guerra mondiale. Il Comune di Carpi ha allestito il Museo del Deportato come memoriale della deportazione ed organizza regolarmente numerose manifestazioni in memoria dell'olocausto.",
            "Carpi è tra le Città decorate al Valor Militare per la Guerra di Liberazione perché è stata insignita della Medaglia d'Argento al Valor Militare per i sacrifici delle sue popolazioni e per la sua attività nella lotta partigiana durante la seconda guerra mondiale e della Medaglia d'oro al Valor Civile per il sostegno dato dai cittadini alle persone internate al campo di Fossoli per alleviare le pene e consentirne la fuga. Nell'opera di soccorso ai perseguitati e agli ebrei si distinse in particolare Odoardo Focherini, il quale pagherà il suo impegno con la deportazione e la morte nel campo di concentramento di Hersbruck. Medaglia d'oro dell'Unione delle Comunità Israelitiche Italiane nel 1955, Giusto tra le nazioni a Yad Vashem nel 1969, Focherini è stato ricordato nel 2006, nel centenario della sua nascita, con importanti manifestazioni con ospiti internazionali e beatificato dalla Chiesa il 15 giugno 2013."};

    public int[] images_berlino = {R.drawable.berlino_storia_origini, R.drawable.berlino_storia_secondaguerramondiale, R.drawable.berlino_storia_ricostruzionesviluppo};
    public String[] titolo_berlino = {"Origini", "Post Seconda Guerra Mondiale", "Ricostruzione e Sviluppo"};
    public String[] descrizione_berlino = {
            "Berlino nacque molto probabilmente come borgo commerciale di origine slava nel XII secolo, in corrispondenza di un'isola della Sprea. Originariamente vi erano due città distinte: Berlino, ad est del fiume, e Cölln, sull'isola.",
            "Al termine della guerra risultava distrutto in un grado irrecuperabile il 20% degli edifici, il 50% nei quartieri centrali; 28,5 km² del territorio urbano erano coperti da macerie. Non erano più abitabili 600.000 appartamenti. Le strutture industriali e commerciali risultavano utilizzabili solo in parte. Gravemente danneggiate erano anche le infrastrutture, in particolare le linee ferroviarie urbane, S-Bahn ed U-Bahn (da Untergrundbahn, cioè \"ferrovia sotterranea\" o ferrovia metropolitana).",
            "La ricostruzione delle più importanti strutture urbane iniziò immediatamente dopo la fine della seconda guerra mondiale; in particolare occorreva rimettere in funzione anche solo provvisoriamente le reti di approvvigionamento, almeno i ponti più importanti e il traffico pubblico. Occorreva sgombrare le macerie: questo lavoro venne fatto soprattutto da donne, le cosiddette Trümmerfrauen – \"donne delle macerie\" in italiano; infatti le competenze professionali degli uomini presenti – quelli non morti, non gravemente feriti e prigionieri di guerra non ancora liberati – erano indispensabili. I singoli mattoni riutilizzabili vennero separati e puliti; anche travi, tubi ed altro materiale veniva riutilizzato, mentre le macerie restanti non riutilizzabili venivano portate in diverse zone, soprattutto periferiche, a formare colline, poi coperte di terra e piantumate. La maggiore di queste colline è il Teufelsberg, ai margini del Grunewald ed alto 114,7 m s.l.m. In tutta la città gli elementi illesi, restaurati o ricostruiti, convivono con quelli moderni. I risultanti contrasti costituiscono lo stile tipico della Berlino odierna e sono nel contempo una testimonianza indiretta delle distruzioni belliche. Il più noto – e in ogni caso uno dei pochi – edifici che ancora ai primi del XXI secolo danno una viva idea diretta delle distruzioni dovute ai bombardamenti, agli incendi e alla battaglia finale è la Gedächtniskirche (ossia \"Chiesa della Memoria\"), conservata allo stato di rudere per volontà della popolazione di Berlino Ovest e circondata dagli elementi architettonici moderni della chiesa nuova, inaugurata nel dicembre del 1961. La zona attorno alla Gedächtniskirche, il \"Nuovo Ovest\" dei primi anni del Novecento, fra i quartieri di Charlottenburg, Wilmersdorf e Schöneberg, divenne rapidamente un'importante zona commerciale di Berlino Ovest. Anche la sola Berlino Ovest durante gli anni del Muro – 480 degli 890 km² totali – era una città policentrica, altre importanti zone commerciali erano – e sono tuttora – il centro storico di Spandau e la Schloßstraße di Steglitz, dove nell'aprile del 1970 venne aperto uno dei primi centri commerciali tedeschi con oltre 50 negozi. Nacque invece in una zona periferica di Berlino Ovest, a ridosso del confine verso il settore sovietico e, dal 1961, del Muro, il Kulturforum. Il primo edificio nuovo fu la Philharmonie, costruita tra il 1960 e il 1963 su progetto di Hans Scharoun."};

    public int[] images_lubiana = {R.drawable.lubiana_storia_primaparte, R.drawable.lubiana_storia_secondaparte, R.drawable.lubiana_storia_terzaparte};
    public String[] titolo_lubiana = {"Dal VI secolo al XVII secolo", "Dal XVIII secolo al XIX secolo", "XX secolo"};
    public String[] descrizione_lubiana = {
            "Nel VI secolo si insediò il popolo degli sloveni i quali, nel IX secolo, passarono sotto la dominazione del popolo dei Franchi, ai quali si aggiunsero gli attacchi da parte degli ungheresi. Il nome della città, Luvigana, appare per la prima volta in un documento del 1144. Nel XIII secolo la città è composta di tre zone: Stari trg (centro storico), il Mestni trg (piazza) e Novi trg (città nuova). Nel 1220 ricevette lo status di città, che le garantiva il diritto di battere propria moneta. Nel 1270 la regione della Carniola (che corrisponde circa all'attuale Slovenia centro-occidentale), in cui rientra la città, entra tra i possedimenti di Ottocaro II di Boemia. Rodolfo I d'Asburgo ottiene la città nel 1278. La città, ribattezzata in tedesco Laibach, rimarrà alla casa d'Austria fino al 1809. La diocesi della città è stata fondata nel 1491 e la chiesa di Saint-Nicolas diviene la cattedrale. Nel XV secolo, la città acquisita fama di centro delle arti. Dopo un terremoto nel 1511, Lubiana viene ricostruita in uno stile rinascimentale e una nuova cinta è costruita intorno alla città. Nel XVI secolo la sua popolazione è composta di 5.000 abitanti, di cui il 70% di lingua slovena. Nel 1550 vengono stampati i primi due libri in sloveno compresa una traduzione della Bibbia. Nel 1597 sono i Gesuiti a costruire una nuova scuola, la quale poi diverrà un collegio. La città adotta negli anni seguenti uno stile architettonico barocco.",
            "Il dominio degli Asburgo venne brevemente interrotto durante le guerre napoleoniche e tra il 1809 e il 1813 Lubiana fu la capitale delle Province illiriche del Primo Impero francese. Nel 1815 la città ritornò in mano austriaca e dal 1816 al 1849 fu parte del Regno austriaco d'Illiria. Nel 1821 la città ospitò il congresso in cui sarà definita la geografia europea degli anni seguenti. Il primo treno da Vienna arriva in città nel 1849 e nel 1857 la linea è estesa a Trieste. L'illuminazione elettrica arriva nel 1898. Nel 1895 la città, che conta 31.000 abitanti, è vittima di un grave terremoto di magnitudo 6,1 sulla scala Richter. Il 10% degli edifici è distrutto, anche se si registra un numero di vittime contenuto. Diverse zone della città sono ricostruite in stile Art Nouveau.",
            "Nel 1918, con il collasso dell'Impero austro-ungarico, Lubiana passò al Regno dei Serbi, Croati e Sloveni poi tramutatosi in Regno di Jugoslavia. Nel 1929 divenne la capitale della provincia jugoslava della Dravska Banovina. Durante la Seconda guerra mondiale, la città fu occupata e annessa dall'Italia nel 1941. Lubiana e il territorio circostante (Bassa Carniola) divennero una provincia italiana della regione Venezia Giulia, di cui Lubiana fu capoluogo con sigla automobilistica LB. L'attuale territorio comunale era articolato - oltre che nel comune capoluogo di Lubiana Città - anche nei comuni di Dobrugne (Dobrunje), Gesizza (Ježica) e S. Vito (Šentvid). Per contrastare gli atti di rivolta compiuti dalla popolazione locale, nella notte fra il 22 e il 23 febbraio 1942 le autorità militari italiane cinsero con filo spinato e reticolati l'intero perimetro di Lubiana, disponendo un ferreo controllo su tutte le entrate e le uscite. Il recinto era lungo ben 41 chilometri. Furono arrestati 18.708 uomini; di questi 878 furono mandati in campo di concentramento. Fino alla capitolazione dell'Italia, avvenuta l'8 settembre 1943, le autorità militari italiane fucilarono, per rappresaglia, oltre 100 ostaggi. Le fucilazioni furono compiute presso la cava abbandonata Gramozna Jama, alla periferia di Lubiana. Successivamente arrivarono i tedeschi nel 1943. In seguito alla sconfitta dell'Asse, nel maggio 1945, le truppe tedesche e le milizie nazionaliste slovene si arresero all'armata comunista di Tito."};

    public int[] images_trieste = {R.drawable.trieste_storia_medioevo, R.drawable.trieste_storia_passaggioaustria, R.drawable.trieste_storia_irredentismo};
    public String[] titolo_trieste = {"Medioevo", "Passaggio all'Austria", "L'irredentismo e la prima unione all'Italia"};
    public String[] descrizione_trieste = {
            "Dopo la caduta dell'Impero romano d'Occidente, Trieste (Τεργέστη in greco bizantino) passò sotto il controllo della dirigenza bizantina fino al 788, quando venne occupata dai franchi. In seguito venne instaurato il dominio vescovile a Trieste. Nel 1098 risultava già diocesi vescovile con il nome latino di Tergestum. Nel XII secolo divenne un Libero Comune. Dopo secoli di battaglie contro la rivale Venezia, nel 1283 la città fu occupata dai Veneziani, ma le truppe Goriziane e quelle Patriarcali la riconquistarono. Successivamente Trieste si pose sotto la protezione (1382) del duca d'Austria conservando però una notevole autonomia fino al XVII secolo. La città di Trieste fu risparmiata dai saccheggi dei turchi, che nel 1470, durante una incursione diretta in Friuli, incendiarono il paese di Prosecco, a soli 8 km da Trieste. La presenza di numerosi documenti dedicati alla viticoltura nella Trieste medievale testimonia l'importanza che l'attività vitivinicola aveva nell'economia cittadina, in passato prettamente agricola. Infatti sino allo sviluppo dell'attività mercantile marittima seguito alla proclamazione del Porto franco, buona parte degli abitanti del piccolo borgo fortificato si dedicava alla viticoltura, che era praticata su tutto il territorio comunale, su terreno marnoso-arenaceo, nei punti più soleggiati, anche a ridosso della città. Trieste era quindi un borgo fortificato circondato da viti, caratteristica riprodotta in numerose stampe d'epoca e descritta da viaggiatori stranieri. Il ruolo assolutamente centrale che il vino aveva nell'economia triestina è comprovato dalla presenza, sia in ambito ecclesiastico che civile, di decime e sistemi tributari basati solo ed esclusivamente sul computo della redditività delle vigne, che quasi tutti i cittadini possedevano. Massimo successo di questa attività agricola triestina è senz'altro il Prosecco, vino nato dall'identificazione del castello di Prosecco con il castellum nobile vino Pucinum di memoria classica. La produzione di questo vino ben presto si allargò oltre i confini triestini nel goriziano, in Friuli, Dalmazia e soprattutto in Veneto, dove si sviluppò sino a diventare uno dei vini più famosi al mondo, mentre la sua produzione cessò sia a Trieste che nel Carso triestino, per riprendere a partire dagli anni Duemila a seguito della riorganizzazione del relativo disciplinare",
            "Nel 1719 Trieste divenne porto franco. Unico sbocco sul mare Adriatico dell'Impero austriaco, la città fu oggetto di investimenti conoscendo un tumultuoso sviluppo, passando dai 3000 abitanti di inizio Settecento a più di 200.000 ad inizio Novecento e diventando nel 1867 capoluogo della regione del cosiddetto Litorale austriaco dell'impero (l'österreichisches Küstenland). In questo periodo nacque e prosperò una nuova borghesia mercantile arricchitasi grazie al commercio marittimo. Grazie al suo status privilegiato di unico porto commerciale della Cisleithania e primo porto dell'Austria-Ungheria, Trieste divenne una città fortemente cosmopolita, plurilingue e plurireligiosa, come dimostra il censimento del comune del 31 dicembre 1910: il 51,83% della popolazione del comune (59,46% della città) era italofona, a cui si aggiungevano gli italiani immigrati dal Regno d'Italia e pertanto considerati stranieri (12,9% della città), il 24,79% degli abitanti era di lingua slovena (12,64% in città), l'1,04% di lingua tedesca (1,34% in città), mentre si contavano molte comunità minori: serbi, croati, armeni, ebrei, greci, ungheresi, inglesi e svizzeri. Nel XVIII secolo in città il dialetto triestino (idioma settentrionale di tipo veneto) sostituì il tergestino, l'antico dialetto locale di tipo retoromanzo. Il triestino, parlato anche da scrittori e filosofi, continua ad essere tuttora l'idioma più usato in ambito familiare e in molti contesti sociali di natura informale e talvolta anche formale, affiancandosi, in una situazione di diglossia, all'italiano, lingua amministrativa e principale veicolo di comunicazione nei rapporti di carattere pubblico.",
            "Trieste fu, con Trento, oggetto e al tempo stesso centro di irredentismo, movimento che negli ultimi decenni del XIX secolo e agli inizi del XX aspirava ad un'annessione della città all'Italia. L'Impero austro-ungarico veniva visto da molti come un naturale protettore del gruppo etnico slavo (verbali del consiglio dei ministri imperiali asburgici del 1866, dopo la perdita di Venezia, per ridurre dove possibile l'influenza dell'elemento italiano, in favore di quello germanico o slavo quando questi fossero presenti) che viveva sia in città che in quelle zone multietniche che costituivano il suo immediato retroterra (che iniziò ad essere definito in quegli anni con il termine di Venezia Giulia). Nella città, durante manifestazioni pro italiane seguenti una petizione firmata da 5.858 cittadini verso l'Inclito Consiglio della città, richiedente il diritto della lingua italiana nelle scuole statali, avvenute tra il 10 e il 12 luglio 1868, scoppiarono scontri e violenze nelle strade principali cittadine con gli sloveni locali arruolati fra i soldati asburgici, che provocarono la morte dello studente Rodolfo Parisi, ucciso con 26 colpi di baionetta, e di due operai, Francesco Sussa e Niccolo' Zecchia. Agli inizi del Novecento il gruppo etnico sloveno era in piena ascesa demografica, sociale ed economica. Ciò spiega come l'irredentismo assunse spesso, nella città giuliana, dei caratteri marcatamente anti-slavi che vennero perfettamente incarnati dalla figura di Ruggero Timeus. A novembre del 1918 - al termine della Prima guerra mondiale - il Regio esercito entrò a Trieste acclamato da quella parte della popolazione che era di sentimenti italiani, dichiarando lo stato di occupazione ed il coprifuoco. La sicura imminente annessione della città e della Venezia Giulia all'Italia - invano contrastata al tavolo della pace dai rappresentanti del neonato Regno dei Serbi, Croati e Sloveni, che reclamarono l'annessione della città e del suo entroterra - fu accompagnata da un forte inasprimento dei rapporti tra il gruppo etnico italiano e quello sloveno, traducendosi talvolta anche in scontri armati. L'11 luglio 1920 a Spalato scoppiarono dei disordini nel corso dei quali un cittadino croato e due militari italiani vennero uccisi. Due giorni dopo i fascisti di Trieste organizzarono una manifestazione in città, durante la quale fu ucciso in circostanze mai chiarite un giovane italiano di nome Giovanni Nini. La folla, incitata dagli squadristi capitanati da Francesco Giunta, circondò in massa il Narodni dom, il massimo centro culturale cittadino degli sloveni e delle altre nazionalità slave locali. Anche qui venne ferito in circostanze non chiare Luigi Casciana, un ufficiale italiano in licenza a Trieste, che morirà in ospedale qualche giorno dopo. Il Narodni dom venne dato alle fiamme: lo sloveno Hugo Roblek, ivi ospitato, morì gettandosi dalla finestra per sfuggire alle fiamme. Lo stesso giorno degli squadristi devastarono anche gli uffici delle Jadranska banka, la filiale della Ljubljanska kreditna banka, la tipografia del settimanale Edinost, la Cassa di Risparmio Croata, la scuola serba e numerosi altri luoghi di aggregazione delle comunità etniche presenti a Trieste, oltre a quelli del partito socialista. Con la firma del Trattato di Rapallo del novembre 1920, Trieste passò definitivamente all'Italia, inglobando nel proprio territorio provinciale zone dell'ex Contea Principesca di Gorizia e Gradisca, dell'Istria e della Carniola."};

    public int[] images_norimberga = {R.drawable.norimberga_storia_origini, R.drawable.norimberga_storia_commercio, R.drawable.norimberga_storia_secondaguerramondiale};
    public String[] titolo_norimberga = {"Origini", "Norimberga e Venezia", "Seconda Guerra Mondiale"};
    public String[] descrizione_norimberga = {
            "La prima citazione della città di Nuorenberc (monte roccioso) risale al 1050 in un documento dell'imperatore Enrico III; nel 1219 l'imperatore Federico II le accorda il privilegio di intitolarsi città libera e di autogovernarsi con istituzioni autonome. La città si espanse dal 1400 al 1600 grazie ad una fiorente attività commerciale sostenuta da scambi con tutta l'Europa ed una altrettanto vivace vita culturale e artistica. Storicamente, la città, di aspetto monumentale, faceva da sfondo tradizionale per le diete imperiali.",
            "Norimberga si era dotata di molte leggi ispirate al diritto romano, mutando poi politica per adottare le istituzioni pubbliche di Venezia. Norimberga chiese e nel 1506 ottenne copia delle leggi veneziane, come raffigurato a Palazzo Ducale. La scoperta del Nuovo Mondo (nel 1492) e l'esclusione della città dalle nuove vie commerciali seguiti dalla guerra dei Trent'anni provocarono una lenta decadenza interrotta solo nel XIX secolo con la nascita e l'espansione dell'industria del giocattolo. La decadenza di Norimberga fu contestuale a quella di Venezia. Con la scoperta del Capo di Buona Speranza (1497), il commercio con Venezia andò scemando; altre vie presero le merci delle Indie; altre nazioni profittarono di un traffico sì allora esclusivo. Cessarono le importazioni da Venezia e le riesportazioni verso il Nord Europa e la Russia. Il graduale impoverimento della ricchezza dei cittadini mutò di conseguenza la Repubblica in Oligarchia, le famiglie patrizie disdgnare il lavoro commerciale, tesaurizzare i loro denari nelle rendita, bloccando l'afflusso di turisti o migranti stranieri.",
            "Nella storia contemporanea, Norimberga è stata la roccaforte del potere nazista insieme a Monaco di Baviera e alla capitale Berlino. La città ha rivestito un ruolo importante sia come sede di raduni di propaganda hitleriana, presso lo Zeppelinwiese (le cui strutture sono ancora parzialmente visibili) in cui si teneva annualmente il Parteitag, e città in cui furono emanate le leggi razziali del 1935, sia, alla fine della seconda guerra mondiale, come sede del tribunale speciale alleato che processò i criminali di guerra nazisti."};

    public SlideAdapter_storia(Context context){
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
        View view = inflater.inflate(R.layout.slide_storia, container, false);

        LinearLayout layoutslide = view.findViewById(R.id.slidelinear_storia);

        Storia st = new Storia();
        st = (Storia) view.getContext();
        String s = st.getS();

        ImageView img = view.findViewById(R.id.mg);
        TextView t1 = view.findViewById(R.id.ttl);
        TextView t2 = view.findViewById(R.id.descr);

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
