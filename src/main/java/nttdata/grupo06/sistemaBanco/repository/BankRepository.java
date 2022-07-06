package nttdata.grupo06.sistemaBanco.repository;

import nttdata.grupo06.sistemaBanco.entity.BankAccount;
import nttdata.grupo06.sistemaBanco.model.Clients;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


public interface BankRepository extends ReactiveCrudRepository <BankAccount, String> {



    Flux<BankAccount> findByClientId(String clientId);
}
