package com.example.rentACar.webApi.controllers;

import com.example.rentACar.business.abstracts.ModelService;
import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.requests.UpdateBrandRequest;
import com.example.rentACar.business.requests.UpdateModelRequest;
import com.example.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
  private ModelService modelService;

  @GetMapping()
  public List<GetAllModelsResponse> getAll() {
    return modelService.getAll();
  }

  @PostMapping
  @ResponseStatus(code = HttpStatus.CREATED)
  public void add(@RequestBody() @Valid() CreateModelRequest createModelRequest) {
    this.modelService.add(createModelRequest);
  }

  @PutMapping
  public void update(@RequestBody() UpdateModelRequest updateModelRequest) {
    this.modelService.update(updateModelRequest);
  }

  @DeleteMapping("/{id}")
  public void delete(@PathVariable int id) {
    this.modelService.delete(id);
  }
}
