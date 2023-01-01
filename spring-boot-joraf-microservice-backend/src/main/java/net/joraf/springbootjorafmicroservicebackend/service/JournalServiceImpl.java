package net.joraf.springbootjorafmicroservicebackend.service;

import net.joraf.springbootjorafmicroservicebackend.dao.JournalRepository;
import net.joraf.springbootjorafmicroservicebackend.entity.JournalOfficiel;
import org.springframework.beans.factory.annotation.Autowired;

public class JournalServiceImpl implements JournalService{

    // Injection of Journal Repository
    @Autowired
    private JournalRepository journalRepository;
    @Override
    public void ajoutJournalOfficiel(JournalOfficiel theJournalOfficiel) {
        journalRepository.save(theJournalOfficiel);
    }
}
