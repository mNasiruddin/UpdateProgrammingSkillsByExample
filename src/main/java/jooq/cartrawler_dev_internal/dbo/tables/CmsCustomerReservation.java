/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CmsCustomerReservationRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class CmsCustomerReservation extends TableImpl<CmsCustomerReservationRecord> {

    private static final long serialVersionUID = 1320916906;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.cms_customer_reservation</code>
     */
    public static final CmsCustomerReservation CMS_CUSTOMER_RESERVATION = new CmsCustomerReservation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmsCustomerReservationRecord> getRecordType() {
        return CmsCustomerReservationRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.id</code>.
     */
    public final TableField<CmsCustomerReservationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.fk_cms_customer_index</code>.
     */
    public final TableField<CmsCustomerReservationRecord, Integer> FK_CMS_CUSTOMER_INDEX = createField("fk_cms_customer_index", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.fk_reservation</code>.
     */
    public final TableField<CmsCustomerReservationRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_customer_reservation.created_date</code>.
     */
    public final TableField<CmsCustomerReservationRecord, Timestamp> CREATED_DATE = createField("created_date", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.cms_customer_reservation</code> table reference
     */
    public CmsCustomerReservation() {
        this(DSL.name("cms_customer_reservation"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.cms_customer_reservation</code> table reference
     */
    public CmsCustomerReservation(String alias) {
        this(DSL.name(alias), CMS_CUSTOMER_RESERVATION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.cms_customer_reservation</code> table reference
     */
    public CmsCustomerReservation(Name alias) {
        this(alias, CMS_CUSTOMER_RESERVATION);
    }

    private CmsCustomerReservation(Name alias, Table<CmsCustomerReservationRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmsCustomerReservation(Name alias, Table<CmsCustomerReservationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CmsCustomerReservation(Table<O> child, ForeignKey<O, CmsCustomerReservationRecord> key) {
        super(child, key, CMS_CUSTOMER_RESERVATION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Dbo.DBO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CMS_CUSTOMER_RESERVATION_PK__CMS_CUST__3213E83F116DBC57);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CmsCustomerReservationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CMS_CUSTOMER_RESERVATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmsCustomerReservationRecord> getPrimaryKey() {
        return Keys.PK__CMS_CUST__3213E83F116DBC57;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmsCustomerReservationRecord>> getKeys() {
        return Arrays.<UniqueKey<CmsCustomerReservationRecord>>asList(Keys.PK__CMS_CUST__3213E83F116DBC57);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservation as(String alias) {
        return new CmsCustomerReservation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomerReservation as(Name alias) {
        return new CmsCustomerReservation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsCustomerReservation rename(String name) {
        return new CmsCustomerReservation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsCustomerReservation rename(Name name) {
        return new CmsCustomerReservation(name, null);
    }
}