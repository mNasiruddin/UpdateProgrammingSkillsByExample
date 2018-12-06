/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.LocationClosed;

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
public class LocationClosedRecord extends UpdatableRecordImpl<LocationClosedRecord> implements Record5<Integer, Integer, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 1006389841;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Closed_ID</code>.
     */
    public void setClosedId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Closed_ID</code>.
     */
    public Integer getClosedId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Agency_ID</code>.
     */
    public void setAgencyId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Agency_ID</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Location_ID</code>.
     */
    public void setLocationId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Location_ID</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Start_Date</code>.
     */
    public void setStartDate(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Closed.Start_Date</code>.
     */
    public Timestamp getStartDate() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Location_Closed.End_Date</code>.
     */
    public void setEndDate(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Location_Closed.End_Date</code>.
     */
    public Timestamp getEndDate() {
        return (Timestamp) get(4);
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
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return LocationClosed.LOCATION_CLOSED.CLOSED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return LocationClosed.LOCATION_CLOSED.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return LocationClosed.LOCATION_CLOSED.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return LocationClosed.LOCATION_CLOSED.START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return LocationClosed.LOCATION_CLOSED.END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getClosedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getClosedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationClosedRecord value1(Integer value) {
        setClosedId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationClosedRecord value2(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationClosedRecord value3(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationClosedRecord value4(Timestamp value) {
        setStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationClosedRecord value5(Timestamp value) {
        setEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public LocationClosedRecord values(Integer value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5) {
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
     * Create a detached LocationClosedRecord
     */
    public LocationClosedRecord() {
        super(LocationClosed.LOCATION_CLOSED);
    }

    /**
     * Create a detached, initialised LocationClosedRecord
     */
    public LocationClosedRecord(Integer closedId, Integer agencyId, Integer locationId, Timestamp startDate, Timestamp endDate) {
        super(LocationClosed.LOCATION_CLOSED);

        set(0, closedId);
        set(1, agencyId);
        set(2, locationId);
        set(3, startDate);
        set(4, endDate);
    }
}