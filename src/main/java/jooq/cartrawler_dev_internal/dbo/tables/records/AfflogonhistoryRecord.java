/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Afflogonhistory;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
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
public class AfflogonhistoryRecord extends UpdatableRecordImpl<AfflogonhistoryRecord> implements Record5<Integer, Integer, Timestamp, Timestamp, String> {

    private static final long serialVersionUID = -1299303849;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.idAffLogonHistory</code>.
     */
    public void setIdafflogonhistory(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.idAffLogonHistory</code>.
     */
    public Integer getIdafflogonhistory() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.Client_ID</code>.
     */
    public void setClientId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.Client_ID</code>.
     */
    public Integer getClientId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.LogonTime</code>.
     */
    public void setLogontime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.LogonTime</code>.
     */
    public Timestamp getLogontime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.LogoffTime</code>.
     */
    public void setLogofftime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.LogoffTime</code>.
     */
    public Timestamp getLogofftime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.ip</code>.
     */
    public void setIp(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.AffLogonHistory.ip</code>.
     */
    public String getIp() {
        return (String) get(4);
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
    // Record5 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Timestamp, Timestamp, String> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Integer, Timestamp, Timestamp, String> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Afflogonhistory.AFFLOGONHISTORY.IDAFFLOGONHISTORY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Afflogonhistory.AFFLOGONHISTORY.CLIENT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return Afflogonhistory.AFFLOGONHISTORY.LOGONTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return Afflogonhistory.AFFLOGONHISTORY.LOGOFFTIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Afflogonhistory.AFFLOGONHISTORY.IP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getIdafflogonhistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component3() {
        return getLogontime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component4() {
        return getLogofftime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getIdafflogonhistory();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getClientId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getLogontime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLogofftime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfflogonhistoryRecord value1(Integer value) {
        setIdafflogonhistory(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfflogonhistoryRecord value2(Integer value) {
        setClientId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfflogonhistoryRecord value3(Timestamp value) {
        setLogontime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfflogonhistoryRecord value4(Timestamp value) {
        setLogofftime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfflogonhistoryRecord value5(String value) {
        setIp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AfflogonhistoryRecord values(Integer value1, Integer value2, Timestamp value3, Timestamp value4, String value5) {
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
     * Create a detached AfflogonhistoryRecord
     */
    public AfflogonhistoryRecord() {
        super(Afflogonhistory.AFFLOGONHISTORY);
    }

    /**
     * Create a detached, initialised AfflogonhistoryRecord
     */
    public AfflogonhistoryRecord(Integer idafflogonhistory, Integer clientId, Timestamp logontime, Timestamp logofftime, String ip) {
        super(Afflogonhistory.AFFLOGONHISTORY);

        set(0, idafflogonhistory);
        set(1, clientId);
        set(2, logontime);
        set(3, logofftime);
        set(4, ip);
    }
}