/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Onetimeoffercodeusage;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;


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
public class OnetimeoffercodeusageRecord extends UpdatableRecordImpl<OnetimeoffercodeusageRecord> implements Record5<Integer, Integer, UByte, Integer, Boolean> {

    private static final long serialVersionUID = 1915887234;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.offerCode</code>.
     */
    public void setOffercode(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.offerCode</code>.
     */
    public Integer getOffercode() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.usageID</code>.
     */
    public void setUsageid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.usageID</code>.
     */
    public Integer getUsageid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.status</code>.
     */
    public void setStatus(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.status</code>.
     */
    public UByte getStatus() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.isLocked</code>.
     */
    public void setIslocked(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.oneTimeOfferCodeUsage.isLocked</code>.
     */
    public Boolean getIslocked() {
        return (Boolean) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, UByte, Integer, Boolean> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, UByte, Integer, Boolean> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE.OFFERCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE.USAGEID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field3() {
        return Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field5() {
        return Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE.ISLOCKED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getOffercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getUsageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component4() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component5() {
        return getIslocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getOffercode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getUsageid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value3() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value4() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value5() {
        return getIslocked();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimeoffercodeusageRecord value1(Integer value) {
        setOffercode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimeoffercodeusageRecord value2(Integer value) {
        setUsageid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimeoffercodeusageRecord value3(UByte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimeoffercodeusageRecord value4(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimeoffercodeusageRecord value5(Boolean value) {
        setIslocked(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OnetimeoffercodeusageRecord values(Integer value1, Integer value2, UByte value3, Integer value4, Boolean value5) {
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
     * Create a detached OnetimeoffercodeusageRecord
     */
    public OnetimeoffercodeusageRecord() {
        super(Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE);
    }

    /**
     * Create a detached, initialised OnetimeoffercodeusageRecord
     */
    public OnetimeoffercodeusageRecord(Integer offercode, Integer usageid, UByte status, Integer fkReservation, Boolean islocked) {
        super(Onetimeoffercodeusage.ONETIMEOFFERCODEUSAGE);

        set(0, offercode);
        set(1, usageid);
        set(2, status);
        set(3, fkReservation);
        set(4, islocked);
    }
}