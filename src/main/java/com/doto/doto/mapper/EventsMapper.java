package com.doto.doto.mapper;

import com.doto.doto.documents.Events;
import com.doto.doto.dto.documents.EventsDto;
import com.doto.doto.dto.request.createrequest.CreateEventsRequest;
import com.doto.doto.utility.InfoMessages;

import java.util.List;
import java.util.Objects;
import java.util.function.Function;

public class EventsMapper {

    public static Events toDocuments(EventsDto eventsDto){
        if(Objects.isNull(eventsDto))
            return null;

        return Events.builder()
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
            return EventsDto.builder()
                    .message(InfoMessages.EVENT_NOT_FOUND_MESSAGE.getMessage())
                    .build();

        return EventsDto.builder()
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
                .eventTitle(createEventsRequest.getEventTitle())
                .eventDescription(createEventsRequest.getEventDescription())
                .eventCreatedDate(createEventsRequest.getEventCreatedDate())
                .eventFinishedDate(createEventsRequest.getEventFinishedDate())
                .build();
    }

    public static List<EventsDto> toDtoList(List<Events> eventEntityList){

        return eventEntityList
                .stream()
                .parallel()
                .map(EventsMapper::toDto)
                .toList();
    }

}
