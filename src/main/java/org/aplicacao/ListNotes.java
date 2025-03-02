package org.aplicacao;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path> {
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".txt")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class ListNotes {
    public static void listNotes() {
        Path root = Paths.get("notepadCLI/notes/");
        try {
            Files.walkFileTree(root, new ListAllFiles());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
