package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import br.com.alura.mvc.mudi.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @Autowired
    PedidoRepository pedidoRepository;

    @GetMapping("/home")
    public String homeController(Model model){

    List<Pedido> pedidoList = pedidoRepository.findAll();

            model.addAttribute("pedidos", pedidoList);

        return "home";
    }
}
