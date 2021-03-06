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
import jooq.cartrawler_dev_internal.dbo.tables.records.WarningsRecord;

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
public class Warnings extends TableImpl<WarningsRecord> {

    private static final long serialVersionUID = -799681625;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.warnings</code>
     */
    public static final Warnings WARNINGS = new Warnings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<WarningsRecord> getRecordType() {
        return WarningsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.id</code>.
     */
    public final TableField<WarningsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.fk_reservation</code>.
     */
    public final TableField<WarningsRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.type</code>.
     */
    public final TableField<WarningsRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.code</code>.
     */
    public final TableField<WarningsRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.message</code>.
     */
    public final TableField<WarningsRecord, String> MESSAGE = createField("message", org.jooq.impl.SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.timestamp</code>.
     */
    public final TableField<WarningsRecord, Timestamp> TIMESTAMP = createField("timestamp", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(org.jooq.impl.DSL.field("(getdate())", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.action</code>.
     */
    public final TableField<WarningsRecord, String> ACTION = createField("action", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.client_id</code>.
     */
    public final TableField<WarningsRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.ipaddress</code>.
     */
    public final TableField<WarningsRecord, Integer> IPADDRESS = createField("ipaddress", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.fk_clientTouchpoint</code>.
     */
    public final TableField<WarningsRecord, Short> FK_CLIENTTOUCHPOINT = createField("fk_clientTouchpoint", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.warnings.system_id</code>.
     */
    public final TableField<WarningsRecord, String> SYSTEM_ID = createField("system_id", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.warnings</code> table reference
     */
    public Warnings() {
        this(DSL.name("warnings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.warnings</code> table reference
     */
    public Warnings(String alias) {
        this(DSL.name(alias), WARNINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.warnings</code> table reference
     */
    public Warnings(Name alias) {
        this(alias, WARNINGS);
    }

    private Warnings(Name alias, Table<WarningsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Warnings(Name alias, Table<WarningsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Warnings(Table<O> child, ForeignKey<O, WarningsRecord> key) {
        super(child, key, WARNINGS);
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
        return Arrays.<Index>asList(Indexes.WARNINGS_PK_WARNINGS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<WarningsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_WARNINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<WarningsRecord> getPrimaryKey() {
        return Keys.PK_WARNINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<WarningsRecord>> getKeys() {
        return Arrays.<UniqueKey<WarningsRecord>>asList(Keys.PK_WARNINGS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Warnings as(String alias) {
        return new Warnings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Warnings as(Name alias) {
        return new Warnings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Warnings rename(String name) {
        return new Warnings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Warnings rename(Name name) {
        return new Warnings(name, null);
    }
}
