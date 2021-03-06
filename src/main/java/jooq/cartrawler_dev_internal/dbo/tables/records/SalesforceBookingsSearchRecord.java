/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SalesforceBookingsSearch;

import org.jooq.Field;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class SalesforceBookingsSearchRecord extends TableRecordImpl<SalesforceBookingsSearchRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = 723173600;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.ref</code>.
     */
    public void setRef(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.ref</code>.
     */
    public Integer getRef() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.Booking_id</code>.
     */
    public void setBookingId(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.Booking_id</code>.
     */
    public String getBookingId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.Supplier_Reference</code>.
     */
    public void setSupplierReference(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.SalesForce_Bookings_search.Supplier_Reference</code>.
     */
    public String getSupplierReference() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return SalesforceBookingsSearch.SALESFORCE_BOOKINGS_SEARCH.REF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return SalesforceBookingsSearch.SALESFORCE_BOOKINGS_SEARCH.BOOKING_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return SalesforceBookingsSearch.SALESFORCE_BOOKINGS_SEARCH.SUPPLIER_REFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getBookingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getSupplierReference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRef();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getBookingId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getSupplierReference();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsSearchRecord value1(Integer value) {
        setRef(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsSearchRecord value2(String value) {
        setBookingId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsSearchRecord value3(String value) {
        setSupplierReference(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SalesforceBookingsSearchRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SalesforceBookingsSearchRecord
     */
    public SalesforceBookingsSearchRecord() {
        super(SalesforceBookingsSearch.SALESFORCE_BOOKINGS_SEARCH);
    }

    /**
     * Create a detached, initialised SalesforceBookingsSearchRecord
     */
    public SalesforceBookingsSearchRecord(Integer ref, String bookingId, String supplierReference) {
        super(SalesforceBookingsSearch.SALESFORCE_BOOKINGS_SEARCH);

        set(0, ref);
        set(1, bookingId);
        set(2, supplierReference);
    }
}
