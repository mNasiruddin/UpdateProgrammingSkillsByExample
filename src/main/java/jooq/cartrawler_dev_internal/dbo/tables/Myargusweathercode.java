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
import jooq.cartrawler_dev_internal.dbo.tables.records.MyargusweathercodeRecord;

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
public class Myargusweathercode extends TableImpl<MyargusweathercodeRecord> {

    private static final long serialVersionUID = -598093401;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode</code>
     */
    public static final Myargusweathercode MYARGUSWEATHERCODE = new Myargusweathercode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MyargusweathercodeRecord> getRecordType() {
        return MyargusweathercodeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode.weather_code_Id</code>.
     */
    public final TableField<MyargusweathercodeRecord, Integer> WEATHER_CODE_ID = createField("weather_code_Id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode.location_id</code>.
     */
    public final TableField<MyargusweathercodeRecord, Integer> LOCATION_ID = createField("location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode.weatherbug_city_code</code>.
     */
    public final TableField<MyargusweathercodeRecord, Integer> WEATHERBUG_CITY_CODE = createField("weatherbug_city_code", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode</code> table reference
     */
    public Myargusweathercode() {
        this(DSL.name("MyArgusWeatherCode"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode</code> table reference
     */
    public Myargusweathercode(String alias) {
        this(DSL.name(alias), MYARGUSWEATHERCODE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MyArgusWeatherCode</code> table reference
     */
    public Myargusweathercode(Name alias) {
        this(alias, MYARGUSWEATHERCODE);
    }

    private Myargusweathercode(Name alias, Table<MyargusweathercodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Myargusweathercode(Name alias, Table<MyargusweathercodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Myargusweathercode(Table<O> child, ForeignKey<O, MyargusweathercodeRecord> key) {
        super(child, key, MYARGUSWEATHERCODE);
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
        return Arrays.<Index>asList(Indexes.MYARGUSWEATHERCODE_PK__MYARGUSW__F48D58E47D439ABD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MyargusweathercodeRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MYARGUSWEATHERCODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MyargusweathercodeRecord> getPrimaryKey() {
        return Keys.PK__MYARGUSW__F48D58E47D439ABD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MyargusweathercodeRecord>> getKeys() {
        return Arrays.<UniqueKey<MyargusweathercodeRecord>>asList(Keys.PK__MYARGUSW__F48D58E47D439ABD);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Myargusweathercode as(String alias) {
        return new Myargusweathercode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Myargusweathercode as(Name alias) {
        return new Myargusweathercode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Myargusweathercode rename(String name) {
        return new Myargusweathercode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Myargusweathercode rename(Name name) {
        return new Myargusweathercode(name, null);
    }
}
