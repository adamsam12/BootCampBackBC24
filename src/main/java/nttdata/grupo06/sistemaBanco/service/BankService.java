package nttdata.grupo06.sistemaBanco.service;

import nttdata.grupo06.sistemaBanco.entity.BankAccount;
import nttdata.grupo06.sistemaBanco.entity.Signer;
import nttdata.grupo06.sistemaBanco.model.Clients;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BankService {

    Flux<BankAccount> findByClientId(String clientId);
    Flux<BankAccount> findAll();

    Mono<BankAccount> createBankAccount(BankAccount bankAccount);
    Mono<BankAccount> deleteBankAccount(String id);
    Mono<BankAccount> getBankAccount(String id);
    Mono<BankAccount> updateBankAccount(BankAccount bankAccount);

    Mono<BankAccount> addSigner(String id, Signer signer);
    Mono<BankAccount> updateSigner(String id, Signer signer);
    Mono<BankAccount> deleteSigner(String id, String dni);


}
