package com.example.store.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

import java.time.LocalDateTime;

@Entity
@Table(name= "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Il cliente è obbligatorio")
    private String cliente;

    @NotBlank(message = "Il prodotto è obbligatorio")
    private String prodotto;

    @NotNull(message = "La quantità è obbligatoria")
    @Min(value = 1, message = "La quantità deve essere almeno 1")
    private Integer quantita;

    @NotNull(message = "La data è obbligatoria")
    @PastOrPresent(message = "La data non può essere nel futuro")
    private LocalDateTime data_ordine;

    public Order() {}

    public Order(Long id, String cliente, String prodotto, Integer quantita, LocalDateTime data_ordine) {
        this.id = id;
        this.cliente = cliente;
        this.prodotto = prodotto;
        this.quantita = quantita;
        this.data_ordine = data_ordine;
    }

    public Long getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProdotto() {
        return prodotto;
    }

    public Integer getQuantita() {
        return quantita;
    }

    public LocalDateTime getData_ordine() {
        return data_ordine;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setProdotto(String prodotto) {
        this.prodotto = prodotto;
    }

    public void setQuantita(Integer quantita) {
        this.quantita = quantita;
    }

    public void setData_ordine(LocalDateTime data_ordine) {
        this.data_ordine = data_ordine;
    }
}
