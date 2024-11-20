package med.voll.spring.mth.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String olaMundo() {
        return """
                 Galera, recebi essa madrugada
                 um monte de mensagem dessa conta
                  falando que vai enviar uma foto minha
                   e um vídeo com conteúdo pornô aleatório 
                   para todos os meus seguidores se eu não pagar 1000 reais.
                    Por favor, bloqueie e denuncie...
                """;

    }

}
