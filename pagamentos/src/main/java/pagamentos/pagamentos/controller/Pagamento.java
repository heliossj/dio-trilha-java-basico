package pagamentos.pagamentos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pagamentos.pagamentos.service.PagamentoService;

@RestController
@RequestMapping("/pagamentos")
public class Pagamento {
    @Autowired
    private PagamentoService service;

    @GetMapping
    public void listar(){

    }

    @PostMapping
    public void adicionar(){

    }

    @PutMapping
    public void editar(){

    }

    @DeleteMapping
    public void remover(){

    }

}
