/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.CommissionreportssummaryRecord;

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
public class Commissionreportssummary extends TableImpl<CommissionreportssummaryRecord> {

    private static final long serialVersionUID = -1967018282;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary</code>
     */
    public static final Commissionreportssummary COMMISSIONREPORTSSUMMARY = new Commissionreportssummary();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CommissionreportssummaryRecord> getRecordType() {
        return CommissionreportssummaryRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.guid</code>.
     */
    public final TableField<CommissionreportssummaryRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.company_name</code>.
     */
    public final TableField<CommissionreportssummaryRecord, String> COMPANY_NAME = createField("company_name", org.jooq.impl.SQLDataType.VARCHAR(100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.user_id</code>.
     */
    public final TableField<CommissionreportssummaryRecord, String> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.report_date</code>.
     */
    public final TableField<CommissionreportssummaryRecord, Timestamp> REPORT_DATE = createField("report_date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.summary</code>.
     */
    public final TableField<CommissionreportssummaryRecord, String> SUMMARY = createField("summary", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.id</code>.
     */
    public final TableField<CommissionreportssummaryRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.check_number</code>.
     */
    public final TableField<CommissionreportssummaryRecord, String> CHECK_NUMBER = createField("check_number", org.jooq.impl.SQLDataType.VARCHAR(20), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary.commission_total</code>.
     */
    public final TableField<CommissionreportssummaryRecord, BigDecimal> COMMISSION_TOTAL = createField("commission_total", org.jooq.impl.SQLDataType.NUMERIC(10, 2), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary</code> table reference
     */
    public Commissionreportssummary() {
        this(DSL.name("CommissionReportsSummary"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary</code> table reference
     */
    public Commissionreportssummary(String alias) {
        this(DSL.name(alias), COMMISSIONREPORTSSUMMARY);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CommissionReportsSummary</code> table reference
     */
    public Commissionreportssummary(Name alias) {
        this(alias, COMMISSIONREPORTSSUMMARY);
    }

    private Commissionreportssummary(Name alias, Table<CommissionreportssummaryRecord> aliased) {
        this(alias, aliased, null);
    }

    private Commissionreportssummary(Name alias, Table<CommissionreportssummaryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Commissionreportssummary(Table<O> child, ForeignKey<O, CommissionreportssummaryRecord> key) {
        super(child, key, COMMISSIONREPORTSSUMMARY);
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
        return Arrays.<Index>asList(Indexes.COMMISSIONREPORTSSUMMARY_PK_COMMISSIONREPORTSSUMMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CommissionreportssummaryRecord, Integer> getIdentity() {
        return Keys.IDENTITY_COMMISSIONREPORTSSUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CommissionreportssummaryRecord> getPrimaryKey() {
        return Keys.PK_COMMISSIONREPORTSSUMMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CommissionreportssummaryRecord>> getKeys() {
        return Arrays.<UniqueKey<CommissionreportssummaryRecord>>asList(Keys.PK_COMMISSIONREPORTSSUMMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Commissionreportssummary as(String alias) {
        return new Commissionreportssummary(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Commissionreportssummary as(Name alias) {
        return new Commissionreportssummary(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Commissionreportssummary rename(String name) {
        return new Commissionreportssummary(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Commissionreportssummary rename(Name name) {
        return new Commissionreportssummary(name, null);
    }
}
