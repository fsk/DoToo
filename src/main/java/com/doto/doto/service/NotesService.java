package com.doto.doto.service;

import com.doto.doto.documents.Notes;
import com.doto.doto.dto.documents.NotesDto;
import com.doto.doto.dto.request.createrequest.CreateNotesRequest;
import com.doto.doto.mapper.NotesMapper;
import com.doto.doto.repositories.NotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotesService {

    private final NotesRepository notesRepository;


    public NotesDto createNotes(CreateNotesRequest createNotesRequest){

        Notes notes = NotesMapper.toDocumentsFromCrateAccountDto(createNotesRequest);

        return NotesMapper.toDto(notesRepository.save(notes));
    }

}