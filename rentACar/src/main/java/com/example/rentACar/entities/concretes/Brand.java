package com.example.rentACar.entities.concretes;

import lombok.*;

import javax.persistence.*;

@Table(name="brands")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Brand {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "name")
  private String name;

}
