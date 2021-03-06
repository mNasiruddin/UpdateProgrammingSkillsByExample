/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.routines;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;

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
public class Spinsertaffiliatesubacc extends AbstractRoutine<Integer> {

    private static final long serialVersionUID = -727126072;

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.RETURN_VALUE</code>.
     */
    public static final Parameter<Integer> RETURN_VALUE = createParameter("RETURN_VALUE", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.Client_ID</code>.
     */
    public static final Parameter<Integer> CLIENT_ID = createParameter("Client_ID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.Client_Name</code>.
     */
    public static final Parameter<String> CLIENT_NAME = createParameter("Client_Name", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.DisplayCountry</code>.
     */
    public static final Parameter<String> DISPLAYCOUNTRY = createParameter("DisplayCountry", org.jooq.impl.SQLDataType.VARCHAR(2), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.DisplayCurrency</code>.
     */
    public static final Parameter<String> DISPLAYCURRENCY = createParameter("DisplayCurrency", org.jooq.impl.SQLDataType.VARCHAR(3), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.password</code>.
     */
    public static final Parameter<String> PASSWORD = createParameter("password", org.jooq.impl.SQLDataType.VARCHAR(50), false, false);

    /**
     * The parameter <code>Cartrawler_dev_internal.dbo.spInsertAffiliateSubAcc.newSubID</code>.
     */
    public static final Parameter<Integer> NEWSUBID = createParameter("newSubID", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * Create a new routine call instance
     */
    public Spinsertaffiliatesubacc() {
        super("spInsertAffiliateSubAcc", Dbo.DBO, org.jooq.impl.SQLDataType.INTEGER);

        setReturnParameter(RETURN_VALUE);
        addInParameter(CLIENT_ID);
        addInParameter(CLIENT_NAME);
        addInParameter(DISPLAYCOUNTRY);
        addInParameter(DISPLAYCURRENCY);
        addInParameter(PASSWORD);
        addInOutParameter(NEWSUBID);
    }

    /**
     * Set the <code>Client_ID</code> parameter IN value to the routine
     */
    public void setClientId(Integer value) {
        setValue(CLIENT_ID, value);
    }

    /**
     * Set the <code>Client_Name</code> parameter IN value to the routine
     */
    public void setClientName(String value) {
        setValue(CLIENT_NAME, value);
    }

    /**
     * Set the <code>DisplayCountry</code> parameter IN value to the routine
     */
    public void setDisplaycountry(String value) {
        setValue(DISPLAYCOUNTRY, value);
    }

    /**
     * Set the <code>DisplayCurrency</code> parameter IN value to the routine
     */
    public void setDisplaycurrency(String value) {
        setValue(DISPLAYCURRENCY, value);
    }

    /**
     * Set the <code>password</code> parameter IN value to the routine
     */
    public void setPassword(String value) {
        setValue(PASSWORD, value);
    }

    /**
     * Set the <code>newSubID</code> parameter IN value to the routine
     */
    public void setNewsubid(Integer value) {
        setValue(NEWSUBID, value);
    }

    /**
     * Get the <code>newSubID</code> parameter OUT value from the routine
     */
    public Integer getNewsubid() {
        return get(NEWSUBID);
    }
}
