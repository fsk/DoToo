package com.doto.doto.controller;

import com.doto.doto.dto.documents.NotesDto;
import com.doto.doto.dto.request.createrequest.CreateNotesRequest;
import com.doto.doto.service.NotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/notes")
@RequiredArgsConstructor
public class NotesController {

    private final NotesService notesService;

    @PostMapping
    public ResponseEntity<NotesDto> createNotes(@RequestBody CreateNotesRequest createNotesRequest){
        return ResponseEntity.ok(notesService.createNotes(createNotesRequest));
    }
}
