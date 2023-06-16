package med.voll.api.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consultas")
public class ConsultaController {

   @PostMapping
   @Transactional
   public ResponseEntity agendar(@Request @Valid DadosAgendamentoConsulta dados){
      System.out.println(dados);
      return ResponseEntity.ok(new DadosDetalhamentoConsulta(null, null, null, null));
   }
   
}
