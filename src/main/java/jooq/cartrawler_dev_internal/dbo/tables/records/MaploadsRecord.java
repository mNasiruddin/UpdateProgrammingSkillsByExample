/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Maploads;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
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
public class MaploadsRecord extends UpdatableRecordImpl<MaploadsRecord> implements Record16<Integer, Long, BigDecimal, BigDecimal, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Long, Integer, UByte> {

    private static final long serialVersionUID = -417168995;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.customer_id</code>.
     */
    public void setCustomerId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.customer_id</code>.
     */
    public Long getCustomerId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.latitude</code>.
     */
    public void setLatitude(BigDecimal value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.latitude</code>.
     */
    public BigDecimal getLatitude() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.longitude</code>.
     */
    public void setLongitude(BigDecimal value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.longitude</code>.
     */
    public BigDecimal getLongitude() {
        return (BigDecimal) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.residency</code>.
     */
    public void setResidency(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.residency</code>.
     */
    public String getResidency() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.country_id</code>.
     */
    public void setCountryId(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.country_id</code>.
     */
    public String getCountryId() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.parent_id</code>.
     */
    public void setParentId(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.parent_id</code>.
     */
    public Integer getParentId() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.client_id</code>.
     */
    public void setClientId(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.client_id</code>.
     */
    public Integer getClientId() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.fk_mapLoadTitle</code>.
     */
    public void setFkMaploadtitle(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.fk_mapLoadTitle</code>.
     */
    public Integer getFkMaploadtitle() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.physicalip</code>.
     */
    public void setPhysicalip(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.physicalip</code>.
     */
    public Integer getPhysicalip() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.priced_markers</code>.
     */
    public void setPricedMarkers(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.priced_markers</code>.
     */
    public Integer getPricedMarkers() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.unpriced_markers</code>.
     */
    public void setUnpricedMarkers(Integer value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.unpriced_markers</code>.
     */
    public Integer getUnpricedMarkers() {
        return (Integer) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.querydate</code>.
     */
    public void setQuerydate(Timestamp value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.querydate</code>.
     */
    public Timestamp getQuerydate() {
        return (Timestamp) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.engineLoadID</code>.
     */
    public void setEngineloadid(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.engineLoadID</code>.
     */
    public Long getEngineloadid() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.consumerip</code>.
     */
    public void setConsumerip(Integer value) {
        set(14, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.consumerip</code>.
     */
    public Integer getConsumerip() {
        return (Integer) get(14);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.mapLoads.testToken</code>.
     */
    public void setTesttoken(UByte value) {
        set(15, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.mapLoads.testToken</code>.
     */
    public UByte getTesttoken() {
        return (UByte) get(15);
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
    // Record16 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Long, BigDecimal, BigDecimal, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Long, Integer, UByte> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row16<Integer, Long, BigDecimal, BigDecimal, String, String, Integer, Integer, Integer, Integer, Integer, Integer, Timestamp, Long, Integer, UByte> valuesRow() {
        return (Row16) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Maploads.MAPLOADS.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Maploads.MAPLOADS.CUSTOMER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field3() {
        return Maploads.MAPLOADS.LATITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<BigDecimal> field4() {
        return Maploads.MAPLOADS.LONGITUDE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Maploads.MAPLOADS.RESIDENCY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Maploads.MAPLOADS.COUNTRY_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Maploads.MAPLOADS.PARENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Maploads.MAPLOADS.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Maploads.MAPLOADS.FK_MAPLOADTITLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return Maploads.MAPLOADS.PHYSICALIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return Maploads.MAPLOADS.PRICED_MARKERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field12() {
        return Maploads.MAPLOADS.UNPRICED_MARKERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field13() {
        return Maploads.MAPLOADS.QUERYDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return Maploads.MAPLOADS.ENGINELOADID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field15() {
        return Maploads.MAPLOADS.CONSUMERIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field16() {
        return Maploads.MAPLOADS.TESTTOKEN;
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
    public Long component2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component3() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal component4() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getResidency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getFkMaploadtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getPhysicalip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getPricedMarkers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component12() {
        return getUnpricedMarkers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component13() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component14() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component15() {
        return getConsumerip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component16() {
        return getTesttoken();
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
    public Long value2() {
        return getCustomerId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value3() {
        return getLatitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BigDecimal value4() {
        return getLongitude();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getResidency();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getCountryId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getParentId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getFkMaploadtitle();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getPhysicalip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPricedMarkers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value12() {
        return getUnpricedMarkers();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value13() {
        return getQuerydate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getEngineloadid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value15() {
        return getConsumerip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value16() {
        return getTesttoken();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value2(Long value) {
        setCustomerId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value3(BigDecimal value) {
        setLatitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value4(BigDecimal value) {
        setLongitude(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value5(String value) {
        setResidency(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value6(String value) {
        setCountryId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value7(Integer value) {
        setParentId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value8(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value9(Integer value) {
        setFkMaploadtitle(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value10(Integer value) {
        setPhysicalip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value11(Integer value) {
        setPricedMarkers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value12(Integer value) {
        setUnpricedMarkers(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value13(Timestamp value) {
        setQuerydate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value14(Long value) {
        setEngineloadid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value15(Integer value) {
        setConsumerip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord value16(UByte value) {
        setTesttoken(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MaploadsRecord values(Integer value1, Long value2, BigDecimal value3, BigDecimal value4, String value5, String value6, Integer value7, Integer value8, Integer value9, Integer value10, Integer value11, Integer value12, Timestamp value13, Long value14, Integer value15, UByte value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached MaploadsRecord
     */
    public MaploadsRecord() {
        super(Maploads.MAPLOADS);
    }

    /**
     * Create a detached, initialised MaploadsRecord
     */
    public MaploadsRecord(Integer id, Long customerId, BigDecimal latitude, BigDecimal longitude, String residency, String countryId, Integer parentId, Integer clientId, Integer fkMaploadtitle, Integer physicalip, Integer pricedMarkers, Integer unpricedMarkers, Timestamp querydate, Long engineloadid, Integer consumerip, UByte testtoken) {
        super(Maploads.MAPLOADS);

        set(0, id);
        set(1, customerId);
        set(2, latitude);
        set(3, longitude);
        set(4, residency);
        set(5, countryId);
        set(6, parentId);
        set(7, clientId);
        set(8, fkMaploadtitle);
        set(9, physicalip);
        set(10, pricedMarkers);
        set(11, unpricedMarkers);
        set(12, querydate);
        set(13, engineloadid);
        set(14, consumerip);
        set(15, testtoken);
    }
}
