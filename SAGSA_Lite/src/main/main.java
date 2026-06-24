package main;

import data.BancoDadosRealRepository;
import data.FakeExcelRepository;
import data.RepositoryContrato;
import core.GeradorEstrategiaCore;
import view.TerminalInterface;

public class main {

    public static void main(String[] args) {
// 1. Instancia o subsistema de persistência de dados
        RepositoryContrato bancoDados = new BancoDadosRealRepository();
// 2. Cria o motor injetando o contrato de dados
        GeradorEstrategiaCore core = new GeradorEstrategiaCore(bancoDados);
// 3. Monta a interface conectando ao core
        TerminalInterface interfaceUsuario = new TerminalInterface(core);
// 4. Dispara a aplicação
        interfaceUsuario.renderizarJanelaTerminal();
    }
}
