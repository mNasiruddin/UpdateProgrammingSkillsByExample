/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RemoteQueriesAdwordsinfoRecord;

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
public class RemoteQueriesAdwordsinfo extends TableImpl<RemoteQueriesAdwordsinfoRecord> {

    private static final long serialVersionUID = 1966337022;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo</code>
     */
    public static final RemoteQueriesAdwordsinfo REMOTE_QUERIES_ADWORDSINFO = new RemoteQueriesAdwordsinfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RemoteQueriesAdwordsinfoRecord> getRecordType() {
        return RemoteQueriesAdwordsinfoRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo.fk_remote_queries</code>.
     */
    public final TableField<RemoteQueriesAdwordsinfoRecord, Long> FK_REMOTE_QUERIES = createField("fk_remote_queries", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo.fk_engineLoadsAdwordsInfo</code>.
     */
    public final TableField<RemoteQueriesAdwordsinfoRecord, Integer> FK_ENGINELOADSADWORDSINFO = createField("fk_engineLoadsAdwordsInfo", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo.querydate</code>.
     */
    public final TableField<RemoteQueriesAdwordsinfoRecord, Timestamp> QUERYDATE = createField("querydate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo</code> table reference
     */
    public RemoteQueriesAdwordsinfo() {
        this(DSL.name("remote_queries_adwordsInfo"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo</code> table reference
     */
    public RemoteQueriesAdwordsinfo(String alias) {
        this(DSL.name(alias), REMOTE_QUERIES_ADWORDSINFO);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_adwordsInfo</code> table reference
     */
    public RemoteQueriesAdwordsinfo(Name alias) {
        this(alias, REMOTE_QUERIES_ADWORDSINFO);
    }

    private RemoteQueriesAdwordsinfo(Name alias, Table<RemoteQueriesAdwordsinfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private RemoteQueriesAdwordsinfo(Name alias, Table<RemoteQueriesAdwordsinfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RemoteQueriesAdwordsinfo(Table<O> child, ForeignKey<O, RemoteQueriesAdwordsinfoRecord> key) {
        super(child, key, REMOTE_QUERIES_ADWORDSINFO);
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
        return Arrays.<Index>asList(Indexes.REMOTE_QUERIES_ADWORDSINFO_PK_REMOTE_QUERIES_ADWORDSINFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RemoteQueriesAdwordsinfoRecord> getPrimaryKey() {
        return Keys.PK_REMOTE_QUERIES_ADWORDSINFO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RemoteQueriesAdwordsinfoRecord>> getKeys() {
        return Arrays.<UniqueKey<RemoteQueriesAdwordsinfoRecord>>asList(Keys.PK_REMOTE_QUERIES_ADWORDSINFO);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAdwordsinfo as(String alias) {
        return new RemoteQueriesAdwordsinfo(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAdwordsinfo as(Name alias) {
        return new RemoteQueriesAdwordsinfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesAdwordsinfo rename(String name) {
        return new RemoteQueriesAdwordsinfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesAdwordsinfo rename(Name name) {
        return new RemoteQueriesAdwordsinfo(name, null);
    }
}
