package com.algaworks.brewer.controller;

import com.algaworks.brewer.model.Cerveja;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;


@Controller
public class CervejasController {

    private static final Logger logger = LoggerFactory.getLogger(CervejasController.class);

    @RequestMapping("/cervejas/novo")
    public String novo(Cerveja cerveja) {
        logger.error("Aqui tem um erro");
        return "cerveja/CadastroCerveja";
    }

    @RequestMapping(value = "/cervejas/novo", method = RequestMethod.POST)
    public String cadastrar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes) {

        if (result.hasErrors()) {
            return novo(cerveja);
        }

        attributes.addFlashAttribute("mensagem", "Cerveja salva com sucesso!");
        System.out.println("sku >>> "+ cerveja.getSku());
        return "redirect:/cervejas/novo";
    }

}
