/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Otaratesheet;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class OtaratesheetRecord extends UpdatableRecordImpl<OtaratesheetRecord> implements Record17<UUID, Integer, Integer, Timestamp, Timestamp, Timestamp, Integer, String, String, Boolean, String, Timestamp, Timestamp, String, String, Timestamp, Timestamp> {

    private static final long serialVersionUID = -367981147;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.ratesheet_id</code>.
     */
    public void setRatesheetId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.ratesheet_id</code>.
     */
    public Integer getRatesheetId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.create_datetime</code>.
     */
    public void setCreateDatetime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.create_datetime</code>.
     */
    public Timestamp getCreateDatetime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.delete_datetime</code>.
     */
    public void setDeleteDatetime(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.delete_datetime</code>.
     */
    public Timestamp getDeleteDatetime() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.lastmodify_datetime</code>.
     */
    public void setLastmodifyDatetime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.lastmodify_datetime</code>.
     */
    public Timestamp getLastmodifyDatetime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.lastmodify_user_id</code>.
     */
    public void setLastmodifyUserId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.lastmodify_user_id</code>.
     */
    public Integer getLastmodifyUserId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.description</code>.
     */
    public void setDescription(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.description</code>.
     */
    public String getDescription() {
        return (String) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.currency_code</code>.
     */
    public void setCurrencyCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.currency_code</code>.
     */
    public String getCurrencyCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.tax_inclusive</code>.
     */
    public void setTaxInclusive(Boolean value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.tax_inclusive</code>.
     */
    public Boolean getTaxInclusive() {
        return (Boolean) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.vendor_ratesheet_id</code>.
     */
    public void setVendorRatesheetId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.vendor_ratesheet_id</code>.
     */
    public String getVendorRatesheetId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.effective_start_date</code>.
     */
    public void setEffectiveStartDate(Timestamp value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.effective_start_date</code>.
     */
    public Timestamp getEffectiveStartDate() {
        return (Timestamp) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.effective_end_date</code>.
     */
    public void setEffectiveEndDate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.effective_end_date</code>.
     */
    public Timestamp getEffectiveEndDate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.pickup_locationgroup_ids</code>.
     */
    public void setPickupLocationgroupIds(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.pickup_locationgroup_ids</code>.
     */
    public String getPickupLocationgroupIds() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.rate_type_ids</code>.
     */
    public void setRateTypeIds(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.rate_type_ids</code>.
     */
    public String getRateTypeIds() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.oldest_end_date</code>.
     */
    public void setOldestEndDate(Timestamp value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.oldest_end_date</code>.
     */
    public Timestamp getOldestEndDate() {
        return (Timestamp) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaratesheet.oldest_pickup_end_date</code>.
     */
    public void setOldestPickupEndDate(Timestamp value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaratesheet.oldest_pickup_end_date</code>.
     */
    public Timestamp getOldestPickupEndDate() {
        return (Timestamp) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<UUID, Integer, Integer, Timestamp, Timestamp, Timestamp, Integer, String, String, Boolean, String, Timestamp, Timestamp, String, String, Timestamp, Timestamp> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<UUID, Integer, Integer, Timestamp, Timestamp, Timestamp, Integer, String, String, Boolean, String, Timestamp, Timestamp, String, String, Timestamp, Timestamp> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Otaratesheet.OTARATESHEET.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Otaratesheet.OTARATESHEET.RATESHEET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Otaratesheet.OTARATESHEET.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Otaratesheet.OTARATESHEET.CREATE_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Otaratesheet.OTARATESHEET.DELETE_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Otaratesheet.OTARATESHEET.LASTMODIFY_DATETIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Otaratesheet.OTARATESHEET.LASTMODIFY_USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return Otaratesheet.OTARATESHEET.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Otaratesheet.OTARATESHEET.CURRENCY_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field10() {
        return Otaratesheet.OTARATESHEET.TAX_INCLUSIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Otaratesheet.OTARATESHEET.VENDOR_RATESHEET_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field12() {
        return Otaratesheet.OTARATESHEET.EFFECTIVE_START_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Otaratesheet.OTARATESHEET.EFFECTIVE_END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Otaratesheet.OTARATESHEET.PICKUP_LOCATIONGROUP_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Otaratesheet.OTARATESHEET.RATE_TYPE_IDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field16() {
        return Otaratesheet.OTARATESHEET.OLDEST_END_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field17() {
        return Otaratesheet.OTARATESHEET.OLDEST_PICKUP_END_DATE;
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
        return getRatesheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getCreateDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getDeleteDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getLastmodifyDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getLastmodifyUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component10() {
        return getTaxInclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getVendorRatesheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component12() {
        return getEffectiveStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getEffectiveEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getPickupLocationgroupIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getRateTypeIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component16() {
        return getOldestEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component17() {
        return getOldestPickupEndDate();
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
        return getRatesheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getCreateDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getDeleteDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getLastmodifyDatetime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getLastmodifyUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getCurrencyCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value10() {
        return getTaxInclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getVendorRatesheetId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value12() {
        return getEffectiveStartDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getEffectiveEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getPickupLocationgroupIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getRateTypeIds();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value16() {
        return getOldestEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value17() {
        return getOldestPickupEndDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value2(Integer value) {
        setRatesheetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value3(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value4(Timestamp value) {
        setCreateDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value5(Timestamp value) {
        setDeleteDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value6(Timestamp value) {
        setLastmodifyDatetime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value7(Integer value) {
        setLastmodifyUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value8(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value9(String value) {
        setCurrencyCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value10(Boolean value) {
        setTaxInclusive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value11(String value) {
        setVendorRatesheetId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value12(Timestamp value) {
        setEffectiveStartDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value13(Timestamp value) {
        setEffectiveEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value14(String value) {
        setPickupLocationgroupIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value15(String value) {
        setRateTypeIds(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value16(Timestamp value) {
        setOldestEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord value17(Timestamp value) {
        setOldestPickupEndDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtaratesheetRecord values(UUID value1, Integer value2, Integer value3, Timestamp value4, Timestamp value5, Timestamp value6, Integer value7, String value8, String value9, Boolean value10, String value11, Timestamp value12, Timestamp value13, String value14, String value15, Timestamp value16, Timestamp value17) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OtaratesheetRecord
     */
    public OtaratesheetRecord() {
        super(Otaratesheet.OTARATESHEET);
    }

    /**
     * Create a detached, initialised OtaratesheetRecord
     */
    public OtaratesheetRecord(UUID guid, Integer ratesheetId, Integer carAgentId, Timestamp createDatetime, Timestamp deleteDatetime, Timestamp lastmodifyDatetime, Integer lastmodifyUserId, String description, String currencyCode, Boolean taxInclusive, String vendorRatesheetId, Timestamp effectiveStartDate, Timestamp effectiveEndDate, String pickupLocationgroupIds, String rateTypeIds, Timestamp oldestEndDate, Timestamp oldestPickupEndDate) {
        super(Otaratesheet.OTARATESHEET);

        set(0, guid);
        set(1, ratesheetId);
        set(2, carAgentId);
        set(3, createDatetime);
        set(4, deleteDatetime);
        set(5, lastmodifyDatetime);
        set(6, lastmodifyUserId);
        set(7, description);
        set(8, currencyCode);
        set(9, taxInclusive);
        set(10, vendorRatesheetId);
        set(11, effectiveStartDate);
        set(12, effectiveEndDate);
        set(13, pickupLocationgroupIds);
        set(14, rateTypeIds);
        set(15, oldestEndDate);
        set(16, oldestPickupEndDate);
    }
}