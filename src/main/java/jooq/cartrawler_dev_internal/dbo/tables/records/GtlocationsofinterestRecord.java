/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Gtlocationsofinterest;

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
public class GtlocationsofinterestRecord extends UpdatableRecordImpl<GtlocationsofinterestRecord> implements Record12<Integer, String, String, String, Integer, String, String, Integer, byte[], String, Timestamp, Integer> {

    private static final long serialVersionUID = 673542514;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.latitude</code>.
     */
    public void setLatitude(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.latitude</code>.
     */
    public String getLatitude() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.longitude</code>.
     */
    public void setLongitude(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.longitude</code>.
     */
    public String getLongitude() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.gtLocationType_id</code>.
     */
    public void setGtlocationtypeId(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.gtLocationType_id</code>.
     */
    public Integer getGtlocationtypeId() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.iata_code</code>.
     */
    public void setIataCode(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.iata_code</code>.
     */
    public String getIataCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.locationID</code>.
     */
    public void setLocationid(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.locationID</code>.
     */
    public String getLocationid() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.address</code>.
     */
    public void setAddress(byte... value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.address</code>.
     */
    public byte[] getAddress() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.city</code>.
     */
    public void setCity(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.city</code>.
     */
    public String getCity() {
        return (String) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.Updated_date</code>.
     */
    public void setUpdatedDate(Timestamp value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.Updated_date</code>.
     */
    public Timestamp getUpdatedDate() {
        return (Timestamp) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.Bookings</code>.
     */
    public void setBookings(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.GTLocationsOfInterest.Bookings</code>.
     */
    public Integer getBookings() {
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
    public Row12<Integer, String, String, String, Integer, String, String, Integer, byte[], String, Timestamp, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row12<Integer, String, String, String, Integer, String, String, Integer, byte[], String, Timestamp, Integer> valuesRow() {
        return (Row12) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.GTLOCATIONTYPE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.IATA_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.LOCATIONID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.CITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field11() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.UPDATED_DATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Gtlocationsofinterest.GTLOCATIONSOFINTEREST.BOOKINGS;
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
    public String component2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getGtlocationtypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getIataCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getLocationid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component11() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getBookings();
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
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getGtlocationtypeId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getIataCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getLocationid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getCity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value11() {
        return getUpdatedDate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getBookings();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value3(String value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value4(String value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value5(Integer value) {
        setGtlocationtypeId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value6(String value) {
        setIataCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value7(String value) {
        setLocationid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value8(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value9(byte... value) {
        setAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value10(String value) {
        setCity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value11(Timestamp value) {
        setUpdatedDate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord value12(Integer value) {
        setBookings(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public GtlocationsofinterestRecord values(Integer value1, String value2, String value3, String value4, Integer value5, String value6, String value7, Integer value8, byte[] value9, String value10, Timestamp value11, Integer value12) {
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
     * Create a detached GtlocationsofinterestRecord
     */
    public GtlocationsofinterestRecord() {
        super(Gtlocationsofinterest.GTLOCATIONSOFINTEREST);
    }

    /**
     * Create a detached, initialised GtlocationsofinterestRecord
     */
    public GtlocationsofinterestRecord(Integer id, String name, String latitude, String longitude, Integer gtlocationtypeId, String iataCode, String locationid, Integer langId, byte[] address, String city, Timestamp updatedDate, Integer bookings) {
        super(Gtlocationsofinterest.GTLOCATIONSOFINTEREST);

        set(0, id);
        set(1, name);
        set(2, latitude);
        set(3, longitude);
        set(4, gtlocationtypeId);
        set(5, iataCode);
        set(6, locationid);
        set(7, langId);
        set(8, address);
        set(9, city);
        set(10, updatedDate);
        set(11, bookings);
    }
}