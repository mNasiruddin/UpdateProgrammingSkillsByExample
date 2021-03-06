/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Otalanguagevalue;

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
public class OtalanguagevalueRecord extends UpdatableRecordImpl<OtalanguagevalueRecord> implements Record4<Integer, Integer, Integer, byte[]> {

    private static final long serialVersionUID = -2133808737;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.name_id</code>.
     */
    public void setNameId(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.name_id</code>.
     */
    public Integer getNameId() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.lang_id</code>.
     */
    public void setLangId(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.lang_id</code>.
     */
    public Integer getLangId() {
        return (Integer) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.value</code>.
     */
    public void setValue(byte... value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.otaLanguageValue.value</code>.
     */
    public byte[] getValue() {
        return (byte[]) get(3);
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
    public Row4<Integer, Integer, Integer, byte[]> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row4<Integer, Integer, Integer, byte[]> valuesRow() {
        return (Row4) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Otalanguagevalue.OTALANGUAGEVALUE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Otalanguagevalue.OTALANGUAGEVALUE.NAME_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Otalanguagevalue.OTALANGUAGEVALUE.LANG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<byte[]> field4() {
        return Otalanguagevalue.OTALANGUAGEVALUE.VALUE;
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
        return getNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] component4() {
        return getValue();
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
        return getNameId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getLangId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public byte[] value4() {
        return getValue();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueRecord value1(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueRecord value2(Integer value) {
        setNameId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueRecord value3(Integer value) {
        setLangId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueRecord value4(byte... value) {
        setValue(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueRecord values(Integer value1, Integer value2, Integer value3, byte[] value4) {
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
     * Create a detached OtalanguagevalueRecord
     */
    public OtalanguagevalueRecord() {
        super(Otalanguagevalue.OTALANGUAGEVALUE);
    }

    /**
     * Create a detached, initialised OtalanguagevalueRecord
     */
    public OtalanguagevalueRecord(Integer id, Integer nameId, Integer langId, byte[] value) {
        super(Otalanguagevalue.OTALANGUAGEVALUE);

        set(0, id);
        set(1, nameId);
        set(2, langId);
        set(3, value);
    }
}
