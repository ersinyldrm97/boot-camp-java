package com.example.rentACar.business.responses;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllBrandsResponse {
  private int id;
  private String name;
}
