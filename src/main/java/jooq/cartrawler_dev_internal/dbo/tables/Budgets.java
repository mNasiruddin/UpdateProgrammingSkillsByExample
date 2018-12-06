/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.BudgetsRecord;

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
public class Budgets extends TableImpl<BudgetsRecord> {

    private static final long serialVersionUID = 432480870;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Budgets</code>
     */
    public static final Budgets BUDGETS = new Budgets();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BudgetsRecord> getRecordType() {
        return BudgetsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.guid</code>.
     */
    public final TableField<BudgetsRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.id</code>.
     */
    public final TableField<BudgetsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.title</code>.
     */
    public final TableField<BudgetsRecord, String> TITLE = createField("title", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.targetType</code>.
     */
    public final TableField<BudgetsRecord, String> TARGETTYPE = createField("targetType", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_createdBy</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_CREATEDBY = createField("fk_createdBy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_amendedBy</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_AMENDEDBY = createField("fk_amendedBy", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_channel</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_CHANNEL = createField("fk_channel", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_country</code>.
     */
    public final TableField<BudgetsRecord, String> FK_COUNTRY = createField("fk_country", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_location</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_LOCATION = createField("fk_location", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_virtualLocation</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_VIRTUALLOCATION = createField("fk_virtualLocation", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.supplier</code>.
     */
    public final TableField<BudgetsRecord, String> SUPPLIER = createField("supplier", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_plan</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_PLAN = createField("fk_plan", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_contract</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_CONTRACT = createField("fk_contract", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_savedReport</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_SAVEDREPORT = createField("fk_savedReport", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.lastModified</code>.
     */
    public final TableField<BudgetsRecord, Timestamp> LASTMODIFIED = createField("lastModified", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.fk_client</code>.
     */
    public final TableField<BudgetsRecord, Integer> FK_CLIENT = createField("fk_client", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Budgets.locationType</code>.
     */
    public final TableField<BudgetsRecord, String> LOCATIONTYPE = createField("locationType", org.jooq.impl.SQLDataType.VARCHAR(10), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Budgets</code> table reference
     */
    public Budgets() {
        this(DSL.name("Budgets"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Budgets</code> table reference
     */
    public Budgets(String alias) {
        this(DSL.name(alias), BUDGETS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Budgets</code> table reference
     */
    public Budgets(Name alias) {
        this(alias, BUDGETS);
    }

    private Budgets(Name alias, Table<BudgetsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Budgets(Name alias, Table<BudgetsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Budgets(Table<O> child, ForeignKey<O, BudgetsRecord> key) {
        super(child, key, BUDGETS);
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
        return Arrays.<Index>asList(Indexes.BUDGETS_IX_BUDGETS, Indexes.BUDGETS_PK_BUDGETS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<BudgetsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_BUDGETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BudgetsRecord> getPrimaryKey() {
        return Keys.PK_BUDGETS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BudgetsRecord>> getKeys() {
        return Arrays.<UniqueKey<BudgetsRecord>>asList(Keys.PK_BUDGETS, Keys.IX_BUDGETS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Budgets as(String alias) {
        return new Budgets(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Budgets as(Name alias) {
        return new Budgets(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Budgets rename(String name) {
        return new Budgets(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Budgets rename(Name name) {
        return new Budgets(name, null);
    }
}