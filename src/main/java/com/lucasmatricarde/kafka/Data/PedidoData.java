package com.lucasmatricarde.kafka.Data;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PedidoData {

    private String id;
    private String nomeProduto;
    private BigDecimal valor;

}
