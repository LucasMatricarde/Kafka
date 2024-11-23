package com.lucasmatricarde.kafka.Controller;

import com.lucasmatricarde.kafka.Data.PedidoData;
import com.lucasmatricarde.kafka.Services.RegistraEventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PedidosController {

    private final RegistraEventoService eventoServiceventoService;

    @PostMapping("/savePedidos")
    public ResponseEntity<String> savePedidos(@RequestBody PedidoData pedidoData) {
        eventoServiceventoService.addEvento(pedidoData, "savePedido");
        return ResponseEntity.ok("Pedido salvo com sucesso");
    }
}
