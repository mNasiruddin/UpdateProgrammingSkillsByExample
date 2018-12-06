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
import jooq.cartrawler_dev_internal.dbo.tables.records.LocationmappingsRecord;

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
public class Locationmappings extends TableImpl<LocationmappingsRecord> {

    private static final long serialVersionUID = 1634265213;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.LocationMappings</code>
     */
    public static final Locationmappings LOCATIONMAPPINGS = new Locationmappings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LocationmappingsRecord> getRecordType() {
        return LocationmappingsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LocationMappings.source</code>.
     */
    public final TableField<LocationmappingsRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LocationMappings.location_id</code>.
     */
    public final TableField<LocationmappingsRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LocationMappings.source_name</code>.
     */
    public final TableField<LocationmappingsRecord, String> SOURCE_NAME = createField("source_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LocationMappings.source_country</code>.
     */
    public final TableField<LocationmappingsRecord, String> SOURCE_COUNTRY = createField("source_country", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.LocationMappings.source_city</code>.
     */
    public final TableField<LocationmappingsRecord, String> SOURCE_CITY = createField("source_city", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.LocationMappings</code> table reference
     */
    public Locationmappings() {
        this(DSL.name("LocationMappings"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.LocationMappings</code> table reference
     */
    public Locationmappings(String alias) {
        this(DSL.name(alias), LOCATIONMAPPINGS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.LocationMappings</code> table reference
     */
    public Locationmappings(Name alias) {
        this(alias, LOCATIONMAPPINGS);
    }

    private Locationmappings(Name alias, Table<LocationmappingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Locationmappings(Name alias, Table<LocationmappingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Locationmappings(Table<O> child, ForeignKey<O, LocationmappingsRecord> key) {
        super(child, key, LOCATIONMAPPINGS);
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
        return Arrays.<Index>asList(Indexes.LOCATIONMAPPINGS_PK_LOCATIONMAPPINGS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LocationmappingsRecord> getPrimaryKey() {
        return Keys.PK_LOCATIONMAPPINGS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LocationmappingsRecord>> getKeys() {
        return Arrays.<UniqueKey<LocationmappingsRecord>>asList(Keys.PK_LOCATIONMAPPINGS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locationmappings as(String alias) {
        return new Locationmappings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Locationmappings as(Name alias) {
        return new Locationmappings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Locationmappings rename(String name) {
        return new Locationmappings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Locationmappings rename(Name name) {
        return new Locationmappings(name, null);
    }
}