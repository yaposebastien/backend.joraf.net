package net.joraf.springbootjorafmicroservicebackend.entity;



import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "journaux")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JournalOfficiel {

    @Id
    private String journalOfficielId;
    private String journalRepublique;
    private int journalNumero;
    private String journalCode;
    private String journalType;
    private int journalAnnee;
    private String journalDatePublication;
    private String journalUrlText;
    private String journalUrlPdf;

}
