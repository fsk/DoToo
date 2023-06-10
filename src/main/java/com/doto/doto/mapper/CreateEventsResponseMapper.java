package com.doto.doto.mapper;

import com.doto.doto.dto.documents.EventsDto;
import com.doto.doto.dto.response.CreateEventsResponse;

import java.util.Objects;

public class CreateEventsResponseMapper {

    public static CreateEventsResponse toDtoFromEventsDto(EventsDto eventsDto){
        if (Objects.isNull(eventsDto))
            return null;

        return CreateEventsResponse.builder()
                .id(eventsDto.getId())
                .build();
    }
}
