package com.pervuha.marketplace_217.seller_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String seller_name;
    private String seller_address;
    private String seller_email;
    private String seller_phoneNumber;
    private int rating;
//    private List<String> comment;

}
