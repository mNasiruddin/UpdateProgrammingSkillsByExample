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
import jooq.cartrawler_dev_internal.dbo.tables.records.CtTechpartnerRecord;

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
public class CtTechpartner extends TableImpl<CtTechpartnerRecord> {

    private static final long serialVersionUID = -442832165;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.CT_TechPartner</code>
     */
    public static final CtTechpartner CT_TECHPARTNER = new CtTechpartner();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CtTechpartnerRecord> getRecordType() {
        return CtTechpartnerRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.id</code>.
     */
    public final TableField<CtTechpartnerRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.SYS_CHANGE_VERSION</code>.
     */
    public final TableField<CtTechpartnerRecord, Long> SYS_CHANGE_VERSION = createField("SYS_CHANGE_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.SYS_CHANGE_CREATION_VERSION</code>.
     */
    public final TableField<CtTechpartnerRecord, Long> SYS_CHANGE_CREATION_VERSION = createField("SYS_CHANGE_CREATION_VERSION", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.SYS_CHANGE_OPERATION</code>.
     */
    public final TableField<CtTechpartnerRecord, String> SYS_CHANGE_OPERATION = createField("SYS_CHANGE_OPERATION", org.jooq.impl.SQLDataType.NCHAR(1), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.SYS_CHANGE_COLUMNS</code>.
     */
    public final TableField<CtTechpartnerRecord, byte[]> SYS_CHANGE_COLUMNS = createField("SYS_CHANGE_COLUMNS", org.jooq.impl.SQLDataType.VARBINARY(4100), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.SYS_CHANGE_CONTEXT</code>.
     */
    public final TableField<CtTechpartnerRecord, byte[]> SYS_CHANGE_CONTEXT = createField("SYS_CHANGE_CONTEXT", org.jooq.impl.SQLDataType.VARBINARY(128), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.CT_TechPartner.pk_id</code>.
     */
    public final TableField<CtTechpartnerRecord, Integer> PK_ID = createField("pk_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.CT_TechPartner</code> table reference
     */
    public CtTechpartner() {
        this(DSL.name("CT_TechPartner"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_TechPartner</code> table reference
     */
    public CtTechpartner(String alias) {
        this(DSL.name(alias), CT_TECHPARTNER);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.CT_TechPartner</code> table reference
     */
    public CtTechpartner(Name alias) {
        this(alias, CT_TECHPARTNER);
    }

    private CtTechpartner(Name alias, Table<CtTechpartnerRecord> aliased) {
        this(alias, aliased, null);
    }

    private CtTechpartner(Name alias, Table<CtTechpartnerRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> CtTechpartner(Table<O> child, ForeignKey<O, CtTechpartnerRecord> key) {
        super(child, key, CT_TECHPARTNER);
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
        return Arrays.<Index>asList(Indexes.CT_TECHPARTNER_PK_CT_TECHPARTNER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<CtTechpartnerRecord, Long> getIdentity() {
        return Keys.IDENTITY_CT_TECHPARTNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CtTechpartnerRecord> getPrimaryKey() {
        return Keys.PK_CT_TECHPARTNER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CtTechpartnerRecord>> getKeys() {
        return Arrays.<UniqueKey<CtTechpartnerRecord>>asList(Keys.PK_CT_TECHPARTNER);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtTechpartner as(String alias) {
        return new CtTechpartner(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CtTechpartner as(Name alias) {
        return new CtTechpartner(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CtTechpartner rename(String name) {
        return new CtTechpartner(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CtTechpartner rename(Name name) {
        return new CtTechpartner(name, null);
    }
}