package com.doto.doto.service;

import com.doto.doto.documents.Notes;
import com.doto.doto.dto.request.CreateNotesRequest;
import com.doto.doto.dto.response.CreateNotesResponse;
import com.doto.doto.mapper.CreateNotesResponseMapper;
import com.doto.doto.mapper.NotesMapper;
import com.doto.doto.repositories.NotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NotesService {

    private final NotesRepository notesRepository;

    public CreateNotesResponse createNotes(CreateNotesRequest createNotesRequest){
        Notes notes = notesRepository.save(NotesMapper.toDocumentsFromCrateAccountDto(createNotesRequest));

        return CreateNotesResponseMapper.toDtoFromNotesDto(NotesMapper.toDto(notes));
    }

}