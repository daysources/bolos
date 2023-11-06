package com.abacattocorp.MVCAtv.controllers;

import com.abacattocorp.MVCAtv.models.Bolos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/bolos")
public class BolosController {

    public List<Bolos> bolos = new ArrayList<Bolos>();

    public BolosController() {
        bolos.add(new Bolos(95.99,"Veludo Dourado","A base é um bolo de baunilha extremamente úmido, recheado com uma camada generosa de creme de avelã e pedaços de avelã caramelizados."));
        bolos.add(new Bolos(80,"Chocolate Supremo","A base é um bolo de chocolate incrivelmente úmido e denso, feito com chocolate amargo de alta qualidade. É recheado com ganache de chocolate ainda mais rico e decorado com raspas de chocolate belga e trufas de chocolate."));
        bolos.add(new Bolos(59.99,"Frutas Exoticas","A base é um bolo de coco úmido, recheado com camadas de manga, maracujá e kiwi frescos, todos combinados com um suave creme de coco."));
    }
    
    @GetMapping
    public String getBolos(Model model)
    {
        model.addAttribute("bolos", bolos);
        return "bolos";
    }
}
