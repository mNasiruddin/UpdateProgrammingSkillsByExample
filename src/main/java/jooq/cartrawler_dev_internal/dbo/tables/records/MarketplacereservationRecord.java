/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Marketplacereservation;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
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
public class MarketplacereservationRecord extends UpdatableRecordImpl<MarketplacereservationRecord> implements Record20<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, String, String, Integer, Integer, Boolean, String, String, Integer, BigDecimal, Timestamp, Integer, Boolean> {

    private static final long serialVersionUID = -1813466776;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.market_place_id</code>.
     */
    public void setMarketPlaceId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.market_place_id</code>.
     */
    public Integer getMarketPlaceId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.car_agent_location_id</code>.
     */
    public void setCarAgentLocationId(Integer value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.car_agent_location_id</code>.
     */
    public Integer getCarAgentLocationId() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.active_from</code>.
     */
    public void setActiveFrom(Timestamp value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.active_from</code>.
     */
    public Timestamp getActiveFrom() {
        return (Timestamp) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.active_to</code>.
     */
    public void setActiveTo(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.active_to</code>.
     */
    public Timestamp getActiveTo() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.pickupFrom</code>.
     */
    public void setPickupfrom(Timestamp value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.pickupFrom</code>.
     */
    public Timestamp getPickupfrom() {
        return (Timestamp) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.pickupTo</code>.
     */
    public void setPickupto(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.pickupTo</code>.
     */
    public Timestamp getPickupto() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.supplierGroup</code>.
     */
    public void setSuppliergroup(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.supplierGroup</code>.
     */
    public String getSuppliergroup() {
        return (String) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.mappedSIPP</code>.
     */
    public void setMappedsipp(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.mappedSIPP</code>.
     */
    public String getMappedsipp() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.rentalDaysRangeStart</code>.
     */
    public void setRentaldaysrangestart(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.rentalDaysRangeStart</code>.
     */
    public Integer getRentaldaysrangestart() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.rentalDaysRangeEnd</code>.
     */
    public void setRentaldaysrangeend(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.rentalDaysRangeEnd</code>.
     */
    public Integer getRentaldaysrangeend() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.exclusive</code>.
     */
    public void setExclusive(Boolean value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.exclusive</code>.
     */
    public Boolean getExclusive() {
        return (Boolean) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.market_rate_email</code>.
     */
    public void setMarketRateEmail(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.market_rate_email</code>.
     */
    public String getMarketRateEmail() {
        return (String) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.SMS</code>.
     */
    public void setSms(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.SMS</code>.
     */
    public String getSms() {
        return (String) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.maxBookings</code>.
     */
    public void setMaxbookings(Integer value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.maxBookings</code>.
     */
    public Integer getMaxbookings() {
        return (Integer) get(15);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.dailyBaseRate</code>.
     */
    public void setDailybaserate(BigDecimal value) {
        set(16, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.dailyBaseRate</code>.
     */
    public BigDecimal getDailybaserate() {
        return (BigDecimal) get(16);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.createDate</code>.
     */
    public void setCreatedate(Timestamp value) {
        set(17, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.createDate</code>.
     */
    public Timestamp getCreatedate() {
        return (Timestamp) get(17);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.fk_reservation</code>.
     */
    public void setFkReservation(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.fk_reservation</code>.
     */
    public Integer getFkReservation() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.Active</code>.
     */
    public void setActive(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.MarketPlaceReservation.Active</code>.
     */
    public Boolean getActive() {
        return (Boolean) get(19);
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
    // Record20 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, String, String, Integer, Integer, Boolean, String, String, Integer, BigDecimal, Timestamp, Integer, Boolean> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row20<Integer, Integer, Integer, Integer, Timestamp, Timestamp, Timestamp, Timestamp, String, String, Integer, Integer, Boolean, String, String, Integer, BigDecimal, Timestamp, Integer, Boolean> valuesRow() {
        return (Row20) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Marketplacereservation.MARKETPLACERESERVATION.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Marketplacereservation.MARKETPLACERESERVATION.MARKET_PLACE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Marketplacereservation.MARKETPLACERESERVATION.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field4() {
        return Marketplacereservation.MARKETPLACERESERVATION.CAR_AGENT_LOCATION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field5() {
        return Marketplacereservation.MARKETPLACERESERVATION.ACTIVE_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return Marketplacereservation.MARKETPLACERESERVATION.ACTIVE_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field7() {
        return Marketplacereservation.MARKETPLACERESERVATION.PICKUPFROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Marketplacereservation.MARKETPLACERESERVATION.PICKUPTO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return Marketplacereservation.MARKETPLACERESERVATION.SUPPLIERGROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Marketplacereservation.MARKETPLACERESERVATION.MAPPEDSIPP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Marketplacereservation.MARKETPLACERESERVATION.RENTALDAYSRANGESTART;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Marketplacereservation.MARKETPLACERESERVATION.RENTALDAYSRANGEEND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field13() {
        return Marketplacereservation.MARKETPLACERESERVATION.EXCLUSIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Marketplacereservation.MARKETPLACERESERVATION.MARKET_RATE_EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Marketplacereservation.MARKETPLACERESERVATION.SMS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field16() {
        return Marketplacereservation.MARKETPLACERESERVATION.MAXBOOKINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field17() {
        return Marketplacereservation.MARKETPLACERESERVATION.DAILYBASERATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field18() {
        return Marketplacereservation.MARKETPLACERESERVATION.CREATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return Marketplacereservation.MARKETPLACERESERVATION.FK_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field20() {
        return Marketplacereservation.MARKETPLACERESERVATION.ACTIVE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getMarketPlaceId();
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
    public Integer component4() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component5() {
        return getActiveFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getActiveTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component7() {
        return getPickupfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getPickupto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getSuppliergroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getMappedsipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getRentaldaysrangestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getRentaldaysrangeend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component13() {
        return getExclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getMarketRateEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getSms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component16() {
        return getMaxbookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component17() {
        return getDailybaserate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component18() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component20() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getMarketPlaceId();
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
    public Integer value4() {
        return getCarAgentLocationId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value5() {
        return getActiveFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getActiveTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value7() {
        return getPickupfrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getPickupto();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getSuppliergroup();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getMappedsipp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getRentaldaysrangestart();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getRentaldaysrangeend();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value13() {
        return getExclusive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getMarketRateEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSms();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value16() {
        return getMaxbookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value17() {
        return getDailybaserate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value18() {
        return getCreatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getFkReservation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value20() {
        return getActive();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value2(Integer value) {
        setMarketPlaceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value3(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value4(Integer value) {
        setCarAgentLocationId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value5(Timestamp value) {
        setActiveFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value6(Timestamp value) {
        setActiveTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value7(Timestamp value) {
        setPickupfrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value8(Timestamp value) {
        setPickupto(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value9(String value) {
        setSuppliergroup(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value10(String value) {
        setMappedsipp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value11(Integer value) {
        setRentaldaysrangestart(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value12(Integer value) {
        setRentaldaysrangeend(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value13(Boolean value) {
        setExclusive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value14(String value) {
        setMarketRateEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value15(String value) {
        setSms(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value16(Integer value) {
        setMaxbookings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value17(BigDecimal value) {
        setDailybaserate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value18(Timestamp value) {
        setCreatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value19(Integer value) {
        setFkReservation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord value20(Boolean value) {
        setActive(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MarketplacereservationRecord values(Integer value1, Integer value2, Integer value3, Integer value4, Timestamp value5, Timestamp value6, Timestamp value7, Timestamp value8, String value9, String value10, Integer value11, Integer value12, Boolean value13, String value14, String value15, Integer value16, BigDecimal value17, Timestamp value18, Integer value19, Boolean value20) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MarketplacereservationRecord
     */
    public MarketplacereservationRecord() {
        super(Marketplacereservation.MARKETPLACERESERVATION);
    }

    /**
     * Create a detached, initialised MarketplacereservationRecord
     */
    public MarketplacereservationRecord(Integer id, Integer marketPlaceId, Integer carAgentId, Integer carAgentLocationId, Timestamp activeFrom, Timestamp activeTo, Timestamp pickupfrom, Timestamp pickupto, String suppliergroup, String mappedsipp, Integer rentaldaysrangestart, Integer rentaldaysrangeend, Boolean exclusive, String marketRateEmail, String sms, Integer maxbookings, BigDecimal dailybaserate, Timestamp createdate, Integer fkReservation, Boolean active) {
        super(Marketplacereservation.MARKETPLACERESERVATION);

        set(0, id);
        set(1, marketPlaceId);
        set(2, carAgentId);
        set(3, carAgentLocationId);
        set(4, activeFrom);
        set(5, activeTo);
        set(6, pickupfrom);
        set(7, pickupto);
        set(8, suppliergroup);
        set(9, mappedsipp);
        set(10, rentaldaysrangestart);
        set(11, rentaldaysrangeend);
        set(12, exclusive);
        set(13, marketRateEmail);
        set(14, sms);
        set(15, maxbookings);
        set(16, dailybaserate);
        set(17, createdate);
        set(18, fkReservation);
        set(19, active);
    }
}