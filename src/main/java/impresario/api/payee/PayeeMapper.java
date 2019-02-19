package impresario.api.payee;

import impresario.api.common.PayeeType;
import impresario.api.dto.PayeeDto;
import impresario.api.repository.entity.PayeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public abstract class PayeeMapper {
    @Mapping(source = "primaryType", target = "payeeType")
    public abstract Payee toPayee(PayeeEntity payeeEntity);

    public abstract PayeeDto toPayeeDto(Payee payee);

    public PayeeType toPayeeType(Integer primaryType) {
        switch (primaryType) {
            case 0:
                return PayeeType.Primary;

            case 1:
                return PayeeType.Participant;

            case 2:
                return PayeeType.Heir;

            case 3:
                return PayeeType.Summary;

            default:
                throw new RuntimeException();
        }
    }
}
