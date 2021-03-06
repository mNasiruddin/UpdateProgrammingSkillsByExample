/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.PsChangeToCharge_09022015;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


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
public class PsChangeToCharge_09022015Record extends TableRecordImpl<PsChangeToCharge_09022015Record> implements Record12<String, Integer, Integer, Timestamp, Timestamp, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -2055260438;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.Reservation_ID</code>.
     */
    public void setReservationId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.Reservation_ID</code>.
     */
    public String getReservationId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.res_ref</code>.
     */
    public void setResRef(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.res_ref</code>.
     */
    public Integer getResRef() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.ref</code>.
     */
    public void setRef(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.Res_Date</code>.
     */
    public void setResDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.Res_Date</code>.
     */
    public Timestamp getResDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.trans_datetime</code>.
     */
    public void setTransDatetime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.trans_datetime</code>.
     */
    public Timestamp getTransDatetime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.charge_currency</code>.
     */
    public void setChargeCurrency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.charge_currency</code>.
     */
    public String getChargeCurrency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.payandshop_amount</code>.
     */
    public void setPayandshopAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.payandshop_amount</code>.
     */
    public BigDecimal getPayandshopAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.currency</code>.
     */
    public void setCurrency(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.currency</code>.
     */
    public String getCurrency() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.ChargetoEuro</code>.
     */
    public void setChargetoeuro(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.ChargetoEuro</code>.
     */
    public BigDecimal getChargetoeuro() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.pstoEuro</code>.
     */
    public void setPstoeuro(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.pstoEuro</code>.
     */
    public BigDecimal getPstoeuro() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.psEuro</code>.
     */
    public void setPseuro(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.psEuro</code>.
     */
    public BigDecimal getPseuro() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.psCharge</code>.
     */
    public void setPscharge(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.psCharge</code>.
     */
    public BigDecimal getPscharge() {
        return (BigDecimal) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, Integer, Integer, Timestamp, Timestamp, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<String, Integer, Integer, Timestamp, Timestamp, String, BigDecimal, String, BigDecimal, BigDecimal, BigDecimal, BigDecimal> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.RESERVATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.RES_REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.RES_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.TRANS_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.CHARGE_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.PAYANDSHOP_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.CHARGETOEURO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.PSTOEURO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.PSEURO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015.PSCHARGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getReservationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getResRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getResDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getTransDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getChargeCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component7() {
        return getPayandshopAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getChargetoeuro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getPstoeuro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getPseuro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getPscharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getReservationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getResRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getResDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getTransDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getChargeCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value7() {
        return getPayandshopAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getChargetoeuro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getPstoeuro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getPseuro();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getPscharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value1(String value) {
        setReservationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value2(Integer value) {
        setResRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value3(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value4(Timestamp value) {
        setResDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value5(Timestamp value) {
        setTransDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value6(String value) {
        setChargeCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value7(BigDecimal value) {
        setPayandshopAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value8(String value) {
        setCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value9(BigDecimal value) {
        setChargetoeuro(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value10(BigDecimal value) {
        setPstoeuro(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value11(BigDecimal value) {
        setPseuro(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record value12(BigDecimal value) {
        setPscharge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015Record values(String value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, String value6, BigDecimal value7, String value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PsChangeToCharge_09022015Record
     */
    public PsChangeToCharge_09022015Record() {
        super(PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015);
    }

    /**
     * Create a detached, initialised PsChangeToCharge_09022015Record
     */
    public PsChangeToCharge_09022015Record(String reservationId, Integer resRef, Integer ref, Timestamp resDate, Timestamp transDatetime, String chargeCurrency, BigDecimal payandshopAmount, String currency, BigDecimal chargetoeuro, BigDecimal pstoeuro, BigDecimal pseuro, BigDecimal pscharge) {
        super(PsChangeToCharge_09022015.PS_CHANGE_TO_CHARGE_09022015);

        set(0, reservationId);
        set(1, resRef);
        set(2, ref);
        set(3, resDate);
        set(4, transDatetime);
        set(5, chargeCurrency);
        set(6, payandshopAmount);
        set(7, currency);
        set(8, chargetoeuro);
        set(9, pstoeuro);
        set(10, pseuro);
        set(11, pscharge);
    }
}
