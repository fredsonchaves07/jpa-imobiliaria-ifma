package models;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.Cliente;
import models.Imovel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2021-09-10T18:34:44", comments="EclipseLink-2.7.7.v20200504-rNA")
@StaticMetamodel(Locacao.class)
public class Locacao_ { 

    public static volatile SingularAttribute<Locacao, String> obs;
    public static volatile SingularAttribute<Locacao, Double> valorAluguel;
    public static volatile SingularAttribute<Locacao, Boolean> ativo;
    public static volatile SingularAttribute<Locacao, Imovel> imovel;
    public static volatile SingularAttribute<Locacao, Date> dataFim;
    public static volatile SingularAttribute<Locacao, Cliente> inquilino;
    public static volatile SingularAttribute<Locacao, Integer> id;
    public static volatile SingularAttribute<Locacao, Date> dataInicio;
    public static volatile SingularAttribute<Locacao, Double> percentualMulta;
    public static volatile SingularAttribute<Locacao, Integer> diaVencimento;

}