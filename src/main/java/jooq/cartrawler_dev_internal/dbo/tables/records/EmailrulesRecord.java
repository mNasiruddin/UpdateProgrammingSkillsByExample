/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Emailrules;

import org.jooq.Field;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.TableRecordImpl;
import org.jooq.types.UByte;


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
public class EmailrulesRecord extends TableRecordImpl<EmailrulesRecord> implements Record13<Integer, String, String, Integer, Integer, Integer, Integer, Integer, UByte, Boolean, Boolean, Integer, UByte> {

    private static final long serialVersionUID = 1732857061;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.emailrule_name</code>.
     */
    public void setEmailruleName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.emailrule_name</code>.
     */
    public String getEmailruleName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.email_type</code>.
     */
    public void setEmailType(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.email_type</code>.
     */
    public String getEmailType() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_after_pk</code>.
     */
    public void setHrsAfterPk(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_after_pk</code>.
     */
    public Integer getHrsAfterPk() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_before_pk</code>.
     */
    public void setHrsBeforePk(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_before_pk</code>.
     */
    public Integer getHrsBeforePk() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_after_create</code>.
     */
    public void setHrsAfterCreate(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_after_create</code>.
     */
    public Integer getHrsAfterCreate() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_min_after_create</code>.
     */
    public void setHrsMinAfterCreate(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_min_after_create</code>.
     */
    public Integer getHrsMinAfterCreate() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_min_before_pk</code>.
     */
    public void setHrsMinBeforePk(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_min_before_pk</code>.
     */
    public Integer getHrsMinBeforePk() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.emailrule_type</code>.
     */
    public void setEmailruleType(UByte value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.emailrule_type</code>.
     */
    public UByte getEmailruleType() {
        return (UByte) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.must_sell_insurance</code>.
     */
    public void setMustSellInsurance(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.must_sell_insurance</code>.
     */
    public Boolean getMustSellInsurance() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.status</code>.
     */
    public void setStatus(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_after_rt</code>.
     */
    public void setHrsAfterRt(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.hrs_after_rt</code>.
     */
    public Integer getHrsAfterRt() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.EmailRules.email_quote_type</code>.
     */
    public void setEmailQuoteType(UByte value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.EmailRules.email_quote_type</code>.
     */
    public UByte getEmailQuoteType() {
        return (UByte) get(12);
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, Integer, Integer, Integer, Integer, UByte, Boolean, Boolean, Integer, UByte> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row13<Integer, String, String, Integer, Integer, Integer, Integer, Integer, UByte, Boolean, Boolean, Integer, UByte> valuesRow() {
        return (Row13) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Emailrules.EMAILRULES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Emailrules.EMAILRULES.EMAILRULE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Emailrules.EMAILRULES.EMAIL_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Emailrules.EMAILRULES.HRS_AFTER_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Emailrules.EMAILRULES.HRS_BEFORE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return Emailrules.EMAILRULES.HRS_AFTER_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Emailrules.EMAILRULES.HRS_MIN_AFTER_CREATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Emailrules.EMAILRULES.HRS_MIN_BEFORE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field9() {
        return Emailrules.EMAILRULES.EMAILRULE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Emailrules.EMAILRULES.MUST_SELL_INSURANCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Emailrules.EMAILRULES.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Emailrules.EMAILRULES.HRS_AFTER_RT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field13() {
        return Emailrules.EMAILRULES.EMAIL_QUOTE_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getEmailruleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getEmailType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getHrsAfterPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getHrsBeforePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getHrsAfterCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getHrsMinAfterCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getHrsMinBeforePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component9() {
        return getEmailruleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getMustSellInsurance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getHrsAfterRt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component13() {
        return getEmailQuoteType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmailruleName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getEmailType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getHrsAfterPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getHrsBeforePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getHrsAfterCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getHrsMinAfterCreate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getHrsMinBeforePk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value9() {
        return getEmailruleType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getMustSellInsurance();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getHrsAfterRt();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value13() {
        return getEmailQuoteType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value2(String value) {
        setEmailruleName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value3(String value) {
        setEmailType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value4(Integer value) {
        setHrsAfterPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value5(Integer value) {
        setHrsBeforePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value6(Integer value) {
        setHrsAfterCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value7(Integer value) {
        setHrsMinAfterCreate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value8(Integer value) {
        setHrsMinBeforePk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value9(UByte value) {
        setEmailruleType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value10(Boolean value) {
        setMustSellInsurance(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value11(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value12(Integer value) {
        setHrsAfterRt(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord value13(UByte value) {
        setEmailQuoteType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EmailrulesRecord values(Integer value1, String value2, String value3, Integer value4, Integer value5, Integer value6, Integer value7, Integer value8, UByte value9, Boolean value10, Boolean value11, Integer value12, UByte value13) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached EmailrulesRecord
     */
    public EmailrulesRecord() {
        super(Emailrules.EMAILRULES);
    }

    /**
     * Create a detached, initialised EmailrulesRecord
     */
    public EmailrulesRecord(Integer id, String emailruleName, String emailType, Integer hrsAfterPk, Integer hrsBeforePk, Integer hrsAfterCreate, Integer hrsMinAfterCreate, Integer hrsMinBeforePk, UByte emailruleType, Boolean mustSellInsurance, Boolean status, Integer hrsAfterRt, UByte emailQuoteType) {
        super(Emailrules.EMAILRULES);

        set(0, id);
        set(1, emailruleName);
        set(2, emailType);
        set(3, hrsAfterPk);
        set(4, hrsBeforePk);
        set(5, hrsAfterCreate);
        set(6, hrsMinAfterCreate);
        set(7, hrsMinBeforePk);
        set(8, emailruleType);
        set(9, mustSellInsurance);
        set(10, status);
        set(11, hrsAfterRt);
        set(12, emailQuoteType);
    }
}
