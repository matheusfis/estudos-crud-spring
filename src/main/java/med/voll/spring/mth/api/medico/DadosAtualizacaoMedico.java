package med.voll.spring.mth.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.spring.mth.api.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
