package com.lucasmatricarde.kafka.Services;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegistraEventoService {

    private final KafkaTemplate<Object, Object> kafkaTemplate;

    public <T>void addEvento(T dados, String topic) {
        kafkaTemplate.send(topic, dados);
    }
}
