package com.doto.doto.controller;


import com.doto.doto.dto.documents.EventsDto;
import com.doto.doto.dto.request.createrequest.CreateEventsRequest;
import com.doto.doto.service.EventsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/events")
@RequiredArgsConstructor
public class EventsController {

    private final EventsService eventsService;

    @PostMapping
    public ResponseEntity<EventsDto> crateEvents(@RequestBody CreateEventsRequest createEventsRequest){
        return ResponseEntity.ok(eventsService.createEvents(createEventsRequest));

    }

    @GetMapping("/get-all-events")
    public ResponseEntity<List<EventsDto>> getAllEventsResponseResponseEntity() {
        return ResponseEntity.ok(eventsService.getAllEvents());
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllEventsResponseEntityFromDay() {
        return ResponseEntity.ok(eventsService.getAllEventsFromDay());
    }

}
