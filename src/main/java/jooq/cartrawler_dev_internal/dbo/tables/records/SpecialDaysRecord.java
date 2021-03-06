/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.SpecialDays;

import org.jooq.Field;
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
public class SpecialDaysRecord extends UpdatableRecordImpl<SpecialDaysRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 826719917;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Special_Days.Special_ID</code>.
     */
    public void setSpecialId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Special_Days.Special_ID</code>.
     */
    public Integer getSpecialId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Special_Days.Day</code>.
     */
    public void setDay(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Special_Days.Day</code>.
     */
    public Integer getDay() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
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
        return SpecialDays.SPECIAL_DAYS.SPECIAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return SpecialDays.SPECIAL_DAYS.DAY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getSpecialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getSpecialId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getDay();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialDaysRecord value1(Integer value) {
        setSpecialId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialDaysRecord value2(Integer value) {
        setDay(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SpecialDaysRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpecialDaysRecord
     */
    public SpecialDaysRecord() {
        super(SpecialDays.SPECIAL_DAYS);
    }

    /**
     * Create a detached, initialised SpecialDaysRecord
     */
    public SpecialDaysRecord(Integer specialId, Integer day) {
        super(SpecialDays.SPECIAL_DAYS);

        set(0, specialId);
        set(1, day);
    }
}
