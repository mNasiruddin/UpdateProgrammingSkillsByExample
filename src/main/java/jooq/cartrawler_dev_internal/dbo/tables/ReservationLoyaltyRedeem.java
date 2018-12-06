/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationLoyaltyRedeemRecord;

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
public class ReservationLoyaltyRedeem extends TableImpl<ReservationLoyaltyRedeemRecord> {

    private static final long serialVersionUID = 2042882906;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem</code>
     */
    public static final ReservationLoyaltyRedeem RESERVATION_LOYALTY_REDEEM = new ReservationLoyaltyRedeem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationLoyaltyRedeemRecord> getRecordType() {
        return ReservationLoyaltyRedeemRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.id</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.fk_reservation</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.points</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, Integer> POINTS = createField("points", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.pointValue</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, BigDecimal> POINTVALUE = createField("pointValue", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.paymentBalance</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, BigDecimal> PAYMENTBALANCE = createField("paymentBalance", org.jooq.impl.SQLDataType.NUMERIC(19, 4).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.paymentCurrency</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, String> PAYMENTCURRENCY = createField("paymentCurrency", org.jooq.impl.SQLDataType.CHAR(3).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.program</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, String> PROGRAM = createField("program", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.loyaltyNum</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, String> LOYALTYNUM = createField("loyaltyNum", org.jooq.impl.SQLDataType.VARCHAR(150), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem.transactionId</code>.
     */
    public final TableField<ReservationLoyaltyRedeemRecord, String> TRANSACTIONID = createField("transactionId", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem</code> table reference
     */
    public ReservationLoyaltyRedeem() {
        this(DSL.name("reservation_loyalty_redeem"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem</code> table reference
     */
    public ReservationLoyaltyRedeem(String alias) {
        this(DSL.name(alias), RESERVATION_LOYALTY_REDEEM);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_loyalty_redeem</code> table reference
     */
    public ReservationLoyaltyRedeem(Name alias) {
        this(alias, RESERVATION_LOYALTY_REDEEM);
    }

    private ReservationLoyaltyRedeem(Name alias, Table<ReservationLoyaltyRedeemRecord> aliased) {
        this(alias, aliased, null);
    }

    private ReservationLoyaltyRedeem(Name alias, Table<ReservationLoyaltyRedeemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationLoyaltyRedeem(Table<O> child, ForeignKey<O, ReservationLoyaltyRedeemRecord> key) {
        super(child, key, RESERVATION_LOYALTY_REDEEM);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_LOYALTY_REDEEM_PK_RESERVATION_LOYALTY_REDEEM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationLoyaltyRedeemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_LOYALTY_REDEEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationLoyaltyRedeemRecord> getPrimaryKey() {
        return Keys.PK_RESERVATION_LOYALTY_REDEEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationLoyaltyRedeemRecord>> getKeys() {
        return Arrays.<UniqueKey<ReservationLoyaltyRedeemRecord>>asList(Keys.PK_RESERVATION_LOYALTY_REDEEM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeem as(String alias) {
        return new ReservationLoyaltyRedeem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationLoyaltyRedeem as(Name alias) {
        return new ReservationLoyaltyRedeem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLoyaltyRedeem rename(String name) {
        return new ReservationLoyaltyRedeem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationLoyaltyRedeem rename(Name name) {
        return new ReservationLoyaltyRedeem(name, null);
    }
}