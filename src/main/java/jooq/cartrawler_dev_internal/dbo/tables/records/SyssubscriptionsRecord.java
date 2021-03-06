/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Syssubscriptions;

import org.jooq.Field;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.TableRecordImpl;
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
public class SyssubscriptionsRecord extends TableRecordImpl<SyssubscriptionsRecord> implements Record14<Integer, Short, String, UByte, UByte, String, Integer, byte[], byte[], UByte, Boolean, Boolean, UByte, String> {

    private static final long serialVersionUID = -1431567413;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.artid</code>.
     */
    public void setArtid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.artid</code>.
     */
    public Integer getArtid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.srvid</code>.
     */
    public void setSrvid(Short value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.srvid</code>.
     */
    public Short getSrvid() {
        return (Short) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.dest_db</code>.
     */
    public void setDestDb(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.dest_db</code>.
     */
    public String getDestDb() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.status</code>.
     */
    public void setStatus(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.status</code>.
     */
    public UByte getStatus() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.sync_type</code>.
     */
    public void setSyncType(UByte value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.sync_type</code>.
     */
    public UByte getSyncType() {
        return (UByte) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.login_name</code>.
     */
    public void setLoginName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.login_name</code>.
     */
    public String getLoginName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.subscription_type</code>.
     */
    public void setSubscriptionType(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.subscription_type</code>.
     */
    public Integer getSubscriptionType() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.distribution_jobid</code>.
     */
    public void setDistributionJobid(byte... value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.distribution_jobid</code>.
     */
    public byte[] getDistributionJobid() {
        return (byte[]) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.timestamp</code>.
     */
    public void setTimestamp(byte... value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.timestamp</code>.
     */
    public byte[] getTimestamp() {
        return (byte[]) get(8);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.update_mode</code>.
     */
    public void setUpdateMode(UByte value) {
        set(9, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.update_mode</code>.
     */
    public UByte getUpdateMode() {
        return (UByte) get(9);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.loopback_detection</code>.
     */
    public void setLoopbackDetection(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.loopback_detection</code>.
     */
    public Boolean getLoopbackDetection() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.queued_reinit</code>.
     */
    public void setQueuedReinit(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.queued_reinit</code>.
     */
    public Boolean getQueuedReinit() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.nosync_type</code>.
     */
    public void setNosyncType(UByte value) {
        set(12, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.nosync_type</code>.
     */
    public UByte getNosyncType() {
        return (UByte) get(12);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.srvname</code>.
     */
    public void setSrvname(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.syssubscriptions.srvname</code>.
     */
    public String getSrvname() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Short, String, UByte, UByte, String, Integer, byte[], byte[], UByte, Boolean, Boolean, UByte, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row14<Integer, Short, String, UByte, UByte, String, Integer, byte[], byte[], UByte, Boolean, Boolean, UByte, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.ARTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field2() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.SRVID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.DEST_DB;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field4() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field5() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.SYNC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.LOGIN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.SUBSCRIPTION_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field8() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.DISTRIBUTION_JOBID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field9() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.TIMESTAMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field10() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.UPDATE_MODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.LOOPBACK_DETECTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field12() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.QUEUED_REINIT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UByte> field13() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.NOSYNC_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field14() {
        return Syssubscriptions.SYSSUBSCRIPTIONS.SRVNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getArtid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component2() {
        return getSrvid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getDestDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component5() {
        return getSyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getLoginName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getSubscriptionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component8() {
        return getDistributionJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component9() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component10() {
        return getUpdateMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getLoopbackDetection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component12() {
        return getQueuedReinit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte component13() {
        return getNosyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component14() {
        return getSrvname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getArtid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value2() {
        return getSrvid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getDestDb();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value4() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value5() {
        return getSyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getLoginName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getSubscriptionType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value8() {
        return getDistributionJobid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value9() {
        return getTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value10() {
        return getUpdateMode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getLoopbackDetection();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value12() {
        return getQueuedReinit();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UByte value13() {
        return getNosyncType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value14() {
        return getSrvname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value1(Integer value) {
        setArtid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value2(Short value) {
        setSrvid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value3(String value) {
        setDestDb(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value4(UByte value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value5(UByte value) {
        setSyncType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value6(String value) {
        setLoginName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value7(Integer value) {
        setSubscriptionType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value8(byte... value) {
        setDistributionJobid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value9(byte... value) {
        setTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value10(UByte value) {
        setUpdateMode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value11(Boolean value) {
        setLoopbackDetection(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value12(Boolean value) {
        setQueuedReinit(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value13(UByte value) {
        setNosyncType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord value14(String value) {
        setSrvname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SyssubscriptionsRecord values(Integer value1, Short value2, String value3, UByte value4, UByte value5, String value6, Integer value7, byte[] value8, byte[] value9, UByte value10, Boolean value11, Boolean value12, UByte value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SyssubscriptionsRecord
     */
    public SyssubscriptionsRecord() {
        super(Syssubscriptions.SYSSUBSCRIPTIONS);
    }

    /**
     * Create a detached, initialised SyssubscriptionsRecord
     */
    public SyssubscriptionsRecord(Integer artid, Short srvid, String destDb, UByte status, UByte syncType, String loginName, Integer subscriptionType, byte[] distributionJobid, byte[] timestamp, UByte updateMode, Boolean loopbackDetection, Boolean queuedReinit, UByte nosyncType, String srvname) {
        super(Syssubscriptions.SYSSUBSCRIPTIONS);

        set(0, artid);
        set(1, srvid);
        set(2, destDb);
        set(3, status);
        set(4, syncType);
        set(5, loginName);
        set(6, subscriptionType);
        set(7, distributionJobid);
        set(8, timestamp);
        set(9, updateMode);
        set(10, loopbackDetection);
        set(11, queuedReinit);
        set(12, nosyncType);
        set(13, srvname);
    }
}
