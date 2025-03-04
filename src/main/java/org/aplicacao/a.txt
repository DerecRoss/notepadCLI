package org.aplicacao;

import org.aplicacao.controller.NoteController;

import java.nio.file.Path;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        NoteController noteController = new NoteController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to NotePad CLI");
        System.out.println(".+#%@@%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%@%#-.\n" +
                "                     .*@+:..                                        ..:@%-.                         \n" +
                "                    .##.                                           .%+. :@#:.                       \n" +
                "                   .-@-                                            .%+.  .=@*:.                     \n" +
                "                   .=%-                                            .%+.    .+@+.                    \n" +
                "                   .=%-                                            .%+.     .:*@=                   \n" +
                "                   .=%-                                            .%+.        :%@-                 \n" +
                "                   .=%-                                            .%+:..........-@+.               \n" +
                "                   .=%-                                            .-**********=..#*.               \n" +
                "                   .=%-           ..+####=.                                      .**.               \n" +
                "                   .=%-           -%-....=%.    .-=++:.                          .**.               \n" +
                "                   .=%-          .%-.......#+:%#=....:%=.                        .**.               \n" +
                "                   .=%-:=++*+==:.-#.........-%:.......-#:                        .**.               \n" +
                "                   .=@%++=----=+%%#..--.....-#:....+@*:#:                        .**.               \n" +
                "                  .%#----=-=-----+#.-%%*....-#:.....:.=+.                        .**.               \n" +
                "                .:%*--------------%-........=*-......-#:                         .**.               \n" +
                "                :#+--------------:=#-......:%++*%+.:*#:                          .**.               \n" +
                "               .**--:::::::::::::---=%*+=+*%-::::=%+:.                           .**.               \n" +
                "               -#=-:::::::::::::::::::-----::::::-=%.                            .**.               \n" +
                "               *+:::=*-::::-:::::-::::::::::::----#@.                            .**.               \n" +
                "              :#:-=##+*%=-------%**+--==+#%+++%@#+:                              .**.               \n" +
                "              :*-+*.=*#::*%@###%%***+++****:-.                                   .**.               \n" +
                "        .....:#%%%--*#++*#=#.    -%=-=..-*++==+......                            .**.               \n" +
                "      :#+=#=*#=::::*+*=:-=*=::::::#*#::::#%::::::=@: .+@%@#.                     .**.               \n" +
                "      :=+++#*#%===--##%*=---==--=+##*=---++===+==@+:.+#=...                      .**.               \n" +
                "               ***.  ... ....     .:-.   .+***#+....                             .**.               \n" +
                "               -#+-    .##+++%=            ....                                                     \n" +
                "               .++%:  :%*=..*+*=   .+%%%+.        +#                             .*+.               \n" +
                "                :*=#-  +#%+#.*+#:  :#: :#-        +%                             .#+.               \n" +
                "                 .*+*=. .... -*#:  :#: :#-        +%                             .#+.               \n" +
                "                  .-%**+.  .-#*%:  :#: :#-        +%                             .#+.               \n" +
                "                   .=@%#***+##=:.  :#: :#-       .*%...                          .#+.               \n" +
                "                   .=%- ....       :#: :#-..::.. .+%....:::.. ..::... ..::..  ..::#+. :.   ::.      \n" +
                "                   .=%-            :#: :#-%#.:#+  +%  =@-.-@-.-#-.*%. *@..** .**..#+. %=   **.      \n" +
                "                   .=%-            :#: :#-%* .#+  +%  =@: -@-.-#: -%. --  +# .*=..*++*%#+=#%%#:     \n" +
                "                   .=%-            :#: :#-%* .#+  +%  =@: -@-.-#: -%. -#%%%# .*=..*+..%=...**..     \n" +
                "                   .=%-            :#: :#-%* .#+  +%  =@=.-@-.-#: -%. *%  +# .*=..*+. @+   *#.      \n" +
                "                   .=%-            :#: :#-%* .#+  +%  =@-::.  -#: -%. *%  +# .*=..*+.               \n" +
                "                   .=%-            :#: :#-%* .#+  +%  =@: :%-.-#: -%. *%  +# .*=..*+.               \n" +
                "                   .=%-            :#: :#-+@##%:  +%  :#%#%#:.-%%#@*. -@##%= .=%##%-.               \n" +
                "                   .=%-            :#: ... ....   +@    ....  -#:..    .....   ....                 \n" +
                "                   .=%-            :#:                        -#:                                   \n" +
                "                   .=%-            :#:                        -#:                                   \n" +
                "                   .-@-            :#:                        .:.                                   \n" +
                "                    .##.           :#:                                                              \n" +
                "                     .#@+...                                                                        \n" +
                "                       :*%@@%%%%%%%%%.");
        System.out.println("**********************");
        System.out.println("Desenvolvido com Java");
        System.out.println("**********************");
        System.out.println("Escolha sua opção:");
        System.out.println("1. Ciar Nota");
        System.out.println("2. Editar Nota");
        System.out.println("3. Listar Notas");
        System.out.println("4. Sair");

        int option = scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                System.out.println("Insira o título:");
                String noteTitle = scanner.nextLine();
                noteController.createNote(noteTitle);
            case 2:
                System.out.println("Insira o conteúdo da nota:");
                String newContent = scanner.nextLine();
                noteController.editNote(newContent);
            case 3:
                System.out.println("Listando suas notas....");
                ListNotes.listNotes();
                break;
            case 4:
                System.out.println("Saindo de NotePad CLI. Goodbye!");
                break;
            default:
                System.out.println("Opção Inválida.");
                break;
        }
        System.out.println();
        scanner.close();
    }
    }
