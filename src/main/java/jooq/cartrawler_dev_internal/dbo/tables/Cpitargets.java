/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.CpitargetsRecord;

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
public class Cpitargets extends TableImpl<CpitargetsRecord> {

    private static final long serialVersionUID = -1428755213;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CPITargets</code>
     */
    public static final Cpitargets CPITARGETS = new Cpitargets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CpitargetsRecord> getRecordType() {
        return CpitargetsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.datecreated</code>.
     */
    public final TableField<CpitargetsRecord, Timestamp> DATECREATED = createField("datecreated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.lastamenddate</code>.
     */
    public final TableField<CpitargetsRecord, Timestamp> LASTAMENDDATE = createField("lastamenddate", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.userid</code>.
     */
    public final TableField<CpitargetsRecord, Integer> USERID = createField("userid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.channelid</code>.
     */
    public final TableField<CpitargetsRecord, Short> CHANNELID = createField("channelid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.clientid</code>.
     */
    public final TableField<CpitargetsRecord, Integer> CLIENTID = createField("clientid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.sourcemarket</code>.
     */
    public final TableField<CpitargetsRecord, String> SOURCEMARKET = createField("sourcemarket", org.jooq.impl.SQLDataType.VARCHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.pickuploc</code>.
     */
    public final TableField<CpitargetsRecord, Integer> PICKUPLOC = createField("pickuploc", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.duration</code>.
     */
    public final TableField<CpitargetsRecord, Short> DURATION = createField("duration", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.class</code>.
     */
    public final TableField<CpitargetsRecord, String> CLASS = createField("class", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.classkey</code>.
     */
    public final TableField<CpitargetsRecord, String> CLASSKEY = createField("classkey", org.jooq.impl.SQLDataType.VARCHAR(40), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.fuelPolicy</code>.
     */
    public final TableField<CpitargetsRecord, String> FUELPOLICY = createField("fuelPolicy", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.rateType</code>.
     */
    public final TableField<CpitargetsRecord, String> RATETYPE = createField("rateType", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.productType</code>.
     */
    public final TableField<CpitargetsRecord, String> PRODUCTTYPE = createField("productType", org.jooq.impl.SQLDataType.VARCHAR(2).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.validfrom</code>.
     */
    public final TableField<CpitargetsRecord, String> VALIDFROM = createField("validfrom", org.jooq.impl.SQLDataType.VARCHAR(19).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.validto</code>.
     */
    public final TableField<CpitargetsRecord, String> VALIDTO = createField("validto", org.jooq.impl.SQLDataType.VARCHAR(19).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.pickupDateTime</code>.
     */
    public final TableField<CpitargetsRecord, String> PICKUPDATETIME = createField("pickupDateTime", org.jooq.impl.SQLDataType.VARCHAR(19).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.dropoffDateTime</code>.
     */
    public final TableField<CpitargetsRecord, String> DROPOFFDATETIME = createField("dropoffDateTime", org.jooq.impl.SQLDataType.VARCHAR(19).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.CPI</code>.
     */
    public final TableField<CpitargetsRecord, BigDecimal> CPI = createField("CPI", org.jooq.impl.SQLDataType.NUMERIC(18, 5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.enabled</code>.
     */
    public final TableField<CpitargetsRecord, Integer> ENABLED = createField("enabled", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.classkeygroup</code>.
     */
    public final TableField<CpitargetsRecord, String> CLASSKEYGROUP = createField("classkeygroup", org.jooq.impl.SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.leadfromweek</code>.
     */
    public final TableField<CpitargetsRecord, Short> LEADFROMWEEK = createField("leadfromweek", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.leadtoweek</code>.
     */
    public final TableField<CpitargetsRecord, Integer> LEADTOWEEK = createField("leadtoweek", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.latencyHours</code>.
     */
    public final TableField<CpitargetsRecord, Short> LATENCYHOURS = createField("latencyHours", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.AdjustContr_Min</code>.
     */
    public final TableField<CpitargetsRecord, BigDecimal> ADJUSTCONTR_MIN = createField("AdjustContr_Min", org.jooq.impl.SQLDataType.NUMERIC(18, 5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.AdjustContr_Max</code>.
     */
    public final TableField<CpitargetsRecord, BigDecimal> ADJUSTCONTR_MAX = createField("AdjustContr_Max", org.jooq.impl.SQLDataType.NUMERIC(18, 5), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CPITargets.priority_competitorid</code>.
     */
    public final TableField<CpitargetsRecord, Short> PRIORITY_COMPETITORID = createField("priority_competitorid", org.jooq.impl.SQLDataType.SMALLINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CPITargets</code> table reference
     */
    public Cpitargets() {
        this(DSL.name("CPITargets"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CPITargets</code> table reference
     */
    public Cpitargets(String alias) {
        this(DSL.name(alias), CPITARGETS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CPITargets</code> table reference
     */
    public Cpitargets(Name alias) {
        this(alias, CPITARGETS);
    }

    private Cpitargets(Name alias, Table<CpitargetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Cpitargets(Name alias, Table<CpitargetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Cpitargets(Table<O> child, ForeignKey<O, CpitargetsRecord> key) {
        super(child, key, CPITARGETS);
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
    public Cpitargets as(String alias) {
        return new Cpitargets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Cpitargets as(Name alias) {
        return new Cpitargets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Cpitargets rename(String name) {
        return new Cpitargets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Cpitargets rename(Name name) {
        return new Cpitargets(name, null);
    }
}
