package aluno.ifpb.edu.br.JavaSmile.Controller;

import aluno.ifpb.edu.br.JavaSmile.Model.Procedimento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.IOException;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FormProcedimentoController {
    List<Procedimento> procedimentos;

    public void carregarProcedimentos() throws IOException {
        procedimentos = JsonUtil.carregarProcedimentos();
    }

    public Procedimento criarProcedimento(String tratamento, double valor) throws IOException {
        carregarProcedimentos();
        Procedimento procedimento = Procedimento.builder()
                .tratamento(tratamento)
                .valor(valor)
                .build();

        getProcedimentos().add(procedimento);
        JsonUtil.salvarDados(getProcedimentos(), "procedimentos.json");
        return procedimento;
    }

    public void deletarProcedimento(Procedimento procedimento) throws IOException {
        carregarProcedimentos();
        getProcedimentos().remove(procedimento);
        JsonUtil.salvarDados(getProcedimentos(), "procedimentos.json");
    }

    public void atualizarProcedimento(int rowIndex, String tratamentoNovo, double valorNovo) throws IOException {
        carregarProcedimentos();
        Procedimento procedimentoAtual = getProcedimentos().get(rowIndex);
        Procedimento procedimentoAtualizado = Procedimento.builder()
                .tratamento(tratamentoNovo)
                .valor(valorNovo)
                .build();

        getProcedimentos().set(rowIndex, procedimentoAtualizado);
        JsonUtil.salvarDados(getProcedimentos(), "procedimentos.json");
        System.out.println(procedimentoAtual.getTratamento() + " passou pra " + procedimentoAtualizado.getTratamento());
    }
}
