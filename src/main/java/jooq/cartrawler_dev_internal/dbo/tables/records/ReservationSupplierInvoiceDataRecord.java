/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ReservationSupplierInvoiceData;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class ReservationSupplierInvoiceDataRecord extends UpdatableRecordImpl<ReservationSupplierInvoiceDataRecord> implements Record16<UUID, Integer, BigDecimal, BigDecimal, String, Timestamp, Timestamp, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> {

    private static final long serialVersionUID = -1441328282;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.amount</code>.
     */
    public void setAmount(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.amount</code>.
     */
    public BigDecimal getAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.adjustment</code>.
     */
    public void setAdjustment(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.adjustment</code>.
     */
    public BigDecimal getAdjustment() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.notes</code>.
     */
    public void setNotes(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.notes</code>.
     */
    public String getNotes() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.pickup</code>.
     */
    public void setPickup(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.pickup</code>.
     */
    public Timestamp getPickup() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.dropoff</code>.
     */
    public void setDropoff(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.dropoff</code>.
     */
    public Timestamp getDropoff() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fk_user</code>.
     */
    public void setFkUser(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fk_user</code>.
     */
    public Integer getFkUser() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.commissionableAmount</code>.
     */
    public void setCommissionableamount(BigDecimal value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.commissionableAmount</code>.
     */
    public BigDecimal getCommissionableamount() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.amount2</code>.
     */
    public void setAmount2(BigDecimal value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.amount2</code>.
     */
    public BigDecimal getAmount2() {
        return (BigDecimal) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.invoice_amount_billing_currency</code>.
     */
    public void setInvoiceAmountBillingCurrency(BigDecimal value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.invoice_amount_billing_currency</code>.
     */
    public BigDecimal getInvoiceAmountBillingCurrency() {
        return (BigDecimal) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.commissionableAmount2</code>.
     */
    public void setCommissionableamount2(BigDecimal value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.commissionableAmount2</code>.
     */
    public BigDecimal getCommissionableamount2() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.invoice_amount_billing_currency2</code>.
     */
    public void setInvoiceAmountBillingCurrency2(BigDecimal value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.invoice_amount_billing_currency2</code>.
     */
    public BigDecimal getInvoiceAmountBillingCurrency2() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.bill_currency</code>.
     */
    public void setBillCurrency(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.bill_currency</code>.
     */
    public String getBillCurrency() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fx_diff_1</code>.
     */
    public void setFxDiff_1(BigDecimal value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fx_diff_1</code>.
     */
    public BigDecimal getFxDiff_1() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fx_diff_2</code>.
     */
    public void setFxDiff_2(BigDecimal value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.reservation_supplier_invoice_data.fx_diff_2</code>.
     */
    public BigDecimal getFxDiff_2() {
        return (BigDecimal) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UUID, Integer, BigDecimal, BigDecimal, String, Timestamp, Timestamp, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<UUID, Integer, BigDecimal, BigDecimal, String, Timestamp, Timestamp, Integer, BigDecimal, BigDecimal, BigDecimal, BigDecimal, BigDecimal, String, BigDecimal, BigDecimal> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.AMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.ADJUSTMENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.NOTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.PICKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.DROPOFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.FK_USER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field9() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.COMMISSIONABLEAMOUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field10() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.AMOUNT2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field11() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.INVOICE_AMOUNT_BILLING_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field12() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.COMMISSIONABLEAMOUNT2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field13() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.INVOICE_AMOUNT_BILLING_CURRENCY2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.BILL_CURRENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field15() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.FX_DIFF_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field16() {
        return ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA.FX_DIFF_2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getGuid();
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
    public BigDecimal component3() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getAdjustment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getPickup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getDropoff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component9() {
        return getCommissionableamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component10() {
        return getAmount2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component11() {
        return getInvoiceAmountBillingCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component12() {
        return getCommissionableamount2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component13() {
        return getInvoiceAmountBillingCurrency2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getBillCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component15() {
        return getFxDiff_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component16() {
        return getFxDiff_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getGuid();
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
    public BigDecimal value3() {
        return getAmount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getAdjustment();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNotes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getPickup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getDropoff();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value9() {
        return getCommissionableamount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value10() {
        return getAmount2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value11() {
        return getInvoiceAmountBillingCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value12() {
        return getCommissionableamount2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value13() {
        return getInvoiceAmountBillingCurrency2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getBillCurrency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value15() {
        return getFxDiff_1();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value16() {
        return getFxDiff_2();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value2(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value3(BigDecimal value) {
        setAmount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value4(BigDecimal value) {
        setAdjustment(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value5(String value) {
        setNotes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value6(Timestamp value) {
        setPickup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value7(Timestamp value) {
        setDropoff(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value8(Integer value) {
        setFkUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value9(BigDecimal value) {
        setCommissionableamount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value10(BigDecimal value) {
        setAmount2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value11(BigDecimal value) {
        setInvoiceAmountBillingCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value12(BigDecimal value) {
        setCommissionableamount2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value13(BigDecimal value) {
        setInvoiceAmountBillingCurrency2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value14(String value) {
        setBillCurrency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value15(BigDecimal value) {
        setFxDiff_1(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord value16(BigDecimal value) {
        setFxDiff_2(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSupplierInvoiceDataRecord values(UUID value1, Integer value2, BigDecimal value3, BigDecimal value4, String value5, Timestamp value6, Timestamp value7, Integer value8, BigDecimal value9, BigDecimal value10, BigDecimal value11, BigDecimal value12, BigDecimal value13, String value14, BigDecimal value15, BigDecimal value16) {
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
        value14(value14);
        value15(value15);
        value16(value16);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ReservationSupplierInvoiceDataRecord
     */
    public ReservationSupplierInvoiceDataRecord() {
        super(ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA);
    }

    /**
     * Create a detached, initialised ReservationSupplierInvoiceDataRecord
     */
    public ReservationSupplierInvoiceDataRecord(UUID guid, Integer fkReservation, BigDecimal amount, BigDecimal adjustment, String notes, Timestamp pickup, Timestamp dropoff, Integer fkUser, BigDecimal commissionableamount, BigDecimal amount2, BigDecimal invoiceAmountBillingCurrency, BigDecimal commissionableamount2, BigDecimal invoiceAmountBillingCurrency2, String billCurrency, BigDecimal fxDiff_1, BigDecimal fxDiff_2) {
        super(ReservationSupplierInvoiceData.RESERVATION_SUPPLIER_INVOICE_DATA);

        set(0, guid);
        set(1, fkReservation);
        set(2, amount);
        set(3, adjustment);
        set(4, notes);
        set(5, pickup);
        set(6, dropoff);
        set(7, fkUser);
        set(8, commissionableamount);
        set(9, amount2);
        set(10, invoiceAmountBillingCurrency);
        set(11, commissionableamount2);
        set(12, invoiceAmountBillingCurrency2);
        set(13, billCurrency);
        set(14, fxDiff_1);
        set(15, fxDiff_2);
    }
}
