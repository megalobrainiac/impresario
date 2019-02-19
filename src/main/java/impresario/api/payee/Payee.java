package impresario.api.payee;

import impresario.api.common.PayeeType;
import lombok.Data;

@Data
public class Payee {
    private Integer id;
    private String name;
    private String currency;
    private Boolean holdPayment;
    private Integer minimumPayment;
    private String paymentPreference;
    private PayeeType payeeType;
}
