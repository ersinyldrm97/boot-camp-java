package com.example.rentACar.business.concretes;

import com.example.rentACar.business.abstracts.ModelService;
import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.requests.UpdateModelRequest;
import com.example.rentACar.business.responses.GetAllModelsResponse;
import com.example.rentACar.core.utilities.mappers.ModelMapperService;
import com.example.rentACar.dataAccess.abstracts.ModelRepository;
import com.example.rentACar.entities.concretes.Model;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ModelManager implements ModelService {
  private ModelRepository modelRepository;
  private ModelMapperService modelMapperService;
  public List<GetAllModelsResponse> getAll() {
    List<Model> models = modelRepository.findAll();

    List<GetAllModelsResponse> modelsResponse = models.stream()
      .map(model -> this.modelMapperService
        .forResponse()
          .map(model, GetAllModelsResponse.class)).collect(Collectors.toList());

    return modelsResponse;
  }

  @Override
  public void add(CreateModelRequest createModelRequest) {
    Model model = this.modelMapperService.forRequest()
      .map(createModelRequest, Model.class);
    this.modelRepository.save(model);
  }

  @Override
  public void update(UpdateModelRequest updateModelRequest) {
    Model model = this.modelMapperService
      .forRequest()
      .map(updateModelRequest, Model.class);
  }

  @Override
  public void delete(int id) {
    this.modelRepository.deleteById(id);
  }
}
