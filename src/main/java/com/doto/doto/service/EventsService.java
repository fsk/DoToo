package com.doto.doto.service;

import com.doto.doto.documents.Events;
import com.doto.doto.dto.documents.EventsDto;

import com.doto.doto.dto.request.createrequest.CreateEventsRequest;



import com.doto.doto.mapper.EventsMapper;
import com.doto.doto.repositories.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class EventsService {

    private final EventsRepository eventsRepository;


    public EventsDto createEvents(CreateEventsRequest createEventsRequest){

    

        Events events = EventsMapper.toDocumentsFromCreateEventsDto(createEventsRequest);

        return EventsMapper.toDto(eventsRepository.save(events));
    }

    public List<EventsDto> getAllEvents() {

        List<Events> eventsList = eventsRepository.findAll();
        return EventsMapper.toDtoList(eventsList);
    }



}
