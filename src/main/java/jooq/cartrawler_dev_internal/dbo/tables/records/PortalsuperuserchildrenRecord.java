/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables.records;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.tables.Portalsuperuserchildren;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
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
public class PortalsuperuserchildrenRecord extends UpdatableRecordImpl<PortalsuperuserchildrenRecord> implements Record3<Long, Integer, Integer> {

    private static final long serialVersionUID = 799222599;

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalSuperUserChildren.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalSuperUserChildren.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalSuperUserChildren.supplierPortalUserId</code>.
     */
    public void setSupplierportaluserid(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalSuperUserChildren.supplierPortalUserId</code>.
     */
    public Integer getSupplierportaluserid() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>Cartrawler_dev_internal.dbo.PortalSuperUserChildren.carAgentId</code>.
     */
    public void setCaragentid(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>Cartrawler_dev_internal.dbo.PortalSuperUserChildren.carAgentId</code>.
     */
    public Integer getCaragentid() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Integer, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row3<Long, Integer, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return Portalsuperuserchildren.PORTALSUPERUSERCHILDREN.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Portalsuperuserchildren.PORTALSUPERUSERCHILDREN.SUPPLIERPORTALUSERID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field3() {
        return Portalsuperuserchildren.PORTALSUPERUSERCHILDREN.CARAGENTID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getSupplierportaluserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component3() {
        return getCaragentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getSupplierportaluserid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value3() {
        return getCaragentid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalsuperuserchildrenRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalsuperuserchildrenRecord value2(Integer value) {
        setSupplierportaluserid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalsuperuserchildrenRecord value3(Integer value) {
        setCaragentid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PortalsuperuserchildrenRecord values(Long value1, Integer value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PortalsuperuserchildrenRecord
     */
    public PortalsuperuserchildrenRecord() {
        super(Portalsuperuserchildren.PORTALSUPERUSERCHILDREN);
    }

    /**
     * Create a detached, initialised PortalsuperuserchildrenRecord
     */
    public PortalsuperuserchildrenRecord(Long id, Integer supplierportaluserid, Integer caragentid) {
        super(Portalsuperuserchildren.PORTALSUPERUSERCHILDREN);

        set(0, id);
        set(1, supplierportaluserid);
        set(2, caragentid);
    }
}
