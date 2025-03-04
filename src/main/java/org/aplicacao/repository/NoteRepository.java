package org.aplicacao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.aplicacao.model.Note;

import java.util.List;

public class NoteRepository {
    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("notepadPU");

    public void createNote(String title, String content) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Note note = new Note(title, content);
        em.persist(note);
        em.getTransaction().commit();
        em.close();
    }

    public void editNote(Long id, String newContent) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Note note = em.find(Note.class, id);
        if (note != null) {
            note.setContent(newContent);
            em.merge(note);
        }
        em.getTransaction().commit();
        em.close();
    }

    public List<Note> listNotes() {
        EntityManager em = emf.createEntityManager();
        List<Note> notes = em.createQuery("SELECT n FROM Note n", Note.class).getResultList();
        em.close();
        return notes;
    }

    public void close() {
        emf.close();
    }
}