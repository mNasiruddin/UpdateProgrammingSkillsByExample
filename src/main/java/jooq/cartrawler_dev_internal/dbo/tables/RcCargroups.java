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
import jooq.cartrawler_dev_internal.dbo.tables.records.RcCargroupsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class RcCargroups extends TableImpl<RcCargroupsRecord> {

    private static final long serialVersionUID = 1295687365;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.RC_CarGroups</code>
     */
    public static final RcCargroups RC_CARGROUPS = new RcCargroups();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RcCargroupsRecord> getRecordType() {
        return RcCargroupsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_CarGroups.C_ID</code>.
     */
    public final TableField<RcCargroupsRecord, Integer> C_ID = createField("C_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_CarGroups.Details</code>.
     */
    public final TableField<RcCargroupsRecord, String> DETAILS = createField("Details", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_CarGroups.Title</code>.
     */
    public final TableField<RcCargroupsRecord, String> TITLE = createField("Title", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.RC_CarGroups.sortorder</code>.
     */
    public final TableField<RcCargroupsRecord, String> SORTORDER = createField("sortorder", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.RC_CarGroups</code> table reference
     */
    public RcCargroups() {
        this(DSL.name("RC_CarGroups"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.RC_CarGroups</code> table reference
     */
    public RcCargroups(String alias) {
        this(DSL.name(alias), RC_CARGROUPS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.RC_CarGroups</code> table reference
     */
    public RcCargroups(Name alias) {
        this(alias, RC_CARGROUPS);
    }

    private RcCargroups(Name alias, Table<RcCargroupsRecord> aliased) {
        this(alias, aliased, null);
    }

    private RcCargroups(Name alias, Table<RcCargroupsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RcCargroups(Table<O> child, ForeignKey<O, RcCargroupsRecord> key) {
        super(child, key, RC_CARGROUPS);
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
        return Arrays.<Index>asList(Indexes.RC_CARGROUPS_PK_RC_CARGROUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RcCargroupsRecord> getPrimaryKey() {
        return Keys.PK_RC_CARGROUPS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RcCargroupsRecord>> getKeys() {
        return Arrays.<UniqueKey<RcCargroupsRecord>>asList(Keys.PK_RC_CARGROUPS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcCargroups as(String alias) {
        return new RcCargroups(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RcCargroups as(Name alias) {
        return new RcCargroups(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RcCargroups rename(String name) {
        return new RcCargroups(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RcCargroups rename(Name name) {
        return new RcCargroups(name, null);
    }
}
