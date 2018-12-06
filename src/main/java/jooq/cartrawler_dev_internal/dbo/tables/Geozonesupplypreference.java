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
import jooq.cartrawler_dev_internal.dbo.tables.records.GeozonesupplypreferenceRecord;

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
public class Geozonesupplypreference extends TableImpl<GeozonesupplypreferenceRecord> {

    private static final long serialVersionUID = 1085400599;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference</code>
     */
    public static final Geozonesupplypreference GEOZONESUPPLYPREFERENCE = new Geozonesupplypreference();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GeozonesupplypreferenceRecord> getRecordType() {
        return GeozonesupplypreferenceRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference.id</code>.
     */
    public final TableField<GeozonesupplypreferenceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference.cal</code>.
     */
    public final TableField<GeozonesupplypreferenceRecord, Integer> CAL = createField("cal", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference.zone</code>.
     */
    public final TableField<GeozonesupplypreferenceRecord, Integer> ZONE = createField("zone", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference.clientId</code>.
     */
    public final TableField<GeozonesupplypreferenceRecord, Integer> CLIENTID = createField("clientId", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference.preference</code>.
     */
    public final TableField<GeozonesupplypreferenceRecord, Short> PREFERENCE = createField("preference", org.jooq.impl.SQLDataType.SMALLINT.defaultValue(org.jooq.impl.DSL.field("((0))", org.jooq.impl.SQLDataType.SMALLINT)), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference</code> table reference
     */
    public Geozonesupplypreference() {
        this(DSL.name("geoZoneSupplyPreference"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference</code> table reference
     */
    public Geozonesupplypreference(String alias) {
        this(DSL.name(alias), GEOZONESUPPLYPREFERENCE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.geoZoneSupplyPreference</code> table reference
     */
    public Geozonesupplypreference(Name alias) {
        this(alias, GEOZONESUPPLYPREFERENCE);
    }

    private Geozonesupplypreference(Name alias, Table<GeozonesupplypreferenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Geozonesupplypreference(Name alias, Table<GeozonesupplypreferenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Geozonesupplypreference(Table<O> child, ForeignKey<O, GeozonesupplypreferenceRecord> key) {
        super(child, key, GEOZONESUPPLYPREFERENCE);
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
        return Arrays.<Index>asList(Indexes.GEOZONESUPPLYPREFERENCE_PK__GEOZONES__3213E83F7F2FDBE2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GeozonesupplypreferenceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GEOZONESUPPLYPREFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GeozonesupplypreferenceRecord> getPrimaryKey() {
        return Keys.PK__GEOZONES__3213E83F7F2FDBE2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GeozonesupplypreferenceRecord>> getKeys() {
        return Arrays.<UniqueKey<GeozonesupplypreferenceRecord>>asList(Keys.PK__GEOZONES__3213E83F7F2FDBE2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geozonesupplypreference as(String alias) {
        return new Geozonesupplypreference(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Geozonesupplypreference as(Name alias) {
        return new Geozonesupplypreference(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Geozonesupplypreference rename(String name) {
        return new Geozonesupplypreference(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Geozonesupplypreference rename(Name name) {
        return new Geozonesupplypreference(name, null);
    }
}