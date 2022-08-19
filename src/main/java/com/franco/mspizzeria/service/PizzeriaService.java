package com.tapia.mspizzeria.service;

import com.tapia.mspizzeria.dto.request.PizzeriaDtoRequest;
import com.tapia.mspizzeria.dto.response.PizzeriaDtoResponse;

import java.util.List;

public interface PizzeriaService {

    public void guardarPizzeria(PizzeriaDtoRequest pizzeria);
    public List<PizzeriaDtoResponse> listarPizzerias();
}
