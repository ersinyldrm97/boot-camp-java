package com.example.rentACar.webApi.controllers;

import com.example.rentACar.business.abstracts.BrandService;
import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.requests.UpdateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import com.example.rentACar.business.responses.GetByIdBrandResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/brands")
public class BrandsController {
  private BrandService brandService;

  @GetMapping()
  public List<GetAllBrandsResponse> getAll() {
    return brandService.getAll();
  }

  @GetMapping("/{id}")
  public GetByIdBrandResponse getById(@PathVariable int id) {
    return brandService.getById(id);
  }

  @PostMapping()
  @ResponseStatus(code = HttpStatus.CREATED)
  public void add(@RequestBody() CreateBrandRequest createBrandRequest) {
    this.brandService.add(createBrandRequest);
  }

  @PutMapping
  public void update(@RequestBody() UpdateBrandRequest updateBrandRequest) {
    this.brandService.update(updateBrandRequest);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable int id) {
    this.brandService.delete(id);
  }
}
