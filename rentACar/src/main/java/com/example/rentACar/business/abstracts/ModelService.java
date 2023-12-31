package com.example.rentACar.business.abstracts;

import com.example.rentACar.business.requests.CreateModelRequest;
import com.example.rentACar.business.requests.UpdateModelRequest;
import com.example.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
  List<GetAllModelsResponse> getAll();
  void add(CreateModelRequest createModelRequest);
  void update(UpdateModelRequest updateModelRequest);
  void delete(int id);
}
