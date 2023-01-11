package net.joraf.springbootjorafmicroservicebackend.entity;



import com.mongodb.BasicDBObject;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.*;

@Document(collection = "journaux")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JournalOfficiel {

    @Id
    private String journalOfficielId;
    private String journalOfficielRepublique;
    private String journalOfficielCodeRepublique;
    private String journalOfficielAnneeEnLettre;
    private int journalOfficielNumero;
    private String journalOfficielNumeroComplet;
    private String journalOfficielType;
    private int journalOfficielAnnee;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDate journalOfficielDatePublication;
    private String journalOfficielCompletUrlText;
    private String journalOfficielCompletUrlPdf;
    private Map<String, Object> journalOfficielListeDocumentsUrl = new HashMap<String, Object>();
    private Map<String, Object> journalOfficielTotalDocuments = new HashMap<String, Object>();
    private Map<String, Object> journalOfficielTags = new HashMap<String, Object>();





}
