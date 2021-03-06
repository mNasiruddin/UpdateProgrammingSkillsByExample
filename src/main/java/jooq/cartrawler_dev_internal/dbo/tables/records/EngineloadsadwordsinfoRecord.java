/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Engineloadsadwordsinfo;

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
public class EngineloadsadwordsinfoRecord extends UpdatableRecordImpl<EngineloadsadwordsinfoRecord> implements Record5<Integer, Long, Long, Long, Long> {

    private static final long serialVersionUID = 473516340;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.fk_engineLoads</code>.
     */
    public void setFkEngineloads(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.fk_engineLoads</code>.
     */
    public Integer getFkEngineloads() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.cID</code>.
     */
    public void setCid(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.cID</code>.
     */
    public Long getCid() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.kID</code>.
     */
    public void setKid(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.kID</code>.
     */
    public Long getKid() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.agID</code>.
     */
    public void setAgid(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.agID</code>.
     */
    public Long getAgid() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.aID</code>.
     */
    public void setAid(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.engineLoadsAdwordsInfo.aID</code>.
     */
    public Long getAid() {
        return (Long) get(4);
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
    public Row5<Integer, Long, Long, Long, Long> fieldsRow() {
        return (Row5) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row5<Integer, Long, Long, Long, Long> valuesRow() {
        return (Row5) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO.FK_ENGINELOADS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO.CID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO.KID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO.AGID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO.AID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getFkEngineloads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getKid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getAgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getAid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getFkEngineloads();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getCid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getKid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getAgid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getAid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadsadwordsinfoRecord value1(Integer value) {
        setFkEngineloads(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadsadwordsinfoRecord value2(Long value) {
        setCid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadsadwordsinfoRecord value3(Long value) {
        setKid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadsadwordsinfoRecord value4(Long value) {
        setAgid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadsadwordsinfoRecord value5(Long value) {
        setAid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public EngineloadsadwordsinfoRecord values(Integer value1, Long value2, Long value3, Long value4, Long value5) {
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
     * Create a detached EngineloadsadwordsinfoRecord
     */
    public EngineloadsadwordsinfoRecord() {
        super(Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO);
    }

    /**
     * Create a detached, initialised EngineloadsadwordsinfoRecord
     */
    public EngineloadsadwordsinfoRecord(Integer fkEngineloads, Long cid, Long kid, Long agid, Long aid) {
        super(Engineloadsadwordsinfo.ENGINELOADSADWORDSINFO);

        set(0, fkEngineloads);
        set(1, cid);
        set(2, kid);
        set(3, agid);
        set(4, aid);
    }
}
