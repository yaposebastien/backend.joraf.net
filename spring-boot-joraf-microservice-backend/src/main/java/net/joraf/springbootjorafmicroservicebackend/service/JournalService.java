package net.joraf.springbootjorafmicroservicebackend.service;

import net.joraf.springbootjorafmicroservicebackend.entity.JournalOfficiel;
import org.springframework.stereotype.Service;


public interface JournalService {


    // Adding function to save Journal Officiel
    public void ajoutJournalOfficiel(JournalOfficiel theJournalOfficiel);
}
