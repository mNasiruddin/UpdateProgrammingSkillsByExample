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
import jooq.cartrawler_dev_internal.dbo.tables.records.RentalconditionscatagoriesRecord;

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
public class Rentalconditionscatagories extends TableImpl<RentalconditionscatagoriesRecord> {

    private static final long serialVersionUID = 2018733816;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories</code>
     */
    public static final Rentalconditionscatagories RENTALCONDITIONSCATAGORIES = new Rentalconditionscatagories();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RentalconditionscatagoriesRecord> getRecordType() {
        return RentalconditionscatagoriesRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.id</code>.
     */
    public final TableField<RentalconditionscatagoriesRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.fk_name_id</code>.
     */
    public final TableField<RentalconditionscatagoriesRecord, Integer> FK_NAME_ID = createField("fk_name_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories.category_id</code>.
     */
    public final TableField<RentalconditionscatagoriesRecord, Integer> CATEGORY_ID = createField("category_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories</code> table reference
     */
    public Rentalconditionscatagories() {
        this(DSL.name("rentalConditionsCatagories"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories</code> table reference
     */
    public Rentalconditionscatagories(String alias) {
        this(DSL.name(alias), RENTALCONDITIONSCATAGORIES);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rentalConditionsCatagories</code> table reference
     */
    public Rentalconditionscatagories(Name alias) {
        this(alias, RENTALCONDITIONSCATAGORIES);
    }

    private Rentalconditionscatagories(Name alias, Table<RentalconditionscatagoriesRecord> aliased) {
        this(alias, aliased, null);
    }

    private Rentalconditionscatagories(Name alias, Table<RentalconditionscatagoriesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Rentalconditionscatagories(Table<O> child, ForeignKey<O, RentalconditionscatagoriesRecord> key) {
        super(child, key, RENTALCONDITIONSCATAGORIES);
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
        return Arrays.<Index>asList(Indexes.RENTALCONDITIONSCATAGORIES_PK__RENTALCO__3213E83F4756626A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<RentalconditionscatagoriesRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RENTALCONDITIONSCATAGORIES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<RentalconditionscatagoriesRecord> getPrimaryKey() {
        return Keys.PK__RENTALCO__3213E83F4756626A;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<RentalconditionscatagoriesRecord>> getKeys() {
        return Arrays.<UniqueKey<RentalconditionscatagoriesRecord>>asList(Keys.PK__RENTALCO__3213E83F4756626A);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rentalconditionscatagories as(String alias) {
        return new Rentalconditionscatagories(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Rentalconditionscatagories as(Name alias) {
        return new Rentalconditionscatagories(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Rentalconditionscatagories rename(String name) {
        return new Rentalconditionscatagories(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Rentalconditionscatagories rename(Name name) {
        return new Rentalconditionscatagories(name, null);
    }
}
