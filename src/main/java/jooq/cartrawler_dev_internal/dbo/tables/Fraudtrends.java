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
import jooq.cartrawler_dev_internal.dbo.tables.records.FraudtrendsRecord;

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
import org.jooq.types.UByte;


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
public class Fraudtrends extends TableImpl<FraudtrendsRecord> {

    private static final long serialVersionUID = -1203491014;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.fraudTrends</code>
     */
    public static final Fraudtrends FRAUDTRENDS = new Fraudtrends();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FraudtrendsRecord> getRecordType() {
        return FraudtrendsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.id</code>.
     */
    public final TableField<FraudtrendsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.pickup</code>.
     */
    public final TableField<FraudtrendsRecord, Integer> PICKUP = createField("pickup", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.hourOfDayMin</code>.
     */
    public final TableField<FraudtrendsRecord, UByte> HOUROFDAYMIN = createField("hourOfDayMin", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.hourOfDayMax</code>.
     */
    public final TableField<FraudtrendsRecord, UByte> HOUROFDAYMAX = createField("hourOfDayMax", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.proximityMin</code>.
     */
    public final TableField<FraudtrendsRecord, Short> PROXIMITYMIN = createField("proximityMin", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.proximityMax</code>.
     */
    public final TableField<FraudtrendsRecord, Short> PROXIMITYMAX = createField("proximityMax", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.geoCountry</code>.
     */
    public final TableField<FraudtrendsRecord, String> GEOCOUNTRY = createField("geoCountry", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.daysMin</code>.
     */
    public final TableField<FraudtrendsRecord, UByte> DAYSMIN = createField("daysMin", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.daysMax</code>.
     */
    public final TableField<FraudtrendsRecord, UByte> DAYSMAX = createField("daysMax", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.surname</code>.
     */
    public final TableField<FraudtrendsRecord, String> SURNAME = createField("surname", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.supplier</code>.
     */
    public final TableField<FraudtrendsRecord, String> SUPPLIER = createField("supplier", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.channel</code>.
     */
    public final TableField<FraudtrendsRecord, Integer> CHANNEL = createField("channel", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.car</code>.
     */
    public final TableField<FraudtrendsRecord, String> CAR = createField("car", org.jooq.impl.SQLDataType.VARCHAR(256), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.residency</code>.
     */
    public final TableField<FraudtrendsRecord, String> RESIDENCY = createField("residency", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.client</code>.
     */
    public final TableField<FraudtrendsRecord, Integer> CLIENT = createField("client", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.risk</code>.
     */
    public final TableField<FraudtrendsRecord, Integer> RISK = createField("risk", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.fraudTrends.CarAgentLoc</code>.
     */
    public final TableField<FraudtrendsRecord, Integer> CARAGENTLOC = createField("CarAgentLoc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.fraudTrends</code> table reference
     */
    public Fraudtrends() {
        this(DSL.name("fraudTrends"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.fraudTrends</code> table reference
     */
    public Fraudtrends(String alias) {
        this(DSL.name(alias), FRAUDTRENDS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.fraudTrends</code> table reference
     */
    public Fraudtrends(Name alias) {
        this(alias, FRAUDTRENDS);
    }

    private Fraudtrends(Name alias, Table<FraudtrendsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Fraudtrends(Name alias, Table<FraudtrendsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Fraudtrends(Table<O> child, ForeignKey<O, FraudtrendsRecord> key) {
        super(child, key, FRAUDTRENDS);
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
        return Arrays.<Index>asList(Indexes.FRAUDTRENDS_PK_FRAUDTRENDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<FraudtrendsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_FRAUDTRENDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FraudtrendsRecord> getPrimaryKey() {
        return Keys.PK_FRAUDTRENDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FraudtrendsRecord>> getKeys() {
        return Arrays.<UniqueKey<FraudtrendsRecord>>asList(Keys.PK_FRAUDTRENDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fraudtrends as(String alias) {
        return new Fraudtrends(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Fraudtrends as(Name alias) {
        return new Fraudtrends(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Fraudtrends rename(String name) {
        return new Fraudtrends(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Fraudtrends rename(Name name) {
        return new Fraudtrends(name, null);
    }
}
