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
import jooq.cartrawler_dev_internal.dbo.tables.records.CountryLocationsRecord;

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
public class CountryLocations extends TableImpl<CountryLocationsRecord> {

    private static final long serialVersionUID = -1254323767;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Country_Locations</code>
     */
    public static final CountryLocations COUNTRY_LOCATIONS = new CountryLocations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CountryLocationsRecord> getRecordType() {
        return CountryLocationsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Country_Locations.ID</code>.
     */
    public final TableField<CountryLocationsRecord, Integer> ID = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Country_Locations.Country_ID</code>.
     */
    public final TableField<CountryLocationsRecord, String> COUNTRY_ID = createField("Country_ID", org.jooq.impl.SQLDataType.CHAR(10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Country_Locations.Country_Text</code>.
     */
    public final TableField<CountryLocationsRecord, String> COUNTRY_TEXT = createField("Country_Text", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Country_Locations</code> table reference
     */
    public CountryLocations() {
        this(DSL.name("Country_Locations"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Country_Locations</code> table reference
     */
    public CountryLocations(String alias) {
        this(DSL.name(alias), COUNTRY_LOCATIONS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Country_Locations</code> table reference
     */
    public CountryLocations(Name alias) {
        this(alias, COUNTRY_LOCATIONS);
    }

    private CountryLocations(Name alias, Table<CountryLocationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private CountryLocations(Name alias, Table<CountryLocationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CountryLocations(Table<O> child, ForeignKey<O, CountryLocationsRecord> key) {
        super(child, key, COUNTRY_LOCATIONS);
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
        return Arrays.<Index>asList(Indexes.COUNTRY_LOCATIONS_PK_COUNTRY_LOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CountryLocationsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COUNTRY_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CountryLocationsRecord> getPrimaryKey() {
        return Keys.PK_COUNTRY_LOCATIONS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CountryLocationsRecord>> getKeys() {
        return Arrays.<UniqueKey<CountryLocationsRecord>>asList(Keys.PK_COUNTRY_LOCATIONS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryLocations as(String alias) {
        return new CountryLocations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CountryLocations as(Name alias) {
        return new CountryLocations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryLocations rename(String name) {
        return new CountryLocations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CountryLocations rename(Name name) {
        return new CountryLocations(name, null);
    }
}