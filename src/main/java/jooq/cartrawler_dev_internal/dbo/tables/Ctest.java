/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.CtestRecord;

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
public class Ctest extends TableImpl<CtestRecord> {

    private static final long serialVersionUID = -963904019;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.ctest</code>
     */
    public static final Ctest CTEST = new Ctest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtestRecord> getRecordType() {
        return CtestRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ctest.dt</code>.
     */
    public final TableField<CtestRecord, Timestamp> DT = createField("dt", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ctest.a</code>.
     */
    public final TableField<CtestRecord, Double> A = createField("a", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ctest.b</code>.
     */
    public final TableField<CtestRecord, Double> B = createField("b", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ctest.c</code>.
     */
    public final TableField<CtestRecord, Double> C = createField("c", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.ctest.d</code>.
     */
    public final TableField<CtestRecord, Double> D = createField("d", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.ctest</code> table reference
     */
    public Ctest() {
        this(DSL.name("ctest"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ctest</code> table reference
     */
    public Ctest(String alias) {
        this(DSL.name(alias), CTEST);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.ctest</code> table reference
     */
    public Ctest(Name alias) {
        this(alias, CTEST);
    }

    private Ctest(Name alias, Table<CtestRecord> aliased) {
        this(alias, aliased, null);
    }

    private Ctest(Name alias, Table<CtestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Ctest(Table<O> child, ForeignKey<O, CtestRecord> key) {
        super(child, key, CTEST);
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
    public Ctest as(String alias) {
        return new Ctest(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Ctest as(Name alias) {
        return new Ctest(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Ctest rename(String name) {
        return new Ctest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Ctest rename(Name name) {
        return new Ctest(name, null);
    }
}
