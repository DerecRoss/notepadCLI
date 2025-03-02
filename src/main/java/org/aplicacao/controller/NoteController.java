package org.aplicacao.controller;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NoteController {
    public Path archive;
    public Path createNote(String fileName){
        Path directory = Paths.get("notepadCLI/notes/"+fileName+".txt");
        try {
            Path file = Files.createFile(directory);
            this.archive = file;
            return archive;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return archive;
    }
    public Path editNote(String msg){
        if (Files.exists(archive)){
            try(FileWriter fw = new FileWriter(String.valueOf(archive), true);
                BufferedWriter bw = new BufferedWriter(fw)){
                    bw.write(msg);
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return archive;
    }

}
