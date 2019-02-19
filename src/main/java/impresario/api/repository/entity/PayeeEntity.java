package impresario.api.repository.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class PayeeEntity {
    @Id private Integer id;
    private String name;
    private String currency;
    private Boolean holdPayment;
    private Integer minimumPayment;
    private String paymentPreference;
    private Integer primaryType;
}
