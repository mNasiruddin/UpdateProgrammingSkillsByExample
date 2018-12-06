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
import jooq.cartrawler_dev_internal.dbo.tables.records.IssclientGroupRecord;

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
public class IssclientGroup extends TableImpl<IssclientGroupRecord> {

    private static final long serialVersionUID = -1445873731;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.issClient_Group</code>
     */
    public static final IssclientGroup ISSCLIENT_GROUP = new IssclientGroup();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<IssclientGroupRecord> getRecordType() {
        return IssclientGroupRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issClient_Group.client_group_id</code>.
     */
    public final TableField<IssclientGroupRecord, Integer> CLIENT_GROUP_ID = createField("client_group_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.issClient_Group.client_group_name</code>.
     */
    public final TableField<IssclientGroupRecord, String> CLIENT_GROUP_NAME = createField("client_group_name", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.issClient_Group</code> table reference
     */
    public IssclientGroup() {
        this(DSL.name("issClient_Group"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issClient_Group</code> table reference
     */
    public IssclientGroup(String alias) {
        this(DSL.name(alias), ISSCLIENT_GROUP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.issClient_Group</code> table reference
     */
    public IssclientGroup(Name alias) {
        this(alias, ISSCLIENT_GROUP);
    }

    private IssclientGroup(Name alias, Table<IssclientGroupRecord> aliased) {
        this(alias, aliased, null);
    }

    private IssclientGroup(Name alias, Table<IssclientGroupRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> IssclientGroup(Table<O> child, ForeignKey<O, IssclientGroupRecord> key) {
        super(child, key, ISSCLIENT_GROUP);
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
        return Arrays.<Index>asList(Indexes.ISSCLIENT_GROUP_PK_ISSCLIENT_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<IssclientGroupRecord> getPrimaryKey() {
        return Keys.PK_ISSCLIENT_GROUP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<IssclientGroupRecord>> getKeys() {
        return Arrays.<UniqueKey<IssclientGroupRecord>>asList(Keys.PK_ISSCLIENT_GROUP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssclientGroup as(String alias) {
        return new IssclientGroup(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IssclientGroup as(Name alias) {
        return new IssclientGroup(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public IssclientGroup rename(String name) {
        return new IssclientGroup(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public IssclientGroup rename(Name name) {
        return new IssclientGroup(name, null);
    }
}