package com.doto.doto.controller;


import com.doto.doto.dto.request.CreateAccountRequest;
import com.doto.doto.dto.request.CreateEventsRequest;
import com.doto.doto.dto.response.CreateEventsResponse;
import com.doto.doto.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventsController {

    private final EventsService eventsService;

    @PostMapping
    public ResponseEntity<CreateEventsResponse> crateEvents(@RequestBody CreateEventsRequest createEventsRequest){
        final CreateEventsResponse createEventsResponse = eventsService.createEvents(createEventsRequest);
        return ResponseEntity.created(URI.create(createEventsResponse.getId())).body(createEventsResponse);
    }


}
