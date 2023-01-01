package net.joraf.springbootjorafmicroservicebackend.controller;

import net.joraf.springbootjorafmicroservicebackend.entity.JournalOfficiel;
import net.joraf.springbootjorafmicroservicebackend.service.JournalService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = { "http://localhost:4200", "http://joraf.net", "http://www.joraf.net",
        "https://www.joraf.net", "https://joraf.net" })

@RestController
@RequestMapping("/api/v1.0/joraf/journal-officiel/")
public class JournalController {

    // Injection of Journal Officiel Service
    private JournalService journalService;

    // Endpoint to add new journal officiel
    @PostMapping("/ajouter")
    public void ajoutJournalOfficiel(@RequestBody JournalOfficiel theJournalOfficiel) {
        journalService.ajoutJournalOfficiel(theJournalOfficiel);
    }
}
