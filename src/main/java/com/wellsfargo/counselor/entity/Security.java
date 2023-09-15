package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class Security {

    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name="portfolioId", nullable=false)
    private Portfolio portfolio;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private long purchasePrice;

    @Column(nullable = false)
    private String purchaseDate;

    @Column(nullable = false)
    private long quantity;

    protected Security() {

    }

    public Security(String name, String category, long purchasePrice, String purchaseDate, long quantity) {
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public Long getSecurityId() {
        return securityId;
    }

    public void setSecurityId(Long securityId) {
        this.securityId = securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return category;
    }

    public void setLastName(String category) {
        this.category = category;
    }

    public long getAddress() {
        return purchasePrice;
    }

    public void setAddress(long purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPhone() {
        return purchaseDate;
    }

    public void setPhone(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public long getEmail() {
        return quantity;
    }

    public void setEmail(long quantity) {
        this.quantity = quantity;
    }
}
