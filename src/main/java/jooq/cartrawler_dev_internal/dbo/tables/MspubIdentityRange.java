/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.MspubIdentityRangeRecord;

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
public class MspubIdentityRange extends TableImpl<MspubIdentityRangeRecord> {

    private static final long serialVersionUID = -715300477;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.MSpub_identity_range</code>
     */
    public static final MspubIdentityRange MSPUB_IDENTITY_RANGE = new MspubIdentityRange();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<MspubIdentityRangeRecord> getRecordType() {
        return MspubIdentityRangeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpub_identity_range.objid</code>.
     */
    public final TableField<MspubIdentityRangeRecord, Integer> OBJID = createField("objid", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpub_identity_range.range</code>.
     */
    public final TableField<MspubIdentityRangeRecord, Long> RANGE = createField("range", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpub_identity_range.pub_range</code>.
     */
    public final TableField<MspubIdentityRangeRecord, Long> PUB_RANGE = createField("pub_range", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpub_identity_range.current_pub_range</code>.
     */
    public final TableField<MspubIdentityRangeRecord, Long> CURRENT_PUB_RANGE = createField("current_pub_range", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpub_identity_range.threshold</code>.
     */
    public final TableField<MspubIdentityRangeRecord, Integer> THRESHOLD = createField("threshold", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.MSpub_identity_range.last_seed</code>.
     */
    public final TableField<MspubIdentityRangeRecord, Long> LAST_SEED = createField("last_seed", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.MSpub_identity_range</code> table reference
     */
    public MspubIdentityRange() {
        this(DSL.name("MSpub_identity_range"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpub_identity_range</code> table reference
     */
    public MspubIdentityRange(String alias) {
        this(DSL.name(alias), MSPUB_IDENTITY_RANGE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.MSpub_identity_range</code> table reference
     */
    public MspubIdentityRange(Name alias) {
        this(alias, MSPUB_IDENTITY_RANGE);
    }

    private MspubIdentityRange(Name alias, Table<MspubIdentityRangeRecord> aliased) {
        this(alias, aliased, null);
    }

    private MspubIdentityRange(Name alias, Table<MspubIdentityRangeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> MspubIdentityRange(Table<O> child, ForeignKey<O, MspubIdentityRangeRecord> key) {
        super(child, key, MSPUB_IDENTITY_RANGE);
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
        return Arrays.<Index>asList(Indexes.MSPUB_IDENTITY_RANGE_UNC1MSPUB_IDENTITY_RANGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<MspubIdentityRangeRecord>> getKeys() {
        return Arrays.<UniqueKey<MspubIdentityRangeRecord>>asList(Keys.UNC1MSPUB_IDENTITY_RANGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspubIdentityRange as(String alias) {
        return new MspubIdentityRange(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MspubIdentityRange as(Name alias) {
        return new MspubIdentityRange(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public MspubIdentityRange rename(String name) {
        return new MspubIdentityRange(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public MspubIdentityRange rename(Name name) {
        return new MspubIdentityRange(name, null);
    }
}
