/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.DropinLocations;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record2;
import org.jooq.Row2;
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
public class DropinLocationsRecord extends UpdatableRecordImpl<DropinLocationsRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 151708713;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Locations.agency_id</code>.
     */
    public void setAgencyId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Locations.agency_id</code>.
     */
    public Integer getAgencyId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropIn_Locations.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropIn_Locations.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(1);
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
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return DropinLocations.DROPIN_LOCATIONS.AGENCY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return DropinLocations.DROPIN_LOCATIONS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAgencyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinLocationsRecord value1(Integer value) {
        setAgencyId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinLocationsRecord value2(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropinLocationsRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DropinLocationsRecord
     */
    public DropinLocationsRecord() {
        super(DropinLocations.DROPIN_LOCATIONS);
    }

    /**
     * Create a detached, initialised DropinLocationsRecord
     */
    public DropinLocationsRecord(Integer agencyId, Integer locationId) {
        super(DropinLocations.DROPIN_LOCATIONS);

        set(0, agencyId);
        set(1, locationId);
    }
}
