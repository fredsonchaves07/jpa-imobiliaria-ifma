package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Locacao;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-10-06T22:59:56", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Aluguel.class)
public class Aluguel_ { 

    public static volatile SingularAttribute<Aluguel, String> obs;
    public static volatile SingularAttribute<Aluguel, Date> dataPagamento;
    public static volatile SingularAttribute<Aluguel, Date> dataVencimento;
    public static volatile SingularAttribute<Aluguel, Double> valorPago;
    public static volatile SingularAttribute<Aluguel, Integer> id;
    public static volatile SingularAttribute<Aluguel, Locacao> locacao;

}