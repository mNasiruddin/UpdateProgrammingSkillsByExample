/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RuleChargeTempRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class RuleChargeTemp extends TableImpl<RuleChargeTempRecord> {

    private static final long serialVersionUID = 1759296529;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rule_charge_temp</code>
     */
    public static final RuleChargeTemp RULE_CHARGE_TEMP = new RuleChargeTemp();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleChargeTempRecord> getRecordType() {
        return RuleChargeTempRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.guid</code>.
     */
    public final TableField<RuleChargeTempRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.rule_charge_id</code>.
     */
    public final TableField<RuleChargeTempRecord, Integer> RULE_CHARGE_ID = createField("rule_charge_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.unit</code>.
     */
    public final TableField<RuleChargeTempRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.unit_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> UNIT_AMOUNT = createField("unit_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.base_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> BASE_AMOUNT = createField("base_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.min_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> MIN_AMOUNT = createField("min_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.max_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> MAX_AMOUNT = createField("max_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.min_units</code>.
     */
    public final TableField<RuleChargeTempRecord, Integer> MIN_UNITS = createField("min_units", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.max_units</code>.
     */
    public final TableField<RuleChargeTempRecord, Integer> MAX_UNITS = createField("max_units", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.percentage</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> PERCENTAGE = createField("percentage", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.currency</code>.
     */
    public final TableField<RuleChargeTempRecord, String> CURRENCY = createField("currency", org.jooq.impl.SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.in_rate</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> IN_RATE = createField("in_rate", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.tax_exclusive</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> TAX_EXCLUSIVE = createField("tax_exclusive", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.on_request</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> ON_REQUEST = createField("on_request", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.excess</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> EXCESS = createField("excess", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.excess_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> EXCESS_AMOUNT = createField("excess_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.monthday_period</code>.
     */
    public final TableField<RuleChargeTempRecord, String> MONTHDAY_PERIOD = createField("monthday_period", org.jooq.impl.SQLDataType.VARCHAR(15), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.payable_at_counter</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> PAYABLE_AT_COUNTER = createField("payable_at_counter", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.required</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> REQUIRED = createField("required", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.rate_type</code>.
     */
    public final TableField<RuleChargeTempRecord, Integer> RATE_TYPE = createField("rate_type", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.max_coverage</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> MAX_COVERAGE = createField("max_coverage", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.max_coverage_unlimited</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> MAX_COVERAGE_UNLIMITED = createField("max_coverage_unlimited", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.max_coverage_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> MAX_COVERAGE_AMOUNT = createField("max_coverage_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.deposit_amount</code>.
     */
    public final TableField<RuleChargeTempRecord, BigDecimal> DEPOSIT_AMOUNT = createField("deposit_amount", org.jooq.impl.SQLDataType.NUMERIC(19, 6), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_charge_temp.deposit</code>.
     */
    public final TableField<RuleChargeTempRecord, Boolean> DEPOSIT = createField("deposit", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rule_charge_temp</code> table reference
     */
    public RuleChargeTemp() {
        this(DSL.name("rule_charge_temp"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_charge_temp</code> table reference
     */
    public RuleChargeTemp(String alias) {
        this(DSL.name(alias), RULE_CHARGE_TEMP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_charge_temp</code> table reference
     */
    public RuleChargeTemp(Name alias) {
        this(alias, RULE_CHARGE_TEMP);
    }

    private RuleChargeTemp(Name alias, Table<RuleChargeTempRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleChargeTemp(Name alias, Table<RuleChargeTempRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RuleChargeTemp(Table<O> child, ForeignKey<O, RuleChargeTempRecord> key) {
        super(child, key, RULE_CHARGE_TEMP);
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
    public Identity<RuleChargeTempRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RULE_CHARGE_TEMP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleChargeTemp as(String alias) {
        return new RuleChargeTemp(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleChargeTemp as(Name alias) {
        return new RuleChargeTemp(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleChargeTemp rename(String name) {
        return new RuleChargeTemp(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleChargeTemp rename(Name name) {
        return new RuleChargeTemp(name, null);
    }
}
