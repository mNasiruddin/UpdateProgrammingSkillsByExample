/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.I4chfails3;

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
public class I4chfails3Record extends UpdatableRecordImpl<I4chfails3Record> implements Record6<UUID, String, String, String, Integer, Integer> {

    private static final long serialVersionUID = 127876625;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails3.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails3.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails3.i4chref</code>.
     */
    public void setI4chref(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails3.i4chref</code>.
     */
    public String getI4chref() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails3.ctref</code>.
     */
    public void setCtref(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails3.ctref</code>.
     */
    public String getCtref() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails3.clientname</code>.
     */
    public void setClientname(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails3.clientname</code>.
     */
    public String getClientname() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails3.days</code>.
     */
    public void setDays(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails3.days</code>.
     */
    public Integer getDays() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.i4chfails3.isvoid</code>.
     */
    public void setIsvoid(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.i4chfails3.isvoid</code>.
     */
    public Integer getIsvoid() {
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
    public Row6<UUID, String, String, String, Integer, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<UUID, String, String, String, Integer, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return I4chfails3.I4CHFAILS3.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return I4chfails3.I4CHFAILS3.I4CHREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return I4chfails3.I4CHFAILS3.CTREF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return I4chfails3.I4CHFAILS3.CLIENTNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return I4chfails3.I4CHFAILS3.DAYS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return I4chfails3.I4CHFAILS3.ISVOID;
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
    public String component2() {
        return getI4chref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getCtref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getClientname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getIsvoid();
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
    public String value2() {
        return getI4chref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getCtref();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getClientname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getDays();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getIsvoid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record value2(String value) {
        setI4chref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record value3(String value) {
        setCtref(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record value4(String value) {
        setClientname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record value5(Integer value) {
        setDays(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record value6(Integer value) {
        setIsvoid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3Record values(UUID value1, String value2, String value3, String value4, Integer value5, Integer value6) {
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
     * Create a detached I4chfails3Record
     */
    public I4chfails3Record() {
        super(I4chfails3.I4CHFAILS3);
    }

    /**
     * Create a detached, initialised I4chfails3Record
     */
    public I4chfails3Record(UUID guid, String i4chref, String ctref, String clientname, Integer days, Integer isvoid) {
        super(I4chfails3.I4CHFAILS3);

        set(0, guid);
        set(1, i4chref);
        set(2, ctref);
        set(3, clientname);
        set(4, days);
        set(5, isvoid);
    }
}
