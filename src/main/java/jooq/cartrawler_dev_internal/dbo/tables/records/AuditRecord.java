/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Audit;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
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
public class AuditRecord extends UpdatableRecordImpl<AuditRecord> implements Record9<UUID, String, String, String, String, String, String, Timestamp, Integer> {

    private static final long serialVersionUID = -1304688010;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.guid</code>.
     */
    public void setGuid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.guid</code>.
     */
    public UUID getGuid() {
        return (UUID) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.Type</code>.
     */
    public void setType(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.Type</code>.
     */
    public String getType() {
        return (String) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.TableName</code>.
     */
    public void setTablename(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.TableName</code>.
     */
    public String getTablename() {
        return (String) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.PK</code>.
     */
    public void setPk(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.PK</code>.
     */
    public String getPk() {
        return (String) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.FieldName</code>.
     */
    public void setFieldname(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.FieldName</code>.
     */
    public String getFieldname() {
        return (String) get(4);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.OldValue</code>.
     */
    public void setOldvalue(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.OldValue</code>.
     */
    public String getOldvalue() {
        return (String) get(5);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.NewValue</code>.
     */
    public void setNewvalue(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.NewValue</code>.
     */
    public String getNewvalue() {
        return (String) get(6);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.UpdateDate</code>.
     */
    public void setUpdatedate(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.UpdateDate</code>.
     */
    public Timestamp getUpdatedate() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.Audit.fk_user</code>.
     */
    public void setFkUser(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.Audit.fk_user</code>.
     */
    public Integer getFkUser() {
        return (Integer) get(8);
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
    // Record9 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UUID, String, String, String, String, String, String, Timestamp, Integer> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row9<UUID, String, String, String, String, String, String, Timestamp, Integer> valuesRow() {
        return (Row9) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<UUID> field1() {
        return Audit.AUDIT.GUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Audit.AUDIT.TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Audit.AUDIT.TABLENAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return Audit.AUDIT.PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Audit.AUDIT.FIELDNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return Audit.AUDIT.OLDVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Audit.AUDIT.NEWVALUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return Audit.AUDIT.UPDATEDATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return Audit.AUDIT.FK_USER;
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getFieldname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOldvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getNewvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getUpdatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getFkUser();
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
        return getType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTablename();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getPk();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getFieldname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOldvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getNewvalue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getUpdatedate();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getFkUser();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value1(UUID value) {
        setGuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value2(String value) {
        setType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value3(String value) {
        setTablename(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value4(String value) {
        setPk(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value5(String value) {
        setFieldname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value6(String value) {
        setOldvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value7(String value) {
        setNewvalue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value8(Timestamp value) {
        setUpdatedate(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord value9(Integer value) {
        setFkUser(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuditRecord values(UUID value1, String value2, String value3, String value4, String value5, String value6, String value7, Timestamp value8, Integer value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuditRecord
     */
    public AuditRecord() {
        super(Audit.AUDIT);
    }

    /**
     * Create a detached, initialised AuditRecord
     */
    public AuditRecord(UUID guid, String type, String tablename, String pk, String fieldname, String oldvalue, String newvalue, Timestamp updatedate, Integer fkUser) {
        super(Audit.AUDIT);

        set(0, guid);
        set(1, type);
        set(2, tablename);
        set(3, pk);
        set(4, fieldname);
        set(5, oldvalue);
        set(6, newvalue);
        set(7, updatedate);
        set(8, fkUser);
    }
}