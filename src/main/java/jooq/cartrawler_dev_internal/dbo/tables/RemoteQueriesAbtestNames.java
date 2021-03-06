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
import jooq.cartrawler_dev_internal.dbo.tables.records.RemoteQueriesAbtestNamesRecord;

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
public class RemoteQueriesAbtestNames extends TableImpl<RemoteQueriesAbtestNamesRecord> {

    private static final long serialVersionUID = 639497145;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names</code>
     */
    public static final RemoteQueriesAbtestNames REMOTE_QUERIES_ABTEST_NAMES = new RemoteQueriesAbtestNames();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RemoteQueriesAbtestNamesRecord> getRecordType() {
        return RemoteQueriesAbtestNamesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names.id</code>.
     */
    public final TableField<RemoteQueriesAbtestNamesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names.abtest_name</code>.
     */
    public final TableField<RemoteQueriesAbtestNamesRecord, String> ABTEST_NAME = createField("abtest_name", org.jooq.impl.SQLDataType.VARCHAR(50), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names</code> table reference
     */
    public RemoteQueriesAbtestNames() {
        this(DSL.name("remote_queries_abtest_names"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names</code> table reference
     */
    public RemoteQueriesAbtestNames(String alias) {
        this(DSL.name(alias), REMOTE_QUERIES_ABTEST_NAMES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.remote_queries_abtest_names</code> table reference
     */
    public RemoteQueriesAbtestNames(Name alias) {
        this(alias, REMOTE_QUERIES_ABTEST_NAMES);
    }

    private RemoteQueriesAbtestNames(Name alias, Table<RemoteQueriesAbtestNamesRecord> aliased) {
        this(alias, aliased, null);
    }

    private RemoteQueriesAbtestNames(Name alias, Table<RemoteQueriesAbtestNamesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RemoteQueriesAbtestNames(Table<O> child, ForeignKey<O, RemoteQueriesAbtestNamesRecord> key) {
        super(child, key, REMOTE_QUERIES_ABTEST_NAMES);
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
        return Arrays.<Index>asList(Indexes.REMOTE_QUERIES_ABTEST_NAMES_PK_REMOTE_QUERIES_ABTEST_NAMES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RemoteQueriesAbtestNamesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_REMOTE_QUERIES_ABTEST_NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RemoteQueriesAbtestNamesRecord> getPrimaryKey() {
        return Keys.PK_REMOTE_QUERIES_ABTEST_NAMES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RemoteQueriesAbtestNamesRecord>> getKeys() {
        return Arrays.<UniqueKey<RemoteQueriesAbtestNamesRecord>>asList(Keys.PK_REMOTE_QUERIES_ABTEST_NAMES);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAbtestNames as(String alias) {
        return new RemoteQueriesAbtestNames(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RemoteQueriesAbtestNames as(Name alias) {
        return new RemoteQueriesAbtestNames(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesAbtestNames rename(String name) {
        return new RemoteQueriesAbtestNames(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RemoteQueriesAbtestNames rename(Name name) {
        return new RemoteQueriesAbtestNames(name, null);
    }
}
