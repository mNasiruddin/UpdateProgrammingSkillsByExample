/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Dropoffs;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
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
public class DropoffsRecord extends UpdatableRecordImpl<DropoffsRecord> implements Record4<Integer, Integer, Integer, Long> {

    private static final long serialVersionUID = -1596623524;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropOffs.dropoff_id</code>.
     */
    public void setDropoffId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropOffs.dropoff_id</code>.
     */
    public Integer getDropoffId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropOffs.location_id</code>.
     */
    public void setLocationId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropOffs.location_id</code>.
     */
    public Integer getLocationId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropOffs.droploc_id</code>.
     */
    public void setDroplocId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropOffs.droploc_id</code>.
     */
    public Integer getDroplocId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.DropOffs.charge</code>.
     */
    public void setCharge(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.DropOffs.charge</code>.
     */
    public Long getCharge() {
        return (Long) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Long> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, Long> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Dropoffs.DROPOFFS.DROPOFF_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Dropoffs.DROPOFFS.LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Dropoffs.DROPOFFS.DROPLOC_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Dropoffs.DROPOFFS.CHARGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getDropoffId();
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
    public Integer component3() {
        return getDroplocId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getCharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getDropoffId();
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
    public Integer value3() {
        return getDroplocId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getCharge();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropoffsRecord value1(Integer value) {
        setDropoffId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropoffsRecord value2(Integer value) {
        setLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropoffsRecord value3(Integer value) {
        setDroplocId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropoffsRecord value4(Long value) {
        setCharge(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DropoffsRecord values(Integer value1, Integer value2, Integer value3, Long value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DropoffsRecord
     */
    public DropoffsRecord() {
        super(Dropoffs.DROPOFFS);
    }

    /**
     * Create a detached, initialised DropoffsRecord
     */
    public DropoffsRecord(Integer dropoffId, Integer locationId, Integer droplocId, Long charge) {
        super(Dropoffs.DROPOFFS);

        set(0, dropoffId);
        set(1, locationId);
        set(2, droplocId);
        set(3, charge);
    }
}
