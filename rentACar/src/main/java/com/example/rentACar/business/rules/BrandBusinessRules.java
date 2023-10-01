package com.example.rentACar.business.rules;

import com.example.rentACar.core.utilities.exceptions.BusinessException;
import com.example.rentACar.dataAccess.abstracts.BrandRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BrandBusinessRules {
  private BrandRepository brandRepository;

  public boolean checkIfBrandNameExists(String name) {
    if (this.brandRepository.existsByName(name)) {
      throw new BusinessException("Brand already exists"); // Java exception types
    }
    return true;
  }
}
