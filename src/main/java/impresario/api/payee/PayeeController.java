package impresario.api.payee;

import impresario.api.dto.PayeeDto;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/payees")
public class PayeeController {
    private static final PayeeMapper payeeMapper = Mappers.getMapper(PayeeMapper.class);

    private PayeeService payeeService;

    public PayeeController(PayeeService payeeService) {
        this.payeeService = payeeService;
    }

    @RequestMapping("{id}")
    public Mono<PayeeDto> getPayee(@PathVariable Integer id) {
        return Mono.just(payeeMapper.toPayeeDto(payeeService.getPayee(id)));
    }
}
