/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationSpecialoffersRecord;

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
public class ReservationSpecialoffers extends TableImpl<ReservationSpecialoffersRecord> {

    private static final long serialVersionUID = 1890714815;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers</code>
     */
    public static final ReservationSpecialoffers RESERVATION_SPECIALOFFERS = new ReservationSpecialoffers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationSpecialoffersRecord> getRecordType() {
        return ReservationSpecialoffersRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.guid</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.id</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.fk_reservation</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.offerType</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, String> OFFERTYPE = createField("offerType", org.jooq.impl.SQLDataType.VARCHAR(32).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.offerText</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, String> OFFERTEXT = createField("offerText", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.offerTextVerbose</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, String> OFFERTEXTVERBOSE = createField("offerTextVerbose", org.jooq.impl.SQLDataType.VARCHAR(1024).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers.ct_promo_code</code>.
     */
    public final TableField<ReservationSpecialoffersRecord, String> CT_PROMO_CODE = createField("ct_promo_code", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers</code> table reference
     */
    public ReservationSpecialoffers() {
        this(DSL.name("Reservation_SpecialOffers"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers</code> table reference
     */
    public ReservationSpecialoffers(String alias) {
        this(DSL.name(alias), RESERVATION_SPECIALOFFERS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Reservation_SpecialOffers</code> table reference
     */
    public ReservationSpecialoffers(Name alias) {
        this(alias, RESERVATION_SPECIALOFFERS);
    }

    private ReservationSpecialoffers(Name alias, Table<ReservationSpecialoffersRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationSpecialoffers(Name alias, Table<ReservationSpecialoffersRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationSpecialoffers(Table<O> child, ForeignKey<O, ReservationSpecialoffersRecord> key) {
        super(child, key, RESERVATION_SPECIALOFFERS);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_SPECIALOFFERS_PK_RESERVATION_SPECIALOFFERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationSpecialoffersRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_SPECIALOFFERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationSpecialoffersRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_SPECIALOFFERS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationSpecialoffersRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationSpecialoffersRecord>>asList(Keys.PK_RESERVATION_SPECIALOFFERS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSpecialoffers as(String alias) {
        return new ReservationSpecialoffers(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationSpecialoffers as(Name alias) {
        return new ReservationSpecialoffers(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationSpecialoffers rename(String name) {
        return new ReservationSpecialoffers(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationSpecialoffers rename(Name name) {
        return new ReservationSpecialoffers(name, null);
    }
}
