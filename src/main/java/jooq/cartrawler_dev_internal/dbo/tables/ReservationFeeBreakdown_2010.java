/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReservationFeeBreakdown_2010Record;

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
public class ReservationFeeBreakdown_2010 extends TableImpl<ReservationFeeBreakdown_2010Record> {

    private static final long serialVersionUID = -401296455;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010</code>
     */
    public static final ReservationFeeBreakdown_2010 RESERVATION_FEE_BREAKDOWN_2010 = new ReservationFeeBreakdown_2010();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReservationFeeBreakdown_2010Record> getRecordType() {
        return ReservationFeeBreakdown_2010Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.id</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.guid</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.fk_reservation</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, Integer> FK_RESERVATION = createField("fk_reservation", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.type</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, UByte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.status</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, UByte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.amount_status</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, UByte> AMOUNT_STATUS = createField("amount_status", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.fee_amount</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, BigDecimal> FEE_AMOUNT = createField("fee_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 9), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.sales_tax</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, UByte> SALES_TAX = createField("sales_tax", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.payment_terms</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, UByte> PAYMENT_TERMS = createField("payment_terms", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010.fk_rawdescription</code>.
     */
    public final TableField<ReservationFeeBreakdown_2010Record, Integer> FK_RAWDESCRIPTION = createField("fk_rawdescription", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010</code> table reference
     */
    public ReservationFeeBreakdown_2010() {
        this(DSL.name("reservation_fee_breakdown_2010"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010</code> table reference
     */
    public ReservationFeeBreakdown_2010(String alias) {
        this(DSL.name(alias), RESERVATION_FEE_BREAKDOWN_2010);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.reservation_fee_breakdown_2010</code> table reference
     */
    public ReservationFeeBreakdown_2010(Name alias) {
        this(alias, RESERVATION_FEE_BREAKDOWN_2010);
    }

    private ReservationFeeBreakdown_2010(Name alias, Table<ReservationFeeBreakdown_2010Record> aliased) {
        this(alias, aliased, null);
    }

    private ReservationFeeBreakdown_2010(Name alias, Table<ReservationFeeBreakdown_2010Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> ReservationFeeBreakdown_2010(Table<O> child, ForeignKey<O, ReservationFeeBreakdown_2010Record> key) {
        super(child, key, RESERVATION_FEE_BREAKDOWN_2010);
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
        return Arrays.<Index>asList(Indexes.RESERVATION_FEE_BREAKDOWN_2010_PK_RESERVATION_FEE_BREAKDOWN_2010_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<ReservationFeeBreakdown_2010Record, Integer> getIdentity() {
        return Keys.IDENTITY_RESERVATION_FEE_BREAKDOWN_2010;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<ReservationFeeBreakdown_2010Record> getPrimaryKey() {
        return Keys.PK_RESERVATION_FEE_BREAKDOWN_2010_1;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<ReservationFeeBreakdown_2010Record>> getKeys() {
        return Arrays.<UniqueKey<ReservationFeeBreakdown_2010Record>>asList(Keys.PK_RESERVATION_FEE_BREAKDOWN_2010_1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2010 as(String alias) {
        return new ReservationFeeBreakdown_2010(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ReservationFeeBreakdown_2010 as(Name alias) {
        return new ReservationFeeBreakdown_2010(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationFeeBreakdown_2010 rename(String name) {
        return new ReservationFeeBreakdown_2010(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ReservationFeeBreakdown_2010 rename(Name name) {
        return new ReservationFeeBreakdown_2010(name, null);
    }
}
