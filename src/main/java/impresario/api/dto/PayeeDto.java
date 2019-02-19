package impresario.api.dto;

import impresario.api.common.PayeeType;
import lombok.Data;

@Data
public class PayeeDto {
    private Integer id;
    private String name;
    private String currency;
    private Boolean holdPayment;
    private Integer minimumPayment;
    private String paymentPreference;
    private PayeeType payeeType;
}
