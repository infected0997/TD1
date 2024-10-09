public class SistemaAtendimento {
    public static void main(String[] args) {
        Fila filaAtendimento = new Fila();
        Pilha historico = new Pilha();

        // Adicionando clientes à fila
        filaAtendimento.adicionar(new Elemento("CLI001", "Dúvida sobre produto","Maria Silva"));
        filaAtendimento.adicionar(new Elemento("CLI002", "Reclamação de serviço","João Souza"));
        filaAtendimento.adicionar(new Elemento("CLI003", "Solicitação de reembolso","Ana Costa"));
        filaAtendimento.adicionar(new Elemento("CLI004", "Informações de entrega","Pedro Alves"));
        filaAtendimento.adicionar(new Elemento("CLI005", "Agendamento de visita","Carla Dias"));
        filaAtendimento.adicionar(new Elemento("CLI006", "Alteração de pedido","Lucas Martins"));
        filaAtendimento.adicionar(new Elemento("CLI007", "Cancelamento de contrato","Patrícia Rocha"));
        filaAtendimento.adicionar(new Elemento("CLI008", "Renovação de assinatura","Rafael Lima"));
        filaAtendimento.adicionar(new Elemento("CLI009", "Suporte para instalação","Fernanda Gomes"));
        filaAtendimento.adicionar(new Elemento("CLI010", "Pedido de orçamento","Carlos Eduardo"));

        // Adicionando solicitações ao histórico com data, hora e nome do cliente
        historico.empilhar(new Elemento("REQ001", "Instalação de software", "2024-08-20 10:30"));
        historico.empilhar(new Elemento("REQ002", "Manutenção preventiva", "2024-08-20 11:00"));
        historico.empilhar(new Elemento("REQ003", "Atualização de sistema", "2024-08-20 11:30"));
        historico.empilhar(new Elemento("REQ004", "Suporte técnico", "2024-08-20 12:00"));
        historico.empilhar(new Elemento("REQ005", "Troca de equipamento", "2024-08-20 12:30"));
        historico.empilhar(new Elemento("REQ006", "Consulta de garantia", "2024-08-20 13:00"));
        historico.empilhar(new Elemento("REQ007", "Reparo de impressora", "2024-08-20 13:30"));
        historico.empilhar(new Elemento("REQ008", "Configuração de rede", "2024-08-20 14:00"));
        historico.empilhar(new Elemento("REQ009", "Restauração de dados", "2024-08-20 14:30"));
        historico.empilhar(new Elemento("REQ010", "Consulta técnica", "2024-08-20 15:00"));

        // Atendendo clientes e registrando no histórico
        for (int i = 0; i < 5; i++) { // Atendendo 5 clientes como exemplo
            Elemento clienteAtendido = filaAtendimento.atender();
            if (clienteAtendido != null) {
                System.out.println("Atendendo cliente: " + clienteAtendido.id + " - " + clienteAtendido.a1 + " - " + clienteAtendido.a2);
            }

            Elemento solicitacao = historico.desempilhar();
            if (solicitacao != null) {
                System.out.println("Histórico de solicitação: " + solicitacao.id + " - " + solicitacao.a1 + " - " + solicitacao.a2);
            }
        }
    }
}