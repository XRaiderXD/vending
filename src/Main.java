import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* System.out.println("Wat wil je eten?");
        Scanner scan = new Scanner(System.in);
        String eten = scan.next();
        System.out.println("Then "+ eten +" it is");
        */


        double geld = 10;

        while (geld > 0) {

            System.out.println("Wil jij iets eten?");
            Scanner scan = new Scanner(System.in);
            String ietseten = scan.next();
            if (ietseten.equals("ja")) {
                System.out.println("Warm of koud?");
            } else if (ietseten.equals("nee")) {
                System.out.println("will jij iets drinken?");
                String drinken = scan.next();
                if (drinken.equals("ja")) {
                    System.out.println("Wil je dan met of zonder prik?");
                }
                String prik = scan.next();
                if (prik.equals("met")) {
                    System.out.println("Wil je dan Cola of Sprite?");
                    String colasprite = scan.next();
                    if (colasprite.equals("cola")) {
                        System.out.println("Hier is uw cola dat is dan 2,50.");
                        geld = geld - 2.50;
                        System.out.println("           .e$.                           z$$e.d$$$.      z$b   z\n" +
                                "         d$\" .d                        .$$\" d\"F ^*$$$e  z$\" $ .$\n" +
                                "       e$P   $%                       d$P .\"  F    \"$$\"d$  .e$\"\n" +
                                "      $$F                           .$$\"  F  J       \"$$z$$$\"\n" +
                                "    .$$\"   .$\"3   .$\"\"  .$P $$  $$ 4$$\"  $  4\"       $$  .\n" +
                                "   .$$F   d$  4  d$ d$ z$\" J$%    4$$\"   $.d\"       $$  .\"\n" +
                                "   $$P   $$ \".$z$$  ^ z$\" .$P    .$$F              $$\" .\"\n" +
                                "  $$$   d$F  J $$F   z$$  $$ .   $$$   ze     .c  J$F z  .e.ze\n" +
                                " 4$$F   $$  4\" $$   z$$  $$\".\"  d$$  d$\" $  z$\" $ $$ @  $$\".$F\n" +
                                " $$$   4$$.d\" 4$$ .$3$$.$$$e%   $$P J$P  P d$*  %$$$\"  $$  $$\n" +
                                " $$$    $$*    $$$\" ^$$\"'$$    4$$% $$\" . d$\" \"$\"$$   $$  $$\n" +
                                " $$$                           $$$  \"   P4$P  z 4$F  $$\" J$% %\n" +
                                " '$$c          .e$$$$$$$$e     $$$F    $ $$  z\" $$  $$$ 4$$ P\n" +
                                "  \"$$b.   .e$*\"     \"$$$$$$$   '$$$c.dP  $$$$\"  $$$\"$$$$$$$P\n" +
                                "    \"*$$$*\"           \"          *$$*\"   \"$*    \"$\" ^$* \"$\"");
                        System.out.println("Je hebt nog " + geld + " over");
                        System.out.println(" ");
                        continue;
                    } else if (colasprite.equals("sprite")) {
                        System.out.println("Hier is uw sprite dat is dan 2,50.");
                        geld = geld - 2.50;
                        System.out.println("                _ _       \n" +
                                "               (_) |      \n" +
                                " ___ _ __  _ __ _| |_ ___ \n" +
                                "/ __| '_ \\| '__| | __/ _ \\\n" +
                                "\\__ \\ |_) | |  | | ||  __/\n" +
                                "|___/ .__/|_|  |_|\\__\\___|\n" +
                                "    | |                   \n" +
                                "    |_|                   ");
                        System.out.println("Je hebt nog " + geld + " over");
                        System.out.println(" ");
                        continue;
                    } else if (ietseten.equals("nee")) {
                        System.out.println("oke dan niet");
                        System.out.println(" ");
                        break;
                    }
                } else if (prik.equals("zonder")) {
                    System.out.println("wilt u dan Thee of Ice Tea?");
                }
                String tea = scan.next();
                if (tea.equals("ice Tea")) {
                    System.out.println("Hier is uw Ice Tea dat is dan 2,50.");
                    geld = geld - 2.50;
                    System.out.println("  ........\n" +
                            "  |      |]\n" +
                            "  \\      /\n" +
                            "   `----'");
                    System.out.println("Je hebt nog " + geld + " over");
                    System.out.println(" ");
                } else if (tea.equals("thee")) {
                    System.out.println("Hier is uw Thee dat is dan 2,50.");
                    geld = geld - 2.50;
                    System.out.println("  ........\n" +
                            "  |      |]\n" +
                            "  \\      /\n" +
                            "   `----'");
                    System.out.println("Je hebt nog " + geld + " over");
                    System.out.println(" ");
                    continue;
                }
            }


            String warmofkoud = scan.next();
            if (warmofkoud.equals("warm")) {
                System.out.println("Mag het uit de oven komen?");

                String oven = scan.next();
                if (oven.equals("ja")) {
                    System.out.println("lasagne ok?");

                    String lasagne = scan.next();
                    if (lasagne.equals("ja")) {
                        System.out.println("dat is dan 7,50 alsjeblieft");
                        geld = geld - 7.50;
                        System.out.println(" ");
                        System.out.println("   | ~~~~~~~~~~~~~|");
                        System.out.println("   |~~~~~~~~~~~~~ |");
                        System.out.println("   | ~~~~~~~~~~~~~|");
                        System.out.println("   |______________|");
                        System.out.println(" ");
                        System.out.println("Je hebt nog " + geld + " over");
                        System.out.println(" ");
                        if (geld < 1.50) {
                            break;
                        }
                        continue;
                    } else if (lasagne.equals("nee")) {
                        System.out.println("Wil je dan Pizza?");
                        String pizza;
                        pizza = scan.next();
                        if (pizza.equals("ja")) {
                            System.out.println("hier is uw pizza, dat is dan 7,50 alsjeblieft");
                            geld = geld - 7.50;
                            System.out.println(" ");
                            System.out.println("                ____\n" +
                                    "               _,--~~    ~~--._\n" +
                                    "            ,/'  m%%%%%%=@%%m  `\\.\n" +
                                    "           /' m%%o(_)%%o%%%%o%%m `\\\n" +
                                    "         /' %%@=%o%%%o%%%o%(_)o%%% `\\\n" +
                                    "        /  %o%%%%%=@%%%(_)%%o%%@=%%  \\\n" +
                                    "       |  (_)%(_)%%o%%%o%%%%=@(_)%%%  |\n" +
                                    "       | %%o%%%%o%%%(_)%%o%%o%%%%o%%% |\n" +
                                    "       | %%o%(_)%%%%%o%(_)%%%o%%o%o%% |\n" +
                                    "       |  (_)%%=@%(_)%o%o%%(_)%o(_)%  |\n" +
                                    "        \\ ~%%o%%%%%o%o%=@%%o%%@%%o%~ /\n" +
                                    "         \\. ~o%%(_)%%%o%(_)%%(_)o~ ,/\n" +
                                    "           \\_ ~o%=@%(_)%o%%(_)%~ _/\n" +
                                    "             `\\_~~o%%%o%%%%%~~_/'\n" +
                                    "                `--..____,,--'");
                            System.out.println("Je hebt nog " + geld + " over");
                            System.out.println(" ");
                            continue;
                        } else if (pizza.equals("nee")) {
                            System.out.println("wilt u dan een Quiche?");
                            String quiche;
                            quiche = scan.next();
                            if (quiche.equals("ja")) {
                                System.out.println("hier is uw Quiche, dat is dan 7,50 alsjeblieft");
                                geld = geld - 7.50;
                                System.out.println(" ");
                                System.out.println("             (\n" +
                                        "              )\n" +
                                        "         __..---..__\n" +
                                        "     ,-='  /  |  \\  `=-.\n" +
                                        "    :--..___________..--;\n" +
                                        "     \\.,_____________,./  \n");
                                System.out.println("Je hebt nog " + geld + " over");
                                System.out.println(" ");
                                continue;
                            } else if (quiche.equals("nee")) {
                                System.out.println("Wil je dan gebakken vis?");
                                String vis;
                                vis = scan.next();
                                if (vis.equals("ja")) {
                                    System.out.println("hier is uw gebakken vis, dat is dan 7,50 alsjeblieft");
                                    geld = geld - 7.50;
                                    System.out.println(" ");
                                    System.out.println("\n" +
                                            "           .'|_.-\n" +
                                            "         .'  '  /_\n" +
                                            "      .-\"    -.   '>\n" +
                                            "   .- -. -.    '. /    /|_\n" +
                                            "  .-.--.-.       ' >  /  /\n" +
                                            " (o( o( o )       \\_.\"  <\n" +
                                            "  '-'-''-'            ) <\n" +
                                            "(       _.-'-.   ._\\.  _\\\n" +
                                            " '----\"/--.__.-) _-  \\|\n" +
                                            "       \"V\"\"    \"V\"");
                                    System.out.println("Je hebt nog " + geld + " over");
                                    System.out.println(" ");
                                    continue;
                                } else if (vis.equals("nee")) {
                                    System.out.println("Wil je een saucijzen broodje?");
                                    String saucijzenbroodje;
                                    saucijzenbroodje = scan.next();
                                    if (saucijzenbroodje.equals("ja")) {
                                        System.out.println("Hier is uw saucijzen broodje dat is dan 2,50.");
                                        geld = geld - 2.50;
                                        System.out.println("        _ _               _                         _ _      \n" +
                                                "                      (_|_)             | |                       | (_)     \n" +
                                                "  ___  __ _ _   _  ___ _ _ _______ _ __ | |__  _ __ ___   ___   __| |_  ___ \n" +
                                                " / __|/ _` | | | |/ __| | |_  / _ \\ '_ \\| '_ \\| '__/ _ \\ / _ \\ / _` | |/ _ \\\n" +
                                                " \\__ \\ (_| | |_| | (__| | |/ /  __/ | | | |_) | | | (_) | (_) | (_| | |  __/\n" +
                                                " |___/\\__,_|\\__,_|\\___|_| /___\\___|_| |_|_.__/|_|  \\___/ \\___/ \\__,_| |\\___|\n" +
                                                "                       _/ |                                        _/ |     \n" +
                                                "                      |__/                                        |__/      ");
                                        System.out.println("Je hebt nog " + geld + " over");
                                        System.out.println(" ");
                                        continue;
                                    } else if (saucijzenbroodje.equals("nee")) {
                                        System.out.println("frikandelbroodje?");
                                        String frikandelbroodje;
                                        frikandelbroodje = scan.next();
                                        if (frikandelbroodje.equals("ja")) {
                                            System.out.println("Hier is uw saucijzen broodje dat is dan 2,50.");
                                            geld = geld - 2.50;
                                            System.out.println("  __      _ _                   _      _ _                         _ _      \n" +
                                                    "  / _|    (_) |                 | |    | | |                       | (_)     \n" +
                                                    " | |_ _ __ _| | ____ _ _ __   __| | ___| | |__  _ __ ___   ___   __| |_  ___ \n" +
                                                    " |  _| '__| | |/ / _` | '_ \\ / _` |/ _ \\ | '_ \\| '__/ _ \\ / _ \\ / _` | |/ _ \\\n" +
                                                    " | | | |  | |   < (_| | | | | (_| |  __/ | |_) | | | (_) | (_) | (_| | |  __/\n" +
                                                    " |_| |_|  |_|_|\\_\\__,_|_| |_|\\__,_|\\___|_|_.__/|_|  \\___/ \\___/ \\__,_| |\\___|\n" +
                                                    "                                                                    _/ |     \n" +
                                                    "                                                                   |__/      ");
                                            System.out.println("Je hebt nog " + geld + " over");
                                            System.out.println(" ");
                                            continue;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else if (oven.equals("nee")){
                    String soep;
                    System.out.println("Wilt u soep?");
                    soep = scan.next();

                    if (soep.equals("ja")){
                        System.out.println("Hier is uw soep dat is dan 2,50.");
                        geld = geld - 2.50;
                        System.out.println("\n" +
                                "                     (\n" +
                                "                  )    )\n" +
                                "               _.(--\"(\"\"\"--.._\n" +
                                "              /, _..-----).._,\\\n" +
                                "             |  `'''-----'''`  |\n" +
                                "              \\               /\n" +
                                "               '.           .'");
                        System.out.println("Je hebt nog " + geld + " over");
                        System.out.println(" ");
                        continue; }
                        else if (soep.equals("nee")){
                        String friet;
                        System.out.println("Wil je dan friet?");
                        friet = scan.next();
                        if (friet.equals("ja")){
                            System.out.println("Hier is uw friet dat is dan 2,50.");
                            geld = geld - 2.50;
                            System.out.println(	"\uD83C\uDF5F");
                            System.out.println("Je hebt nog " + geld + " over");
                            System.out.println(" ");
                            continue;


                        }
                        else if (friet.equals("nee")){
                            System.out.println("Wil je dan pasta?");
                            String pasta;
                            pasta = scan.next();
                            if (pasta.equals("ja")){
                                System.out.println("Hier is uw pasta dat is dan 5 euro.");
                                geld = geld - 5;
                                System.out.println("\uD83C\uDF5D");
                                System.out.println("Je hebt nog " + geld + " over");
                                System.out.println(" ");
                                continue;
                            }
                        }

                    }

                }
            } else if (warmofkoud.equals("koud")) {
                System.out.println("wilt u Appeltaart, redvelvet, birthdaycake, roomcake, citroencake of een cheesecake?");
                String appeltaart;
                appeltaart = scan.next();
                if (appeltaart.equals("appeltaart")) {
                    System.out.println("Hier is uw appeltaart dat is dan 2,50.");
                    geld = geld - 2.50;
                    System.out.println("        _,..---..,_\n" +
                            "    ,-\"`    .'.    `\"-,\n" +
                            "   ((      '.'.'      ))\n" +
                            "    `'-.,_   '   _,.-'`\n" +
                            "   `\\  `\"\"\"\"\"`  /`\n" +
                            "        `\"\"-----\"\"`");
                    System.out.println("Je hebt nog " + geld + " over");
                    System.out.println(" ");
                    continue;
                }
                if (appeltaart.equals("birthdaycake")) {
                    System.out.println("Hier is uw appeltaart dat is dan 2,50.");
                    geld = geld - 2.50;
                    System.out.println("\n" +
                            "           ~                  ~\n" +
                            "     *                   *                *       *\n" +
                            "                  *               *\n" +
                            "  ~       *                *         ~    *\n" +
                            "              *       ~        *              *   ~\n" +
                            "                  )         (         )              *\n" +
                            "    *    ~     ) (_)   (   (_)   )   (_) (  *\n" +
                            "           *  (_) # ) (_) ) # ( (_) ( # (_)       *\n" +
                            "              _#.-#(_)-#-(_)#(_)-#-(_)#-.#_\n" +
                            "  *         .' #  # #  #  # # #  #  # #  # `.   ~     *\n" +
                            "           :   #    #  #  #   #  #  #    #   :\n" +
                            "    ~      :.       #     #   #     #       .:      *\n" +
                            "        *  | `-.__                     __.-' | *\n" +
                            "           |      `````\"\"\"\"\"\"\"\"\"\"\"`````      |         *\n" +
                            "     *     |         | ||\\ |~)|~)\\ /         |\n" +
                            "           |         |~||~\\|~ |~  |          |       ~\n" +
                            "   ~   *   |                                 | *\n" +
                            "           |      |~)||~)~|~| ||~\\|\\ \\ /     |         *\n" +
                            "   *    _.-|      |~)||~\\ | |~|| /|~\\ |      |-._\n" +
                            "      .'   '.      ~            ~           .'   `.  *\n" +
                            "  jgs :      `-.__                     __.-'      :\n" +
                            "       `.         `````\"\"\"\"\"\"\"\"\"\"\"`````         .'\n" +
                            "         `-.._                             _..-'\n" +
                            "              `````\"\"\"\"-----------\"\"\"\"`````\n" +
                            "Copy to Clipboard\n");
                    System.out.println("Je hebt nog " + geld + " over");
                    System.out.println(" ");
                    continue;
                }
                if (appeltaart.equals("cheesecake")) {
                    System.out.println("Hier is cheesecake dat is dan 2,50.");
                    geld = geld - 2.50;
                    System.out.println("\n" +
                            "()()()()()()\n" +
                            "|\\         |\n" +
                            "|.\\. . . . |\n" +
                            "\\'.\\       |\n" +
                            " \\.:\\ . . .|\n" +
                            "  \\'o\\     |\n" +
                            "   \\.'\\. . |\n" +
                            "    \\\".\\   |\n" +
                            "     \\'`\\ .|\n" +
                            "      \\.'\\ |\n" +
                            "       \\__\\|");
                    System.out.println("Je hebt nog " + geld + " over");
                    System.out.println(" ");
                    continue;}
                    if (appeltaart.equals("roomcake")){
                        System.out.println("Hier is uw roomcake dat is dan 2,50.");
                        geld = geld - 2.50;
                        System.out.println("\n" +
                                "()()()()()()\n" +
                                "|\\         |\n" +
                                "|.\\. . . . |\n" +
                                "\\'.\\       |\n" +
                                " \\.:\\ . . .|\n" +
                                "  \\'o\\     |\n" +
                                "   \\.'\\. . |\n" +
                                "    \\\".\\   |\n" +
                                "     \\'`\\ .|\n" +
                                "      \\.'\\ |\n" +
                                "       \\__\\|");
                        System.out.println("Je hebt nog " + geld + " over");
                        System.out.println(" ");
                        continue; }
                        if (appeltaart.equals("citroencake")){
                            System.out.println("Hier is uw citroencake dat is dan 2,50.");
                            geld = geld - 2.50;
                            System.out.println("\n" +
                                    "()()()()()()\n" +
                                    "|\\         |\n" +
                                    "|.\\. . . . |\n" +
                                    "\\'.\\       |\n" +
                                    " \\.:\\ . . .|\n" +
                                    "  \\'o\\     |\n" +
                                    "   \\.'\\. . |\n" +
                                    "    \\\".\\   |\n" +
                                    "     \\'`\\ .|\n" +
                                    "      \\.'\\ |\n" +
                                    "       \\__\\|");
                            System.out.println("Je hebt nog " + geld + " over");
                            System.out.println(" ");
                            continue; }
                    else if (appeltaart.equals("Redvelvet")) {
                    System.out.println("Hier is Red Velvet dat is dan 2,50.");
                    geld = geld - 2.50;
                    System.out.println("\n" +
                            "()()()()()()\n" +
                            "|\\         |\n" +
                            "|.\\. . . . |\n" +
                            "\\'.\\       |\n" +
                            " \\.:\\ . . .|\n" +
                            "  \\'o\\     |\n" +
                            "   \\.'\\. . |\n" +
                            "    \\\".\\   |\n" +
                            "     \\'`\\ .|\n" +
                            "      \\.'\\ |\n" +
                            "       \\__\\|");
                    System.out.println("Je hebt nog " + geld + " over");
                    System.out.println(" ");
                    continue;
                }

            }
        }


    }
}



