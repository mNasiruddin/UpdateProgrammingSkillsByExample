/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.PlanbiasingCache;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PlanbiasingCacheRecord extends UpdatableRecordImpl<PlanbiasingCacheRecord> implements Record3<Integer, Timestamp, Integer> {

    private static final long serialVersionUID = 1230623309;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planbiasing_cache.fk_planbiasing</code>.
     */
    public void setFkPlanbiasing(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planbiasing_cache.fk_planbiasing</code>.
     */
    public Integer getFkPlanbiasing() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planbiasing_cache.last_update</code>.
     */
    public void setLastUpdate(Timestamp value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planbiasing_cache.last_update</code>.
     */
    public Timestamp getLastUpdate() {
        return (Timestamp) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.planbiasing_cache.percentage</code>.
     */
    public void setPercentage(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.planbiasing_cache.percentage</code>.
     */
    public Integer getPercentage() {
        return (Integer) get(2);
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
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Integer, Timestamp, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PlanbiasingCache.PLANBIASING_CACHE.FK_PLANBIASING;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field2() {
        return PlanbiasingCache.PLANBIASING_CACHE.LAST_UPDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return PlanbiasingCache.PLANBIASING_CACHE.PERCENTAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkPlanbiasing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component2() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getPercentage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkPlanbiasing();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value2() {
        return getLastUpdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getPercentage();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlanbiasingCacheRecord value1(Integer value) {
        setFkPlanbiasing(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlanbiasingCacheRecord value2(Timestamp value) {
        setLastUpdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlanbiasingCacheRecord value3(Integer value) {
        setPercentage(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PlanbiasingCacheRecord values(Integer value1, Timestamp value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PlanbiasingCacheRecord
     */
    public PlanbiasingCacheRecord() {
        super(PlanbiasingCache.PLANBIASING_CACHE);
    }

    /**
     * Create a detached, initialised PlanbiasingCacheRecord
     */
    public PlanbiasingCacheRecord(Integer fkPlanbiasing, Timestamp lastUpdate, Integer percentage) {
        super(PlanbiasingCache.PLANBIASING_CACHE);

        set(0, fkPlanbiasing);
        set(1, lastUpdate);
        set(2, percentage);
    }
}
