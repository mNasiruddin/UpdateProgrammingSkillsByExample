/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.StopsaleDateRange;

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
public class StopsaleDateRangeRecord extends UpdatableRecordImpl<StopsaleDateRangeRecord> implements Record5<UUID, Integer, Timestamp, Timestamp, byte[]> {

    private static final long serialVersionUID = -1017598711;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.stopsale_id</code>.
     */
    public void setStopsaleId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.stopsale_id</code>.
     */
    public Integer getStopsaleId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.date_range_from</code>.
     */
    public void setDateRangeFrom(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.date_range_from</code>.
     */
    public Timestamp getDateRangeFrom() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.date_range_to</code>.
     */
    public void setDateRangeTo(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.date_range_to</code>.
     */
    public Timestamp getDateRangeTo() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.rv</code>.
     */
    public void setRv(byte... value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.stopsale_date_range.rv</code>.
     */
    public byte[] getRv() {
        return (byte[]) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Timestamp, Timestamp, byte[]> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<UUID, Integer, Timestamp, Timestamp, byte[]> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return StopsaleDateRange.STOPSALE_DATE_RANGE.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return StopsaleDateRange.STOPSALE_DATE_RANGE.STOPSALE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return StopsaleDateRange.STOPSALE_DATE_RANGE.DATE_RANGE_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return StopsaleDateRange.STOPSALE_DATE_RANGE.DATE_RANGE_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field5() {
        return StopsaleDateRange.STOPSALE_DATE_RANGE.RV;
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
        return getStopsaleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getDateRangeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getDateRangeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component5() {
        return getRv();
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
        return getStopsaleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getDateRangeFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDateRangeTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value5() {
        return getRv();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRangeRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRangeRecord value2(Integer value) {
        setStopsaleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRangeRecord value3(Timestamp value) {
        setDateRangeFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRangeRecord value4(Timestamp value) {
        setDateRangeTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRangeRecord value5(byte... value) {
        setRv(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public StopsaleDateRangeRecord values(UUID value1, Integer value2, Timestamp value3, Timestamp value4, byte[] value5) {
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
     * Create a detached StopsaleDateRangeRecord
     */
    public StopsaleDateRangeRecord() {
        super(StopsaleDateRange.STOPSALE_DATE_RANGE);
    }

    /**
     * Create a detached, initialised StopsaleDateRangeRecord
     */
    public StopsaleDateRangeRecord(UUID guid, Integer stopsaleId, Timestamp dateRangeFrom, Timestamp dateRangeTo, byte[] rv) {
        super(StopsaleDateRange.STOPSALE_DATE_RANGE);

        set(0, guid);
        set(1, stopsaleId);
        set(2, dateRangeFrom);
        set(3, dateRangeTo);
        set(4, rv);
    }
}
