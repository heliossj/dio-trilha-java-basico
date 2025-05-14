package pagamentos.pagamentos.dto;

import java.math.BigDecimal;

public class PagamentoDto {
    private Long id;
    private BigDecimal valor;
    private String nome;
    private String numero;
    private String expiracao;
    private String codigo;
    private Long formaDePagamentoId;
    private Long pedidoId;

}
