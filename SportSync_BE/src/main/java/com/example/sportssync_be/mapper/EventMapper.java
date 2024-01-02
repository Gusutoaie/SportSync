package com.example.sportssync_be.mapper;

import com.example.sportssync_be.dto.EventDTO;
import com.example.sportssync_be.entity.Event;

public interface EventMapper {
    EventDTO entityToDto(Event event);
    Event dtoToEntity(EventDTO eventDTO);
}
