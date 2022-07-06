package nttdata.grupo06.sistemaBanco.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import reactor.core.publisher.Flux;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {

    @Id
    private String id;
    private String description;
    private String accountType; //Ahorro, Corriente, PlazoFijo
    private Integer limitPerMonth; // Movimientos por mes
    private Float commission; // Solo para cuenta corriente
    private String bankAccountNumber;
    private Float balance; // Saldo
    private Integer transactionDay; // Solo para Plazo Fijo
    private Float minimumAmount; // Solo para Cuenta de Ahorro y cliente VIP

    private String clientId;
    private Flux<Signer> signers;
}
