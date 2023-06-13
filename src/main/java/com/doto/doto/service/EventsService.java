package com.doto.doto.service;

import com.doto.doto.documents.Events;
import com.doto.doto.dto.documents.EventsDto;
import com.doto.doto.dto.request.CreateEventsRequest;
import com.doto.doto.dto.response.CreateEventsResponse;
import com.doto.doto.mapper.CreateAccountResponseMapper;
import com.doto.doto.mapper.CreateEventsResponseMapper;
import com.doto.doto.mapper.EventsMapper;
import com.doto.doto.repositories.EventsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventsService {

    private final EventsRepository eventsRepository;

    public EventsDto createEvents(CreateEventsRequest createEventsRequest){

        Events events = EventsMapper.toDocumentsFromCreateEventsDto(createEventsRequest);

        return EventsMapper.toDto(eventsRepository.save(events));
    }

}
