/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.TermsGroupnames;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TermsGroupnamesRecord extends UpdatableRecordImpl<TermsGroupnamesRecord> implements Record4<Integer, String, String, Boolean> {

    private static final long serialVersionUID = 2006073242;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.TC_Master_ID</code>.
     */
    public void setTcMasterId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.TC_Master_ID</code>.
     */
    public Integer getTcMasterId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.TC_Master_Name</code>.
     */
    public void setTcMasterName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.TC_Master_Name</code>.
     */
    public String getTcMasterName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.Country_ID</code>.
     */
    public void setCountryId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.Country_ID</code>.
     */
    public String getCountryId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.status</code>.
     */
    public void setStatus(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Terms_GroupNames.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Boolean> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, String, Boolean> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return TermsGroupnames.TERMS_GROUPNAMES.TC_MASTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return TermsGroupnames.TERMS_GROUPNAMES.TC_MASTER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return TermsGroupnames.TERMS_GROUPNAMES.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TermsGroupnames.TERMS_GROUPNAMES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getTcMasterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTcMasterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getTcMasterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTcMasterName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupnamesRecord value1(Integer value) {
        setTcMasterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupnamesRecord value2(String value) {
        setTcMasterName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupnamesRecord value3(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupnamesRecord value4(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TermsGroupnamesRecord values(Integer value1, String value2, String value3, Boolean value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TermsGroupnamesRecord
     */
    public TermsGroupnamesRecord() {
        super(TermsGroupnames.TERMS_GROUPNAMES);
    }

    /**
     * Create a detached, initialised TermsGroupnamesRecord
     */
    public TermsGroupnamesRecord(Integer tcMasterId, String tcMasterName, String countryId, Boolean status) {
        super(TermsGroupnames.TERMS_GROUPNAMES);

        set(0, tcMasterId);
        set(1, tcMasterName);
        set(2, countryId);
        set(3, status);
    }
}
