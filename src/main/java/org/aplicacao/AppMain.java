package org.aplicacao;

import org.aplicacao.repository.NoteRepository;
import org.aplicacao.model.Note;

import java.util.List;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args) {
        NoteRepository noteRepository = new NoteRepository();
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
                String title = scanner.nextLine();
                System.out.println("Insira o conteúdo da nota:");
                String content = scanner.nextLine();
                noteRepository.createNote(title, content);
                System.out.println("Nota criada com sucesso!");
                break;
            case 2:
                System.out.println("Insira o ID da nota para editar:");
                Long id = scanner.nextLong();
                scanner.nextLine();
                System.out.println("Insíra novo conteúdp:");
                String newContent = scanner.nextLine();
                noteRepository.editNote(id, newContent);
                System.out.println("Note atualizada com sucesso!");
                break;
            case 3:
                System.out.println("Listando suas notas:");
                List<Note> notes = noteRepository.listNotes();
                for (Note note : notes) {
                    System.out.println(note.getId() + " - " + note.getTitle() + ": " + note.getContent());
                }
                break;
            case 4:
                System.out.println("Saindo de Notepad CLI...");
                noteRepository.close();
                break;
            default:
                System.out.println("opção inválida");
        }

        scanner.close();
    }
}
