package com.doto.doto.mapper;

import com.doto.doto.documents.Notes;
import com.doto.doto.dto.documents.NotesDto;
import com.doto.doto.dto.request.CreateNotesRequest;

import java.util.Objects;

public class NotesMapper {

    public static Notes toDocuments(NotesDto notesDto){
        if(Objects.isNull(notesDto))
            return null;
        return Notes.builder()
                .id(notesDto.getId())
                .noteTitle(notesDto.getNoteTitle())
                .noteDescription(notesDto.getNoteDescription())
                .createdDate(notesDto.getCreatedDate())
                .updatedDate(notesDto.getUpdatedDate())
                .isActive(notesDto.isActive())
                .build();
    }

    public static NotesDto toDto(Notes notes){
        if(Objects.isNull(notes))
            return null;

        return NotesDto.builder()
                .id(notes.getId())
                .noteTitle(notes.getNoteTitle())
                .noteDescription(notes.getNoteDescription())
                .createdDate(notes.getCreatedDate())
                .updatedDate(notes.getUpdatedDate())
                .isActive(notes.isActive())
                .build();
    }

    public static Notes toDocumentsFromCrateAccountDto(CreateNotesRequest createNotesRequest){
        if (Objects.isNull(createNotesRequest))
            return null;

        return Notes.builder()
                .id(createNotesRequest.getId())
                .noteTitle(createNotesRequest.getNoteTitle())
                .noteDescription(createNotesRequest.getNoteDescription())
                .createdDate(createNotesRequest.getCreatedDate())
                .updatedDate(createNotesRequest.getUpdatedDate())
                .isActive(createNotesRequest.isActive())
                .build();
    }


}
