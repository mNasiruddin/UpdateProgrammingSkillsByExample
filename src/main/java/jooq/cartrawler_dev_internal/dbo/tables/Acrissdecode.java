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
import jooq.cartrawler_dev_internal.dbo.tables.records.AcrissdecodeRecord;

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
import org.jooq.types.UByte;


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
public class Acrissdecode extends TableImpl<AcrissdecodeRecord> {

    private static final long serialVersionUID = 573672710;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.acrissdecode</code>
     */
    public static final Acrissdecode ACRISSDECODE = new Acrissdecode();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AcrissdecodeRecord> getRecordType() {
        return AcrissdecodeRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.acrissdecode.guid</code>.
     */
    public final TableField<AcrissdecodeRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.acrissdecode.type</code>.
     */
    public final TableField<AcrissdecodeRecord, UByte> TYPE = createField("type", org.jooq.impl.SQLDataType.TINYINTUNSIGNED, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.acrissdecode.code</code>.
     */
    public final TableField<AcrissdecodeRecord, String> CODE = createField("code", org.jooq.impl.SQLDataType.CHAR(2), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.acrissdecode.description</code>.
     */
    public final TableField<AcrissdecodeRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.acrissdecode.parameters</code>.
     */
    public final TableField<AcrissdecodeRecord, String> PARAMETERS = createField("parameters", org.jooq.impl.SQLDataType.VARCHAR(128), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.acrissdecode</code> table reference
     */
    public Acrissdecode() {
        this(DSL.name("acrissdecode"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.acrissdecode</code> table reference
     */
    public Acrissdecode(String alias) {
        this(DSL.name(alias), ACRISSDECODE);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.acrissdecode</code> table reference
     */
    public Acrissdecode(Name alias) {
        this(alias, ACRISSDECODE);
    }

    private Acrissdecode(Name alias, Table<AcrissdecodeRecord> aliased) {
        this(alias, aliased, null);
    }

    private Acrissdecode(Name alias, Table<AcrissdecodeRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Acrissdecode(Table<O> child, ForeignKey<O, AcrissdecodeRecord> key) {
        super(child, key, ACRISSDECODE);
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
        return Arrays.<Index>asList(Indexes.ACRISSDECODE_PK_ACRISSDECODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<AcrissdecodeRecord> getPrimaryKey() {
        return Keys.PK_ACRISSDECODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<AcrissdecodeRecord>> getKeys() {
        return Arrays.<UniqueKey<AcrissdecodeRecord>>asList(Keys.PK_ACRISSDECODE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Acrissdecode as(String alias) {
        return new Acrissdecode(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Acrissdecode as(Name alias) {
        return new Acrissdecode(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Acrissdecode rename(String name) {
        return new Acrissdecode(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Acrissdecode rename(Name name) {
        return new Acrissdecode(name, null);
    }
}
