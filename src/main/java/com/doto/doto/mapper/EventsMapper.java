package com.doto.doto.mapper;

import com.doto.doto.documents.Events;
import com.doto.doto.dto.documents.EventsDto;
import com.doto.doto.dto.request.CreateEventsRequest;

import java.util.Objects;

public class EventsMapper {

    public static Events toDocuments(EventsDto eventsDto){
        if(Objects.isNull(eventsDto))
            return null;

        return Events.builder()
                .id(eventsDto.getId())
                .eventTitle(eventsDto.getEventTitle())
                .eventDescription(eventsDto.getEventDescription())
                .eventCreatedDate(eventsDto.getEventCreatedDate())
                .eventFinishedDate(eventsDto.getEventFinishedDate())
                .eventUpdatedCreatedDate(eventsDto.getEventUpdatedCreatedDate())
                .eventUpdatedFinishedDate(eventsDto.getEventUpdatedFinishedDate())
                .build();


    }

    public static EventsDto toDto(Events events){
        if (Objects.isNull(events))
            return null;

        return EventsDto.builder()
                .id(events.getId())
                .eventTitle(events.getEventTitle())
                .eventDescription(events.getEventDescription())
                .eventCreatedDate(events.getEventCreatedDate())
                .eventFinishedDate(events.getEventFinishedDate())
                .eventUpdatedCreatedDate(events.getEventUpdatedCreatedDate())
                .eventUpdatedFinishedDate(events.getEventUpdatedFinishedDate())
                .build();
    }

    public static Events toDocumentsFromCreateEventsDto(CreateEventsRequest createEventsRequest){
        if(Objects.isNull(createEventsRequest))
            return null;

        return Events.builder()
                .id(createEventsRequest.getId())
                .eventTitle(createEventsRequest.getEventTitle())
                .eventDescription(createEventsRequest.getEventDescription())
                .eventCreatedDate(createEventsRequest.getEventCreatedDate())
                .eventFinishedDate(createEventsRequest.getEventFinishedDate())
                .eventUpdatedFinishedDate(createEventsRequest.getEventUpdatedFinishedDate())
                .eventFinishedDate(createEventsRequest.getEventUpdatedFinishedDate())
                .build();
    }
}
