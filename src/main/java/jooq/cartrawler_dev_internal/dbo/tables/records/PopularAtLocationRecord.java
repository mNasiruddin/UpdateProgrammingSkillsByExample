/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.PopularAtLocation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class PopularAtLocationRecord extends UpdatableRecordImpl<PopularAtLocationRecord> implements Record5<Integer, String, Integer, String, Integer> {

    private static final long serialVersionUID = -1158746558;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.popular_at_location.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.popular_at_location.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.popular_at_location.company_name</code>.
     */
    public void setCompanyName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.popular_at_location.company_name</code>.
     */
    public String getCompanyName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.popular_at_location.pickup_location</code>.
     */
    public void setPickupLocation(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.popular_at_location.pickup_location</code>.
     */
    public Integer getPickupLocation() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.popular_at_location.country_id</code>.
     */
    public void setCountryId(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.popular_at_location.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.popular_at_location.no_of_bookings</code>.
     */
    public void setNoOfBookings(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.popular_at_location.no_of_bookings</code>.
     */
    public Integer getNoOfBookings() {
        return (Integer) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, String, Integer> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, String, Integer, String, Integer> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PopularAtLocation.POPULAR_AT_LOCATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PopularAtLocation.POPULAR_AT_LOCATION.COMPANY_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PopularAtLocation.POPULAR_AT_LOCATION.PICKUP_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return PopularAtLocation.POPULAR_AT_LOCATION.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return PopularAtLocation.POPULAR_AT_LOCATION.NO_OF_BOOKINGS;
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
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPickupLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getNoOfBookings();
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
        return getCompanyName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPickupLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getNoOfBookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PopularAtLocationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PopularAtLocationRecord value2(String value) {
        setCompanyName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PopularAtLocationRecord value3(Integer value) {
        setPickupLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PopularAtLocationRecord value4(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PopularAtLocationRecord value5(Integer value) {
        setNoOfBookings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PopularAtLocationRecord values(Integer value1, String value2, Integer value3, String value4, Integer value5) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PopularAtLocationRecord
     */
    public PopularAtLocationRecord() {
        super(PopularAtLocation.POPULAR_AT_LOCATION);
    }

    /**
     * Create a detached, initialised PopularAtLocationRecord
     */
    public PopularAtLocationRecord(Integer id, String companyName, Integer pickupLocation, String countryId, Integer noOfBookings) {
        super(PopularAtLocation.POPULAR_AT_LOCATION);

        set(0, id);
        set(1, companyName);
        set(2, pickupLocation);
        set(3, countryId);
        set(4, noOfBookings);
    }
}