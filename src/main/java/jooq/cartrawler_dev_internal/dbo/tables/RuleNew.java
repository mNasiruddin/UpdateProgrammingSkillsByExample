/*
 * This file is generated by jOOQ.
 */
package jooq.cartrawler_dev_internal.dbo.tables;


import java.sql.Timestamp;
import java.util.UUID;

import javax.annotation.Generated;

import jooq.cartrawler_dev_internal.dbo.Dbo;
import jooq.cartrawler_dev_internal.dbo.Keys;
import jooq.cartrawler_dev_internal.dbo.tables.records.RuleNewRecord;

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
public class RuleNew extends TableImpl<RuleNewRecord> {

    private static final long serialVersionUID = 1403827765;

    /**
     * The reference instance of <code>Cartrawler_dev_internal.dbo.rule_new</code>
     */
    public static final RuleNew RULE_NEW = new RuleNew();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<RuleNewRecord> getRecordType() {
        return RuleNewRecord.class;
    }

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.guid</code>.
     */
    public final TableField<RuleNewRecord, UUID> GUID = createField("guid", org.jooq.impl.SQLDataType.UUID.nullable(false), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.rule_id</code>.
     */
    public final TableField<RuleNewRecord, Integer> RULE_ID = createField("rule_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.parent_rule_id</code>.
     */
    public final TableField<RuleNewRecord, Integer> PARENT_RULE_ID = createField("parent_rule_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.type</code>.
     */
    public final TableField<RuleNewRecord, String> TYPE = createField("type", org.jooq.impl.SQLDataType.VARCHAR(32), this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.rule_values</code>.
     */
    public final TableField<RuleNewRecord, String> RULE_VALUES = createField("rule_values", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.rule_charge_id</code>.
     */
    public final TableField<RuleNewRecord, Integer> RULE_CHARGE_ID = createField("rule_charge_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.rule_message_id</code>.
     */
    public final TableField<RuleNewRecord, Integer> RULE_MESSAGE_ID = createField("rule_message_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.user_id</code>.
     */
    public final TableField<RuleNewRecord, Integer> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>Cartrawler_dev_internal.dbo.rule_new.amenddate</code>.
     */
    public final TableField<RuleNewRecord, Timestamp> AMENDDATE = createField("amenddate", org.jooq.impl.SQLDataType.TIMESTAMP, this, "");

    /**
     * Create a <code>Cartrawler_dev_internal.dbo.rule_new</code> table reference
     */
    public RuleNew() {
        this(DSL.name("rule_new"), null);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_new</code> table reference
     */
    public RuleNew(String alias) {
        this(DSL.name(alias), RULE_NEW);
    }

    /**
     * Create an aliased <code>Cartrawler_dev_internal.dbo.rule_new</code> table reference
     */
    public RuleNew(Name alias) {
        this(alias, RULE_NEW);
    }

    private RuleNew(Name alias, Table<RuleNewRecord> aliased) {
        this(alias, aliased, null);
    }

    private RuleNew(Name alias, Table<RuleNewRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> RuleNew(Table<O> child, ForeignKey<O, RuleNewRecord> key) {
        super(child, key, RULE_NEW);
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
    public Identity<RuleNewRecord, Integer> getIdentity() {
        return Keys.IDENTITY_RULE_NEW;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleNew as(String alias) {
        return new RuleNew(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public RuleNew as(Name alias) {
        return new RuleNew(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleNew rename(String name) {
        return new RuleNew(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public RuleNew rename(Name name) {
        return new RuleNew(name, null);
    }
}
