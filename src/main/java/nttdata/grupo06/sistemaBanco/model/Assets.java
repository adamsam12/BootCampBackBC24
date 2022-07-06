package nttdata.grupo06.sistemaBanco.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "Assets")
@Data
@NoArgsConstructor
public class Assets {
    @Id
    private String assetId;
    private String holderDocument;
    private Double availableAmount;
    private Double debtAmount;
    private String assetNumber;
    private String transactions;
    private String status;
    private String assetType;
    private Float initialAmount;

}
