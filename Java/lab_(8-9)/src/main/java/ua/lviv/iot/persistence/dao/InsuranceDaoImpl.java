package ua.lviv.iot.persistence.dao;

import ua.lviv.iot.Insurance;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;

public class InsuranceDaoImpl extends AbstractDao<Insurance> implements InsuranceDao,Serializable {
    private static final long serialVersionUID = 1L;

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    protected Class<Insurance> getEntityClass() {
        return Insurance.class;
    }
}
