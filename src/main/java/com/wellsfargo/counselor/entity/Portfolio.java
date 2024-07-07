package com.wellsfargo.counselor.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio{

    @Id
    @@GeneratedValue()
    private long portfolioid;

    @ManyToOne
    @JoinColumn(name = "clientid") // Name of the foreign key
    private Client client;

    @Column(nullable = false)
    private Date creationDate;

    protected Portfolio() {

    }

    public Portfolio(Date creationDate) {
        this.creationDate = creationDate;
    }

    //Getter and Setter for Client
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate){
        this.creationDate = creationDate;
    }


}