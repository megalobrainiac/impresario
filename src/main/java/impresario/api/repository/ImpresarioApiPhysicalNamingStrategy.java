package impresario.api.repository;

import org.hibernate.boot.model.naming.Identifier;
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment;
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy;

public class ImpresarioApiPhysicalNamingStrategy extends SpringPhysicalNamingStrategy {
    @Override
    public Identifier toPhysicalTableName(Identifier name, JdbcEnvironment jdbcEnvironment) {
        if (name.getText().endsWith("Entity")) {
            name = new Identifier(name.getText().substring(0, name.getText().length() - "Entity".length()), name.isQuoted());
        }
        return super.toPhysicalTableName(name, jdbcEnvironment);
    }
}
