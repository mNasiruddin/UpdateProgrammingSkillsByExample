/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Btlineaddresses;

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
public class BtlineaddressesRecord extends UpdatableRecordImpl<BtlineaddressesRecord> implements Record4<Integer, String, Timestamp, String> {

    private static final long serialVersionUID = 1080417987;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.ip</code>.
     */
    public void setIp(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.ip</code>.
     */
    public String getIp() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.connectDate</code>.
     */
    public void setConnectdate(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.connectDate</code>.
     */
    public Timestamp getConnectdate() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.line</code>.
     */
    public void setLine(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.btlineAddresses.line</code>.
     */
    public String getLine() {
        return (String) get(3);
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
    // Record4 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, String, Timestamp, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Btlineaddresses.BTLINEADDRESSES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Btlineaddresses.BTLINEADDRESSES.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Btlineaddresses.BTLINEADDRESSES.CONNECTDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Btlineaddresses.BTLINEADDRESSES.LINE;
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
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getConnectdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getLine();
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
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getConnectdate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getLine();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BtlineaddressesRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BtlineaddressesRecord value2(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BtlineaddressesRecord value3(Timestamp value) {
        setConnectdate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BtlineaddressesRecord value4(String value) {
        setLine(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BtlineaddressesRecord values(Integer value1, String value2, Timestamp value3, String value4) {
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
     * Create a detached BtlineaddressesRecord
     */
    public BtlineaddressesRecord() {
        super(Btlineaddresses.BTLINEADDRESSES);
    }

    /**
     * Create a detached, initialised BtlineaddressesRecord
     */
    public BtlineaddressesRecord(Integer id, String ip, Timestamp connectdate, String line) {
        super(Btlineaddresses.BTLINEADDRESSES);

        set(0, id);
        set(1, ip);
        set(2, connectdate);
        set(3, line);
    }
}
