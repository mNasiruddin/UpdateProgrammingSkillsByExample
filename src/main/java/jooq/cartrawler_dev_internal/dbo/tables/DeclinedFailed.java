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
import jooq.cartrawler_dev_internal.dbo.tables.records.DeclinedFailedRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
public class DeclinedFailed extends TableImpl<DeclinedFailedRecord> {

    private static final long serialVersionUID = 733251301;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.Declined_Failed</code>
     */
    public static final DeclinedFailed DECLINED_FAILED = new DeclinedFailed();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeclinedFailedRecord> getRecordType() {
        return DeclinedFailedRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.guid</code>.
     */
    public final TableField<DeclinedFailedRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.I4CH DB</code>.
     */
    public final TableField<DeclinedFailedRecord, Double> I4CH_DB = createField("I4CH DB", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.CarTrawler Ref</code>.
     */
    public final TableField<DeclinedFailedRecord, String> CARTRAWLER_REF = createField("CarTrawler Ref", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.No# Days</code>.
     */
    public final TableField<DeclinedFailedRecord, Double> NO_23_DAYS = createField("No# Days", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.Issue Date</code>.
     */
    public final TableField<DeclinedFailedRecord, Timestamp> ISSUE_DATE = createField("Issue Date", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.Client</code>.
     */
    public final TableField<DeclinedFailedRecord, String> CLIENT = createField("Client", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.Declined_Failed.Amount</code>.
     */
    public final TableField<DeclinedFailedRecord, Double> AMOUNT = createField("Amount", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.Declined_Failed</code> table reference
     */
    public DeclinedFailed() {
        this(DSL.name("Declined_Failed"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Declined_Failed</code> table reference
     */
    public DeclinedFailed(String alias) {
        this(DSL.name(alias), DECLINED_FAILED);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.Declined_Failed</code> table reference
     */
    public DeclinedFailed(Name alias) {
        this(alias, DECLINED_FAILED);
    }

    private DeclinedFailed(Name alias, Table<DeclinedFailedRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeclinedFailed(Name alias, Table<DeclinedFailedRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DeclinedFailed(Table<O> child, ForeignKey<O, DeclinedFailedRecord> key) {
        super(child, key, DECLINED_FAILED);
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
        return Arrays.<Index>asList(Indexes.DECLINED_FAILED_PK_DECLINED_FAILED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DeclinedFailedRecord> getPrimaryKey() {
        return Keys.PK_DECLINED_FAILED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DeclinedFailedRecord>> getKeys() {
        return Arrays.<UniqueKey<DeclinedFailedRecord>>asList(Keys.PK_DECLINED_FAILED);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeclinedFailed as(String alias) {
        return new DeclinedFailed(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeclinedFailed as(Name alias) {
        return new DeclinedFailed(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeclinedFailed rename(String name) {
        return new DeclinedFailed(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeclinedFailed rename(Name name) {
        return new DeclinedFailed(name, null);
    }
}
