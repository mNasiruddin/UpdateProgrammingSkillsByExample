/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationChargeableProduct;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class ReservationChargeableProductRecord extends UpdatableRecordImpl<ReservationChargeableProductRecord> implements Record12<Integer, Integer, Integer, Integer, BigDecimal, String, BigDecimal, String, BigDecimal, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = -360014764;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.product_type</code>.
     */
    public void setProductType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.product_type</code>.
     */
    public Integer getProductType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.ancillary_type</code>.
     */
    public void setAncillaryType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.ancillary_type</code>.
     */
    public Integer getAncillaryType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.charge_amount</code>.
     */
    public void setChargeAmount(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.charge_amount</code>.
     */
    public BigDecimal getChargeAmount() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.charge_currency</code>.
     */
    public void setChargeCurrency(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.charge_currency</code>.
     */
    public String getChargeCurrency() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_amount</code>.
     */
    public void setRateAmount(BigDecimal value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_amount</code>.
     */
    public BigDecimal getRateAmount() {
        return (BigDecimal) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_currency</code>.
     */
    public void setRateCurrency(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_currency</code>.
     */
    public String getRateCurrency() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_charge_xe</code>.
     */
    public void setRateChargeXe(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.rate_charge_xe</code>.
     */
    public BigDecimal getRateChargeXe() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.lifecycle</code>.
     */
    public void setLifecycle(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.lifecycle</code>.
     */
    public Integer getLifecycle() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.create_date</code>.
     */
    public void setCreateDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.create_date</code>.
     */
    public Timestamp getCreateDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.cancelled_date</code>.
     */
    public void setCancelledDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_chargeable_product.cancelled_date</code>.
     */
    public Timestamp getCancelledDate() {
        return (Timestamp) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, BigDecimal, String, BigDecimal, String, BigDecimal, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, Integer, Integer, BigDecimal, String, BigDecimal, String, BigDecimal, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.PRODUCT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.ANCILLARY_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field5() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.CHARGE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.CHARGE_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field7() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.RATE_AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.RATE_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.RATE_CHARGE_XE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.LIFECYCLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.CREATE_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT.CANCELLED_DATE;
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
    public Integer component2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getProductType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getAncillaryType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component5() {
        return getChargeAmount();
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
        return getRateAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getRateCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getRateChargeXe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getLifecycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getCancelledDate();
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
    public Integer value2() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getProductType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getAncillaryType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value5() {
        return getChargeAmount();
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
        return getRateAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getRateCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getRateChargeXe();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getLifecycle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getCreateDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getCancelledDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value3(Integer value) {
        setProductType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value4(Integer value) {
        setAncillaryType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value5(BigDecimal value) {
        setChargeAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value6(String value) {
        setChargeCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value7(BigDecimal value) {
        setRateAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value8(String value) {
        setRateCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value9(BigDecimal value) {
        setRateChargeXe(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value10(Integer value) {
        setLifecycle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value11(Timestamp value) {
        setCreateDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord value12(Timestamp value) {
        setCancelledDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationChargeableProductRecord values(Integer value1, Integer value2, Integer value3, Integer value4, BigDecimal value5, String value6, BigDecimal value7, String value8, BigDecimal value9, Integer value10, Timestamp value11, Timestamp value12) {
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
     * Create a detached ReservationChargeableProductRecord
     */
    public ReservationChargeableProductRecord() {
        super(ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT);
    }

    /**
     * Create a detached, initialised ReservationChargeableProductRecord
     */
    public ReservationChargeableProductRecord(Integer id, Integer fkReservation, Integer productType, Integer ancillaryType, BigDecimal chargeAmount, String chargeCurrency, BigDecimal rateAmount, String rateCurrency, BigDecimal rateChargeXe, Integer lifecycle, Timestamp createDate, Timestamp cancelledDate) {
        super(ReservationChargeableProduct.RESERVATION_CHARGEABLE_PRODUCT);

        set(0, id);
        set(1, fkReservation);
        set(2, productType);
        set(3, ancillaryType);
        set(4, chargeAmount);
        set(5, chargeCurrency);
        set(6, rateAmount);
        set(7, rateCurrency);
        set(8, rateChargeXe);
        set(9, lifecycle);
        set(10, createDate);
        set(11, cancelledDate);
    }
}
