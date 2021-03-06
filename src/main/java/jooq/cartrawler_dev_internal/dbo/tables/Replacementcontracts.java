/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.ReplacementcontractsRecord;

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
public class Replacementcontracts extends TableImpl<ReplacementcontractsRecord> {

    private static final long serialVersionUID = 1234425524;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.replacementContracts</code>
     */
    public static final Replacementcontracts REPLACEMENTCONTRACTS = new Replacementcontracts();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ReplacementcontractsRecord> getRecordType() {
        return ReplacementcontractsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.replacementContracts.agent</code>.
     */
    public final TableField<ReplacementcontractsRecord, String> AGENT = createField("agent", org.jooq.impl.SQLDataType.NVARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.replacementContracts.source</code>.
     */
    public final TableField<ReplacementcontractsRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.NVARCHAR(255).nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.replacementContracts.replacement</code>.
     */
    public final TableField<ReplacementcontractsRecord, String> REPLACEMENT = createField("replacement", org.jooq.impl.SQLDataType.NVARCHAR(255).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.replacementContracts</code> table reference
     */
    public Replacementcontracts() {
        this(DSL.name("replacementContracts"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.replacementContracts</code> table reference
     */
    public Replacementcontracts(String alias) {
        this(DSL.name(alias), REPLACEMENTCONTRACTS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.replacementContracts</code> table reference
     */
    public Replacementcontracts(Name alias) {
        this(alias, REPLACEMENTCONTRACTS);
    }

    private Replacementcontracts(Name alias, Table<ReplacementcontractsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Replacementcontracts(Name alias, Table<ReplacementcontractsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Replacementcontracts(Table<O> child, ForeignKey<O, ReplacementcontractsRecord> key) {
        super(child, key, REPLACEMENTCONTRACTS);
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
    public Replacementcontracts as(String alias) {
        return new Replacementcontracts(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Replacementcontracts as(Name alias) {
        return new Replacementcontracts(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Replacementcontracts rename(String name) {
        return new Replacementcontracts(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Replacementcontracts rename(Name name) {
        return new Replacementcontracts(name, null);
    }
}
