/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Yrmt extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -1707732751;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.yrmt.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.yrmt.dt</code>.
     */
    public static final Parameter<Timestamp> DT = createParameter("dt", org.jooq.impl.SQLDataType.TIMESTAMP, false, false);

    /**
     * Create a new routine call instance
     */
    public Yrmt() {
        super("yrmt", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(DT);
    }

    /**
     * Set the <code>dt</code> parameter IN value to the routine
     */
    public void setDt(Timestamp value) {
        setValue(DT, value);
    }

    /**
     * Set the <code>dt</code> parameter to the function to be used with a {@link org.jooq.Select} statement
     */
    public void setDt(Field<Timestamp> field) {
        setField(DT, field);
    }
}
