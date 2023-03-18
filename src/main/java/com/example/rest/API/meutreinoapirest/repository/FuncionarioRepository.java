package com.example.rest.API.meutreinoapirest.repository;


import com.example.rest.API.meutreinoapirest.model.Funcionario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FuncionarioRepository {

    //method return list Employee
    public List<Funcionario> listar(){
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Gabriel Sales",1234576,"Desenvolvedor Back-and"));
        funcionarios.add(new Funcionario("Isabelle Sales",1235467,"Enfermeira"));
        return  funcionarios;
    }

}
