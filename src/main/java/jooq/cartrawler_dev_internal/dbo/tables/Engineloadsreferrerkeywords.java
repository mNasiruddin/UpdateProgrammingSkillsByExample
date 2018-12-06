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
import jooq.cartrawler_dev_internal.dbo.tables.records.EngineloadsreferrerkeywordsRecord;

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
public class Engineloadsreferrerkeywords extends TableImpl<EngineloadsreferrerkeywordsRecord> {

    private static final long serialVersionUID = -210955260;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.engineLoadsReferrerKeywords</code>
     */
    public static final Engineloadsreferrerkeywords ENGINELOADSREFERRERKEYWORDS = new Engineloadsreferrerkeywords();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<EngineloadsreferrerkeywordsRecord> getRecordType() {
        return EngineloadsreferrerkeywordsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.engineLoadsReferrerKeywords.id</code>.
     */
    public final TableField<EngineloadsreferrerkeywordsRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.engineLoadsReferrerKeywords.keyword</code>.
     */
    public final TableField<EngineloadsreferrerkeywordsRecord, String> KEYWORD = createField("keyword", org.jooq.impl.SQLDataType.VARCHAR(64).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.engineLoadsReferrerKeywords</code> table reference
     */
    public Engineloadsreferrerkeywords() {
        this(DSL.name("engineLoadsReferrerKeywords"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.engineLoadsReferrerKeywords</code> table reference
     */
    public Engineloadsreferrerkeywords(String alias) {
        this(DSL.name(alias), ENGINELOADSREFERRERKEYWORDS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.engineLoadsReferrerKeywords</code> table reference
     */
    public Engineloadsreferrerkeywords(Name alias) {
        this(alias, ENGINELOADSREFERRERKEYWORDS);
    }

    private Engineloadsreferrerkeywords(Name alias, Table<EngineloadsreferrerkeywordsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Engineloadsreferrerkeywords(Name alias, Table<EngineloadsreferrerkeywordsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Engineloadsreferrerkeywords(Table<O> child, ForeignKey<O, EngineloadsreferrerkeywordsRecord> key) {
        super(child, key, ENGINELOADSREFERRERKEYWORDS);
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
        return Arrays.<Index>asList(Indexes.ENGINELOADSREFERRERKEYWORDS_IX_ENGINELOADSREFERRERKEYWORDS, Indexes.ENGINELOADSREFERRERKEYWORDS_PK_ENGINELOADSREFERRERKEYWORDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<EngineloadsreferrerkeywordsRecord, Integer> getIdentity() {
        return Keys.IDENTITY_ENGINELOADSREFERRERKEYWORDS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<EngineloadsreferrerkeywordsRecord>> getKeys() {
        return Arrays.<UniqueKey<EngineloadsreferrerkeywordsRecord>>asList(Keys.PK_ENGINELOADSREFERRERKEYWORDS, Keys.IX_ENGINELOADSREFERRERKEYWORDS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Engineloadsreferrerkeywords as(String alias) {
        return new Engineloadsreferrerkeywords(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Engineloadsreferrerkeywords as(Name alias) {
        return new Engineloadsreferrerkeywords(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Engineloadsreferrerkeywords rename(String name) {
        return new Engineloadsreferrerkeywords(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Engineloadsreferrerkeywords rename(Name name) {
        return new Engineloadsreferrerkeywords(name, null);
    }
}