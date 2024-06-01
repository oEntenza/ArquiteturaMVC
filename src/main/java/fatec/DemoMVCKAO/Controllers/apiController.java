package fatec.DemoMVCKAO.Controllers;

import fatec.DemoMVCKAO.Models.Produto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class apiController {
    private List<Produto> produtos = new ArrayList<Produto>();

    public apiController()
    {
        produtos.add(new Produto("Média", 30, 0.98f));
        produtos.add(new Produto("Cará", 25, 1.10f));
        produtos.add(new Produto("Baguete de Frango", 10, 7.50f));
        produtos.add(new Produto("Calzone", 2, 8.00f));
        produtos.add(new Produto("Croissant c/ Nutella", 20, 10.00f));
    }

    @GetMapping
    public List<Produto> apiProdutos(){
        return produtos;
    }
}
