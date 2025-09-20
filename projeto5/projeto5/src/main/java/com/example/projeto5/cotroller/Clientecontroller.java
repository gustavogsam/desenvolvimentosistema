package com.example.projeto5.cotroller;

import com.example.projeto5.model.Cliente;
import com.example.projeto5.repository.Clienterepository;
import com.example.projeto5.services.Clienteservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class Clientecontroller {

    @Autowired
    private Clienteservices clienteservices;


    @GetMapping
    public List<Cliente> Listartodos(){
        return clienteservices.listartodos();
    }

   @PostMapping
    public ResponseEntity<Cliente>salvar(@RequestBody Cliente cliente){
        clienteservices.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(cliente);
   }
   @PutMapping("/{id}")
   public ResponseEntity<Cliente>atualizar(@PathVariable UUID id,@RequestBody  Cliente cliente){
       Cliente clienteatualizado = clienteservices.atualizar(id,cliente);
       return ResponseEntity.status(HttpStatus.OK).body(clienteatualizado);
   }
   @DeleteMapping("/{id}")
    public ResponseEntity<Void>deletar(@PathVariable UUID id){
        clienteservices.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
