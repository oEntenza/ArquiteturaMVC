package fatec.DemoMVCKAO.Controllers;

import fatec.DemoMVCKAO.Models.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private List<Produto> produtos = new ArrayList<Produto>();

    public ProdutoController()
    {
        produtos.add(new Produto("Média", 30, 0.98f));
        produtos.add(new Produto("Cará", 25, 1.10f));
        produtos.add(new Produto("Baguete de Frango", 10, 7.50f));
        produtos.add(new Produto("Calzone", 2, 8.00f));
        produtos.add(new Produto("Croissant c/ Nutella", 20, 10.00f));
    }

    @GetMapping
    public String produtos(Model model){
        model.addAttribute("produtos",produtos);
        return "Produtos";
    }

}
