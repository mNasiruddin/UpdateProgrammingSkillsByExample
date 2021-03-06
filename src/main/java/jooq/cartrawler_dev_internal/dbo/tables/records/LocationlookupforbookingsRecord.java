/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Locationlookupforbookings;

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
public class LocationlookupforbookingsRecord extends TableRecordImpl<LocationlookupforbookingsRecord> implements Record3<Integer, String, String> {

    private static final long serialVersionUID = -1330705215;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.locationLookupForBookings.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.locationLookupForBookings.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.locationLookupForBookings.pickup</code>.
     */
    public void setPickup(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.locationLookupForBookings.pickup</code>.
     */
    public String getPickup() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.locationLookupForBookings.country_id</code>.
     */
    public void setCountryId(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.locationLookupForBookings.country_id</code>.
     */
    public String getCountryId() {
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
        return Locationlookupforbookings.LOCATIONLOOKUPFORBOOKINGS.CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Locationlookupforbookings.LOCATIONLOOKUPFORBOOKINGS.PICKUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Locationlookupforbookings.LOCATIONLOOKUPFORBOOKINGS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getPickup();
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
    public Integer value1() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getPickup();
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
    public LocationlookupforbookingsRecord value1(Integer value) {
        setCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationlookupforbookingsRecord value2(String value) {
        setPickup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationlookupforbookingsRecord value3(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationlookupforbookingsRecord values(Integer value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached LocationlookupforbookingsRecord
     */
    public LocationlookupforbookingsRecord() {
        super(Locationlookupforbookings.LOCATIONLOOKUPFORBOOKINGS);
    }

    /**
     * Create a detached, initialised LocationlookupforbookingsRecord
     */
    public LocationlookupforbookingsRecord(Integer carAgentLocationId, String pickup, String countryId) {
        super(Locationlookupforbookings.LOCATIONLOOKUPFORBOOKINGS);

        set(0, carAgentLocationId);
        set(1, pickup);
        set(2, countryId);
    }
}
