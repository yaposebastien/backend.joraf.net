package net.joraf.springbootjorafmicroservicebackend.entity;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Map;

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
    private Date journalOfficielDatePublication;
    private String journalOfficielCompletUrlText;
    private String journalOfficielCompletUrlPdf;
    private Map<String, String> journalOfficielListeDocumentsUrl;
    private Map<String, Integer> journalOfficielTotalDocuments;



}
