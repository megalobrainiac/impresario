package impresario.api.payee;

import impresario.api.repository.PayeeRepository;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

@Service
public class PayeeService {
    private static final PayeeMapper payeeMapper = Mappers.getMapper(PayeeMapper.class);

    private PayeeRepository payeeRepository;

    public PayeeService(PayeeRepository payeeRepository) {
        this.payeeRepository = payeeRepository;
    }

    public Payee getPayee(Integer id) {
        return payeeMapper.toPayee(payeeRepository.findById(id).orElseThrow());
    }
}
