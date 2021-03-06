/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.OrganisationRecord;

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
public class Organisation extends TableImpl<OrganisationRecord> {

    private static final long serialVersionUID = -1383043564;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Organisation</code>
     */
    public static final Organisation ORGANISATION = new Organisation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganisationRecord> getRecordType() {
        return OrganisationRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.id</code>.
     */
    public final TableField<OrganisationRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.org_name</code>.
     */
    public final TableField<OrganisationRecord, String> ORG_NAME = createField("org_name", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.MX</code>.
     */
    public final TableField<OrganisationRecord, String> MX = createField("MX", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("(NULL)", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.WWW</code>.
     */
    public final TableField<OrganisationRecord, String> WWW = createField("WWW", org.jooq.impl.SQLDataType.VARCHAR(256).defaultValue(org.jooq.impl.DSL.field("(NULL)", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.phone</code>.
     */
    public final TableField<OrganisationRecord, String> PHONE = createField("phone", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("(NULL)", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.fax</code>.
     */
    public final TableField<OrganisationRecord, String> FAX = createField("fax", org.jooq.impl.SQLDataType.VARCHAR(128).defaultValue(org.jooq.impl.DSL.field("(NULL)", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.amendedBy</code>.
     */
    public final TableField<OrganisationRecord, Integer> AMENDEDBY = createField("amendedBy", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Organisation.oriignating_client</code>.
     */
    public final TableField<OrganisationRecord, Integer> ORIIGNATING_CLIENT = createField("oriignating_client", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Organisation</code> table reference
     */
    public Organisation() {
        this(DSL.name("Organisation"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Organisation</code> table reference
     */
    public Organisation(String alias) {
        this(DSL.name(alias), ORGANISATION);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Organisation</code> table reference
     */
    public Organisation(Name alias) {
        this(alias, ORGANISATION);
    }

    private Organisation(Name alias, Table<OrganisationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Organisation(Name alias, Table<OrganisationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Organisation(Table<O> child, ForeignKey<O, OrganisationRecord> key) {
        super(child, key, ORGANISATION);
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
        return Arrays.<Index>asList(Indexes.ORGANISATION_PK__ORGANISATION__61915EA7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<OrganisationRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ORGANISATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<OrganisationRecord> getPrimaryKey() {
        return Keys.PK__ORGANISATION__61915EA7;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<OrganisationRecord>> getKeys() {
        return Arrays.<UniqueKey<OrganisationRecord>>asList(Keys.PK__ORGANISATION__61915EA7);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Organisation as(String alias) {
        return new Organisation(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Organisation as(Name alias) {
        return new Organisation(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Organisation rename(String name) {
        return new Organisation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Organisation rename(Name name) {
        return new Organisation(name, null);
    }
}
