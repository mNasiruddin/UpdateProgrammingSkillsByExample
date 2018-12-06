/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.AbeVersionRulesOldRecord;

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
public class AbeVersionRulesOld extends TableImpl<AbeVersionRulesOldRecord> {

    private static final long serialVersionUID = 356204679;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.abe_version_rules_old</code>
     */
    public static final AbeVersionRulesOld ABE_VERSION_RULES_OLD = new AbeVersionRulesOld();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AbeVersionRulesOldRecord> getRecordType() {
        return AbeVersionRulesOldRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_rules_old.client_id</code>.
     */
    public final TableField<AbeVersionRulesOldRecord, Integer> CLIENT_ID = createField("client_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_rules_old.use_latest_override</code>.
     */
    public final TableField<AbeVersionRulesOldRecord, Boolean> USE_LATEST_OVERRIDE = createField("use_latest_override", org.jooq.impl.SQLDataType.BIT, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.abe_version_rules_old.fk_version_id</code>.
     */
    public final TableField<AbeVersionRulesOldRecord, Integer> FK_VERSION_ID = createField("fk_version_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.abe_version_rules_old</code> table reference
     */
    public AbeVersionRulesOld() {
        this(DSL.name("abe_version_rules_old"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.abe_version_rules_old</code> table reference
     */
    public AbeVersionRulesOld(String alias) {
        this(DSL.name(alias), ABE_VERSION_RULES_OLD);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.abe_version_rules_old</code> table reference
     */
    public AbeVersionRulesOld(Name alias) {
        this(alias, ABE_VERSION_RULES_OLD);
    }

    private AbeVersionRulesOld(Name alias, Table<AbeVersionRulesOldRecord> aliased) {
        this(alias, aliased, null);
    }

    private AbeVersionRulesOld(Name alias, Table<AbeVersionRulesOldRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> AbeVersionRulesOld(Table<O> child, ForeignKey<O, AbeVersionRulesOldRecord> key) {
        super(child, key, ABE_VERSION_RULES_OLD);
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
    public List<ForeignKey<AbeVersionRulesOldRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<AbeVersionRulesOldRecord, ?>>asList(Keys.FK_ABE_VERSIONING_ABE_VERSION);
    }

    public AbeVersion abeVersion() {
        return new AbeVersion(this, Keys.FK_ABE_VERSIONING_ABE_VERSION);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRulesOld as(String alias) {
        return new AbeVersionRulesOld(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AbeVersionRulesOld as(Name alias) {
        return new AbeVersionRulesOld(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public AbeVersionRulesOld rename(String name) {
        return new AbeVersionRulesOld(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AbeVersionRulesOld rename(Name name) {
        return new AbeVersionRulesOld(name, null);
    }
}