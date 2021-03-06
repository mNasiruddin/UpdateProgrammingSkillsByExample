/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.InvoiceLine;

import org.jooq.Record1;
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
public class InvoiceLineRecord extends UpdatableRecordImpl<InvoiceLineRecord> {

    private static final long serialVersionUID = -2255540;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_ancillary_provider</code>.
     */
    public void setFkAncillaryProvider(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_ancillary_provider</code>.
     */
    public Integer getFkAncillaryProvider() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoice_type</code>.
     */
    public void setInvoiceType(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoice_type</code>.
     */
    public Integer getInvoiceType() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoice_line_type</code>.
     */
    public void setInvoiceLineType(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoice_line_type</code>.
     */
    public Integer getInvoiceLineType() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoice_date</code>.
     */
    public void setInvoiceDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoice_date</code>.
     */
    public Timestamp getInvoiceDate() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.Invoice_number</code>.
     */
    public void setInvoiceNumber(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.Invoice_number</code>.
     */
    public String getInvoiceNumber() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.remarks</code>.
     */
    public void setRemarks(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.remarks</code>.
     */
    public String getRemarks() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.provider</code>.
     */
    public void setProvider(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.provider</code>.
     */
    public String getProvider() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.company_id</code>.
     */
    public void setCompanyId(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.company_id</code>.
     */
    public Integer getCompanyId() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_creditor_id</code>.
     */
    public void setFkCreditorId(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_creditor_id</code>.
     */
    public Integer getFkCreditorId() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_debtor_id</code>.
     */
    public void setFkDebtorId(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_debtor_id</code>.
     */
    public Integer getFkDebtorId() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_ct_user</code>.
     */
    public void setFkCtUser(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.fk_ct_user</code>.
     */
    public Integer getFkCtUser() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.ax_user</code>.
     */
    public void setAxUser(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.ax_user</code>.
     */
    public String getAxUser() {
        return (String) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.billing_currency</code>.
     */
    public void setBillingCurrency(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.billing_currency</code>.
     */
    public String getBillingCurrency() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.number_reservations_total</code>.
     */
    public void setNumberReservationsTotal(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.number_reservations_total</code>.
     */
    public Integer getNumberReservationsTotal() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.number_reservations_processed</code>.
     */
    public void setNumberReservationsProcessed(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.number_reservations_processed</code>.
     */
    public Integer getNumberReservationsProcessed() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.expected_amount_rate</code>.
     */
    public void setExpectedAmountRate(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.expected_amount_rate</code>.
     */
    public BigDecimal getExpectedAmountRate() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.expected_amount_bill</code>.
     */
    public void setExpectedAmountBill(BigDecimal value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.expected_amount_bill</code>.
     */
    public BigDecimal getExpectedAmountBill() {
        return (BigDecimal) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoiced_amount_rate</code>.
     */
    public void setInvoicedAmountRate(BigDecimal value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoiced_amount_rate</code>.
     */
    public BigDecimal getInvoicedAmountRate() {
        return (BigDecimal) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoiced_amount_bill</code>.
     */
    public void setInvoicedAmountBill(BigDecimal value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.invoiced_amount_bill</code>.
     */
    public BigDecimal getInvoicedAmountBill() {
        return (BigDecimal) get(19);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.processed_amount_rate</code>.
     */
    public void setProcessedAmountRate(BigDecimal value) {
        set(20, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.processed_amount_rate</code>.
     */
    public BigDecimal getProcessedAmountRate() {
        return (BigDecimal) get(20);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.processed_amount_bill</code>.
     */
    public void setProcessedAmountBill(BigDecimal value) {
        set(21, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.processed_amount_bill</code>.
     */
    public BigDecimal getProcessedAmountBill() {
        return (BigDecimal) get(21);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.fxdiff_bill</code>.
     */
    public void setFxdiffBill(BigDecimal value) {
        set(22, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.fxdiff_bill</code>.
     */
    public BigDecimal getFxdiffBill() {
        return (BigDecimal) get(22);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.total_invoiced_rate</code>.
     */
    public void setTotalInvoicedRate(BigDecimal value) {
        set(23, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.total_invoiced_rate</code>.
     */
    public BigDecimal getTotalInvoicedRate() {
        return (BigDecimal) get(23);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.total_invoiced_bill</code>.
     */
    public void setTotalInvoicedBill(BigDecimal value) {
        set(24, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.total_invoiced_bill</code>.
     */
    public BigDecimal getTotalInvoicedBill() {
        return (BigDecimal) get(24);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.last_pickup_date</code>.
     */
    public void setLastPickupDate(Date value) {
        set(25, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.last_pickup_date</code>.
     */
    public Date getLastPickupDate() {
        return (Date) get(25);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.receipt_date</code>.
     */
    public void setReceiptDate(Timestamp value) {
        set(26, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.receipt_date</code>.
     */
    public Timestamp getReceiptDate() {
        return (Timestamp) get(26);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.invoice_line.is_paid</code>.
     */
    public void setIsPaid(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.invoice_line.is_paid</code>.
     */
    public Boolean getIsPaid() {
        return (Boolean) get(27);
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
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InvoiceLineRecord
     */
    public InvoiceLineRecord() {
        super(InvoiceLine.INVOICE_LINE);
    }

    /**
     * Create a detached, initialised InvoiceLineRecord
     */
    public InvoiceLineRecord(Integer id, Integer fkAncillaryProvider, Integer invoiceType, Integer invoiceLineType, Timestamp invoiceDate, String invoiceNumber, String remarks, String provider, Integer companyId, Integer fkCreditorId, Integer fkDebtorId, Integer fkCtUser, String axUser, String billingCurrency, Integer numberReservationsTotal, Integer numberReservationsProcessed, BigDecimal expectedAmountRate, BigDecimal expectedAmountBill, BigDecimal invoicedAmountRate, BigDecimal invoicedAmountBill, BigDecimal processedAmountRate, BigDecimal processedAmountBill, BigDecimal fxdiffBill, BigDecimal totalInvoicedRate, BigDecimal totalInvoicedBill, Date lastPickupDate, Timestamp receiptDate, Boolean isPaid) {
        super(InvoiceLine.INVOICE_LINE);

        set(0, id);
        set(1, fkAncillaryProvider);
        set(2, invoiceType);
        set(3, invoiceLineType);
        set(4, invoiceDate);
        set(5, invoiceNumber);
        set(6, remarks);
        set(7, provider);
        set(8, companyId);
        set(9, fkCreditorId);
        set(10, fkDebtorId);
        set(11, fkCtUser);
        set(12, axUser);
        set(13, billingCurrency);
        set(14, numberReservationsTotal);
        set(15, numberReservationsProcessed);
        set(16, expectedAmountRate);
        set(17, expectedAmountBill);
        set(18, invoicedAmountRate);
        set(19, invoicedAmountBill);
        set(20, processedAmountRate);
        set(21, processedAmountBill);
        set(22, fxdiffBill);
        set(23, totalInvoicedRate);
        set(24, totalInvoicedBill);
        set(25, lastPickupDate);
        set(26, receiptDate);
        set(27, isPaid);
    }
}
