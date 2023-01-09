package net.joraf.springbootjorafmicroservicebackend.service;

import net.joraf.springbootjorafmicroservicebackend.dao.JournalOfficielRepository;
import net.joraf.springbootjorafmicroservicebackend.entity.JournalOfficiel;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalOfficielServiceImpl implements JournalOfficielService {

    // Injection of Journal Repository
    @Autowired
    private JournalOfficielRepository journalRepository;
    @Override
    public void ajoutJournalOfficiel(JournalOfficiel theJournalOfficiel) {
        journalRepository.save(theJournalOfficiel);
    }
}
