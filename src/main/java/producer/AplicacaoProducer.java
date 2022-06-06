package producer;


import lombok.extern.slf4j.Slf4j;
import producer.eventos.ConsumidorEvento;
import producer.eventos.ProdutorEvento;

@Slf4j
public class AplicacaoProducer {

    public static void main(String[] args) {
        AplicacaoProducer aplicacao = new AplicacaoProducer();
        aplicacao.iniciarProducer();
        aplicacao.iniciarConsumer();
    }

    private void iniciarProducer() {
        log.info("Iniciando a aplicação producer");
        ProdutorEvento produtor = new ProdutorEvento();
        produtor.executar();
    }

    private void iniciarConsumer() {
        log.info("Iniciando a aplicação consumer");
        ConsumidorEvento consumidor = new ConsumidorEvento();
        consumidor.executar();
    }
}
