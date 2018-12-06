/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.PsChangeToCharge_09022015Record;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class PsChangeToCharge_09022015 extends TableImpl<PsChangeToCharge_09022015Record> {

    private static final long serialVersionUID = 1140084943;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015</code>
     */
    public static final PsChangeToCharge_09022015 PS_CHANGE_TO_CHARGE_09022015 = new PsChangeToCharge_09022015();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PsChangeToCharge_09022015Record> getRecordType() {
        return PsChangeToCharge_09022015Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.Reservation_ID</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, String> RESERVATION_ID = createField("Reservation_ID", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.res_ref</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, Integer> RES_REF = createField("res_ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.ref</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, Integer> REF = createField("ref", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.Res_Date</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, Timestamp> RES_DATE = createField("Res_Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.trans_datetime</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, Timestamp> TRANS_DATETIME = createField("trans_datetime", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.charge_currency</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, String> CHARGE_CURRENCY = createField("charge_currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.payandshop_amount</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, BigDecimal> PAYANDSHOP_AMOUNT = createField("payandshop_amount", org.jooq.impl.SQLDataType.NUMERIC(18, 2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.currency</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.CHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.ChargetoEuro</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, BigDecimal> CHARGETOEURO = createField("ChargetoEuro", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.pstoEuro</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, BigDecimal> PSTOEURO = createField("pstoEuro", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.psEuro</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, BigDecimal> PSEURO = createField("psEuro", org.jooq.impl.SQLDataType.NUMERIC(38, 12), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015.psCharge</code>.
     */
    public final TableField<PsChangeToCharge_09022015Record, BigDecimal> PSCHARGE = createField("psCharge", org.jooq.impl.SQLDataType.NUMERIC(38, 6), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015</code> table reference
     */
    public PsChangeToCharge_09022015() {
        this(DSL.name("ps_change_to_charge_09022015"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015</code> table reference
     */
    public PsChangeToCharge_09022015(String alias) {
        this(DSL.name(alias), PS_CHANGE_TO_CHARGE_09022015);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ps_change_to_charge_09022015</code> table reference
     */
    public PsChangeToCharge_09022015(Name alias) {
        this(alias, PS_CHANGE_TO_CHARGE_09022015);
    }

    private PsChangeToCharge_09022015(Name alias, Table<PsChangeToCharge_09022015Record> aliased) {
        this(alias, aliased, null);
    }

    private PsChangeToCharge_09022015(Name alias, Table<PsChangeToCharge_09022015Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> PsChangeToCharge_09022015(Table<O> child, ForeignKey<O, PsChangeToCharge_09022015Record> key) {
        super(child, key, PS_CHANGE_TO_CHARGE_09022015);
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
    public PsChangeToCharge_09022015 as(String alias) {
        return new PsChangeToCharge_09022015(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PsChangeToCharge_09022015 as(Name alias) {
        return new PsChangeToCharge_09022015(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PsChangeToCharge_09022015 rename(String name) {
        return new PsChangeToCharge_09022015(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PsChangeToCharge_09022015 rename(Name name) {
        return new PsChangeToCharge_09022015(name, null);
    }
}