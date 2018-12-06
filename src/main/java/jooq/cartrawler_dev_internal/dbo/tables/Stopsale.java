/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.StopsaleRecord;

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
public class Stopsale extends TableImpl<StopsaleRecord> {

    private static final long serialVersionUID = -1761774259;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.stopsale</code>
     */
    public static final Stopsale STOPSALE = new Stopsale();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<StopsaleRecord> getRecordType() {
        return StopsaleRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.guid</code>.
     */
    public final TableField<StopsaleRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.stopsale_id</code>.
     */
    public final TableField<StopsaleRecord, Integer> STOPSALE_ID = createField("stopsale_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.car_agent_id</code>.
     */
    public final TableField<StopsaleRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.stop_sale_type</code>.
     */
    public final TableField<StopsaleRecord, Integer> STOP_SALE_TYPE = createField("stop_sale_type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.description</code>.
     */
    public final TableField<StopsaleRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.includes_pickup_and_return</code>.
     */
    public final TableField<StopsaleRecord, Boolean> INCLUDES_PICKUP_AND_RETURN = createField("includes_pickup_and_return", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.override_days</code>.
     */
    public final TableField<StopsaleRecord, Integer> OVERRIDE_DAYS = createField("override_days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.source</code>.
     */
    public final TableField<StopsaleRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.createDate</code>.
     */
    public final TableField<StopsaleRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.amendDate</code>.
     */
    public final TableField<StopsaleRecord, Timestamp> AMENDDATE = createField("amendDate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.date_range_mode</code>.
     */
    public final TableField<StopsaleRecord, Integer> DATE_RANGE_MODE = createField("date_range_mode", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.rv</code>.
     */
    public final TableField<StopsaleRecord, byte[]> RV = createField("rv", org.jooq.impl.SQLDataType.BINARY(8), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.max_override_days</code>.
     */
    public final TableField<StopsaleRecord, Integer> MAX_OVERRIDE_DAYS = createField("max_override_days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.no_oneways</code>.
     */
    public final TableField<StopsaleRecord, Boolean> NO_ONEWAYS = createField("no_oneways", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.stopsale.Disabled</code>.
     */
    public final TableField<StopsaleRecord, Boolean> DISABLED = createField("Disabled", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.stopsale</code> table reference
     */
    public Stopsale() {
        this(DSL.name("stopsale"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.stopsale</code> table reference
     */
    public Stopsale(String alias) {
        this(DSL.name(alias), STOPSALE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.stopsale</code> table reference
     */
    public Stopsale(Name alias) {
        this(alias, STOPSALE);
    }

    private Stopsale(Name alias, Table<StopsaleRecord> aliased) {
        this(alias, aliased, null);
    }

    private Stopsale(Name alias, Table<StopsaleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Stopsale(Table<O> child, ForeignKey<O, StopsaleRecord> key) {
        super(child, key, STOPSALE);
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
        return Arrays.<Index>asList(Indexes.STOPSALE_ISX_STOPSALE_SOURCE, Indexes.STOPSALE_IX_STOPSALE, Indexes.STOPSALE_IX_STOPSALE_CAR_AGENT_ID, Indexes.STOPSALE_PK_STOPSALE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<StopsaleRecord, Integer> getIdentity() {
        return Keys.IDENTITY_STOPSALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<StopsaleRecord>> getKeys() {
        return Arrays.<UniqueKey<StopsaleRecord>>asList(Keys.IX_STOPSALE, Keys.PK_STOPSALE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Stopsale as(String alias) {
        return new Stopsale(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Stopsale as(Name alias) {
        return new Stopsale(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Stopsale rename(String name) {
        return new Stopsale(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Stopsale rename(Name name) {
        return new Stopsale(name, null);
    }
}