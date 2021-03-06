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
import jooq.cartrawler_dev_internal.dbo.tables.records.DcErrorMapRecord;

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
public class DcErrorMap extends TableImpl<DcErrorMapRecord> {

    private static final long serialVersionUID = 1520162392;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.dc_error_map</code>
     */
    public static final DcErrorMap DC_ERROR_MAP = new DcErrorMap();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DcErrorMapRecord> getRecordType() {
        return DcErrorMapRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_error_map.guid</code>.
     */
    public final TableField<DcErrorMapRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false).defaultValue(org.jooq.impl.DSL.field("(newid())", org.jooq.impl.SQLDataType.UUID)), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_error_map.id</code>.
     */
    public final TableField<DcErrorMapRecord, Integer> ID = createField("id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_error_map.fk_dc_prompt</code>.
     */
    public final TableField<DcErrorMapRecord, Integer> FK_DC_PROMPT = createField("fk_dc_prompt", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.dc_error_map.identifying_text</code>.
     */
    public final TableField<DcErrorMapRecord, String> IDENTIFYING_TEXT = createField("identifying_text", org.jooq.impl.SQLDataType.VARCHAR(256).nullable(false), this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.dc_error_map</code> table reference
     */
    public DcErrorMap() {
        this(DSL.name("dc_error_map"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.dc_error_map</code> table reference
     */
    public DcErrorMap(String alias) {
        this(DSL.name(alias), DC_ERROR_MAP);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.dc_error_map</code> table reference
     */
    public DcErrorMap(Name alias) {
        this(alias, DC_ERROR_MAP);
    }

    private DcErrorMap(Name alias, Table<DcErrorMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private DcErrorMap(Name alias, Table<DcErrorMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> DcErrorMap(Table<O> child, ForeignKey<O, DcErrorMapRecord> key) {
        super(child, key, DC_ERROR_MAP);
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
        return Arrays.<Index>asList(Indexes.DC_ERROR_MAP_PK_DC_ERROR_MAP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<DcErrorMapRecord, Integer> getIdentity() {
        return Keys.IDENTITY_DC_ERROR_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<DcErrorMapRecord> getPrimaryKey() {
        return Keys.PK_DC_ERROR_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<DcErrorMapRecord>> getKeys() {
        return Arrays.<UniqueKey<DcErrorMapRecord>>asList(Keys.PK_DC_ERROR_MAP);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcErrorMap as(String alias) {
        return new DcErrorMap(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DcErrorMap as(Name alias) {
        return new DcErrorMap(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DcErrorMap rename(String name) {
        return new DcErrorMap(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DcErrorMap rename(Name name) {
        return new DcErrorMap(name, null);
    }
}
