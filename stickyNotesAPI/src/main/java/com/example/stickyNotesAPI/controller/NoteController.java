package com.example.stickyNotesAPI.controller;

import com.example.stickyNotesAPI.notes.Note;
import com.example.stickyNotesAPI.repo.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notes")
@CrossOrigin("*")
public class NoteController {

    @Autowired
    private NoteRepository repo;

    @GetMapping
    public List<Note> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Note add(@RequestBody Note note) {
        return repo.save(note);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
