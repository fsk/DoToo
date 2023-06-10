package com.doto.doto.controller;


import com.doto.doto.dto.documents.EventsDto;
import com.doto.doto.dto.request.CreateEventsRequest;
import com.doto.doto.dto.response.CreateEventsResponse;
import com.doto.doto.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventsController {

    private final EventsService eventsService;

    @PostMapping("/create-event")
    public ResponseEntity<CreateEventsResponse> crateEvents(@RequestBody CreateEventsRequest createEventsRequest){
        final CreateEventsResponse createEventsResponse = eventsService.createEvents(createEventsRequest);
        return ResponseEntity.created(URI.create(createEventsResponse.getId())).body(createEventsResponse);
    }


    @GetMapping("/")
    public ResponseEntity<List<EventsDto>> getAllEventsResponseResponseEntity() {
        return ResponseEntity.ok(eventsService.getAllEvents());
    }

}
