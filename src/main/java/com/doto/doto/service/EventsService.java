package com.doto.doto.service;

import com.doto.doto.documents.Events;
import com.doto.doto.dto.documents.EventsDto;

import com.doto.doto.dto.request.createrequest.CreateEventsRequest;



import com.doto.doto.mapper.EventsMapper;
import com.doto.doto.repositories.EventsRepository;
import com.doto.doto.utility.InfoMessages;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EventsService {

    private final EventsRepository eventsRepository;
    private final MongoTemplate mongoTemplate;


    public EventsDto createEvents(CreateEventsRequest createEventsRequest){

        Events events = EventsMapper.toDocumentsFromCreateEventsDto(createEventsRequest);
        assert events != null;
        return EventsMapper.toDto(eventsRepository.save(events));
    }

    public List<EventsDto> getAllEvents() {

        List<Events> eventsList = eventsRepository.findAll();
        return EventsMapper.toDtoList(eventsList);

    }


    public List<EventsDto> getAllEventsFromDay() {
        List<EventsDto> eventsDtoList = new ArrayList<>();
        LocalDateTime endOfDay = LocalDateTime.now().with(LocalTime.MAX);
        LocalDateTime startOfDay = LocalDateTime.now().with(LocalTime.MIN);
        Query query = new Query();
        query.addCriteria(Criteria.where("eventCreatedDate").gte(startOfDay).lt(endOfDay));

        List<Events> eventsList = mongoTemplate.find(query, Events.class);
        if (eventsList.isEmpty()) {
            EventsDto eventsDto = EventsDto.builder().message(InfoMessages.EVENT_NOT_FOUND_MESSAGE.getMessage()).build();
            eventsDtoList.add(eventsDto);
            return eventsDtoList;
        }
        return EventsMapper.toDtoList(eventsList);

    }
}
