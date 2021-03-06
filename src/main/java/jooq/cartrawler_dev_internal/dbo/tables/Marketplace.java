/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.MarketplaceRecord;

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
public class Marketplace extends TableImpl<MarketplaceRecord> {

    private static final long serialVersionUID = -233512894;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MarketPlace</code>
     */
    public static final Marketplace MARKETPLACE = new Marketplace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MarketplaceRecord> getRecordType() {
        return MarketplaceRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.id</code>.
     */
    public final TableField<MarketplaceRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.car_agent_id</code>.
     */
    public final TableField<MarketplaceRecord, Integer> CAR_AGENT_ID = createField("car_agent_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.car_agent_location_id</code>.
     */
    public final TableField<MarketplaceRecord, Integer> CAR_AGENT_LOCATION_ID = createField("car_agent_location_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.active_from</code>.
     */
    public final TableField<MarketplaceRecord, Timestamp> ACTIVE_FROM = createField("active_from", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.active_to</code>.
     */
    public final TableField<MarketplaceRecord, Timestamp> ACTIVE_TO = createField("active_to", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.pickupFrom</code>.
     */
    public final TableField<MarketplaceRecord, Timestamp> PICKUPFROM = createField("pickupFrom", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.pickupTo</code>.
     */
    public final TableField<MarketplaceRecord, Timestamp> PICKUPTO = createField("pickupTo", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.supplierGroup</code>.
     */
    public final TableField<MarketplaceRecord, String> SUPPLIERGROUP = createField("supplierGroup", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.mappedSIPP</code>.
     */
    public final TableField<MarketplaceRecord, String> MAPPEDSIPP = createField("mappedSIPP", org.jooq.impl.SQLDataType.CHAR(4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.rentalDaysRangeStart</code>.
     */
    public final TableField<MarketplaceRecord, Integer> RENTALDAYSRANGESTART = createField("rentalDaysRangeStart", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.rentalDaysRangeEnd</code>.
     */
    public final TableField<MarketplaceRecord, Integer> RENTALDAYSRANGEEND = createField("rentalDaysRangeEnd", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.exclusive</code>.
     */
    public final TableField<MarketplaceRecord, Boolean> EXCLUSIVE = createField("exclusive", org.jooq.impl.SQLDataType.BIT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.market_rate_email</code>.
     */
    public final TableField<MarketplaceRecord, String> MARKET_RATE_EMAIL = createField("market_rate_email", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.SMS</code>.
     */
    public final TableField<MarketplaceRecord, String> SMS = createField("SMS", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.maxBookings</code>.
     */
    public final TableField<MarketplaceRecord, Integer> MAXBOOKINGS = createField("maxBookings", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.dailyBaseRate</code>.
     */
    public final TableField<MarketplaceRecord, BigDecimal> DAILYBASERATE = createField("dailyBaseRate", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.createDate</code>.
     */
    public final TableField<MarketplaceRecord, Timestamp> CREATEDATE = createField("createDate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.bookingsCount</code>.
     */
    public final TableField<MarketplaceRecord, Integer> BOOKINGSCOUNT = createField("bookingsCount", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MarketPlace.active</code>.
     */
    public final TableField<MarketplaceRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MarketPlace</code> table reference
     */
    public Marketplace() {
        this(DSL.name("MarketPlace"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MarketPlace</code> table reference
     */
    public Marketplace(String alias) {
        this(DSL.name(alias), MARKETPLACE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MarketPlace</code> table reference
     */
    public Marketplace(Name alias) {
        this(alias, MARKETPLACE);
    }

    private Marketplace(Name alias, Table<MarketplaceRecord> aliased) {
        this(alias, aliased, null);
    }

    private Marketplace(Name alias, Table<MarketplaceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Marketplace(Table<O> child, ForeignKey<O, MarketplaceRecord> key) {
        super(child, key, MARKETPLACE);
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
        return Arrays.<Index>asList(Indexes.MARKETPLACE_PK_MARKETPLACE, Indexes.MARKETPLACE_PK_MARKETPLACE_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<MarketplaceRecord, Integer> getIdentity() {
        return Keys.IDENTITY_MARKETPLACE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<MarketplaceRecord> getPrimaryKey() {
        return Keys.PK_MARKETPLACE_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MarketplaceRecord>> getKeys() {
        return Arrays.<UniqueKey<MarketplaceRecord>>asList(Keys.PK_MARKETPLACE_1, Keys.PK_MARKETPLACE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Marketplace as(String alias) {
        return new Marketplace(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Marketplace as(Name alias) {
        return new Marketplace(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Marketplace rename(String name) {
        return new Marketplace(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Marketplace rename(Name name) {
        return new Marketplace(name, null);
    }
}
