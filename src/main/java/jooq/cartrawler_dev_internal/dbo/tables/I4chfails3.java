/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Indexes;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.I4chfails3Record;

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
public class I4chfails3 extends TableImpl<I4chfails3Record> {

    private static final long serialVersionUID = -965226777;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.i4chfails3</code>
     */
    public static final I4chfails3 I4CHFAILS3 = new I4chfails3();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<I4chfails3Record> getRecordType() {
        return I4chfails3Record.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.i4chfails3.guid</code>.
     */
    public final TableField<I4chfails3Record, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.i4chfails3.i4chref</code>.
     */
    public final TableField<I4chfails3Record, String> I4CHREF = createField("i4chref", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.i4chfails3.ctref</code>.
     */
    public final TableField<I4chfails3Record, String> CTREF = createField("ctref", org.jooq.impl.SQLDataType.NVARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.i4chfails3.clientname</code>.
     */
    public final TableField<I4chfails3Record, String> CLIENTNAME = createField("clientname", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.i4chfails3.days</code>.
     */
    public final TableField<I4chfails3Record, Integer> DAYS = createField("days", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.i4chfails3.isvoid</code>.
     */
    public final TableField<I4chfails3Record, Integer> ISVOID = createField("isvoid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.i4chfails3</code> table reference
     */
    public I4chfails3() {
        this(DSL.name("i4chfails3"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.i4chfails3</code> table reference
     */
    public I4chfails3(String alias) {
        this(DSL.name(alias), I4CHFAILS3);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.i4chfails3</code> table reference
     */
    public I4chfails3(Name alias) {
        this(alias, I4CHFAILS3);
    }

    private I4chfails3(Name alias, Table<I4chfails3Record> aliased) {
        this(alias, aliased, null);
    }

    private I4chfails3(Name alias, Table<I4chfails3Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> I4chfails3(Table<O> child, ForeignKey<O, I4chfails3Record> key) {
        super(child, key, I4CHFAILS3);
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
        return Arrays.<Index>asList(Indexes.I4CHFAILS3_PK_I4CHFAILS3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<I4chfails3Record> getPrimaryKey() {
        return Keys.PK_I4CHFAILS3;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<I4chfails3Record>> getKeys() {
        return Arrays.<UniqueKey<I4chfails3Record>>asList(Keys.PK_I4CHFAILS3);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3 as(String alias) {
        return new I4chfails3(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public I4chfails3 as(Name alias) {
        return new I4chfails3(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public I4chfails3 rename(String name) {
        return new I4chfails3(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public I4chfails3 rename(Name name) {
        return new I4chfails3(name, null);
    }
}