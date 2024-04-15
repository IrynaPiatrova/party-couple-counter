package com.springboot.partycouplecounter.beans;

import com.springboot.partycouplecounter.enums.PartnerType;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {
    int personId;
    String personFullName;
    String personInstNickname;
    PartnerType personPartnerType;
}
