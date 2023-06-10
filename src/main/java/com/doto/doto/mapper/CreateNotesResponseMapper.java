package com.doto.doto.mapper;

import com.doto.doto.dto.documents.NotesDto;
import com.doto.doto.dto.response.CreateNotesResponse;

import java.util.Objects;

public class CreateNotesResponseMapper {

    public static CreateNotesResponse toDtoFromNotesDto(NotesDto notesDto){
        if(Objects.isNull(notesDto))
            return null;

        return CreateNotesResponse.builder()
                .id(notesDto.getId())
                .build();
    }
}
