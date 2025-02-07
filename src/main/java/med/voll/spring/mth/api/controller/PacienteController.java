package med.voll.spring.mth.api.controller;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import med.voll.spring.mth.api.medico.DadosListagemMedicos;
import med.voll.spring.mth.api.medico.Medico;
import med.voll.spring.mth.api.paciente.DadosCadastroPaciente;
import med.voll.spring.mth.api.paciente.Paciente;
import med.voll.spring.mth.api.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroPaciente dados) {
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPacientes> listar(@PageableDefault(size = 10, sort = {"nome"} ) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPacientes::new);
    }

}

