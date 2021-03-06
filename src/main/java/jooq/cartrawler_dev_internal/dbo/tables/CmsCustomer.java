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
import jooq.cartrawler_dev_internal.dbo.tables.records.CmsCustomerRecord;

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
public class CmsCustomer extends TableImpl<CmsCustomerRecord> {

    private static final long serialVersionUID = 1599858903;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.cms_customer</code>
     */
    public static final CmsCustomer CMS_CUSTOMER = new CmsCustomer();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmsCustomerRecord> getRecordType() {
        return CmsCustomerRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_customer.id</code>.
     */
    public final TableField<CmsCustomerRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.cms_customer.updated_date</code>.
     */
    public final TableField<CmsCustomerRecord, Timestamp> UPDATED_DATE = createField("updated_date", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.cms_customer</code> table reference
     */
    public CmsCustomer() {
        this(DSL.name("cms_customer"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.cms_customer</code> table reference
     */
    public CmsCustomer(String alias) {
        this(DSL.name(alias), CMS_CUSTOMER);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.cms_customer</code> table reference
     */
    public CmsCustomer(Name alias) {
        this(alias, CMS_CUSTOMER);
    }

    private CmsCustomer(Name alias, Table<CmsCustomerRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmsCustomer(Name alias, Table<CmsCustomerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CmsCustomer(Table<O> child, ForeignKey<O, CmsCustomerRecord> key) {
        super(child, key, CMS_CUSTOMER);
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
        return Arrays.<Index>asList(Indexes.CMS_CUSTOMER_PK__CMS_CUST__3213E83F0D9D2B73);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CmsCustomerRecord, Integer> getIdentity() {
        return Keys.IDENTITY_CMS_CUSTOMER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmsCustomerRecord> getPrimaryKey() {
        return Keys.PK__CMS_CUST__3213E83F0D9D2B73;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmsCustomerRecord>> getKeys() {
        return Arrays.<UniqueKey<CmsCustomerRecord>>asList(Keys.PK__CMS_CUST__3213E83F0D9D2B73);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomer as(String alias) {
        return new CmsCustomer(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsCustomer as(Name alias) {
        return new CmsCustomer(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsCustomer rename(String name) {
        return new CmsCustomer(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsCustomer rename(Name name) {
        return new CmsCustomer(name, null);
    }
}
