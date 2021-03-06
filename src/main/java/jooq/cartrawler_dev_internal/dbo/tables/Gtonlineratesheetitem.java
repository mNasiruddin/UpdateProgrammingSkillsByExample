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
import jooq.cartrawler_dev_internal.dbo.tables.records.GtonlineratesheetitemRecord;

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
public class Gtonlineratesheetitem extends TableImpl<GtonlineratesheetitemRecord> {

    private static final long serialVersionUID = 187248943;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem</code>
     */
    public static final Gtonlineratesheetitem GTONLINERATESHEETITEM = new Gtonlineratesheetitem();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<GtonlineratesheetitemRecord> getRecordType() {
        return GtonlineratesheetitemRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.id</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.rate_id</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, Integer> RATE_ID = createField("rate_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.from_distance</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, Integer> FROM_DISTANCE = createField("from_distance", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.to_distance</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, Integer> TO_DISTANCE = createField("to_distance", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> RATE = createField("rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.return_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> RETURN_RATE = createField("return_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.packaged</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, Boolean> PACKAGED = createField("packaged", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.senior_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> SENIOR_RATE = createField("senior_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.senior_return_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> SENIOR_RETURN_RATE = createField("senior_return_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.student_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> STUDENT_RATE = createField("student_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.student_return_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> STUDENT_RETURN_RATE = createField("student_return_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.child_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> CHILD_RATE = createField("child_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem.child_return_rate</code>.
     */
    public final TableField<GtonlineratesheetitemRecord, BigDecimal> CHILD_RETURN_RATE = createField("child_return_rate", org.jooq.impl.SQLDataType.NUMERIC(20, 10), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem</code> table reference
     */
    public Gtonlineratesheetitem() {
        this(DSL.name("GTOnlineRateSheetItem"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem</code> table reference
     */
    public Gtonlineratesheetitem(String alias) {
        this(DSL.name(alias), GTONLINERATESHEETITEM);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.GTOnlineRateSheetItem</code> table reference
     */
    public Gtonlineratesheetitem(Name alias) {
        this(alias, GTONLINERATESHEETITEM);
    }

    private Gtonlineratesheetitem(Name alias, Table<GtonlineratesheetitemRecord> aliased) {
        this(alias, aliased, null);
    }

    private Gtonlineratesheetitem(Name alias, Table<GtonlineratesheetitemRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Gtonlineratesheetitem(Table<O> child, ForeignKey<O, GtonlineratesheetitemRecord> key) {
        super(child, key, GTONLINERATESHEETITEM);
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
        return Arrays.<Index>asList(Indexes.GTONLINERATESHEETITEM_PK_GTONLINERATESHEETITEM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<GtonlineratesheetitemRecord, Integer> getIdentity() {
        return Keys.IDENTITY_GTONLINERATESHEETITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<GtonlineratesheetitemRecord> getPrimaryKey() {
        return Keys.PK_GTONLINERATESHEETITEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<GtonlineratesheetitemRecord>> getKeys() {
        return Arrays.<UniqueKey<GtonlineratesheetitemRecord>>asList(Keys.PK_GTONLINERATESHEETITEM);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gtonlineratesheetitem as(String alias) {
        return new Gtonlineratesheetitem(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Gtonlineratesheetitem as(Name alias) {
        return new Gtonlineratesheetitem(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Gtonlineratesheetitem rename(String name) {
        return new Gtonlineratesheetitem(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Gtonlineratesheetitem rename(Name name) {
        return new Gtonlineratesheetitem(name, null);
    }
}
