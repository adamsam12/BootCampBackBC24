package nttdata.grupo06.sistemaBanco.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collation = "Liabilities")
public class Liabilities {

    @Id
    private String liabilitiesID;
    private String holderDocument;
    private Double ammount;
    private String legalSigner;
    private String transactions;
    private String liabilitieType;
    private int accountNumber;
    private String status;


}
