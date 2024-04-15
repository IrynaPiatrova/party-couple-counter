package com.springboot.partycouplecounter.beans;


import org.springframework.stereotype.Component;

@Component("event")
public class Event {
    int eventId;
    String eventStartDay;
    String eventStartMonth;
    String eventStartYear;
    String eventStartTime;
}
