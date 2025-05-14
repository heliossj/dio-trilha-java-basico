package pagamentos.pagamentos.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pagamentos.pagamentos.model.Pagamento;

public interface PagamentoRepository extends JpaRepository <Pagamento, Long> {
}
