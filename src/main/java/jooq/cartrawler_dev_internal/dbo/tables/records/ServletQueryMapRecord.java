/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.ServletQueryMap;

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
public class ServletQueryMapRecord extends UpdatableRecordImpl<ServletQueryMapRecord> implements Record6<Integer, Integer, String, String, String, String> {

    private static final long serialVersionUID = -549916091;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.fk_servlet_queries</code>.
     */
    public void setFkServletQueries(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.fk_servlet_queries</code>.
     */
    public Integer getFkServletQueries() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.provider</code>.
     */
    public void setProvider(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.provider</code>.
     */
    public String getProvider() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.poiType</code>.
     */
    public void setPoitype(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.poiType</code>.
     */
    public String getPoitype() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.poiRef</code>.
     */
    public void setPoiref(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.poiRef</code>.
     */
    public String getPoiref() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.size</code>.
     */
    public void setSize(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.servlet_query_map.size</code>.
     */
    public String getSize() {
        return (String) get(5);
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
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Integer, Integer, String, String, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return ServletQueryMap.SERVLET_QUERY_MAP.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return ServletQueryMap.SERVLET_QUERY_MAP.FK_SERVLET_QUERIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return ServletQueryMap.SERVLET_QUERY_MAP.PROVIDER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ServletQueryMap.SERVLET_QUERY_MAP.POITYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ServletQueryMap.SERVLET_QUERY_MAP.POIREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ServletQueryMap.SERVLET_QUERY_MAP.SIZE;
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
        return getFkServletQueries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPoitype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getPoiref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getSize();
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
        return getFkServletQueries();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getProvider();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPoitype();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getPoiref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getSize();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord value2(Integer value) {
        setFkServletQueries(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord value3(String value) {
        setProvider(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord value4(String value) {
        setPoitype(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord value5(String value) {
        setPoiref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord value6(String value) {
        setSize(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServletQueryMapRecord values(Integer value1, Integer value2, String value3, String value4, String value5, String value6) {
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
     * Create a detached ServletQueryMapRecord
     */
    public ServletQueryMapRecord() {
        super(ServletQueryMap.SERVLET_QUERY_MAP);
    }

    /**
     * Create a detached, initialised ServletQueryMapRecord
     */
    public ServletQueryMapRecord(Integer id, Integer fkServletQueries, String provider, String poitype, String poiref, String size) {
        super(ServletQueryMap.SERVLET_QUERY_MAP);

        set(0, id);
        set(1, fkServletQueries);
        set(2, provider);
        set(3, poitype);
        set(4, poiref);
        set(5, size);
    }
}