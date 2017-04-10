package com.algaworks.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by willi on 09/04/2017.
 */

@Controller
public class ClientesController {

    @RequestMapping("/clientes/novo")
    public String novo() {
        return "cliente/CadastroCliente";
    }
}
