/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.OtalanguagevalueNewBigRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
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
public class OtalanguagevalueNewBig extends TableImpl<OtalanguagevalueNewBigRecord> {

    private static final long serialVersionUID = -2011748797;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big</code>
     */
    public static final OtalanguagevalueNewBig OTALANGUAGEVALUE_NEW_BIG = new OtalanguagevalueNewBig();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OtalanguagevalueNewBigRecord> getRecordType() {
        return OtalanguagevalueNewBigRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.id</code>.
     */
    public final TableField<OtalanguagevalueNewBigRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.name_id</code>.
     */
    public final TableField<OtalanguagevalueNewBigRecord, Integer> NAME_ID = createField("name_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.lang_id</code>.
     */
    public final TableField<OtalanguagevalueNewBigRecord, Integer> LANG_ID = createField("lang_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.value</code>.
     */
    public final TableField<OtalanguagevalueNewBigRecord, byte[]> VALUE = createField("value", org.jooq.impl.SQLDataType.VARBINARY(250), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big.value_big</code>.
     */
    public final TableField<OtalanguagevalueNewBigRecord, byte[]> VALUE_BIG = createField("value_big", org.jooq.impl.SQLDataType.VARBINARY, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big</code> table reference
     */
    public OtalanguagevalueNewBig() {
        this(DSL.name("otaLanguageValue_new_big"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big</code> table reference
     */
    public OtalanguagevalueNewBig(String alias) {
        this(DSL.name(alias), OTALANGUAGEVALUE_NEW_BIG);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.otaLanguageValue_new_big</code> table reference
     */
    public OtalanguagevalueNewBig(Name alias) {
        this(alias, OTALANGUAGEVALUE_NEW_BIG);
    }

    private OtalanguagevalueNewBig(Name alias, Table<OtalanguagevalueNewBigRecord> aliased) {
        this(alias, aliased, null);
    }

    private OtalanguagevalueNewBig(Name alias, Table<OtalanguagevalueNewBigRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> OtalanguagevalueNewBig(Table<O> child, ForeignKey<O, OtalanguagevalueNewBigRecord> key) {
        super(child, key, OTALANGUAGEVALUE_NEW_BIG);
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
    public Identity<OtalanguagevalueNewBigRecord, Integer> getIdentity() {
        return Keys.IDENTITY_OTALANGUAGEVALUE_NEW_BIG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBig as(String alias) {
        return new OtalanguagevalueNewBig(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public OtalanguagevalueNewBig as(Name alias) {
        return new OtalanguagevalueNewBig(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OtalanguagevalueNewBig rename(String name) {
        return new OtalanguagevalueNewBig(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OtalanguagevalueNewBig rename(Name name) {
        return new OtalanguagevalueNewBig(name, null);
    }
}
