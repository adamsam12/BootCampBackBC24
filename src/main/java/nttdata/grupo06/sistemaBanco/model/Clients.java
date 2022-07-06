package nttdata.grupo06.sistemaBanco.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collation = "Clients")
public class Clients {
    @Id
    private String clientID;
    private String identityDocument;
    private String name;
    private String lastnames;
    private int phoneNumber;
    private String mail;
    private String type;
    private String address;
}
