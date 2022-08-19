package com.tapia.mspizzeria.controller;

import com.tapia.mspizzeria.dto.request.PizzeriaDtoRequest;
import com.tapia.mspizzeria.dto.response.PizzeriaDtoResponse;
import com.tapia.mspizzeria.service.PizzeriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/api/pizzeria")
public class PizzeriaController {

    @Autowired
    private PizzeriaService pizzeriaService;

    @PostMapping("/guardar")
    public @ResponseBody void guardarPizzeria(@RequestBody PizzeriaDtoRequest pizzeria) {

        pizzeriaService.guardarPizzeria(pizzeria);
    }

    @PostMapping("/listar")
    public @ResponseBody List<PizzeriaDtoResponse> listarPizzerias() {

        return pizzeriaService.listarPizzerias();
    }


}
