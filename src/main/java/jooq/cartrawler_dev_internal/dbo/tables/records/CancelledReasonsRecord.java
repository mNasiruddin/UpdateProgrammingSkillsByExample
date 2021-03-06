/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.CancelledReasons;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
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
public class CancelledReasonsRecord extends UpdatableRecordImpl<CancelledReasonsRecord> implements Record6<UUID, Integer, String, Timestamp, Boolean, Integer> {

    private static final long serialVersionUID = -369509575;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.cancelled_id</code>.
     */
    public void setCancelledId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.cancelled_id</code>.
     */
    public Integer getCancelledId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.cancelled_name</code>.
     */
    public void setCancelledName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.cancelled_name</code>.
     */
    public String getCancelledName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.date_added</code>.
     */
    public void setDateAdded(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.date_added</code>.
     */
    public Timestamp getDateAdded() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.status</code>.
     */
    public void setStatus(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.status</code>.
     */
    public Boolean getStatus() {
        return (Boolean) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.cancel_type</code>.
     */
    public void setCancelType(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.cancelled_reasons.cancel_type</code>.
     */
    public Integer getCancelType() {
        return (Integer) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, String, Timestamp, Boolean, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, Integer, String, Timestamp, Boolean, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return CancelledReasons.CANCELLED_REASONS.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return CancelledReasons.CANCELLED_REASONS.CANCELLED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return CancelledReasons.CANCELLED_REASONS.CANCELLED_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CancelledReasons.CANCELLED_REASONS.DATE_ADDED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return CancelledReasons.CANCELLED_REASONS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return CancelledReasons.CANCELLED_REASONS.CANCEL_TYPE;
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
        return getCancelledId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCancelledName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getDateAdded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getCancelType();
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
        return getCancelledId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCancelledName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getDateAdded();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getCancelType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord value2(Integer value) {
        setCancelledId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord value3(String value) {
        setCancelledName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord value4(Timestamp value) {
        setDateAdded(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord value5(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord value6(Integer value) {
        setCancelType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CancelledReasonsRecord values(UUID value1, Integer value2, String value3, Timestamp value4, Boolean value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CancelledReasonsRecord
     */
    public CancelledReasonsRecord() {
        super(CancelledReasons.CANCELLED_REASONS);
    }

    /**
     * Create a detached, initialised CancelledReasonsRecord
     */
    public CancelledReasonsRecord(UUID guid, Integer cancelledId, String cancelledName, Timestamp dateAdded, Boolean status, Integer cancelType) {
        super(CancelledReasons.CANCELLED_REASONS);

        set(0, guid);
        set(1, cancelledId);
        set(2, cancelledName);
        set(3, dateAdded);
        set(4, status);
        set(5, cancelType);
    }
}
