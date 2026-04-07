package com.example.stickyNotesAPI.repo;

import com.example.stickyNotesAPI.notes.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
