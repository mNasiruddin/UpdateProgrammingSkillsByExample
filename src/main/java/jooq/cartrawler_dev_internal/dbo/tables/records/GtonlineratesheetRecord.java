/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Gtonlineratesheet;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
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
public class GtonlineratesheetRecord extends UpdatableRecordImpl<GtonlineratesheetRecord> implements Record12<Integer, Integer, String, String, String, String, Long, Long, Long, Long, String, Integer> {

    private static final long serialVersionUID = -305074050;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.rate_id</code>.
     */
    public void setRateId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.rate_id</code>.
     */
    public Integer getRateId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.car_agent_id</code>.
     */
    public void setCarAgentId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.car_agent_id</code>.
     */
    public Integer getCarAgentId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.fleet_code</code>.
     */
    public void setFleetCode(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.fleet_code</code>.
     */
    public String getFleetCode() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.rate_code_str</code>.
     */
    public void setRateCodeStr(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.rate_code_str</code>.
     */
    public String getRateCodeStr() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.pickup_locations</code>.
     */
    public void setPickupLocations(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.pickup_locations</code>.
     */
    public String getPickupLocations() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.return_locations</code>.
     */
    public void setReturnLocations(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.return_locations</code>.
     */
    public String getReturnLocations() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.booking_from</code>.
     */
    public void setBookingFrom(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.booking_from</code>.
     */
    public Long getBookingFrom() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.booking_to</code>.
     */
    public void setBookingTo(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.booking_to</code>.
     */
    public Long getBookingTo() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.travel_from</code>.
     */
    public void setTravelFrom(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.travel_from</code>.
     */
    public Long getTravelFrom() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.travel_to</code>.
     */
    public void setTravelTo(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.travel_to</code>.
     */
    public Long getTravelTo() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.route_id</code>.
     */
    public void setRouteId(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.route_id</code>.
     */
    public String getRouteId() {
        return (String) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.transfer_minutes</code>.
     */
    public void setTransferMinutes(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheet.transfer_minutes</code>.
     */
    public Integer getTransferMinutes() {
        return (Integer) get(11);
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
    // Record12 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, Long, Long, Long, Long, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, Integer, String, String, String, String, Long, Long, Long, Long, String, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Gtonlineratesheet.GTONLINERATESHEET.RATE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Gtonlineratesheet.GTONLINERATESHEET.CAR_AGENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Gtonlineratesheet.GTONLINERATESHEET.FLEET_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Gtonlineratesheet.GTONLINERATESHEET.RATE_CODE_STR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Gtonlineratesheet.GTONLINERATESHEET.PICKUP_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Gtonlineratesheet.GTONLINERATESHEET.RETURN_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return Gtonlineratesheet.GTONLINERATESHEET.BOOKING_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field8() {
        return Gtonlineratesheet.GTONLINERATESHEET.BOOKING_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return Gtonlineratesheet.GTONLINERATESHEET.TRAVEL_FROM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field10() {
        return Gtonlineratesheet.GTONLINERATESHEET.TRAVEL_TO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return Gtonlineratesheet.GTONLINERATESHEET.ROUTE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Gtonlineratesheet.GTONLINERATESHEET.TRANSFER_MINUTES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getRateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getFleetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getRateCodeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPickupLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getReturnLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getBookingFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component8() {
        return getBookingTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getTravelFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component10() {
        return getTravelTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getRouteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getTransferMinutes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getRateId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getCarAgentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getFleetCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getRateCodeStr();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPickupLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getReturnLocations();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getBookingFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value8() {
        return getBookingTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getTravelFrom();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value10() {
        return getTravelTo();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getRouteId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getTransferMinutes();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value1(Integer value) {
        setRateId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value2(Integer value) {
        setCarAgentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value3(String value) {
        setFleetCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value4(String value) {
        setRateCodeStr(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value5(String value) {
        setPickupLocations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value6(String value) {
        setReturnLocations(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value7(Long value) {
        setBookingFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value8(Long value) {
        setBookingTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value9(Long value) {
        setTravelFrom(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value10(Long value) {
        setTravelTo(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value11(String value) {
        setRouteId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord value12(Integer value) {
        setTransferMinutes(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtonlineratesheetRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6, Long value7, Long value8, Long value9, Long value10, String value11, Integer value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached GtonlineratesheetRecord
     */
    public GtonlineratesheetRecord() {
        super(Gtonlineratesheet.GTONLINERATESHEET);
    }

    /**
     * Create a detached, initialised GtonlineratesheetRecord
     */
    public GtonlineratesheetRecord(Integer rateId, Integer carAgentId, String fleetCode, String rateCodeStr, String pickupLocations, String returnLocations, Long bookingFrom, Long bookingTo, Long travelFrom, Long travelTo, String routeId, Integer transferMinutes) {
        super(Gtonlineratesheet.GTONLINERATESHEET);

        set(0, rateId);
        set(1, carAgentId);
        set(2, fleetCode);
        set(3, rateCodeStr);
        set(4, pickupLocations);
        set(5, returnLocations);
        set(6, bookingFrom);
        set(7, bookingTo);
        set(8, travelFrom);
        set(9, travelTo);
        set(10, routeId);
        set(11, transferMinutes);
    }
}
