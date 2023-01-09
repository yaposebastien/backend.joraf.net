package net.joraf.springbootjorafmicroservicebackend.dao;

import net.joraf.springbootjorafmicroservicebackend.entity.JournalOfficiel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = { "http://localhost:4200", "http://joraf.net", "http://www.joraf.net",
        "https://www.joraf.net", "https://joraf.net" })


public interface JournalOfficielRepository extends MongoRepository<JournalOfficiel, String> {

    /*
    Adding function to search Journal Officiel by its Id
    Endpoint:
        http://localhost:8080/api/v1.0/joraf/journalOfficiels/search/findJournalOfficielByJournalOfficielIdEquals?journalOfficielId=63b0e251b1205f2d8d196973
    */
    Page<JournalOfficiel> findJournalOfficielByJournalOfficielIdEquals(@RequestParam("journalOfficielId") String journalOfficielId, Pageable pageable);

    // Adding function to search Journal Officiel by its republique
    Page<JournalOfficiel> findJournalOfficielByJournalOfficielRepubliqueEquals(@RequestParam("journalOfficielRepublique") String journalOfficielRepublique, Pageable pageable);

    // Adding function to search Journal Officiel by its year
    Page<JournalOfficiel> findJournalOfficielByJournalOfficielAnneeEquals(@RequestParam("journalOfficielAnnee") int journalOfficielAnnee, Pageable pageable);
}
