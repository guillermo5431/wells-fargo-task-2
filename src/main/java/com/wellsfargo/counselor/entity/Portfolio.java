package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Portfolio{

    @Id
    @GeneratedValue
    private long portfolioid;

    @ManyToOne
    @JoinColumn(name = "clientid") // Name of the foreign key
    private Client client;

    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, String creationDate) {
        this.client = client;
        this.creationDate = creationDate;
    }

    //Getter and Setter for Client
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate){
        this.creationDate = creationDate;
    }

    //Getter for Portfolioid
    public Long getPortfolioId() {
        return portfolioid;
    }


}