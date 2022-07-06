package nttdata.grupo06.sistemaBanco.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Signer {

    @Id
    private String id;
    private String signerType;
    private String dni;
    private String name;
    private String firstName;
    private String lastName;
    private String status; //ACTIVE OR RETIRED
}
