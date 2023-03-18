package com.example.rest.API.meutreinoapirest.controller;

import com.example.rest.API.meutreinoapirest.model.Funcionario;
import com.example.rest.API.meutreinoapirest.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FuncionarioController {

    @Autowired  //injetamos o objeto que dispõe dos métodos
    private FuncionarioRepository funcionarioRepository;

    @GetMapping (value = "/funcionarios") //mapemaos o recurso do método da classe FuncionarioRepository
    public List<Funcionario> getLista(){
        return  funcionarioRepository.listar();
    }
}