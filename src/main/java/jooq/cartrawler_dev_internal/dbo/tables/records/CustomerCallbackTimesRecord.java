/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CustomerCallbackTimes;

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
public class CustomerCallbackTimesRecord extends UpdatableRecordImpl<CustomerCallbackTimesRecord> implements Record4<UUID, Integer, Timestamp, Timestamp> {

    private static final long serialVersionUID = 2121496;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.id</code>.
     */
    public void setId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.id</code>.
     */
    public UUID getId() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.fk_callback</code>.
     */
    public void setFkCallback(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.fk_callback</code>.
     */
    public Integer getFkCallback() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.range_a</code>.
     */
    public void setRangeA(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.range_a</code>.
     */
    public Timestamp getRangeA() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.range_b</code>.
     */
    public void setRangeB(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.customer_callback_times.range_b</code>.
     */
    public Timestamp getRangeB() {
        return (Timestamp) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, Timestamp, Timestamp> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<UUID, Integer, Timestamp, Timestamp> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return CustomerCallbackTimes.CUSTOMER_CALLBACK_TIMES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CustomerCallbackTimes.CUSTOMER_CALLBACK_TIMES.FK_CALLBACK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CustomerCallbackTimes.CUSTOMER_CALLBACK_TIMES.RANGE_A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CustomerCallbackTimes.CUSTOMER_CALLBACK_TIMES.RANGE_B;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getFkCallback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getRangeA();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getRangeB();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UUID value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getFkCallback();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getRangeA();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getRangeB();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerCallbackTimesRecord value1(UUID value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerCallbackTimesRecord value2(Integer value) {
        setFkCallback(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerCallbackTimesRecord value3(Timestamp value) {
        setRangeA(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerCallbackTimesRecord value4(Timestamp value) {
        setRangeB(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerCallbackTimesRecord values(UUID value1, Integer value2, Timestamp value3, Timestamp value4) {
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
     * Create a detached CustomerCallbackTimesRecord
     */
    public CustomerCallbackTimesRecord() {
        super(CustomerCallbackTimes.CUSTOMER_CALLBACK_TIMES);
    }

    /**
     * Create a detached, initialised CustomerCallbackTimesRecord
     */
    public CustomerCallbackTimesRecord(UUID id, Integer fkCallback, Timestamp rangeA, Timestamp rangeB) {
        super(CustomerCallbackTimes.CUSTOMER_CALLBACK_TIMES);

        set(0, id);
        set(1, fkCallback);
        set(2, rangeA);
        set(3, rangeB);
    }
}