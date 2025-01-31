package state;
import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaquinaTest {
    private Maquina maquina;
    private EstadoObserver observer;

    @BeforeEach
    void setUp() {
        maquina = new Maquina();
        observer = new EstadoObserver("Observer Teste");
        observer.observar(maquina);
    }

    @Test
    void testNotificacaoObserverSelecaoProduto() {
        maquina.setEstado(MaquinaEstadoAguardandoSelecaoProduto.getInstance());
        assertEquals("Observer Teste recebeu atualização: Novo estado -> Aguardando Seleção de Produto", observer.getUltimaNotificacao());
    }
    @Test
    void testNotificacaoObserverAguardandoMoeda() {
        maquina.setEstado(MaquinaEstadoAguardandoMoeda.getInstance());
        assertEquals("Observer Teste recebeu atualização: Novo estado -> Aguardando Moeda", observer.getUltimaNotificacao());
    }
    @Test
    void testNotificacaoObserverManutencao() {
        maquina.setEstado(MaquinaEstadoManutencao.getInstance());
        assertEquals("Observer Teste recebeu atualização: Novo estado -> Em Manutenção", observer.getUltimaNotificacao());
    }
    @Test
    void testNotificacaoObserverDispensado() {
        maquina.setEstado(MaquinaEstadoProdutoDispensado.getInstance());
        assertEquals("Observer Teste recebeu atualização: Novo estado -> Produto Dispensado", observer.getUltimaNotificacao());
    }
    @Test
    void testNotificacaoObserverDisponivel() {
        maquina.setEstado(MaquinaEstadoProdutoDisponivel.getInstance());
        assertEquals("Observer Teste recebeu atualização: Novo estado -> Produto Disponível", observer.getUltimaNotificacao());
    }
}
