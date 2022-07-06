package nttdata.grupo06.sistemaBanco.controller;

import nttdata.grupo06.sistemaBanco.entity.BankAccount;
import nttdata.grupo06.sistemaBanco.entity.Signer;
import nttdata.grupo06.sistemaBanco.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping ("/banck")
public class BanckController {

    @Autowired
    private BankService banckService;

    @GetMapping("/")
    public Flux<BankAccount> findAllBankAccount(){
        return banckService.findAll();
    }

    @GetMapping ("/client/{clientId}")
    public Flux<BankAccount> getBanckAccountByClienId (@PathVariable("clientId") String clientId){
        return banckService.findByClientId(clientId);
    }

    @PostMapping("/")
    public Mono<BankAccount> createBanckAccount (@PathVariable BankAccount banckAccount){
        return banckService.createBankAccount(banckAccount);
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<BankAccount>> updateBankAccount(@PathVariable("id") String id, @RequestBody BankAccount bankAccount){
        bankAccount.setId(id);
        return banckService.updateBankAccount(bankAccount).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping ("/{id}")
    public Mono<ResponseEntity<BankAccount>> deleteBankAccount (@PathVariable ("id") String id){
        return banckService.deleteBankAccount(id).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<BankAccount>> getBankAccountById(@PathVariable("id") String id){

        return banckService.getBankAccount(id).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/{id}/signer")
    public Mono<ResponseEntity<BankAccount>> addSigner(@PathVariable("id") String id, @RequestBody Signer signer){
        return banckService.addSigner(id, signer).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }

    @PutMapping("/{id}/signer/update")
    public Mono<ResponseEntity<BankAccount>> updateSigner(@PathVariable("id") String id, @RequestBody Signer signer){
        return banckService.updateSigner(id, signer).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @PutMapping("/{id}/signer/delete/{dni}")
    public Mono<ResponseEntity<BankAccount>> deleteSigner(@PathVariable("id") String id, @PathVariable("dni") String dni){
        return banckService.deleteSigner(id, dni).flatMap(response -> Mono.just(ResponseEntity.ok(response)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));

    }



}
