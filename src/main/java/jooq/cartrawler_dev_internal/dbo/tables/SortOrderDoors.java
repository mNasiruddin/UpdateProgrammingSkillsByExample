/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.tables.records.SortOrderDoorsRecord;

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
public class SortOrderDoors extends TableImpl<SortOrderDoorsRecord> {

    private static final long serialVersionUID = 914416945;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.sort_order_doors</code>
     */
    public static final SortOrderDoors SORT_ORDER_DOORS = new SortOrderDoors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SortOrderDoorsRecord> getRecordType() {
        return SortOrderDoorsRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_doors.pax</code>.
     */
    public final TableField<SortOrderDoorsRecord, Integer> PAX = createField("pax", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_doors.doors</code>.
     */
    public final TableField<SortOrderDoorsRecord, Integer> DOORS = createField("doors", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.sort_order_doors.score</code>.
     */
    public final TableField<SortOrderDoorsRecord, Double> SCORE = createField("score", org.jooq.impl.SQLDataType.FLOAT, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.sort_order_doors</code> table reference
     */
    public SortOrderDoors() {
        this(DSL.name("sort_order_doors"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sort_order_doors</code> table reference
     */
    public SortOrderDoors(String alias) {
        this(DSL.name(alias), SORT_ORDER_DOORS);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.sort_order_doors</code> table reference
     */
    public SortOrderDoors(Name alias) {
        this(alias, SORT_ORDER_DOORS);
    }

    private SortOrderDoors(Name alias, Table<SortOrderDoorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private SortOrderDoors(Name alias, Table<SortOrderDoorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> SortOrderDoors(Table<O> child, ForeignKey<O, SortOrderDoorsRecord> key) {
        super(child, key, SORT_ORDER_DOORS);
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
    public SortOrderDoors as(String alias) {
        return new SortOrderDoors(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public SortOrderDoors as(Name alias) {
        return new SortOrderDoors(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SortOrderDoors rename(String name) {
        return new SortOrderDoors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SortOrderDoors rename(Name name) {
        return new SortOrderDoors(name, null);
    }
}